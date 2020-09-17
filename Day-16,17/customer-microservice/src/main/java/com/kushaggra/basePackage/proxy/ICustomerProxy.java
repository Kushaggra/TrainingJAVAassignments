package com.kushaggra.basePackage.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import com.kushaggra.basePackage.model.*;

//@FeignClient(name="telephone-microservice",url = "localhost:8000")

@FeignClient(name="telephone-microservice")
@RibbonClient(name="telephone-microservice")
public interface ICustomerProxy {

	@GetMapping("telephone/{num}")
	public TelephoneBean retrieveData(@PathVariable long num);
	
}