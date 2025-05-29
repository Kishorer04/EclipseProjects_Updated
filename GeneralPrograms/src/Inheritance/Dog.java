package Inheritance;

public class Dog extends Animal {
	
	    void eat()
	 {
	     System.out.println("dog is eating...");
	     
	 }  
	    
	    void sleep() {
	    	System.out.println("dog is sleeping");
	    }
	  
	 public static void main(String[] args){  
		 
		 
	  Dog a=new Dog();  //Dynamic Binding
	  a.eat();
	  a.sleep();
	  
	 


	 }  

}
