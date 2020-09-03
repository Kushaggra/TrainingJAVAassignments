package com.beans;

public class Cart implements Comparable<Cart>{

	private int cID;
	private String cName;
	private int cRate;
	private int cQuant;
	private int cPrice;
	
//	Getters
	public int getcID() {
		return cID;
	}

	public String getcName() {
		return cName;
	}

	public int getcRate() {
		return cRate;
	}

	public int getcQuant() {
		return cQuant;
	}

	public int getcPrice() {
		return cPrice;
	}


	public Cart(int cID, String cName, int cRate, int cQuant, int cPrice) {
		super();
		this.cID = cID;
		this.cName = cName;
		this.cRate = cRate;
		this.cQuant = cQuant;
		this.cPrice = cPrice;
	}



	@Override
	public String toString() {
		return "Cart [ID=" + cID + ", Name=" + cName + ", Rate=" + cRate + ", Quant=" + cQuant + ", Price=" + cPrice
				+ "]";
	}


	@Override
	public int compareTo(Cart o2) {
		if(cID<o2.getcID())
			return 1;
		if(cID==o2.getcID())
			return 0;
		else
		return -1;
	}
}
