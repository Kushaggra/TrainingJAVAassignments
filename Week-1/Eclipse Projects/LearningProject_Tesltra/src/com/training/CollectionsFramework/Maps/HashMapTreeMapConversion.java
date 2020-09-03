package com.training.CollectionsFramework.Maps;
import java.util.*;

import com.training.Comparator.*;
import com.training.Comparator.Person;

public class HashMapTreeMapConversion {

	public static void main(String[] args) {
		System.out.println("HASHMAP TO TREEMAP Demo");System.out.println();

		//HashMap has 
		//	KEY   = Person Object;
		//	Value = String - Person's hometown
		
		Map<Person,String> mp = new HashMap<Person,String>();
		mp.put(new Person(100,"Kushaggra",22), "Delhi");
		mp.put(new Person(234,"Luna",22), "Udaipur");
		mp.put(new Person(203,"Rishabh",25), "Bangalore");
		mp.put(new Person(120,"Nikhil",35), "Hyderabad");
		
		//Now we need to convert this "mp" from HashMap to TreeMap which sorts data according to ID;

		//We need to make an object of IDComparator class that we defined in com.training.Comparator
		IDComparator comp = new IDComparator(mp);
		
		Map<Person,String> tmp = new TreeMap<Person,String>(comp);
		
//		Adding values from HashMap to TreeMap
		tmp.putAll(mp);
		
		for(Person key : tmp.keySet()) {
			System.out.println("Key = "+key+ " Value = "+tmp.get(key));
		}
		

	}

}
