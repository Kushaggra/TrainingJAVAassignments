package com.training.Comparator;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("COMPARATOR Demo");System.out.println();
		
		ArrayList<Person> plist = new ArrayList<Person>();
		
		System.out.println("Sorting According to age:");
		plist.add(new Person(10,"xxx",72));
		plist.add(new Person(20,"yyy",45));
		plist.add(new Person(30,"zzz",38));
		plist.add(new Person(40,"www",27));
		plist.add(new Person(50,"sss",60));

//		Collections.sort(plist,new AgeComparator());
		
		for(Person ele: plist) {
			System.out.println(ele);
		}
	}

}
