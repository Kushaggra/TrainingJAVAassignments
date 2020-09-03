package com.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.manipal.train_tel_001.Welcome;

public class main {

	public static void main(String[] args) {
	
		//Creating a container to receive the Config. metadata file
//-------------------------------------------------------------------------------------------------------
//   1. BeanFactory is a Container Class but doesn't have all the functionlities
		
    
	/*		BeanFactory factory=new XmlBeanFactory(new ClassPathResource("springConfig.xml"));
			
			Welcome obj = (Welcome) factory.getBean("welcomeid");
			System.out.println(obj.getMessage());

			Welcome obj1 = (Welcome) factory.getBean("welcomeid1");
			System.out.println(obj1.getMessage());
	*/
//-------------------------------------------------------------------------------------------------------		
//		2. ApplicationContext is an advanced container type that has got all the functionalities	
		
			ApplicationContext appObj = new ClassPathXmlApplicationContext("springConfig.xml");
			appObj.getBean("welcomeid");
					
		
	}

}
