package com.kushaggra.basePackage.Exceptions;

public class CountryAlreadyExistsException extends RuntimeException{
	private String message;
	
	public CountryAlreadyExistsException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
}
