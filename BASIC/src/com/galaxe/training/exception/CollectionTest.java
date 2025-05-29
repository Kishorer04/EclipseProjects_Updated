package com.galaxe.training.exception;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionTest {

	public static void main(String[] args) {
		List<String> nameList = new ArrayList<String>();
		nameList.add("Mumbai");
		nameList.add("Mumbai");
		nameList.add("Mumbai");
		
		for(String city: nameList) {
			System.out.println(city);
		}
		
	List<Employee> employeeList = new ArrayList<Employee>();
	Employee emp = new Employee(1,"Kishore","Ravi","Coonoor",31000);
	employeeList.add(emp);
	employeeList.add(new Employee(2,"Kishore1", "Ravi1","Coonoor1",31000));
 
	Collections.sort(employeeList);
	
	SortByName sbn = new SortByName();
	
	Collections.sort(employeeList, sbn);
	
	for(Employee emp1: employeeList) {
	System.out.println(emp1.getId()+" "+emp1.getFirstName()+" "+emp1.getLastName()+ emp1.getSalary());
	}

}
	
}


class SortByName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
	

