package com.kushaggra.basePackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kushaggra.basePackage.exceptions.CustomerNotFoundException;
import com.kushaggra.basePackage.model.CustomerBean;
import com.kushaggra.basePackage.model.repository.ICustomerRepository;

@Service
public class ServiceCustomer implements IServiceCustomer {
	
	@Autowired
	private ICustomerRepository repository;

	@Override
	public CustomerBean getById(int id) {
		return repository.findById(id).orElse(null);
	}
	
	@Override
	public String addCustomer(CustomerBean bean) {
		CustomerBean obj=getById(bean.getCustomerId());
		
		if(obj==null) {
			repository.save(bean);
			return "Customer Added Successfully";
		}
		else
			throw new CustomerNotFoundException("Addition to Database FAILED! Customer ID Already exists");
	}

	@Override
	public List<CustomerBean> showAll() {
		return repository.findAll();
	}


	@Override
	public CustomerBean updateCustomer(CustomerBean bean) {
		return repository.save(bean);
	}

	@Override
	public void delById(CustomerBean bean) {
		repository.delete(bean);
		
	}

}
