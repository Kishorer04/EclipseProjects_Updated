package predicateExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class WithoutBoilerplate_StudentRunner {

	public static void main(String[] args) {
		

		List<WithoutBoilerplate_Student> students = new ArrayList<WithoutBoilerplate_Student>();
		
		WithoutBoilerplate_Student riya = new WithoutBoilerplate_Student("Riya", 10);
		WithoutBoilerplate_Student akash = new WithoutBoilerplate_Student("Akash",40);
		WithoutBoilerplate_Student ram = new WithoutBoilerplate_Student("Ram", 39);
		
		students.add(riya);
		students.add(akash);
		students.add(ram);
		
		
		//Both are same
		
//		students.add(new WithoutBoilerplate_Student("Riya",10));
//		students.add(new WithoutBoilerplate_Student("Akash", 40));
//		students.add(new WithoutBoilerplate_Student("Ram", 39));
//		
		Predicate<WithoutBoilerplate_Student> below40 = list -> list.percentage<40;
		
		for(WithoutBoilerplate_Student student: students)
			if(below40.test(student))
				System.out.println(student.name);
	}

}
