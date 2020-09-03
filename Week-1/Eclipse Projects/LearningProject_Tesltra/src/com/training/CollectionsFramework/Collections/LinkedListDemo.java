package com.training.CollectionsFramework.Collections;
import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) {
		System.out.println("LINKEDLIST DEMO");System.out.println();

		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Orange");
		l1.add("Apple");
		l1.add("Grapes");
		l1.add("Cheeku");
		l1.add("Strawberry");
		
		System.out.println(l1);
		System.out.println("Size of l1 = "+l1.size());
		System.out.println("isEmpty = "+ l1.isEmpty());
		
//		Case Sensitive
		System.out.println("Contains grapes = "+ l1.contains("Grapes"));
		
//		Traversal Using Iterator
		ListIterator<String> it = (ListIterator<String>) l1.iterator();
		
		//Forward Traversal
		System.out.println("Traversal in forward Direction");
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
		
		System.out.println("\n");
		//Backward Traversal
		System.out.println("Traversal in backward Direction");
		while(it.hasPrevious()) {
			System.out.print(it.previous()+" ");
		}
		
		
//		Iterator<String> it2 = l1.iterator();
//		ListIterator<String> it = (ListIterator<String>) l1.iterator();
		
//		Now the difference between "Iterator" and "ListIterator" is that ListIterator is capable of both
//		sides of traversal, whereas Iterator has only forward iteration Capabilities.
//		ListIterator is mainly used for LinkedList, but can be used with other Collections as well.
		
		
		/*	Collections.reverse(l1);
			Collections.shuffle(l1);
			Collections.sort(l1);
		*/
		
	}

}
