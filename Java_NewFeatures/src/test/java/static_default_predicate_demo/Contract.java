package static_default_predicate_demo;

public interface Contract {

	//From Java 8 interface can have main method and it can be run independently without a class
//	 public static void main(String[] args) {
//		System.out.println("Hello");
//	}
	
	default void calculate_Salary(int a, int b)
	{
		System.out.println(a+b);
	}
	 
	static void staticTest() {
		System.out.println("Contract Interface");
	}
	 
	 
	 
}
