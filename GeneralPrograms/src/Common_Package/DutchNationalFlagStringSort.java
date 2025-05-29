package Common_Package;

import java.util.Arrays;

public class DutchNationalFlagStringSort {

	    // Method to sort the colors
	    public static void sortColors(String[] colors) {
	        int low = 0, mid = 0, high = colors.length - 1;

	        while (mid <= high) {
	            switch (colors[mid]) {
	                case "red":
	                    swap(colors, low, mid);
	                    low++;
	                    mid++;
	                    break;
	                case "white":
	                    mid++;
	                    break;
	                case "blue":
	                    swap(colors, mid, high);
	                    high--;
	                    break;
	            }
	        }
	    }

	   
	    private static void swap(String[] arr, int i, int j) {
	        String temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	   
	    private static void printArray(String[] arr) {
	        for (String color : arr) {
	            System.out.print(color + " ");
	        }
	        System.out.println();
//			System.out.println(Arrays.toString(arr));
	    }

	   
	    public static void main(String[] args) {
	        String[] colors = {"blue", "red", "white", "red", "blue", "white", "red"};

	        System.out.println("Before sorting:");
	        printArray(colors);

	        sortColors(colors);

	        System.out.println("After sorting:");
	        printArray(colors);
	    }
	}


