package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {

	 String name;
	 int age;
	 int rollNo;
	 
	 Student(String name, int age, int rollNo){
		
		 this.name = name;
		 this.age = age;
		 this.rollNo = rollNo;
	 }
	 
	 @Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name+ " ,RollNo=" +rollNo +"]";
	}

	@Override
		public int compareTo(Student that) {
			if(this.age<that.age)
				return 1;
			else if (this.age>that.age)
				return -1;
			else
				return 0;
		}
	 


	 
	public static void main(String[] args) {
		
		List<Student> studs = new ArrayList<Student>();
		studs.add(new Student("Kishore",12,123));
		studs.add(new Student("Anand",18,456));
		studs.add(new Student("Kiran",20,789));
		studs.add(new Student("Navin",21,101112));
		
		System.out.println("Before Sorting:");
		for(Student s:studs)
			System.out.println(s);
		
		Collections.sort(studs);
		
		System.out.println("After sorting:");
		for(Student s:studs)
			System.out.println(s);
		
	
	}	
}
