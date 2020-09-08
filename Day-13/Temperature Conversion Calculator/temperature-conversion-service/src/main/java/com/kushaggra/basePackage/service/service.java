package com.kushaggra.basePackage.service;

import org.springframework.stereotype.Service;

import com.kushaggra.basePackage.model.bean;
@Service
public class service implements Iservice {

	@Override
	public bean convert(bean mc) {
		String fromString = mc.getFrom();
		String toString = mc.getTo();
		double unit = mc.getUnit();
		
		
		bean mcb = new bean();
		if(fromString.equalsIgnoreCase("c")) {
			if(toString.equalsIgnoreCase("f")) 
				mcb.setTotalUnits(((unit*9)/5)+32);
			else if(toString.equalsIgnoreCase("k")) 
				mcb.setTotalUnits(unit+273.15);
			
		}else if(fromString.equalsIgnoreCase("f")) {
			if(toString.equalsIgnoreCase("c"))
				mcb.setTotalUnits(((unit-32)*5)/9);
			else if(toString.equalsIgnoreCase("k"))
				mcb.setTotalUnits((((unit-32)*5)/9)+273.15);	
			
		}else if(fromString.equalsIgnoreCase("k")) {
			if(toString.equalsIgnoreCase("c")) 
				mcb.setTotalUnits(unit-273.15);
			else if(toString.equalsIgnoreCase("f")) 
				mcb.setTotalUnits((((unit-273.15)*9)/5)+32);
		}	
		mcb.setId(mc.getId());
		mcb.setFrom(mc.getFrom());
		mcb.setTo(mc.getTo());
		mcb.setUnit(mc.getUnit());
		
		return mcb;
	}
}
