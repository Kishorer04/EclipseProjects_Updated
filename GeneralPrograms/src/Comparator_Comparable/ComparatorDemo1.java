package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo1 implements Comparator<Integer> {
	
	@Override
	public int compare(Integer i, Integer j) {
		
	    System.out.println("i "+i +"j "+j);
		
	    if(i%10 >j%10) 		
		return 1;    //will sort

		else
		return -1;   //will not sort
		
	}

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(78);
		li.add(43);
		li.add(32);
		li.add(84);
		li.add(55);
	
		Collections.sort(li, new ComparatorDemo1());
		
		System.out.println(li);
	}
}
