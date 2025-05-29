package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstVsFindAny {

	
	
	
	public static void findFirst() {
		
		List<String> elements = Arrays.asList("one","two","three","four");
		
		Optional<String> firstElement =elements.stream()
		.findFirst();
		System.out.println(firstElement.get());  //Will get first element as output
		
		Optional<String> firstElement_parallelStream =elements.parallelStream()   //Parallel stream
				.findFirst();
				System.out.println(firstElement_parallelStream.get()); //Will get first element as output
		
		
	}
	
	public static void findAny() {
		List<String> elements = Arrays.asList("one","two","three","four");
		
		Optional<String> anyElement =elements.stream()
		.findAny();
		System.out.println(anyElement.get());   //99.99% will get first element as output
		
		
		
		Optional<String> anyElement_parallelStream =elements.parallelStream()  //Parallel stream
				.findAny();
				System.out.println(anyElement_parallelStream.get()); //May get any value as output
	}
	
	
	public static void main(String[] args) {
		
		findFirst();
		findAny();
	
	}

}
