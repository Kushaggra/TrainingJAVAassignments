package com.kushaggra.basePackage.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.exceptions.TelephoneBeanException;
import com.kushaggra.basePackage.model.TelephoneBean;
import com.kushaggra.basePackage.service.ServiceTelephone;

@RestController
@RequestMapping("telephone")
public class TelephoneController {

//	public String addTelephone(TelephoneBean bean);
//	public List<TelephoneBean> showAll();
//	public TelephoneBean ;
	
	@Autowired
	ServiceTelephone serviceTelObj;
	
	@PostMapping
	public String addNew(@RequestBody TelephoneBean bean) {
		serviceTelObj.addTelephone(bean);
		return "Record Added Successfully";
	}
	
	@PutMapping
	public TelephoneBean UpadateRec(@RequestBody TelephoneBean bean) {
		return serviceTelObj.updateTel(bean);	
	}
	
	@GetMapping("id/{id}")
	public TelephoneBean getUsingId(@PathVariable long id) {
		TelephoneBean obj= serviceTelObj.getById(id);
		if(obj!=null) {
			return obj;
		}else
			throw new TelephoneBeanException("The record with this telephone ID is not present in the Database");
	}
	
	@DeleteMapping("id/{id}")
	public String DelUsingId(@PathVariable int id) {
		TelephoneBean obj= serviceTelObj.getById(id);
		if(obj!=null) {
			serviceTelObj.delById(obj);
			return "Telephone record with ID: "+id+" has been deleted.";
		}else
			throw new TelephoneBeanException("The record with this telephone ID is not present in the Database");
	}
	
	@GetMapping("{num}")
	public TelephoneBean getUsingNum(@PathVariable long num) {
		TelephoneBean obj = serviceTelObj.getByNum(num);
		if(obj!=null) {
			return obj;
		}else
//			throw new TelephoneBeanException("The record with this telephone number is not present in the Database");
			return null;
	}
	
	@GetMapping
	public List<TelephoneBean> getAllrecords(){
		List<TelephoneBean> list =serviceTelObj.showAll();
		if(list!=null) {
			return list;
		}
		else
			throw new TelephoneBeanException("Nothing in the Database!");	
	}

}
