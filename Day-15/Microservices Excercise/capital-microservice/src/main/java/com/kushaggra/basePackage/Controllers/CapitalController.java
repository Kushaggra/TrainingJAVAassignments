package com.kushaggra.basePackage.Controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.Exceptions.CountryNotFoundException;
import com.kushaggra.basePackage.model.CapitalBean;

import com.kushaggra.basePackage.services.ServiceCapital;

@RestController
public class CapitalController {

	@Autowired
	private ServiceCapital serviceCapitalObj;
	
	@Autowired
	private Environment environment;
	
		
	
		@PostMapping("capital/addCapital")
		public String addCapital(@RequestBody CapitalBean cb) {
			int port = Integer.parseInt(environment.getProperty("local.server.port"));
			cb.setPort(port);
			serviceCapitalObj.addCapital(cb);
			return "Addition Successful";
		}
		
		
		@GetMapping("capital")
		public ResponseEntity<CapitalBean> getAll() {
			List<CapitalBean> list = new ArrayList<CapitalBean>();
			list =serviceCapitalObj.getAllData();
			
			if(list==null)
				throw new CountryNotFoundException("No Data in the DataBase");
			
			ResponseEntity<CapitalBean> responseEntity = new ResponseEntity(list, HttpStatus.OK);
			return responseEntity;
		}
		
		
		@GetMapping("capital/{countryCode}")
		public ResponseEntity<CapitalBean> getName(@PathVariable String countryCode ) {
			CapitalBean obj =serviceCapitalObj.getByCountryCode(countryCode);
			
			if(obj==null)
				throw new CountryNotFoundException("No Country with the entered Country Code exists!");
			
			ResponseEntity<CapitalBean> responseEntity = new ResponseEntity(obj, HttpStatus.OK);
			return responseEntity;
		}
		
}
