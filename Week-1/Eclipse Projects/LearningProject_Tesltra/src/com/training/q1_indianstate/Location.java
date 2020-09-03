package com.training.q1_indianstate;

public class Location {

	private String name;
	private String address;
	private int PINcode;
	public Location(String name, String address, int pINcode) {
		super();
		this.name = name;
		this.address = address;
		PINcode = pINcode;
	}
	
	
//	toString
	@Override
	public String toString() {
		return "Location [name=" + name + ", address=" + address + ", PINcode=" + PINcode + "]";
	}

//	Getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getPINcode() {
		return PINcode;
	}
	
}
