package com.example.demo.service;
import com.example.demo.service.ConversionRateService;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.exceptions.ConversionMultipleNotFoundException;
import com.example.demo.model.ConversionRate;
import com.example.demo.repository.IConversionRepository;

@Service
public class ConversionRateService implements IConversionRateService {
	
	@Autowired
	private IConversionRepository repository;
	
	@Override
	public ConversionRate getConversion(String from , String to) {
		List<ConversionRate> list = new ArrayList<ConversionRate>();
		list = repository.findByFrom(from);
		int flag = 0;
		if(list!=null) {
			for(ConversionRate c : list) {
				if(c.getTo().equalsIgnoreCase(to)) {
					flag=1;
					return c;
				}
			}	
		}
		else
			throw new ConversionMultipleNotFoundException("The Conversion Factor for this conversion doesn't exist in the Database!");
		if(flag==0)
			throw new ConversionMultipleNotFoundException("The Conversion Factor for this conversion doesn't exist in the Database!");
	return null;
	}

	@Override
	public void addConversion(ConversionRate conversion) {
		repository.save(conversion);
		
	}

	@Override
	public ConversionRate getConversionbyID(long l) {
		return repository.findById(l).orElse(null);
	}
	
}





//---------------------------------HARDCODED CONVERSIONS-------------------------------
//if(from.equalsIgnoreCase("Meter")) {
//	if(to.equalsIgnoreCase("CM")) {
//		return 0.01;
//	}else if(to.equalsIgnoreCase("KM")) {
//		return 1000;
//	}
//}else if(from.equalsIgnoreCase("Km"))
//	if(to.equalsIgnoreCase("Meter")) {
//		return 0.001;
//	}else if(to.equalsIgnoreCase("CM")) {
//		return 0.00001;
//	
//}else if(from.equalsIgnoreCase("cm"))
//	if(to.equalsIgnoreCase("Meter")) {
//		return 100;
//	}else if(to.equalsIgnoreCase("KM")) {
//		return 100000;
//	}
//	
//return 0;