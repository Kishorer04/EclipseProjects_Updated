package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample2 {

	public static void main(String[] args) {
		
		
		List<String> DC = Arrays.asList("Kishore", "Kiran","Rahul");
		List<String> Marvel = Arrays.asList("Ramya","Kausic","deepak");
		List<String> XMen =  Arrays.asList("Raj","Kumar","Rakesh");
		
		
		List<List<String>> heros =Arrays.asList(DC,Marvel,XMen);
	
		
//		List<String> singleList = heros.stream()
//		.flatMap(h->h.stream())
//		.collect(Collectors.toList());
//	
//		System.out.println(singleList);
		
		
		List<String> singleList = heros.stream()
		.flatMap(List::stream)     // Can use Collection::stream as well. After stream() we are 
		.collect(Collectors.toList()); // again streaming that List/Collection in flatMap() to make it flat (Single list).
		System.out.println(singleList);                         
	}

}
