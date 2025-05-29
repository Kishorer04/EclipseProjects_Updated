package Common_Package;
import java.util.Scanner;

public class SecondLargestFor {

	public static void main(String[] args) {
		
		
		int max1=0;
		int max2=0;
		
		System.out.println("enter the size of the array");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int[] ar=new int[size];
		
		System.out.println("Enter the array elements");
	    int j;
		for(j=0;j<ar.length;j++) {
			ar[j]=sc.nextInt();
		}
		
		int i;
		for(i=0;i<ar.length;i++) {
			if(ar[i]>max1) 
			{
			 max2=max1;
			 max1=ar[i];
			}
			else if(ar[i]>max2)
				max2=ar[i];
	    } 
		System.out.println("value of i "+i);
		System.out.println("2nd largest "+max2);

	}

}
