package Collections;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo implements Comparator {

	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = o2.toString();// typecast or use toString()
		int result = s1.compareTo(s2);
		if (result > 0)
			return -1;
		if (result < 0)
			return +1;
		else
			return 0;

//		if(s1.length()>s2.length())
//			return +1;
//		else if(s1.length()<s2.length())
//			return -1;
//		else
//		return 0;
	}

	public static void main(String[] args) {
		String[] st = { "Kishore", "Vicky", "RockJohnson", "Raju" };
//		Arrays.sort(st);
//		System.out.println("Normal sort");
//		for(String s:st) 
//			System.out.println(s);
//		
		// ComparatorDemo cm=new ComparatorDemo();
		Arrays.sort(st, new ComparatorDemo());

		System.out.println("after compare method sort");
		for (String s : st)
			System.out.println(s);

	}



}
