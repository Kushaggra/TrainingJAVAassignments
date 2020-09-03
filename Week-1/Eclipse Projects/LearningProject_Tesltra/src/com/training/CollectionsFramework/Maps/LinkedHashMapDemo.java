package com.training.CollectionsFramework.Maps;
import java.util.*;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
		
		lhmap.put(104,"aaa");
		lhmap.put(101,"bbb");
		lhmap.put(105,null);
		lhmap.put(null,"ooo");
		lhmap.put(503,"kkk");
		lhmap.put(100,"xxx");
		lhmap.put(202,"ooo");
		lhmap.put(202, "val_updated");
		
		System.out.println();
		for(Integer i: lhmap.keySet()) {
			System.out.println("key :"+i+" value ="+lhmap.get(i));
		}

	}

}
