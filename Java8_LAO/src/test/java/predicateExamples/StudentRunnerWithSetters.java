package predicateExamples;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StudentRunnerWithSetters {
	
	public static void main(String[] args) {
		
		List<StudentWithSetters> swt = new ArrayList<StudentWithSetters>();
		
		StudentWithSetters student1 = new StudentWithSetters();
		student1.setName("Riya");
		student1.setPercentage(20);
		
		StudentWithSetters student2 = new StudentWithSetters();
		student2.setName("Akash");
		student2.setPercentage(38);
		
		StudentWithSetters student3 = new StudentWithSetters();
		student3.setName("Ram");
		student3.setPercentage(49);
		
		
		swt.add(student1);
		swt.add(student2);
		swt.add(student3);
		
		
		Predicate<StudentWithSetters> below40 = input -> input.percentage<40;
		
		for(StudentWithSetters s: swt)
			if(below40.test(s))
				System.out.println(s.name);
		
		
	}

}
