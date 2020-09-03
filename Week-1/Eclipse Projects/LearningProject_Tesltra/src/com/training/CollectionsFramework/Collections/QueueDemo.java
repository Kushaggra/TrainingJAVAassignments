package com.training.CollectionsFramework.Collections;
import java.util.*;

public class QueueDemo {

	public static void main(String[] args) {
		System.out.println("QUEUE DEMO");System.out.println();

//		Parent Class reference to child class object
		Queue<String> q = new LinkedList<String>();
		
		q.offer("Quit");
		q.add("JAVA");
		q.add("JavaScript");
		q.add("HTML-5");
		q.add(".NET");
		q.add("Python");
		q.add("PHP");
		
		System.out.println(q);
		System.out.println("Peeking element in FIFO - "+ q.peek());
		System.out.println("Removing element in FIFO - "+ q.poll());
		System.out.println("Peeking element in FIFO - "+ q.peek());
		System.out.println("Removing element in FIFO - "+ q.remove());
		System.out.println(q);
		

	}

}
