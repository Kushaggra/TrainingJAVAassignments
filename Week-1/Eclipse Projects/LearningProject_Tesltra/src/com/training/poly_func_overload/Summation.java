package com.training.poly_func_overload;

public class Summation {

	public static int add(int x, int y) {
		return(x+y);
	}
	
	public static double add(int x, long y, double z) {
		return(x+y+z);
	}
	
	public static String add(String x, String y) {
		return(x+" "+y);
	}
	
}
