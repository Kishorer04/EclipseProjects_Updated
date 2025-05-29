package com.galaxe.training;

public class GrOfTh {
	public static void main(String[] args) {
		int num1=50,num2=60,num3=20;
		if(num1>num2&&num1>num3) {
			System.out.println("The biggest number is " +num1);
		}
		else if(num2>num3&&num2>num1) {
			System.out.println("The biggest number is " +num2);
		}
		else {
			System.out.println("The biggest number is " +num3);
		}
	}

}
