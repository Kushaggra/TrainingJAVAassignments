package com.training.Comparator;
import java.util.*;

public class AgeComparator implements Comparator<Person> {

	Map<Person,String> map;
	
	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getpAge()>o2.getpAge())
			return 1;
		else if(o1.getpAge()==o2.getpAge())
			return 0;
		else
			return -1;
	}

	public AgeComparator(Map<Person, String> map) {
		super();
		this.map = map;
	}
	
}
