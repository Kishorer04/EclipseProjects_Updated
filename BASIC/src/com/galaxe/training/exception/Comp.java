package com.galaxe.training.exception;

public class Comp implements Comparable<Comp> {
	private Integer id;
	private String firstName;
	private String lastName;
	private String city;
	private Integer salary;
	
Comp(){
	
}
Comp(Integer id, String firstName, String lastName, String city, Integer salary){
	this.id=id;
	this.firstName=firstName;
	this.lastName=lastName;
	this.city=city;
	this.salary=salary;
}
@Override
public int compareTo(Comp o) {
	
	return 0;
}
}





