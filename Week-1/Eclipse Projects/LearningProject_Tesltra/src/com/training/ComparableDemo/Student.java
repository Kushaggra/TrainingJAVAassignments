package com.training.ComparableDemo;

public class Student implements Comparable<Student> {

	@Override
	public String toString() {
		return "Student [ID=" + ID + ", name=" + name + ", marks=" + marks + "]";
	}


	private int ID;
	private String name;
	private int marks;
	public Student(int iD, String name, int marks) {
		super();
		ID = iD;
		this.name = name;
		this.marks = marks;
	}
	
//	Getters
	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}


	@Override
	public int compareTo(Student o) {
	
		/*
		 * // Descending Order of Marks
		 * 
		 * if(this.marks==o.marks) 
		 * 		return 0; 
		 * if(this.marks<o.marks)
		 * 		return 1; 
		 * else return -1;
		 * 
		 */
		
//		Descending order of names
		return (-1*(name.compareTo(o.name)));
	}
	
}
