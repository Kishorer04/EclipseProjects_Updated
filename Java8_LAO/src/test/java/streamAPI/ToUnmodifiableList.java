package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ToUnmodifiableList {
	
	public static void main(String[] args) {
		
		
		List<String> name = Arrays.asList("Kishore","Ravi","Raju");
		
		List<Integer> nameLength = name.stream()
		.map(String::length)
		.collect(Collectors.toUnmodifiableList());
		
		System.out.println(nameLength);
		
		nameLength.add(6);
		
		System.out.println(nameLength);
		
	}

}
