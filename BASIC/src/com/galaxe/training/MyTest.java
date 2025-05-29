package com.galaxe.training;

public class MyTest {
	static String str="Java traing";
	/*
	 access modifier return type fuctionName(parameters){
	 System.out.println("");
	 }
	 */
//public|private|protected
	public void getMyName() {
		System.out.println("this is first method");
		
	}
	public String getMyNameHello(String name) {
		return "Hello" + name;
	}
	//special method which cannot change
	public static void main(String[] args) {
	System.out.println(str);
}
}