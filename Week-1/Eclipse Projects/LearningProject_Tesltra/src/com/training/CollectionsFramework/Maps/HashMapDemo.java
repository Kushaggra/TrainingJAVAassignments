package com.training.CollectionsFramework.Maps;
import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
//		Since Maps aren't Managed separately than other Collection classes, so there's NO ".add()"
//		HashMap supports a null key - ONLY ONE NULL KEY, BECAUSE "keys need to be UNIQUE"
				
		hmap.put(104,"aaa");
		hmap.put(101,"bbb");
		hmap.put(105,null);
		hmap.put(null,"ooo");
		hmap.put(503,"kkk");
		hmap.put(100,"xxx");
		hmap.put(202,"ooo");
		hmap.put(202, "val_updated");
		
		System.out.println("Printing KEYS only-");
		System.out.println(hmap.keySet());
		
		System.out.println();
		System.out.println("Printing VALUES only-");
		System.out.println(hmap.values());
		
		System.out.println();
		System.out.println("Printing KEY VALUES only-");
		System.out.println(hmap.entrySet());
		
		System.out.println();
		for(Integer i: hmap.keySet()) {
			System.out.println("key :"+i+" value ="+hmap.get(i));
		}

	}

}
