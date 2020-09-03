package com.training.commandline_args;

public class Main {

	public static void main(String[] args) {
//		String str1= args[0];
//		String str2= args[1];
		
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		System.out.println("Sum = "+ (n1+n2));
		
	}

}
