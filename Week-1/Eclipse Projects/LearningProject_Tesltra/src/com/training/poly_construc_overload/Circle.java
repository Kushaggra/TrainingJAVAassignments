package com.training.poly_construc_overload;

public class Circle {

	private double radius;
	private String color;
	
//	Constructor Overloading
	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = color;
	}
	
	public Circle() {
		this(3.5,"Blue");		//Invoking fully parameterized constructor inside the other Constructor
	}
	
	public Circle(double radius) {
		this(radius, "Brown");
	}
	
	public Circle(String color){
		this(6.5,color);
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
}
