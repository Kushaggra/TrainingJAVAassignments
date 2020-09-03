package com.training.poly_construc_overload;

public class Main {

	public static void main(String[] args) {
		System.out.println("Default Constructor:");
		Circle c1 = new Circle();
		System.out.println(c1);
System.out.println(" ");
		System.out.println("Fully Parameterized Constructor:");
		Circle c2 = new Circle(3.4,"Magenta");
		System.out.println(c2);
System.out.println(" ");
		System.out.println("Partially Parametrized Constructor with only color given:");
		Circle c3 = new Circle("Green");
		System.out.println(c3);
System.out.println(" ");
		System.out.println("Partially Parametrized Constructor with only radius given:");
		Circle c4 = new Circle(10.9);
		System.out.println(c4);
	}

}
