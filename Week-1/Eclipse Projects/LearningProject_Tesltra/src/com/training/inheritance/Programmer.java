package com.training.inheritance;

public class Programmer extends Employee {

	private int noOfProjects;
	private String skillSet;
	
	public Programmer(int empID, String empName, int basicSal, int noOfProjects, String skillSet) {
		super(empID, empName, basicSal);
		this.noOfProjects = noOfProjects;
		this.skillSet = skillSet;
	}

	@Override
	public String toString() {
		return "Programmer ["+ super.getDetails()+"noOfProjects=" + noOfProjects + ", skillSet=" + skillSet + "]";
	}

	@Override
	protected double netSalary() {
		this.basicSal+=noOfProjects*1000;
		return this.basicSal;
	}
	
	
}
