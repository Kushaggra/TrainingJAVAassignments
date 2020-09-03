package com.training.ExceptionHandling;

import com.training.ExceptionHandling.epack.InsufficientLeavesException;

public class Main {

	public static void main(String[] args) {
		
//--------------------------------MAIN FUNCTION FOR Exception.java, ExceptionDemoReadStream.java-------------------
//		
//		ExceptionDemoReadStream edr = new ExceptionDemoReadStream();
//		edr.readInput1();
//		try {
//			System.out.println(edr.readinput2());
//		} catch (NumberFormatException | ArithmeticException | IOException e) {
//			// TODO Auto-generated catch block
//			e.getMessage();
//		}
		
//--------MAIN FNCTION FOR Employee.java and com.training.ExceptionHandling.epack.InsufficientException.java------------		

		Employee emp =new Employee(100,12);
		
		try {
			System.out.println(emp.applyLeave(10));
		} catch (InsufficientLeavesException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		try {
			System.out.println(emp.applyLeave(10));
		} catch (InsufficientLeavesException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
	

}
