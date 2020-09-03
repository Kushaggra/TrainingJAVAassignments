package com.manipal.Shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ShapeApplication 
{
    public static void main( String[] args )
    {

    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
 
    	Line lObj = (Line) context.getBean("line");
    	Triangle pObj = (Triangle) context.getBean("triangle");
    	
    	System.out.println("Line Coordinates:");
    	System.out.println(lObj);
    	System.out.println();
    	System.out.println("Triangle Coordinates:");
    	System.out.println(pObj);
    	
    }
}
