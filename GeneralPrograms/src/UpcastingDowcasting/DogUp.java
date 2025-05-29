package UpcastingDowcasting;

public class DogUp extends AnimalUp {

	
	void bark() {
		System.out.println("Dog eating");
	}
	
	public static void main(String[] args) {
		DogUp dog = new DogUp();
		
		//upcasting
		AnimalUp animal = dog;
		animal.eat();
		//animal.bark();   //Cannot access this 
	  
      
	}
	
}
