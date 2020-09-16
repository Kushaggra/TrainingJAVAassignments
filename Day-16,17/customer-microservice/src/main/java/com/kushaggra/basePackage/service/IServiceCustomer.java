package com.kushaggra.basePackage.service;

import java.util.List;

import com.kushaggra.basePackage.model.CustomerBean;

public interface IServiceCustomer {
	public String addCustomer(CustomerBean bean);
	public List<CustomerBean> showAll();
	public CustomerBean getById(int id);
	public CustomerBean updateCustomer(CustomerBean bean);
	public void delById(CustomerBean bean);

}
