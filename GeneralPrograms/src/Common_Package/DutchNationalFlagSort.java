package Common_Package;

import java.util.Arrays;

public class DutchNationalFlagSort {
	
	
	public static void sortNum(int[] arr)
	{
		int low =0, mid=0, high=arr.length-1;
		
		while(mid<=high)
		{
			switch(arr[mid])
			{
			case 0:
				swap(arr, low, mid);
				low++;
				mid++;
				break;
				
			case 1:
				mid++;
				break;
				
			case 2:
				swap(arr, mid, high);
				high--;
				break;
			}
		}
		
	}
	
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
//		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,0,1,2,1,0,0,2,1};
		
		System.out.println("Before Sorting");
		
		printArray(arr);
		
		sortNum(arr);
		
		System.out.println("After Sorting");
		
		printArray(arr);
	}
	
	
	public static void printArray(int[] arr) {
		for(int num:arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
	}
	
	

}
