package ArraysClassandComparator;

import java.util.Arrays;


public class SortMethodDemo {

	public static void main(String[] args) {
		//Arrays.sort() by default sorts in ascending order
		int[] a3 = {4,7,2,3,9};
		Arrays.sort(a3);
		for(int a:a3)
			System.out.println(a);
		
		
		//Arrays.sort() by default sorts in ascending order
		//If we want to sort in descending order, sort by length or acc. to our wish we have to use the comparator interface
		String[] names = {"suresh","gowtham","karthik"};
		Arrays.sort(names);
		
		for(String n:names)
			System.out.println(n);
		
		
		
		}

}
