package com.training.CollectionsFramework.Collections;
import java.util.*;

public class BookArrayList {

	private int bID;
	private String bName;
	private int bPrice;
	
	public BookArrayList(int bID, String bName, int bPrice) {
		super();
		this.bID = bID;
		this.bName = bName;
		this.bPrice = bPrice;
	}
	@Override
	public String toString() {
		return "BookArrayList [bID=" + bID + ", bName=" + bName + ", bPrice=" + bPrice + "]";
	};
	
	public static void main(String[] args) {
		List<BookArrayList> books = new ArrayList();
		books.add(new BookArrayList(10,"Alchemist",300));
		books.add(new BookArrayList(11,"Da Vinci Code",450));
		books.add(new BookArrayList(12,"Tempest",200));
		books.add(new BookArrayList(13,"Inferno",400));

		Iterator<BookArrayList> it= books.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next().bName);
		}
	}
}
