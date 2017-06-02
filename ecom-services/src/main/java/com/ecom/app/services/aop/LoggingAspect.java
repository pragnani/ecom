package com.ecom.app.services.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
	
	@Before("execution(String com.ecom.app..*.get*())")
	public void logTestController(JoinPoint jointPoint){
		
		System.out.println("Get method is invoked " + jointPoint.getSignature().getName());
		
	}
	@After("execution(String com.ecom.app..*.get*())")
	public void logAfterTestController(JoinPoint jointPoint){
		
		System.out.println("Get method is invoked after " + jointPoint.getSignature().getName());
		
	}
	@Around("execution(String com.ecom.app..*.get*())")
	public void logAroundTestController(ProceedingJoinPoint jointPoint) throws Throwable{
		System.out.println("before call");
		jointPoint.proceed();
		System.out.println("After call");
		
	}

}
