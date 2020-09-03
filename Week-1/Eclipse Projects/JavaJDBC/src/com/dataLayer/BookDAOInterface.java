package com.dataLayer;

import java.util.ArrayList;

import com.bean.model;

public interface BookDAOInterface {

	ArrayList<model> getAllBooks();
	 void addBook(model b);
	 boolean UpdatePrice(int bid, int bprice);
	 model findBookByName(String bName);
	
}
