package com.kushaggra.basePackage.service;

import java.util.List;

import com.kushaggra.basePackage.model.TelephoneBean;

public interface IServiceTelephone {
	
	public String addTelephone(TelephoneBean bean);
	public List<TelephoneBean> showAll();
	public TelephoneBean getById(long id);
	public TelephoneBean getByNum(long id);
	public TelephoneBean updateTel(TelephoneBean bean);
	public void delById(TelephoneBean bean);
	
		
}
