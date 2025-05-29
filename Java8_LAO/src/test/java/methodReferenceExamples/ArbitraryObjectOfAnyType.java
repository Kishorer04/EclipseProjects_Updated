package methodReferenceExamples;

import java.util.function.Function;

public class ArbitraryObjectOfAnyType {

	public static void main(String[] args) {
		
		Function<String,String> lambdaLowerCase = input -> input.toLowerCase();
		System.out.println(lambdaLowerCase.apply("KISHORE"));
		
		Function<String, String>  methRefLowerCase = String::toLowerCase;
		System.out.println(methRefLowerCase.apply("KISHORE"));

		
		Function<String,Integer> lambdaLength = input -> input.length();
		System.out.println(lambdaLength.apply("Kishore"));
		
		
		Function<String,Integer>methRefLength = String::length;
		System.out.println(methRefLength.apply("Kishore"));
		
	}

}
