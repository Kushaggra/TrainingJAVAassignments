package com.training.ExceptionHandling.epack;




//Checked Exceptions are handled by Compiler and to make our custom made Exception class as Checked Exception, 
//we need to extend it with "Exception" class

//public class InsufficientLeavesException extends RuntimeException  ------> to make it Unchecked Exception
  public class InsufficientLeavesException extends Exception {     //------------------------> to make it Checked Exception

	  
	// Just a random ID that Java asks for when we create a checked exception, it can be any Long number.
	private static final long serialVersionUID = 1L;	
	private String msg;

		public InsufficientLeavesException(String msg) {
			super();
			this.msg = msg;
		}
			  
		public String getMessage() {
			return this.msg;
		}
	
}
