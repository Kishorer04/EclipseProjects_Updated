package Generics;

public class Employees {
	
	String name;
	int age;
	int salary;
	
	Employees(String name,int age,int salary){
		this.name=name;
		this.age=age;
		this.salary=salary;				
	}
	
	  public String toString() { 
		  return this.name +" "+ this.age+" " + this.salary;
	  
	  }
	 

}
