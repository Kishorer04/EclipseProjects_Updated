package lambda_expression;

public class Test {
	
	public static void main(String[] args) {
	
		//To access lambda expression we need functional interface
		
		//example 1
		/*
		 * Contract c = ()-> { System.out.println("Follow rules"); };
		 *  c.rule();
		 */
		
		
		//example 2
		/*
		 * Contract c = (a,b)-> { System.out.println("Additon"+" "+(a+b)); };
		 * c.add(10,20);
		 */
		
		//example 3
		Contract c = (a,b)->{
			
			                return a+b;
		                   };
		                   
	    int ans= c.add(30, 50);
	    System.out.println(ans);
	   
	   
	    

	}

}
