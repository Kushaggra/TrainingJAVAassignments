package com.kushaggra.basePackage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.exceptions.CustomerNotFoundException;
import com.kushaggra.basePackage.model.CustomerBean;
import com.kushaggra.basePackage.model.TelephoneBean;
import com.kushaggra.basePackage.proxy.ICustomerProxy;
import com.kushaggra.basePackage.service.ServiceCustomer;

@RestController
@RequestMapping("customer")
public class CustomerController {

	@Autowired
	ServiceCustomer serviceCustomerObj;
	
	@Autowired
	ICustomerProxy proxy;
	
	@PostMapping	//save customer
	public String addCust(@RequestBody CustomerBean bean) {
		return serviceCustomerObj.addCustomer(bean);
	}
	
	@PutMapping		//update Customer
	public CustomerBean update(@RequestBody CustomerBean bean) {
		return serviceCustomerObj.updateCustomer(bean);
		
	}
	
	@GetMapping		//Get all the customers
	public List<CustomerBean> getAll(){
		List<CustomerBean> list = serviceCustomerObj.showAll();
		if(list!=null) {
			return list;
		}else
			throw new CustomerNotFoundException("There's no Customer added into our Database.");
	}
	
	@GetMapping("{customerId}")		//get customer by ID
	public CustomerBean showbyID(@PathVariable int customerId) {
		CustomerBean obj =serviceCustomerObj.getById(customerId);
		if(obj!=null) {
			return obj;
		}else
			throw new CustomerNotFoundException("The record with this Customer ID is DOES NOT exist in Database.");
	}

	
	@DeleteMapping("{customerId}")		//Delete customer by ID
	public String deletebyID(@PathVariable int customerId) {
		CustomerBean obj =serviceCustomerObj.getById(customerId);
		if(obj!=null) {
			serviceCustomerObj.delById(obj);
			return "Customer record with ID: "+customerId+" has been deleted.";
		}else
			throw new CustomerNotFoundException("The record with this Customer ID is DOES NOT exist in Database.");
	}
	
	@GetMapping("{customerId}/telephone")		//to display cutomer's telephone details
	public TelephoneBean getCustomerTelephone(@PathVariable int customerId) {
		CustomerBean cbean =serviceCustomerObj.getById(customerId);
		if(cbean!=null) {
			System.out.println(cbean);
			TelephoneBean obj = proxy.retrieveData(cbean.getCustomerTelephone());
			if(obj==null)
				throw new CustomerNotFoundException("No Telephone Number attached");
			System.out.println(obj);
			return obj;
		}else
			throw new CustomerNotFoundException("Invalid Customer ID entered.");
	}
}
