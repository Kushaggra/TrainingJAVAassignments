package com.kushaggra.basePackage.service;

import com.kushaggra.basePackage.model.Capital;
import com.kushaggra.basePackage.model.CountryBean;
import com.kushaggra.basePackage.model.CountryCapitalBean;

public interface ICountryService {
	public void addCountry(CountryBean bean);
	public  CountryBean getById(String id);	
	public  CountryBean getBycountryCode(String countryCode);
	public CountryCapitalBean getCombo(CountryBean cb , Capital c);
}
