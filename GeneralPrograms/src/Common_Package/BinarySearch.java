package Common_Package;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int min=0,max=arr.length-1;
		System.out.println("Enter element to search");
		Scanner sc=new Scanner(System.in);
		int key=sc.nextInt();
		
		while(min<=max)
		{
			int mid=(min+max)/2;
			
			if(key==arr[mid])
			{
				System.out.println("Element is present at postion "+mid);
			break;
			}
			    
			
			else if(key>arr[mid])
				min=mid+1;
			
			else
				max=mid-1;
		}
		
		 if(min>max)
			System.out.println("Element not present");
		

	}

}
