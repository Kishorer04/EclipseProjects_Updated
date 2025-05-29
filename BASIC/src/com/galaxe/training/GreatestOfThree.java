package com.galaxe.training;

public class GreatestOfThree {
	public int greatOfThree(int num1, int num2, int num3){
		int greater = 0;
		if(num1>num2&&num1>num3) {
			System.out.println("The biggest number is"+num1);
			greater = num1;
		}
		else if(num2>num3&&num2>num1) {
			System.out.println("The biggest number is"+num2);
		}
		else {
			System.out.println("The biggest number is"+num3);
		}
		return greater;
		
		
	}
	public static void main(String[] args) {
		GreatestOfThree greatestOfThree  = new GreatestOfThree();
		int returnvalue=greatestOfThree.greatOfThree(30, 50,20);
		System.out.println(returnvalue);
		
	}
}
