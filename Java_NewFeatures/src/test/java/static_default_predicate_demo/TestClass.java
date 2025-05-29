package static_default_predicate_demo;

public class TestClass implements TestInterface{

	public static void main(String[] args) {
		
		TestInterface.staticMethod();
		
		TestInterface tt = new TestClass();
		tt.defMethod();
	}

}
