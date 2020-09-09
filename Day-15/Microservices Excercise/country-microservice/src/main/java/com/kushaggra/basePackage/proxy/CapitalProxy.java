package com.kushaggra.basePackage.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import com.kushaggra.basePackage.model.Capital;

//@RibbonClient(name="capital-microservice")
@FeignClient(name="capital-microservice",url = "localhost:8000")
public interface CapitalProxy {

	@GetMapping("capital/{countryCode}")
	public Capital retrieveData(@PathVariable(value="countryCode") String countryCode); 
	
}
