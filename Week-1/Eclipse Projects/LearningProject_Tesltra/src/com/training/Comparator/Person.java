package com.training.Comparator;


public class Person{

	private int pID;
	private String pName;
	private int pAge;
	
	public Person(int pID, String pName, int pAge) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pAge = pAge;
	}

	public int getpID() {
		return pID;
	}

	public String getpName() {
		return pName;
	}

	public int getpAge() {
		return pAge;
	}

	@Override
	public String toString() {
		return "Person [pID=" + pID + ", pName=" + pName + ", pAge=" + pAge + "]";
	}

}
