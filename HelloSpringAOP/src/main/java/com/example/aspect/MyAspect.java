package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("aspect")
@Aspect
public class MyAspect {
	
	@After("execution(public int draw*(*))")
	public void snackBreak(JoinPoint jp) {
		System.out.println("snack break!");
	}
	/*
	 * @After is the advice
	 * Pointcut is after the annotation, i.e. public int draw*(*)
	 * 
	 * "*" - a wildcard for return types and method naming
	 * ".." - a wildcard for our parameter list
	 * "*" - a wildcard for a SINGLE parameter in the parameter list
	 */
	
	@Before("execution(* *p*t*er*(..))")
	public void findPotteryMethod(JoinPoint jp) {
		System.out.println("next method will be pottery");
	}
	
	@Around("execution(* scul*(..))")
	public void testAroundAdvice(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("putting on an apron");
		pjp.proceed();
		System.out.println("clean up");
	}

}
