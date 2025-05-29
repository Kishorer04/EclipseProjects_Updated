package UpcastingDowcasting;

public class DogDown extends AnimalDown {
	
	void bark() {
		System.out.println("Dog barking");
	}
	
	public static void main(String[] args) {
		
		AnimalDown animal = new DogDown();
	
		//Downcasting
		DogDown dog = (DogDown) animal;
		dog.eat();
		dog.bark();
	
		
		
		
		
		
		
	}

}
