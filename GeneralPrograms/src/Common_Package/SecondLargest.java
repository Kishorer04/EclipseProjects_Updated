package Common_Package;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		int max1=0;
		int max2=0;
		
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] ar=new int[size];
		
		System.out.println("Enter the array elements");
	
		for(int i=0;i<ar.length;i++) {
			ar[i]=sc.nextInt();
		}
         
		int i=0;
		while(i<ar.length) 
		{
			if(ar[i]>max1) {
				max2=max1;
				max1=ar[i];
			}
			
			else if(ar[i]>max2)
			max2=ar[i];
			i++;
		}
		System.out.println("value of i is "+i);
		System.out.println("second largest is  "+max2);
		
		
		
		
		
		}
		
	}
	

