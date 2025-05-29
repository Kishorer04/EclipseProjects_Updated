package streamAPI;

import java.util.ArrayList;
import java.util.List;

public class LimitFunction {

	public static void main(String[] args) {
		
		List<String> countries = new ArrayList<String>();
		countries.add("USA");
		countries.add("UK");
		countries.add("China");
		countries.add("USSR");
		countries.add("India");
		
		
		countries.stream()
		.limit(3)  //Intermediate function    // limit function takes long datatype as parameter not int
		.forEach(System.out::println); //Terminal function

	}

}
