package com.JDBCdemo;
import java.sql.*;
import java.util.*;

import com.bean.model;
import com.dataLayer.BookDAOimplement;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<model> mlist = new ArrayList<model>();
		BookDAOimplement obj  = new BookDAOimplement();
		model temp = new model(80,"Da Vinci Code",350);
		
		mlist=obj.getAllBooks();
		for(model m: mlist) {
			System.out.println(m);
		}
//		
//		obj.addBook(temp);
//		
//		mlist=obj.getAllBooks();
//		for(model m: mlist) {
//			System.out.println(m);
//		}
//		
		obj.UpdatePrice(60, 380);
		mlist=obj.getAllBooks();
		for(model m: mlist) {
			System.out.println(m);
		}
		
		System.out.println(obj.findBookByName("Alchemist"));
		
	}
}
