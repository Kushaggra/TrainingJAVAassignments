package com.training.static_demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class Person {

	final private String pID;	// final because we need to make pID as a contanst (immutable)
	private String pName;
	private int pAge;
	
//	Static variable for a class has only SINGLE copy for the entire class
//	Static Variable is a property of a class and not a variable
	private static String count;	
	
//	We need a "static block" to set a value for the static variable
//	Its execution is done before the Constructor
	static {
		count ="null";
	}

	public static String getCount() {
		
		Random rand = new Random();
		int code=(rand.nextInt(9000)+1111);
		
		String timeStamp = new SimpleDateFormat("yyMMddHHmmss").format(Calendar.getInstance().getTime());
		count = timeStamp+code;
		return (count);
	}
	
	
//	Constructor
	public Person(String pName, int pAge) {
		super();
		this.pID = getCount();
		this.pName = pName;
		this.pAge = pAge;
	}


	@Override
	public String toString() {
		return "Person [pID=" + pID + ", pName=" + pName + ", pAge=" + pAge + "]";
	}
	
	
}
