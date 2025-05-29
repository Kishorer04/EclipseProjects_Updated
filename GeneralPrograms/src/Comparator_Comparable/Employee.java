package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{
	
	String name;
	int exp;
	int salary;
	
	public Employee(String name, int exp, int salary){
		
		this.name=name;
		this.exp=exp;
		this.salary=salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", exp=" + exp + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee that) {
		if(this.exp<that.exp)
			return 1;
		
		else if (this.exp>that.exp)
			return -1;
		
		else
			return 0;
	
	}


	public static void main(String[] args) {
		
    List<Employee> ls = new ArrayList<Employee>();
    
    Employee e1 = new Employee("Kishore",2,20000);
    Employee e2 = new Employee("Kavin",4,40000);
    Employee e3 = new Employee("Kiran",5,60000);
    
    ls.add(e1);
    ls.add(e2);
    ls.add(e3);
    
    
    
    System.out.println("Before sorting");
    for(Employee l : ls)
    System.out.println(l);
    
    Collections.sort(ls);
    
    System.out.println("After sorting");
    for(Employee l : ls)
    System.out.println(l);
    
	}

	
}
