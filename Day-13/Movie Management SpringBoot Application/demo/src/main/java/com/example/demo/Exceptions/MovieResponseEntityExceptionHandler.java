package com.example.demo.Exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
// ----------OFFICIAL DOCUMENTATION-------------------------------------------------------------------
// "ResponseEntityExceptionHandler" A convenient base class for @ControllerAdvice classes 
//that wish to provide centralized exception handling across all @RequestMapping methods 
//through @ExceptionHandler methods.
//This base class provides an @ExceptionHandler method for handling internal Spring MVC exceptions.
//This method returns a ResponseEntity for writing to the response with a message converter,
//in contrast to DefaultHandlerExceptionResolver which returns a ModelAndView.
//---------------------------------------------------------------------------------------------------


@ControllerAdvice
public class MovieResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(MovieNotFoundException.class)
	public ResponseEntity<ExceptionResponse> movieNotFound(MovieNotFoundException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
	
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
	
	@ExceptionHandler(TitleNotFoundException.class)
	public ResponseEntity<ExceptionResponse> TitleNotFound(TitleNotFoundException exception){
		ExceptionResponse response = new ExceptionResponse(exception.getMessage(),LocalDateTime.now());
	
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND);
	}
	
	
}
