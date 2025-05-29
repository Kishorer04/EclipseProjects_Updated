package ConstructorChaining;

public class B extends A  {
	B(){
		System.out.println("B class constructor");
	}
	
	B(int x){
		//super(x);
		System.out.println("B class constructor "+x);
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		B b= new B();
		System.out.println("Kishore");
		Thread.sleep(3000);
//		B b1 =new B(20);
		
		
	}
}
