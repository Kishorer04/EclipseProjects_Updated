package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class DistinctExample {

	public static void main(String[] args) {
		
		List<String> names = Arrays.asList("Kishore", "Raja", "Vicky", "Ganesh");
		
		
//		names =names.stream()
//		.distinct()
//		.collect(Collectors.toList());
//		
//		System.out.println(names);
		
		
		//Using Method Reference
		names.stream()
		.distinct()
		.forEach(System.out::println);
		
		//forEach is a terminal function
		
		
		//Using Consumer interface
		names.stream()
		.distinct()
		.forEach(input->System.out.println(input));
        
		
		Consumer<String> c = input->System.out.println(input);
		names.stream()
		.distinct()
		.forEach(c);
		
	}

}
