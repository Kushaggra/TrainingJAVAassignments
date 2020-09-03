package com.Comparators;

import java.util.Comparator;

import com.beans.Product;

public class IDComparator implements Comparator<Product> {
	@Override
	public int compare(Product o1, Product o2) {
		if(o1.getpID()<o2.getpID())
			return 1;
		if(o1.getpID()==o2.getpID())
			return 0;
		else
		return -1;
	}
	
}
