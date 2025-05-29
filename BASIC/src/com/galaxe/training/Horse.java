package com.galaxe.training;

public class Horse extends Animal {
	public static void main(String[] args) {
		Horse horse=new Horse();
		//horse.test();
		horse.eat();
	}


	@Override
	public void eat() {
		System.out.println("Horses will eat fruits");	
		
	}

}
