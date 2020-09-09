package com.kushaggra.basePackage.Exceptions;
import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class CapitalResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(CountryAlreadyExistsException.class)
	public ResponseEntity<ExceptionResponse> convNotFound(CountryAlreadyExistsException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
	
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(CountryNotFoundException.class)
	public ResponseEntity<ExceptionResponse> countryNotFound(CountryNotFoundException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
	
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
//------can add more @ExceptionHandler --> for other exceptions-----	

}
