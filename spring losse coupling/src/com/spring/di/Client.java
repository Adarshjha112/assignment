package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
	 public static void main(String []args) {
		 
//		 Student student = new Student();//object1 spring do
	//	 MathCheat cheat = new MathCheat();// object2 spring do
		// student.setMathCheat(cheat);// passing the object cheat  in method spring do
		 // student.cheating();
		 
		 // two objects that is why in beans.xml create two classes of objects ..firest student then 
		
		 ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		 System.out.println("beans.xml file loaded");
		Student student = context.getBean("stu", Student.class);
		 student.cheating();
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
