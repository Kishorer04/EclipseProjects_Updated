package AbstractClass;

public class ClassB extends ClassA{

	
	ClassB(){
		System.out.println("Class B constructor");
	}
	
	public static void main(String[] args) {
		
		
		ClassB classb = new ClassB();
		ClassA classa = new ClassB();
		

	}

}
