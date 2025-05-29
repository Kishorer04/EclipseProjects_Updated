package Common_Package;
import java.util.Scanner;

public class GreatestElement {
	public static void main(String[] args) {
		int max=0;
		int[] arr=new int[6];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array elements");
		for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
		  if(arr[i]>max)
		  max=arr[i];
	    }
System.out.println("The greatest element is " +max);

	}
}



//import java.util.Scanner;
//
//public class GreatestElement {
//	public static void main(String[] args) {
//		
//		int[] arr=new int[6];
//		Scanner sc=new Scanner(System.in);
//		
//		System.out.println("enter the array elements");
//		for(int i=0;i<arr.length;i++) {
//		  arr[i]=sc.nextInt();
//	    }
//	
//		int max=0;
//		
//for(int i=0;i<arr.length;i++) {		
//if(arr[i]>max)
//max=arr[i];
//}
//System.out.println("The greatest elements is " +max);
//
//	
//
//
//	}
//}
