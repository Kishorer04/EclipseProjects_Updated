package biExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionDemo {
	
	public static void main(String[] args) {
		
		//fname, lname, fullname
		BiFunction<String,String,String> fullName = (fn,ln)->fn+ln;
		System.out.println(fullName.apply("Kishore", "Ravikumar"));
		
		
		//num1, num2, average
		
		BiFunction<Integer,Integer,Number> avg = (n1,n2)->n1+n2/2.0;
		System.out.println(avg.apply(1, 2));
		
		//list1, list2, combined list
		
		List<String> l1 = Arrays.asList("Bat","Super","Wonder");
		List<String> l2 = Arrays.asList("Man","Man","Woman");
		
		List<String> superHeros = new ArrayList<String>();
		
		
		BiFunction<List<String>, List<String>, List<String>>  justiceLeague = (h1,h2)->
		
		{
		
		for(int i=0;i<l1.size();i++)
		superHeros.add(l1.get(i)+l2.get(i));
	
		return superHeros;
		
		};
		
		System.out.println(justiceLeague.apply(l1,l2));
		
	}

}
