package com.kushaggra.basePackage.Exceptions;

public class CountryNotFoundException extends RuntimeException {
	
	private String message;

	public CountryNotFoundException(String message) {
		super(message);
	}
	
}
