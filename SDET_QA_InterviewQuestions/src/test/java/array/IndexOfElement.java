package array;

import java.util.ArrayList;
import java.util.List;

public class IndexOfElement {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4, 3, 8, 9, 1, 3, 2 };
		int target = 7;

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				list.add(i);
			}
		}
		if (list.isEmpty())
			System.out.println("Element not found");

		else
			System.out.println(list);
	}

}
