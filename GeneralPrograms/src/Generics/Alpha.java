package Generics;
import java.util.*;

public class Alpha {

	public static void main(String[] args) {
		
		Employees obj=new Employees("Kishore",22,20000);
		
		List al=new ArrayList();
		
		al.add(obj);
		
		System.out.println("Printing  "+ obj);
		System.out.println("Printing 2 "+ al);
		System.out.println("Printing 2 "+ al.get(0));
		
		

		 Object o= al.get(0); //return type of get() is Object
		 Employees emp1=(Employees)o; //typecasting
		 System.out.println(emp1.name+" "+emp1.age+" "+emp1.salary);
		 
	
		

	}

}
