package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.exceptions.ConversionMultipleNotFoundException;
import com.example.demo.exceptions.DuplicateConversionIdException;
import com.example.demo.model.ConversionRate;
//import com.example.demo.model.Movie;
import com.example.demo.service.ConversionRateService;

@RestController
public class MetricConversionController {
	
	@Autowired
	ConversionRateService conversionRateServiceObject;
	
	@GetMapping("metric-conversion/from/{from}/to/{to}")	
	public ResponseEntity<ConversionRate> getConversionRate(@PathVariable String from, @PathVariable String to) {
			ConversionRate c = conversionRateServiceObject.getConversion(from, to);
			if(c==null)
				throw new ConversionMultipleNotFoundException("Conversion Multiple not Found!");
			
			ResponseEntity<ConversionRate> responseEntity = new ResponseEntity(c, HttpStatus.OK);
			return responseEntity;
		}
	
	
	
	
	@PostMapping("addConversion")
	public void AddingToConversions(@RequestBody ConversionRate conversion) {
		ConversionRate conv = conversionRateServiceObject.getConversionbyID(conversion.getId());
		if(conv==null)
			conversionRateServiceObject.addConversion(conversion);
		else
			throw new DuplicateConversionIdException("Addition failed, Duplicate Conversion ID is being used!");
	}
}
