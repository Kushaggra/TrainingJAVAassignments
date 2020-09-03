package com.training.inheritance;

public class Tax {

	double taxAmount = 0.0;
	public static void calcTax(Employee[] empArr) {
		
		for(Employee emp: empArr) {
			
		if(emp instanceof Manager ) {
			emp.basicSal-=0.2*emp.basicSal;
		}else if(emp instanceof Programmer) {
			emp.basicSal-=0.15*emp.basicSal;
		}else if(emp instanceof Employee) {
			emp.basicSal-=0.1*emp.basicSal;
		}else {
//			A minimum tax amount that needs to be paid if the employee doesn't fall in above categories 
			emp.basicSal+=5000;
			}
		}
	}
}
