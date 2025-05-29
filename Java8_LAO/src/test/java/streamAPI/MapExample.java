package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Jack Sparrow","Eagle","Superman");
		
		
	List<Integer> nameLength =	names.stream()
								.map(String::length)
								.collect(Collectors.toList());
	
	System.out.println(nameLength);
	
	List<Integer> nameLength1 = names.stream()
			                   .map(input->input.length())
			                   .collect(Collectors.toList());
	System.out.println(nameLength1);
	
	
	names.stream()
	.map(String::length)
	.forEach(System.out::println);
	
	names.stream()
	.map(String::length)
	.forEach(input -> System.out.println(input));
	
	// map() takes another function as a parameter. The output datatype depends on the return datatype of the 
	// function inside the map function

	}}
