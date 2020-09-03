package com.training.CollectionsFramework.Collections;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		System.out.println("ARRAYLIST DEMO");System.out.println();

		//		Defaulted ArrayList size is 10, but we can specify its size as well
//		ArrayList has Dynamic Memory allocation
//		Every reference of ArrayList is a reference of OBJECT class, thus we can add any sort of data inside ArrayList
		
		ArrayList a1 = new ArrayList();
		
		a1.add(3);
		a1.add(3.567);
		a1.add("Kushaggra Sharma");
		a1.add('c');
		a1.add(true);
		
		
		System.out.println(a1);
		
//		printing Heterogeneous ArrayList using Enhanced FOR loop
		System.out.println("Printing Heterogeneous ArrayList using Enhanced FOR loop");
		for(Object ele: a1) {
			System.out.print(ele+" ");
		}
		
//		This is an ORDERED LIST : the elements are in the same order as they were entered.
//		Base class reference to derived class object
		List<String> a2 = new ArrayList<String>();

		a2.add("Kushaggra");
		a2.add("Luna");
		a2.add("Harry");
		System.out.println(a2);
		
//		Adding an element at a specific index
		a2.add(2,"Harshu");
		System.out.println(a2);
		
//		Removing an element from a specific index
		a2.remove(3);
		System.out.println(a2);
		
//		Adding a subarray to a specific location of a pre-existing ArrayList
		ArrayList<String> subarr = new ArrayList();
		subarr.add("New ele-1");
		subarr.add("New ele-2");
		subarr.add("New ele-3");
		
		a2.addAll(1,subarr);
		System.out.println(a2);
		
//		Getting the element at a particular location
		System.out.println(a2.get(4));
		
		
//		printing an ArrayList using Enhanced FOR loop
		for(String ele: a2) {
			System.out.print(ele+" ");
		}
		
		System.out.println(" ");
		
//		printing ArrayList using Traditional for loop, because this loop gives more customizations
		for(int i=0; i<a2.size();++i){
			System.out.print(a2.get(i)+ " ");
		}
		
//		printing using iterator class
		System.out.println(" ");
		Iterator<String> it = a2.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		
	}

}
