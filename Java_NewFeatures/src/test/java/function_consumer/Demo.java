package function_consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {

	public static void main(String[] args) {
		
		//Input String, Output Integer
		Function<String, Integer> f = name -> name.length();
		System.out.println(f.apply("Kishore"));
		
		Function<String, Integer> ff = t -> { return t.length();}; //return is not mandatory it is optional                           
	    System.out.println(ff.apply("Kishore"));
			
		 
//		
		
	
//	List<Integer> ls = Arrays.asList(1,4,5,7);
//	System.out.println(ls);
//	
//	//In background consumer interface is there
//	ls.forEach(no -> System.out.println(no));
		
//		Contract cc=  new Contract_Implementation();
//		cc.rule1();
		
//		Contract cc = new Contract()
//				{
//                    //Now we have created anonymous inner class
//					@Override 
//					public void rule1() {
//						System.out.println("Hello");
//						
//					}};
//					cc.rule1();
		
		//Now since Contract is a Functional interface
		
//		Contract cc=  ()-> { 
//			               System.out.println("Hello");
//			               };
//		cc.rule1();
//		
		
//		List<Integer> ls = Arrays.asList(1,4,5,7);
		//see the forEach method implementation by Ctrl+click
		//ls.forEach(no -> System.out.println(no));
		
//		Consumer<Integer> co = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				System.out.println(t);
//				
//			}
//			
//		                           };
//		                           
//		    co.accept(87);
		    
		    //Since Consumer interface is a Functional Interface
		    
//		    Consumer<Integer> co = (t) -> {
//					System.out.println(t);
//					
//			};
//			                           
//			    co.accept(87);
//                 
			   //Since forEach method is taking a consumer object 
//			   ls.forEach(co);  (or)
//			  ls.forEach(t -> System.out.println(t));
	
	}
}
