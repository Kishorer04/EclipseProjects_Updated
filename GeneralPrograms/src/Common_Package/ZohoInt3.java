package Common_Package;
import java.util.Scanner;

public class ZohoInt3 {

	public static void main(String[] args) {
		/*
		 * Given an array [input], find the sum of elements present in the specified gap
		 * n[input]
		 * 
		 * Sample:
		 * Enter array size: 13
		 * Enter array: 1 2 3 4 5 6 7 8 9 10
		 * Sample output:
		 * 35
		 * 26
		 * 30
		 * 
		 * Output explanation:
		 * Start adding from 1st number with gap 3 =
		 * (1+4+7+10+13)= 35
		 * Start adding from 2nd number with gap 3 =
		 * (2+5+8+11)=26
		 * Start adding from 3rd number with gap 3 =
		 * (3+6+9+12)=30
		 * 
		 */
		
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter array size");
         int arrSize= sc.nextInt();
         
         int[] arr = new int[arrSize];
         
         System.out.println("Enter the array elements");
         
         for(int i=0;i<arrSize;i++)
         {
        	 System.out.println("Enter element");
        	 arr[i]=sc.nextInt();
         }
         
         System.out.println("Enter the gap number");
         int gapNum =sc.nextInt();
         
         System.out.println("Enter num of outputs needed");
         int outputCount =sc.nextInt();
         
         
         
         if(gapNum<arr.length)
         {
        	 
        	 
         
         for(int i=0;i<outputCount;i++ )
         {
        	int sum=0;
         for(int j=i;j<arr.length;j=j+gapNum) 
         {
        	 sum= sum + arr[j];
         }
         
         System.out.println("The sum is "+ sum);
         
         } 
     
         }
         
    
         else {
        	 System.out.println("Enter gap num within array length");
         }
		
		

	}

}
