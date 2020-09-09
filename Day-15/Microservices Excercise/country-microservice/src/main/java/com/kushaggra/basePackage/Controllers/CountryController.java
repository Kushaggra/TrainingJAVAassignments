package com.kushaggra.basePackage.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.model.Capital;
import com.kushaggra.basePackage.model.CountryBean;
import com.kushaggra.basePackage.model.CountryCapitalBean;
import com.kushaggra.basePackage.proxy.CapitalProxy;
//import com.kushaggra.basePackage.proxy.CapitalProxy;
import com.kushaggra.basePackage.service.CountryService;

@RestController
public class CountryController {
	
	@Autowired
	private CountryService countryServiceObj=new CountryService();

	@Autowired
	private com.kushaggra.basePackage.proxy.CapitalProxy proxy;
	
	@PostMapping("country")
	public String addRecord(@RequestBody CountryBean countryBean) {
		countryServiceObj.addCountry(countryBean);
		return "Record Added Successfully!";
	}
	
	@GetMapping("country/{countryCode}")
	public ResponseEntity<CountryCapitalBean> getDet(@PathVariable(value="countryCode") String countryCode){
		
		CountryBean obj = countryServiceObj.getBycountryCode(countryCode);
		System.out.println(obj);
		Capital cObj = proxy.retrieveData(countryCode);
		obj.setCapital(cObj.getName());
		
		CountryCapitalBean completeObj= countryServiceObj.getCombo(obj, cObj);
	
		ResponseEntity<CountryCapitalBean> responseEntity = new ResponseEntity(completeObj,HttpStatus.OK); 
		return responseEntity;
	}
	
	
}
