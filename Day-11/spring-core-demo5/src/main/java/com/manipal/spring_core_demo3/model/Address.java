package com.manipal.spring_core_demo3.model;

public class Address {
	
	private int streetNo;
	private String city;
	private String pin;
	
	public int getStreetNo() {
		return streetNo;
	}
	public void setStreetNo(int streetNo) {
		this.streetNo = streetNo;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "\nAddress [streetNo=" + streetNo + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
}