package com.training.Comparator;
import java.util.*;

public class IDComparator implements Comparator<Person>{

	Map<Person,String> map;

	public IDComparator(Map<Person, String> map) {
		super();
		this.map = map;
	}

	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getpID()>o2.getpID())
			return 1;
		else if(o1.getpID()==o2.getpID())
			return 0;
		else
			return -1;
	}
	
}
