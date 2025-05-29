package com.galaxe.training.exception;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		int a,b,sum;
		int n=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 1st no");
		a=sc.nextInt();
		System.out.println("enter 2nd no.");
		b=sc.nextInt();
	    sum=a+b;
	    System.out.println("the sum is"+sum);
	    
	    switch(n) {
	    	case 1:
	    	System.out.println("repeat");
	    	break;
	    	case 2:
	    	System.out.println("stop");
	    	break;
	    	default:
	    		System.out.println("over");
	    
	    }
	    
	}

}
