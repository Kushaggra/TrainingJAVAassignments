package com.manipal.AOPdemo.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspectReturning {
	
//	Logger logger = LoggerFactory.getLogger(LoggingAspectReturning.class);
//	
//	@AfterReturning(
//			pointcut="execution(public * com.manipal.AOPdemo.Welcome.*(..))", 
//			returning = "returnVal")
//	public void afterReturningAdvice(Object returnVal) {
//		
//		logger.info("Logger");
		
//		if(returnVal == null) {
//			System.out.println("returnVal is NULL");
//		}else {
//			System.out.println("returnVal - it's not null!");
//		}
		
//	}
}
