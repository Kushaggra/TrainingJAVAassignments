package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.train_tel_001.Employee;

public class mainEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		ApplicationContext is an Interface
		ApplicationContext context = new ClassPathXmlApplicationContext("springConfigEmp.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("C:\\Users\\d960830\\eclipse-workspace\\train-tel-001\\src\\main\\java\\springConfigEmp.xml");
//		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\d960830\\eclipse-workspace\\train-tel-001\\src\\main\\java\\springConfigEmp.xml");
		Employee empObj = (Employee) context.getBean("empid");
		System.out.println(empObj);
		
//		AbstractApplicationContext is a class and the implementation of ApplicationContext interface
//		This is done by DOWNCASTING the object of ApplicationContext 
//		to AbstractApplicationContext. this is because AbstractApplicationContext
//		has implemented the ApplicationContext Interface.
		
		((AbstractApplicationContext)context).registerShutdownHook();
		
		
		
		
		
		
		
		
		

	}

}
