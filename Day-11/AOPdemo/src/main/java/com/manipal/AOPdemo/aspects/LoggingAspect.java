package com.manipal.AOPdemo.aspects;

import java.util.Date;

import org.aspectj.lang.annotation.*;
@Aspect
public class LoggingAspect {
	
	
//	@Before("execution(public * *(..))")
	
//						@Pointcut("execution(public * *(..))")
//						public void showLogPointCut() {
//							
//						}
//						
//						@Before("showLogPointCut()")
//						public void showLogging1() {
//							System.out.println("(Message accessed at "+ new Date()+")--- for get*");
//						}
//						
//						@After("showLogPointCut()")
//						public void showLoggingAfter() {
//							System.out.println("(Message access Over at "+ new Date()+")--- for get*");
//						}
	
	
//	@Before("execution(public * com.manipal.AOPdemo.Welcome.get*())")
//	public void showLogging1() {
//		System.out.println("(Message accessed at "+ new Date()+")--- for get*");
//	}

	
}
