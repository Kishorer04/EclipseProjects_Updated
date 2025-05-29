package InterfaceDemo2;

public interface LearnInterface {

	
	void balance();

	default void xerox()
	{
		System.out.println("In default method");
	}	
}
