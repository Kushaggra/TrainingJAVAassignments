package com.manipal.AOPdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConfig.xml");

        Welcome w= (Welcome)context.getBean("welcomeid");
       Sample s = (Sample)context.getBean("sample");
        
       
//       When we have a method which returns something (like the one below), at that time the
//       logging(both types of logging @Before and @After) takes place before the message is returned
      
       
       w.exceptionMessage();
//        But the method body gets executed in between the @Before and @After logging 
//        w.showMessage();
//        System.out.println("==================================================");
//        s.showSample();
//        System.out.println("==================================================");
//        w.getABC();
//    
    
    }
}
