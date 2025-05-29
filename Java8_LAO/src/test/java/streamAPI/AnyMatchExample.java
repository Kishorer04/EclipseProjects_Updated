package streamAPI;

import java.util.Arrays;
import java.util.List;

public class AnyMatchExample {

	public static void main(String[] args) {
		
		List<String> studs= Arrays.asList("Silent","Silent","Shout");
		
		boolean status = studs.stream()
		.anyMatch(stud->stud.equalsIgnoreCase("Shout")); 
		
		System.out.println(status);
		
		//anyMatch() accepts Predicate as input and gives boolean output.
		//anyMatch() is a short-circuiting terminal function.
	
		

	}

}
