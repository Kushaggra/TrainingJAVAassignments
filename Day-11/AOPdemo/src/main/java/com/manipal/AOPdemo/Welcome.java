package com.manipal.AOPdemo;


public class Welcome {
	private String message;
	
	public Welcome() {}
	public Welcome(String message) {
		this.message =message;
	}

	public String getMessage() {
		return message;
	}
	
	public void getABC() {
		System.out.println("ABC");
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void showMessage() {
		System.out.println(message);
	}
	
	public void exceptionMessage() {
		throw new RuntimeException();
	}
	
}