package com.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


// aspect
@Aspect
public class MyAspect {

	
	// advice is an action taken b aspect at any joinpoint
	@Before("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	// before is a advice add expression which is  pointcut expression add here which will match 
	// inside class psimpl make payment method is there
	// * means any return type all
	
	
	
	public void printBefore()
	{
		
		System.out.println("Payment started before");
		
	}
	
	
	@After("execution(* com.aop.services.PaymentServiceImpl.makePayment(..))")
	// before is a advice add expression which is  pointcut expression add here which will match 
	// inside class psimpl make payment method is there
	// * means any return type all
	public void printAfter()
	{
		
		System.out.println("Payment done  ");
		
	}


	


}
