package predicateChainingExamples;

import java.util.function.Predicate;

public class PredicateChainingExamples {

	//Campus interview select - Yes
	//Degree complete - Yes
	
	Predicate<String> campusInterviewSelected;
	Predicate<String> degreeCompleted;
	Predicate<Boolean> opposite;
	
	public void andExample() {
		
		campusInterviewSelected = input -> input.equalsIgnoreCase("Yes");
		degreeCompleted = input -> input.equalsIgnoreCase("Yes");
		System.out.println("And can I join the company? "+campusInterviewSelected.and(degreeCompleted).test("No"));
		
	}
	
	public void orExample() {
		
		campusInterviewSelected = input -> input.equalsIgnoreCase("Yes");
		degreeCompleted = input -> input.equalsIgnoreCase("No");
		
		System.out.println("Or can I join the company? "+campusInterviewSelected.or(degreeCompleted).test("Yes"));
		
	}
	
	public void negateExample() {
		opposite = input->input;
		System.out.println(opposite.negate().test(false));
	}
	
	public static void main(String[] args) {
		PredicateChainingExamples pce = new PredicateChainingExamples();
		pce.andExample();
		pce.orExample();
		pce.negateExample();

	}

}
