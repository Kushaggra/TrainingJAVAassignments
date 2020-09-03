package com.training.ComparableDemo;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("COMPARABLE Demo");System.out.println();
		
		ArrayList<Student> slist = new ArrayList<Student>();
		slist.add(new Student(10,"xxx",70));
		slist.add(new Student(20,"yyy",75));
		slist.add(new Student(30,"zzz",68));
		slist.add(new Student(40,"www",97));
		slist.add(new Student(50,"sss",70));
		
//		Sorting function provided by JAVA,
//		but we have Overridden it to sort the collections according to our need (in Student class)
		Collections.sort(slist);
		
		for(Student ele: slist) {
			System.out.println(ele);
		}
	}
}
