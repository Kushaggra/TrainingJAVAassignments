package com.training.inheritance;

public class Manager extends Employee {

	private String deptName;
	private int empCount;
	
//	Constructor
	public Manager(int empID, String empName, int basicSal, String deptName, int empCount) {
		super(empID, empName, basicSal);
		this.deptName = deptName;
		this.empCount = empCount;
	}
	


	//	Overridden Function - Dynamic Polymorphism 
	//Annotation is not compulsory, its just good to have, not mandatory
	@Override
	public String getDetails() {
		return "Manager [" + super.getDetails()+ "deptName = "+ deptName +" empCount = "+ empCount;
	}

	@Override
	public String toString() {
		return "Manager [" + super.getDetails()+ "deptName=" + deptName + ", empCount=" + empCount + "]";
	}
	
	
	
//	Getter
	public String getDeptName() {
		return deptName;
	}

	public int getEmpCount() {
		return empCount;
	}


	protected double netSalary() {
		// TODO Auto-generated method stub
			this.basicSal+=(empCount*1000);
			return this.basicSal;
	}
	
	
	
}
