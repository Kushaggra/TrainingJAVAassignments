package com.kushaggra.basePackage.services;

import java.util.List;

import com.kushaggra.basePackage.model.CapitalBean;

public interface IServiceCapital {
	public void addCapital(CapitalBean cb);
	public CapitalBean getByCountryCode(String code);
	public List<CapitalBean> getAllData();

}
