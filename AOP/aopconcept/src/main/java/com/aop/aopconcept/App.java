package com.aop.aopconcept;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;
import com.aop.services.PaymentServiceImpl;

public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/aopconcept/config.xml");
    	
    	PaymentService paymentObject = context.getBean("payment", PaymentService.class);
    	
    	//PaymentServiceImpl paymentObject = context.getBean("payment", PaymentServiceImpl.class);
    	// error why?of using 
    	
    	
    	
    	// now here above makepayment /auth , print "paymentstarted" to use aop concept/ not modify the code 
    	// msg or auth, use aop here above make payment method 
    	
    	//payment strted of printbefore function   of myaspect class will run  here below.....
    	
    	
    	
    	
    	
    	paymentObject.makePayment(123);
    	
    	
    }
    
    
}
