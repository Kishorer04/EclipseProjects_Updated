package streamAPI;

import java.util.Arrays;
import java.util.List;

public class NoneMatch {

	public static void main(String[] args) {
		
        List<String> studs= Arrays.asList("Silent","Silent","a");
		
		boolean status = studs.stream()
		.noneMatch(stud->stud.equalsIgnoreCase("Shout")); 
		
		System.out.println(status);
		
		//noneMatch() accepts Predicate as input and gives boolean output.
		//noneMatch() is a short-circuiting terminal function.


	}

}
