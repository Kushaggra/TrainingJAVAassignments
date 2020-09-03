package com.training.poly_func_overload;

public class Average {
	
	public static double avg(int ...num) {			// for unknown numbers for arguments
													// "num" is taken as an array
		double sum = 0.0;
		for(int n:num) {
			sum+=n;
		}
		return (sum/num.length);
	}
}
