package SearchingSorting;

import java.util.Scanner;

public class BinarySearch {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter the length of the array");
		int len = sc.nextInt();
		
		int[] ar = new int[len];
		System.out.println("Enter the elements of the array");

		for (int i = 0; i < len; i++) {
			System.out.println("Enter value");
			ar[i] = sc.nextInt();
		}
			

		BinarySearch bs = new BinarySearch();
		int pos = bs.binarySearch(ar);
		if (pos >= 0)
			System.out.println("The element found in the pos " + pos);
		else
			System.out.println("Element not present");
	}

	public int binarySearch(int[] ar) {
		int min = 0, max = ar.length - 1;
		System.out.println("Enter element to search");
		int key = sc.nextInt();

		while (min <= max) {
			int mid = (min + max) / 2;

			if (key == ar[mid])
				return mid;

			else if (key > ar[mid])
				min = mid + 1;

			else
				max = mid - 1;
		}

		return -1;

	}

}
