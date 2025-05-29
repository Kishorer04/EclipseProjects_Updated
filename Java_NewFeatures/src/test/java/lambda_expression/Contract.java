package lambda_expression;

@FunctionalInterface
public interface Contract {
	
	//abstract method
	
	//example 1
	//public void rule();
	
	//example 2
	//public void add(int n1, int n2);
	
	//example 3
	public int add(int n1, int n2);
	
	
	
	
	//default method
	public default void rule2() {
	}
	
	//static method
	public static void rule3() {	
	}

}


