package com.training.CollectionsFramework.Maps;

import java.util.*;

public class TreeMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> thmap = new TreeMap<Integer,String>();
		
//		TreeMap can't have "null" as a key
		thmap.put(104,"aaa");
		thmap.put(101,"bbb");
		thmap.put(105,null);
//		thmap.put(null,"ooo");
		thmap.put(503,"kkk");
		thmap.put(100,"xxx");
		thmap.put(202,"ooo");
		thmap.put(202, "val_updated");
		
		System.out.println();
		for(Integer i: thmap.keySet()) {
			System.out.println("key :"+i+" value ="+thmap.get(i));
		}

	}


}
