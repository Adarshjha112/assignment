package com.spring.di;

public class Student {
	
	// String studentName = "hihhgh"; no hard coding tightly coupled
	 private String studentName ;
	  private int id;
	 
	 
	  //using  Setter methods example 
	  
	  
	 // public void setId(int id) {
		//this.id = id;
	//}




	//public void setStudentName(String studentName) {
		//this.studentName = studentName;
	//}

	  
	  
	  // using constructor method 
	  	
	  public Student(int id) {
		  this.id = id;
	  }

		public Student(String studentName, int id) {
			
			this.studentName = studentName;
			this.id = id;
		}
	  
	  
	  
	  
	public void displayStudentInfo() {
		  System.out.println("the name is "  +studentName  +  "and the id is:" +id );
		  
		  
	  }



}
