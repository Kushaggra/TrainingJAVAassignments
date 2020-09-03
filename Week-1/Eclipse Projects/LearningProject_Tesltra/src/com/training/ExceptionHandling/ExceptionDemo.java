package com.training.ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		double result = 0.0;
		try {
			int n1 = Integer.parseInt(args[0]);
			int n2 = Integer.parseInt(args[1]);
			result = n1/n2;
			System.out.println("Result = "+ result);
		}
		catch(NumberFormatException e) {
			System.out.println("Enter Integer Values ONLY\n"+ e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Divisor can't be Zero. Please enter a NON ZERO integer\n"+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Atleast two inputs required for Division!\n"+ e.getMessage());
		}catch(Exception e) {
			
			//e.printStackTrace();  	This is avoided because we need not give source code info to client.
			e.getMessage();
		}
		finally {
			System.out.println("FINALLY BLOCK");
		}
//		System.out.println("Result = "+ result);
	}

}
