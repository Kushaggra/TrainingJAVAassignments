package com.training.ExceptionHandling;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class ExceptionDemoReadStream {

	public void readInput1() {
	
//		"Try with resource" is used-------->provides Auto close option for resources, removing the need for "finally" block to close our resources

//		"TRY WITH RESOURCE" block

		try (InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		){
			System.out.println("Enter two integer values");
			String str1 = br.readLine();
			String str2 = br.readLine();
			int result = Integer.parseInt(str1)/Integer.parseInt(str2);
			System.out.println(result);
			
		}catch(NumberFormatException e) {
			System.out.println("Enter Integer Values ONLY\n"+ e.getMessage());
		}catch(ArithmeticException e) {
			System.out.println("Divisor can't be Zero. Please enter a NON ZERO integer\n"+ e.getMessage());
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Atleast two inputs required for Division!\n"+ e.getMessage());
		}catch(Exception e) {
			//e.printStackTrace();  	This is avoided because we need not give source code info to client.
			e.getMessage();
		}
		
//		----------------------------------------------------------------------------------------------
//		without "TRY WITH RESOURCE" block
//		
//		InputStreamReader ir2 =null;
//		BufferedReader br2 = null;
//		
//		try {
//					ir2 = new InputStreamReader(System.in);
//					br2 = new BufferedReader(ir2);
//					String str1 = br2.readLine();
//					String str2 = br2.readLine();
//					int result = Integer.parseInt(str1)/Integer.parseInt(str2);
//					System.out.println(result);
//					
//				}catch(IOException e) {
//					System.out.println(e.getMessage());
//				}
//		finally {
//			try {
//				br2.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			try {
//				ir2.close();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
		
	}
	
	//CHECKED EXCEPTIONS ARE COMPILE-TIME EXCEPTION 
	
	
	public int readinput2() throws IOException,ArithmeticException,NumberFormatException {
					InputStreamReader ir = new InputStreamReader(System.in);
					BufferedReader br = new BufferedReader(ir);
					System.out.println("Enter two integer values");
					String str1 = br.readLine();
					String str2 = br.readLine();
					int result = Integer.parseInt(str1)/Integer.parseInt(str2);
					return(result);
	}
}
