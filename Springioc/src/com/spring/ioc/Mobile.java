package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
	//	Airtel airtel = new Airtel();
	//	airtel.calling();
		//airtel.data();
    //  Vodaphone vodaphone= new Vodaphone();
		//vodaphone.calling();
		//vodaphone.data();
		
	//	Sim sim = new Airtel();
	//	sim.calling();
		//sim.data();
		ApplicationContext  context = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("config loaded");
	//Airtel air	=(Airtel)context.getBean("airtel");
	//	air.calling();
	//	air.data();
		
		//we use interface variable in beans.xml and in mobile.java 
		
		Sim sim = context.getBean("sim",Sim.class);
		sim.calling();
		sim.data();
		
		
	}

}
