package forEachExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {

	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(3,5,3,21,5);
		
		//Before 1.5
		for(int i=0;i<l.size();i++)
			System.out.println(l.get(i));
		
		System.out.println("========================");
		
		//From 1.5
		for(Integer i : l)
			System.out.println(i);
		
		System.out.println("=========================");
		
		//From 1.8
		
		Consumer<Integer> c = input -> System.out.println(input);
		
		l.forEach(c);
		
		//or
		
		l.forEach(input ->System.out.println(input));
		
		
		

	}

}
