package static_default_predicate_demo;

public interface TestInterface {
	
	static void staticMethod() {
		System.out.println("static methd");
	}
	
	default void defMethod() {
		System.out.println("def methd");
	}

}
