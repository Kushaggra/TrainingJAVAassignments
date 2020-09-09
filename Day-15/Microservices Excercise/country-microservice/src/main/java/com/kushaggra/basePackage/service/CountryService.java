package com.kushaggra.basePackage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushaggra.basePackage.Exceptions.CountryAlreadyExistsException;
import com.kushaggra.basePackage.Exceptions.CountryNotFoundException;
import com.kushaggra.basePackage.model.Capital;
import com.kushaggra.basePackage.model.CountryBean;
import com.kushaggra.basePackage.model.CountryCapitalBean;
import com.kushaggra.basePackage.repository.CountryRepository;

@Service
public class CountryService implements ICountryService {
	@Autowired
	private CountryRepository repository;
	
	@Override
	public CountryBean getById(String id) {
		return repository.findByCountryCode(id);		
	}
	
	@Override
	public CountryBean getBycountryCode(String countryCode) {
		CountryBean newObj = getById(countryCode);
		if(newObj==null)
			throw new CountryNotFoundException("This country Doesn't exists in the Databse!"); 
		return newObj;
	}

	@Override
	public void addCountry(CountryBean bean) {
		CountryBean obj = getById(bean.getCountryCode());
		
		if(obj==null) 
			repository.save(bean);
		else
			throw new CountryAlreadyExistsException("This Country Code is associated with another country in the Database");
		
	}

	@Override
	public CountryCapitalBean getCombo(CountryBean obj, Capital cObj) {
		CountryCapitalBean completeObj = new CountryCapitalBean();
		completeObj.setCountryName(obj.getCountryName());
		completeObj.setCountryCode(cObj.getCountryCode());
		completeObj.setCapital(cObj);
		
		return completeObj;
	}


}
