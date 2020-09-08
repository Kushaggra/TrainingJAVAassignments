package com.kushaggra.basePackage.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.model.bean;
import com.kushaggra.basePackage.service.Iservice;

@RestController
public class tempController {
	
	@Autowired
	private Iservice iserviceObject;
	
	@GetMapping("metric-conversion/from/{from}/to/{to}/unit/{unit}")
	public bean calculateUnit(@PathVariable String from,@PathVariable String to,@PathVariable double unit) {	
		bean mcb = new bean(1l, from, to, unit,0);
		System.out.println("------------------------------"+mcb);
		bean newObj =iserviceObject.convert(mcb);
		System.out.println("---------------------------*******************"+newObj);
		return newObj;
	}

}
