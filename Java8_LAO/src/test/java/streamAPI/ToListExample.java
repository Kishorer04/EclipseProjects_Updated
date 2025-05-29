package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToListExample {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Kishore","Ravi","Raju");
		
		List<Integer> nameLength =	name.stream()
		.map(String::length)
		.collect(Collectors.toList());
	
		System.out.println(nameLength);

	}

}
