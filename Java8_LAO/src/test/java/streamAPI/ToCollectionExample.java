package streamAPI;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ToCollectionExample {

	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("Kishore","Ravi","Raju");
		
		LinkedList<String> newName = name.stream()
		.filter(n->n.length()>4)
		.collect(Collectors.toCollection(LinkedList::new));
		
		System.out.println(newName);

	}

}
