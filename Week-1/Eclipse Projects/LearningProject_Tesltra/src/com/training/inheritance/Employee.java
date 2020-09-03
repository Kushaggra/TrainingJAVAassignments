package com.training.inheritance;

public abstract class Employee {

//	"protected" Access Specifier makes these variables available to all derived classes and also within the package
	protected int empID;
	protected String empName;
	protected int basicSal;
	
	public Employee(int empID, String empName, int basicSal) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.basicSal = basicSal;
	}

	protected abstract double netSalary();
	
	public String getDetails() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", basicSal=" + basicSal + "]";
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", basicSal=" + basicSal + "]";
	}
	
	public String getEmpName() {
		return empName;
	}
}
