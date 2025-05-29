package Inheritance;

public class SameMethod {
	
	public static void meth() {
		System.out.println("Method 1");
	}
	
	SameMethod()
	{
		String s="Hellow";
		System.out.println(s);
	
	}

	public static void main(String[] args) {
		SameMethod sameMethod = new SameMethod();
		meth();
		sameMethod.meth();
		SameMethod.meth();
		
		
		

	}

}
