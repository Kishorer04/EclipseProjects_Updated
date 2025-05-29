package com.galaxe.training;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Employee {
	Integer Id;
	String firstName;
	String lastName;
	String DOB;
	Integer Salary;
	String City;
	String Gender;	
	
	
Employee(Integer Id, String firstName, String lastName, String DOB, Integer Salary, String City, String Gender){
	this.Id=Id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.DOB=DOB;
	this.Salary=Salary;
	this.City=City;
	this.Gender=Gender;
	
}


/*	
	
public Integer getId() {
	return Id;
}


public void setId(Integer id) {
	Id = id;
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}




public void setLastName(String lastName) {
	this.lastName = lastName;
}


public String getDOB() {
	return DOB;
}


public void setDOB(String dOB) {
	DOB = dOB;
}


public Integer getSalary() {
	return Salary;
}


public void setSalary(Integer salary) {
	Salary = salary;
}


public String getCity() {
	return City;
}


public void setCity(String city) {
	City = city;
}


public String getGender() {
	return Gender;
}


public void setGender(String gender) {
	Gender = gender;
}

*/


public static void main(String[] args) {
	Integer Id;
	String firstName;
	String lastName;
	String DOB;
	Integer Salary;
	String City;
	String Gender;
	
    Scanner sc = new Scanner(System.in);
	List<Employee> emp =new ArrayList<Employee>();
    do {
    	System.out.println("1: Insert employee records\n"+ "2: Display all employee records\n"+ "3: Delete records\n"+ "4:Update records\n"+ "Display one record based on ID");
    	System.out.println("Enter your choice");
    	
    	int n=sc.nextInt();
    	
    	
    	switch(n) {
    	
    	case 1:
    		System.out.println("Enter ID");
    		Id=sc.nextInt();
    		System.out.println("Enter firstName");
    		firstName=sc.next();
    		System.out.println("Enter lastName");
    		lastName=sc.next();
    		System.out.println("Enter DateOfBirth");
    		DOB=sc.next();
    		System.out.println("Enter Salary");
    		Salary=sc.nextInt();
    		System.out.println("Enter City");
    		City=sc.next();
    		System.out.println("Enter Gender");
    		Gender=sc.next();
    		emp.add(new Employee(Id,firstName,lastName,DOB,Salary,City,Gender));
    		

    	}
    	
    	
    	
    }while(true);
	
}
}


