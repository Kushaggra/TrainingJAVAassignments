package com.manipal.train_tel_001;

public class Employee {
	private long empID;
	private String empName;
	private double salary;
	private Address address; 
	
	public Employee(long empID, String empName, double salary, Address address) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", \naddress=" + address
				+ "]";
	}

	void initialize() {
		System.out.println("Initializing......");
	}
	
	void destroy() {
		System.out.println("...Destroyed");
	}
}
