package Common_Package;

import java.util.Scanner;

public class ArrayRotation {
	
	
	public static int[] rotateArray(int[] arr, int rotate) {
		
		int n = arr.length;
		rotate = rotate % n; // To handle cases where rotation > array size
		
		int[] rotatedArray = new int[n];
		
		for(int i=0 ;i<n;i++)
		{
			int newIndex = (i + rotate) % n; //Calculate the index for each element
			rotatedArray[newIndex] = arr[i];
		}

		return rotatedArray;
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size");
		
		int arraySize = sc.nextInt();
		
		int[] arr = new int[arraySize];
		
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element");
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number of rotations");
		int rotate = sc.nextInt();
		
		arr = rotateArray(arr,rotate);
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
