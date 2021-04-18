package com.ywalakamar.project;

public class Website {
	//fields or instance variables
	String name;
	int age;
	
	
	//default constructor
	Website(){
		this.name="Amazon";
		this.age=18;
	}
	//parametized constructor
	Website(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public static void main(String args[]) {
		//Create objects
		Website obj1=new Website("Facebook", 12);
		Website obj2=new Website("Google", 21);
		Website obj3=new Website();
		
		//Accessing data through reference
		System.out.println(obj1.name+" "+obj1.age);
		System.out.println(obj2.name+" "+obj2.age);
		System.out.println(obj3.name+" "+obj3.age);
		
	}
}
