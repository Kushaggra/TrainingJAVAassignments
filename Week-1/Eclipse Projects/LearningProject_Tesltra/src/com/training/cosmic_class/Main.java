package com.training.cosmic_class;

public class Main {

	public static void main(String[] args) {
		MyDate d1= new MyDate(24,8,2020);
		MyDate d2= new MyDate(24,8,2020);

		System.out.println(d1==d2);					//false
		System.out.println(d1.equals(d2));			//false - if equals() and hashCode() were not overridden
													//true - when we have overridden both the methods
		
		String s1 = "good";
		String s2 = "good";
		System.out.println(s1==s2);					//true , this happens because in String class .equals()
													// is Overridden to check the contents
	}

}
