package com.manipal.AOPdemo.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspectAround {

	@Around("execution(public * *(..))")
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
		
		System.out.println("----------Before---------");
		
		Object obj = pjp.proceed();
		
		System.out.println("----------After----------");
		return obj;
	}
}
