package com.training.inheritance;

public class Insurance {

	public static int[] calcInsurance(Employee[] empArr) {
		
		int[] Insurance = new int[empArr.length];
		
		for(int i=0;i<empArr.length;++i) {
			
		if(empArr[i] instanceof Manager ) {
			Insurance[i]=5*empArr[i].basicSal;
		}else if(empArr[i] instanceof Programmer) {
			Insurance[i]=4*empArr[i].basicSal;
		}else if(empArr[i] instanceof Employee) {
			Insurance[i]=3*empArr[i].basicSal;
		}else {
//			A minimum tax amount that needs to be paid if the employee doesn't fall in above categories 
			Insurance[i]=2*(empArr[i].basicSal);
			}
		}
		
		return Insurance;
	}
	
	
}
