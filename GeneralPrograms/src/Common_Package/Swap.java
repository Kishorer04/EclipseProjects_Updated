package Common_Package;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int count=sc.nextInt();
		int[] ar=new int[count];
         
		System.out.println("Enter the array elements");
         for(int i=0;i<ar.length;i++) {
        	 ar[i]=sc.nextInt();
         }
         
         int temp=ar[0];
         int i=0;
         while(i<ar.length-1) {
        	 ar[i]=ar[i+1];
        	 i++;
         }
         ar[i]=temp;
         System.out.println("Value of temp assigned to i value is "+i); 
         
         for(i=0;i<ar.length;i++)
         System.out.print(" "+ar[i]);
         
	
	}

}
