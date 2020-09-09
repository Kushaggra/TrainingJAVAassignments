package com.kushaggra.basePackage.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushaggra.basePackage.Exceptions.CountryAlreadyExistsException;
import com.kushaggra.basePackage.model.CapitalBean;
import com.kushaggra.basePackage.repository.CapitalRepository;

@Service
public class ServiceCapital implements IServiceCapital{

	@Autowired
	private CapitalRepository repository;
	
	@Override
	public CapitalBean getByCountryCode(String code) {
		return repository.findById(code).orElse(null);
	}
	
	
	@Override
	public void addCapital(CapitalBean cb) {
		CapitalBean obj=getByCountryCode(cb.getCountryCode());
		if(obj==null) {
			repository.save(cb);
		}else {
			throw new CountryAlreadyExistsException("The Country Code you are trying to enter already exists in the database");
		}
	}


	@Override
	public List<CapitalBean> getAllData() {
		return repository.findAll();
	}
		
}
