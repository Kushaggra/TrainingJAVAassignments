package com.training.static_demo;

public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("Kushaggra",22);
		System.out.println(p1);
		Person p2 = new Person("Rishabh",22);
		System.out.println(p2);
		Person p3 = new Person("Ajanta",21);
		System.out.println(p3);
		Person p4 = new Person("Hemant",23);
		System.out.println(p4);
		System.out.println(" ");
		System.out.println("Accessing Static Variable doesn't require an object creation,\nValue of Static variable = "+Person.getCount());
	}

}
