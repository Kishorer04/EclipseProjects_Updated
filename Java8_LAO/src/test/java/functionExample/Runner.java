package functionExample;

import java.util.function.Function;

public class Runner {
	
	public void usingClassicalWay() {
		
		UsdToInr usdToInr = new UsdToInr();
		System.out.println(usdToInr.usdToInr(10));
	}
	
	
	public void usingAnonymousInnerClass() {
		
		
		Function<Integer,Double> function = new Function<Integer, Double>(){
			
			public Double apply(Integer usd) {
				
				return usd*81.5;
			}
		};
		
		System.out.println(function.apply(12));
		
	}
	
	
	public void usingLambda() {
		
		Function<Integer,Double> func = usd->  usd*81.5; 
		System.out.println(func.apply(13));
		
	}
	
	public void square() {
		
		Function<Integer,Integer> square = num->num*num;
		System.out.println(square.apply(3));
	}
	
	public void toUpper() {
		
		Function<String,String> upper = str->str.toUpperCase();
		System.out.println(upper.apply("watch"));
	}
	
	public void strLength() {
		
		Function<String,Integer> strLen = str->str.length();
		System.out.println(strLen.apply("Copilot"));
	}
	
	public void isEmpty() {
		
		Function<String, Boolean> empty = str->str.isEmpty() || str.isBlank() ||str.equals("");
		System.out.println(empty.apply(""));
	}
	
	
	
	public static void main(String[] args) {
		Runner runner = new Runner();
		runner.usingClassicalWay();
		runner.usingAnonymousInnerClass();
		runner.usingLambda();
		runner.square();
		runner.toUpper();
		runner.strLength();
		runner.isEmpty();
		
	}

}
