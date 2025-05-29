package ConstructorChaining;

public class A {
	
	A(){
		this(30);
		System.out.println("A class constructor");
	}
	
	A(int x){
		System.out.println("A class constructor "+x);
	}

}
