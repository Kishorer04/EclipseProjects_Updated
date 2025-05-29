package biExamples;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		
    //lastname should not be empty
	BiPredicate<String,String> pred1 = (n1,n2)-> {
		return n2.length()>0;
	};
	System.out.println(pred1.test("Kishore", "R"));
	
	
	
	//check equality of two given strings
	
	BiPredicate<String,String> pred2 = (n1,n2)->{
		                                       return n1.equals(n2);
                                                };
	System.out.println(pred2.test("Kishore", "KISHORE"));
	
	
	
	//check equality of two given strings equalsIgnoreCase
	
	BiPredicate<String,String> pred3 = (n1,n2)->{
		                                       return n1.equalsIgnoreCase(n2);
                                                };
	System.out.println(pred3.test("Kishore", "KISHORE"));
	

	}

}
