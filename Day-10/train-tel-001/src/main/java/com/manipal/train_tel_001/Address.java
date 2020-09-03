package com.manipal.train_tel_001;

public class Address {
	
	private int streetNo;
	private String city;
	private String pin;
	public Address(int streetNo, String city, String pin) {
		super();
		this.streetNo = streetNo;
		this.city = city;
		this.pin = pin;
	}
	@Override
	public String toString() {
		return "Address [streetNo=" + streetNo + ", city=" + city + ", pin=" + pin + "]";
	}
	
}
