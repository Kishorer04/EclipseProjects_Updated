package streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SkipFunction {
	
	
public static void main(String[] args) {
	
	List<String> countries = new ArrayList<String>();
	countries.add("USA");
	countries.add("UK");
	countries.add("China");
	countries.add("USSR");
	countries.add("India");
	
	countries =countries.stream()
	.skip(3)                            //skip takes long datatype as parameter not int  //skip is a intermediate function
	.collect(Collectors.toList());     //collect is a terminal function
	
	System.out.println(countries);
	
}
}
