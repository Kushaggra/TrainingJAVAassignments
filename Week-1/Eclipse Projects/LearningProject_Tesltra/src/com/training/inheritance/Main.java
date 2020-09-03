package com.training.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Manager m1 = new Manager(200,"Luna",70000,"Data Science",20);
		System.out.println(m1.getDetails());

//		Virtual Method Invocation in JAVA
		Employee emp = new Manager(201, "Kushaggra",70000, "IT",5);
		System.out.println(emp.getDetails());
		
//		Type-casting the base class reference to child class reference to get access to child class methods
//		that were not overridden
		Manager m_converted=(Manager)emp;
		System.out.println(m_converted.getDeptName());
		
//		Utility of storing the child class object in base class reference
//		(We can create Heterogeneous arrays)
		
		//Array of Base Class
		Employee[] empArr = new Employee[5];
		
		//Storing values of all the child classes without having to create separate arrays for all of them
		empArr[0]= new Programmer(301,"Programmer A",55000, 2 , "React JS");
		empArr[0].netSalary();
		
		empArr[1]= new Manager(201, "Kushaggra",80000, "IT",5);
		empArr[1].netSalary();
		
		empArr[2]= new Programmer(302,"Programmer B",55000, 3 , "C++");
		empArr[2].netSalary();
		
		empArr[3]= new Manager(202, "Luna",70000, "Analytics",5);
		empArr[3].netSalary();
		
		empArr[4]= new Programmer(303,"Programmer K",65000, 6 , "JAVA");
		empArr[4].netSalary();
		
		System.out.println(" ");
		System.out.println("Printing the deatails of Employees");
		for(Employee e: empArr) {
			System.out.println(e);
		}
		
//		Updating Salaries after Taxation
		Tax.calcTax(empArr);
		System.out.println(" ");
		System.out.println("Details after Taxation");
		for(Employee e: empArr) {
			System.out.println(e);
		}
		
//		Insurance Amounts
		int[] Insured = Insurance.calcInsurance(empArr);
		System.out.println("\nPrinting Insurance Amounts for each Employee:");
		for(int i=0;i<empArr.length;++i) {
			System.out.println(empArr[i].getEmpName()+" - "+Insured[i]);
		}
		
	}

}
