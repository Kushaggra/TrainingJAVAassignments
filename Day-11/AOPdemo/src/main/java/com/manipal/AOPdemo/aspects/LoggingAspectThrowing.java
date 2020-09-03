package com.manipal.AOPdemo.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class LoggingAspectThrowing {
	@AfterThrowing("execution(public * com.manipal.AOPdemo.Welcome.*(..))") 
	public void afterThrowing(JoinPoint jp) {
		System.out.println("After Throwing "+jp.getKind());
	}

}
