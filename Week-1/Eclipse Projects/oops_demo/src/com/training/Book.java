package com.training;

public class Book {
// Description of the the entity is called the data member / instant variable:
	
//	Every instance is given memory space to hold its state
	int bID;
	String bName;
	int bPrice;
	
	
	
//	Methods:
	
//	Special method called - Constructor 
//	This method doesn't return any value because it returns 
	public Book(int bID, String bName, int bPrice) {
		super();
		this.bID = bID;
		this.bName = bName;
		this.bPrice = bPrice;
	}

	
// Why is it Overridden?
// Root class : Object Class : toString()
	
	@Override
	public String toString() {
		return "Book [bID=" + bID + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	}
	
	
}
