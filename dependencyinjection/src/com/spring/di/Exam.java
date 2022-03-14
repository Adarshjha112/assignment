package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {

	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student abhi = context.getBean("student", Student.class);
		 abhi.displayStudentInfo();
		 
		 
		 Student k = context.getBean("ram", Student.class);
		 k.displayStudentInfo();
	 
		 
		 
		 
			//ApplicationContext contex = new ClassPathXmlApplicationContext("beans.xml");
			
		//Student jha = context.getBean("adarsh" , Student.class);
	//	jha.displayStudentInfo();
		
		 //for constr in java 
		 //Student kk = new Student("ada",1);
		// kk.displayStudentInfo();
		 
		 
		 // construction injection in spring
		
		// dont needed -replace property with constructor-arg in beans.xml
		
		 
		 
		 
		 
	}
}
