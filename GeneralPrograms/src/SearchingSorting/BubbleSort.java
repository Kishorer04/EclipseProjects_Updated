package SearchingSorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the length of the array");
         int len =sc.nextInt();
         int ar[] = new int[len];
		
         for(int i=0;i<len;i++) {
        	System.out.println("Enter value");
        	ar[i] = sc.nextInt();
         }
         
         BubbleSort bs = new BubbleSort(); //
         int[] sortedArray= bs.bubbleSort(ar);
         
         System.out.println("Sorted array");
 		for(int i=0;i<sortedArray.length;i++)
 			System.out.println(sortedArray[i]);
 		
 		System.out.println("Second max "+ar[ar.length-2]);
	}

	public int[] bubbleSort(int[] ar) {
		int j = 1;
		while (j < ar.length) {
			int i = 0;
			while (i < ar.length - 1) {
				if (ar[i] > ar[i + 1]) {
					int temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
				}
				i++;
			}
			j++;
			
		}
	    return ar;
		
		
	}

}
