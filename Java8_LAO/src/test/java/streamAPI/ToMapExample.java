package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ToMapExample {
	
	public static void main(String[] args) {
		
		
		List<String> names = Arrays.asList("Kishore","Raju","Kavin");
		
		Map<String,Integer> result = names.stream()
		.collect(Collectors.toMap(name->name, String::length));
		
		System.out.println(result);
		
		
		//KeyMapper, ValueMapper takes Function functional interface as arguments
		
		
		Map<String,Integer> result1 = names.stream()
		.collect(Collectors.toMap(Function.identity(), String::length));
		
		System.out.println(result1);
				
				
		//KeyMapper is simply taking the value and returning the same value. In this case we can use Function.identity() as
		//replacement
			
		List<String> names1 = Arrays.asList("Kishore","Raju","Kavin","Kishore");
		names1.stream()
		.collect(Collectors.toMap(Function.identity(), String::length, (key1,key2)->key1));
		
		//The third argument mergeFunction will come into play only when we have duplicate keys
		//In this example it says, key1 and key2 take key1 as main key or we can take key2 as main key
		
	}

}
