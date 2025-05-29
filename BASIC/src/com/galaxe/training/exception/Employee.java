package com.galaxe.training.exception;

public class Employee implements Comparable<Employee> {
	private Integer id;
	private String firstName;
	private String lastName;
	private String city;
	private Integer salary;
	
Employee(){
	
}
Employee(Integer id, String firstName, String lastName, String city, Integer salary){
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.city=city;
	this.salary=salary;
}

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
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
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
@Override
public int compareTo(Employee o) {
	return o.getId() - this.getId();
}


}




