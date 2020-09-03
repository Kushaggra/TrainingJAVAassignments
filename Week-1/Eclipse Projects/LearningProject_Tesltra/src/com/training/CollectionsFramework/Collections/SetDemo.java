package com.training.CollectionsFramework.Collections;

import java.util.*;

public class SetDemo {

	public static void main(String[] args) {
		System.out.println("SET DEMO");System.out.println();

		//		Parent Class Reference 
		Set s = new HashSet();
		
		/*
		 * Set: 
		 * 		doesn't allow Duplicate items 
		 * 		there's NO ORDER MAINTAINED, since it maintains a HashCode for every element
		 * 		can be used when we need to have a primary key value
		 */
		
		s.add(1);
		s.add("Luna");
		s.add(3.5432);
		s.add(null);
		s.add("Luna");
		s.add(3.5432);
		s.add(null);
		s.add(0.123);
		s.add(0.126);
		
		System.out.println(s);
		
		Set<String> stringSet = new HashSet();
		stringSet.add("Luna");
		stringSet.add("Lovegood");
		stringSet.add("Kushaggra");
		stringSet.add("Sharma");
		stringSet.add("Harry");
		stringSet.add("Potter");
		
		System.out.println("HashSet - No Order is MAINTAINED-\n"+stringSet);
		System.out.println();
		
		Set<String> stringListSet = new LinkedHashSet<String>();
		stringListSet.add("Luna");
		stringListSet.add("Lovegood");
		stringListSet.add("Kushaggra");
		stringListSet.add("Sharma");
		stringListSet.add("Harry");
		stringListSet.add("Potter");
		
		System.out.println("LinkedHashSet - Order of Insertion MAINTAINED-\n"+stringListSet);
		System.out.println();
		
		Set<String> stringTreeSet = new TreeSet<String>();
		stringTreeSet.add("Luna");
		stringTreeSet.add("Lovegood");
		stringTreeSet.add("Kushaggra");
		stringTreeSet.add("Sharma");
		stringTreeSet.add("Harry");
		stringTreeSet.add("Potter");
		
		System.out.println("TreeSet - SORTED -\n"+stringTreeSet);
		System.out.println();	
		
	}
}
