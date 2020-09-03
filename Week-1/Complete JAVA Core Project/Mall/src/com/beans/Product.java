package com.beans;

public class Product implements Comparable<Product> {

	private int pID;
	private String pName;
	private int pCost;
	
	public Product(int pID, String pName, int pCost) {
		super();
		this.pID = pID;
		this.pName = pName;
		this.pCost = pCost;
	}

	@Override
	public String toString() {
		return "Product [pID=" + pID + ", pName=" + pName + ", pCost=" + pCost + "]";
	}

	
	public int getpID() {
		return pID;
	}

	public String getpName() {
		return pName;
	}

	public int getpCost() {
		return pCost;
	}

	@Override
	public int compareTo(Product o2) {
		if(pID<o2.getpID())
			return 1;
		if(pID==o2.getpID())
			return 0;
		else
		return -1;
	}
	

}
