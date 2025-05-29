package com.galaxe.training;

public class Classs implements AnimalInterface {

	@Override
	public void function1() {
		System.out.println("Interface is executed");

	}

	@Override
	public void test() {
		System.out.println("check check");
		
	}
public static void main(String[] args) {
	Classs classs=new Classs();
	classs.function1();
	classs.test();
}
}
