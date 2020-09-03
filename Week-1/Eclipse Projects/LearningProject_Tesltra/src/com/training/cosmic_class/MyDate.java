package com.training.cosmic_class;

public class MyDate {

//	POJO Classes - Plain Old Java Object Classes
	
	private int dd,mm,yy;

public MyDate(int dd, int mm, int yy) {
	super();
	this.dd = dd;
	this.mm = mm;
	this.yy = yy;
}

@Override
public String toString() {
	return "MyDate [dd=" + dd + ", mm=" + mm + ", yy=" + yy + "]";
}

@Override
public int hashCode() {
	// Here we need to write a code that generates any unique combination of dd,mm,yy
	//The code provided here is  provided by Eclipse, we can change it according to ourselves
	
	final int prime = 31;
	int result = 1;
	result = prime * result + dd;
	result = prime * result + mm;
	result = prime * result + yy;
	return result;
}

@Override
public boolean equals(Object obj) {
	//Here we just need to compare the objects
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	MyDate other = (MyDate) obj;
	if (dd != other.dd)
		return false;
	if (mm != other.mm)
		return false;
	if (yy != other.yy)
		return false;
	return true;
}


	
	
}
