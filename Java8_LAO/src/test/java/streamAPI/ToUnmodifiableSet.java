package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToUnmodifiableSet {

	public static void main(String[] args) {

		List<String> name = Arrays.asList("Kishore","Ravi","Raju", "Ravi");
		
		Set<String> withoutDuplicates = name.stream()
		.collect(Collectors.toUnmodifiableSet());
		
		System.out.println(withoutDuplicates);
		
		withoutDuplicates.add("Ashok");
		System.out.println(withoutDuplicates);

	}

}
