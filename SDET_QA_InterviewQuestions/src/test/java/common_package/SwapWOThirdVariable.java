package common_package;

public class SwapWOThirdVariable {

	public static void main(String[] args) {
		
		int a=5, b=3;
		
		System.out.println("a: "+a +" "+ "b: "+b);
		
		//Swap
		a= a+b;
		b= a-b;
		a= a-b;
		
		System.out.println("After swapping: "+"a: "+a +" "+ "b: "+b);
			
	}
}
