package com.model;

import java.util.Random;

public class Athlete {

	@Override
	public String toString() {
		return "Athlete [IDshow=" + IDshow + ", name=" + name + ", gender=" + gender + ", category=" + category
				+ ", email=" + email + ", mobile=" + mobile + "]";
	}
	private static int ID;
	private int IDshow;
	private String name;
	private String gender;
	private String category;
	private String email;
	private String mobile;
	
	static {
		ID=10000;
	}
	
	private static int count() {
		Random rand = new Random();
		int temp = rand.nextInt(900000)+100000;
		++ID;
		temp+=ID;
		return temp;
	}
	public static int getID() {
		return count();
	}
	
	
	public int getIDshow() {
		return IDshow;
	}

	public void setIDshow(int iDshow) {
		IDshow = iDshow;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}
