package predicateExamples;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
public class StudentRunnerWithGetters {

	public static void main(String[] args) {
		

		List<StudentWithGetters> students = new ArrayList<StudentWithGetters>();
		
		
		//Both are same. Can using anything
		
		/*
		 * StudentWithGetters riya = new StudentWithGetters("Riya",100); 
		 * StudentWithGetters akash = new StudentWithGetters("Akash",30);
		 *  StudentWithGetters ram = new StudentWithGetters("Ram", 39);
		 * 
		 * 
		 * students.add(riya); students.add(akash); students.add(ram);
		 */
		 
		
		
		students.add(new StudentWithGetters("Riya",10));
		students.add(new StudentWithGetters("Akash", 40));
		students.add(new StudentWithGetters("Ram", 39));
		
		
		Predicate<StudentWithGetters> below40 = list -> list.getPercentage()<40;
		
		for(StudentWithGetters student: students)
		{
			if(below40.test(student))
				System.out.println(student.getName());	
		}
		
	}

}
