package com.galaxe.training;
//class_name
public class Train { 
	//function_name(camel case)
	public int sumNum(int num1, int num2, int num3) {
		int sum;
		sum=num1+num2+num3;
		return sum;
	}
	//main_function
	public static void main(String[] args) {
		//object_creation
		Train train=new Train();	
		//calling function with object
		int returnvalue= train.sumNum(10,20,30);
		//printing the return value
		System.out.println(returnvalue);
		
	}

}
