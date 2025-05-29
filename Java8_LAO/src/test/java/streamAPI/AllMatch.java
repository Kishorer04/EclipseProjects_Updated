package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class AllMatch {

	public static void main(String[] args) {
		
		
		List<String> studs = new ArrayList<String>();
		studs.add("Silent");
		studs.add("Silent");
		studs.add("Silent");
		
		boolean status =studs.stream()
		.allMatch(stud->stud.equalsIgnoreCase("silent"));
		
		System.out.println(status);
		
		//allMatch() accepts Predicate as input and gives boolean output.
	    //allMatch() is a short-circuiting terminal function.


	}

}
