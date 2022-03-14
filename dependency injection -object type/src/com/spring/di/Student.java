package com.spring.di;

public class Student {

//           public static void main(String[] args) {
				//creating object of class by new keyword and calling ... is not good way of doing coding
		//hard /tight coupling coding not used 
		//   not used --MathCheat mathCheat = new MathCheat();
		
		//MathCheat mathCheat = new MathCheat(); without main no used to create object
		//mathCheat.mathCheat(); in main method used 
	
	//MathCheat mathCheat = null; // for class  not assigning any object it will be null.
private 	int id;//1
private 	MathCheat mathCheat; //2 ,here  mathCheat is the class type...
	// dependecy name mathCheat
	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat; // if setter method 2then use property in beans.xml and for inner bean mathCheat is inside the student bean  in beans.xml id is not created 
	}

	

	public void setId(int id) {
		this.id = id; // if  setter method 2 then use property in beans.xml
	}

	
	
	



		// student class is dependent on MathCheat class that is  why two objects in client .java







	public void cheating() {   // use method to reduce eroors
		
		
		mathCheat.mathCheat();  
		//use this in a method otherwise error
		
		// automatically it will print math cheating start in mathCheat mehod by passing or calling  this method cheating in client .java  
		
	System.out.println("my id is"+id+"take and do whatever you want to do");
		// printing id value and client.java it will pass cheating . 
	}
	
	
		
		
	}
	









