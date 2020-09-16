package com.kushaggra.basePackage.exceptions;

public class TelephoneBeanException extends RuntimeException{

	String messsage;

	public TelephoneBeanException(String message) {
		super(message);
	}
	
}
