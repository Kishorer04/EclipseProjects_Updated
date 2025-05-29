package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PackRunner {
	
	//FlatMap is used to Flat a Map.
	//Meaning, if we have List of List of Items using map()
	//FlatMap() will help us in making the List of List of Items into List of Items.
	
	 static List<Pack> packages;
	 
	 
	 public static void packUsingMapFunction() {
		 
		 
//		List<List<String>> items = packages.stream()
//									.map(Pack::getItems)
//									.collect(Collectors.toList());
//		
//		System.out.println(items);
//		
		List<List<String>> listOfListOfMasalaItems = packages.stream()
									.map((obj)->obj.getItems())
									.collect(Collectors.toList());
		
		System.out.println(listOfListOfMasalaItems);
	 }
	 
	 
	 public static void packUsingFlatMapFunction() {
		 
		 List<String> listOfMasalaItems = packages.stream()
		 .map(Pack::getItems)
		 .flatMap(List::stream) // Can use Collection::stream as well. The output from Pack::getItems is a List/Collection. So we are 
		                        // again streaming that List/Collection in flatMap() to make it flat (Single list).
		 .collect(Collectors.toList());
		 
		 System.out.println(listOfMasalaItems);
	 }
	 
	 
	 

	public static void main(String[] args) {
		
		Pack masalaItems1 = new Pack("Masala items", Arrays.asList("Biriyani Masala", "Idly Podi"));
		Pack masalaItems2 = new Pack ("Masala items", Arrays.asList("Bajji Masala", "Tandoori Masala"));
		
		
         packages = Arrays.asList(masalaItems1, masalaItems2);	
         
         System.out.printf("| %-15s | %-15s |%n", "Name", "Items");
         
         for(Pack pack : packages)
        	 
          System.out.printf("| %-15s | %-15s |%n", pack.getName(), pack.getItems());
         
         packUsingMapFunction();
         packUsingFlatMapFunction();
         
         }

}
