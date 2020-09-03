package com.training.oops;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book = new Book(10, "Alchemist", 400);
		
		//Here since toString() was overridden in class Book, the output for both the statements is same.
		System.out.println(book.toString());
		System.out.println(book);
		
		// Had we not overridden toString() method, the output would have been-
		// com.training.oops.Book@<some_hex_code> which is packagename+classname@object_reference_code
	}

}
