package com.manipal.spring_core_demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.manipal.spring_core_demo3.model.Employee;
import com.manipal.spring_core_demo3.model.Organization;

public class App{
    public static void main( String[] args ){
    	ApplicationContext context = new FileSystemXmlApplicationContext("src\\main\\java\\spring3.xml");
    	Organization org = (Organization) context.getBean("organization");  
    	System.out.println(org);
    }
}
