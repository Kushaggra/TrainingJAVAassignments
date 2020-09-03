package com.beans;
import java.util.*;

import com.functionality.ProductOps;

public class ProductCollection implements ProductOps{

	public Set<Product> tp = new TreeSet<Product>();

//	public ProductCollection(TreeSet<Product> tp) {
//		super();
//		this.tp = tp;
//	}


	@Override
	public void addProduct(Product p) {
	
		tp.add(p);
		System.out.println("Product Added\n\n");
		
		
	}

	
	@Override
	public void deleteProduct(int id) {
		if(tp.isEmpty()) {
			System.out.println("No Product in the List\n");
			return;
		}
		else
		for(Product p: tp) {
			if(p.getpID()==id) {
				System.out.println("The product removed is :"+ p.getpName());
				tp.remove(p);
				break;
			}
		}
	}

	@Override
	public void showAllproducts() {
//		System.out.println(tp);
		if(tp.isEmpty())
			System.out.println("Empty List");
		else
		for(Product p : tp) {
			System.out.println(p);
		}
	}

	@Override
	public void findElementByID(int ID) {
		int flag=0;
		for(Product p: tp) {
			if(p.getpID()==ID) {
				flag =1;
				System.out.println(p);
			}
		}
		if (flag==0) {
			System.out.println("Element with ID:"+ID+" doesn't exist.\n");
		}
	}
}
