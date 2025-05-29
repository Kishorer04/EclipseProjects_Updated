package com.galaxe.training;

public class Polymorphism {
	public static void main(String[] args) {
		Polymorphism polymorphism = new Polymorphism();
		String name="       Kishore     ";
		System.out.println("Length ="+name.length());
		System.out.println("Length="+polymorphism.getName(name).length());
		System.out.println(polymorphism.getName("       firstName      "));
		System.out.println(polymorphism.getNum(2,4));
		
	}
	
	public String getName(String name) {
		return name.trim();
	}
	public int getNum(int n,int m) {
		return n+m;
		
	}
}
