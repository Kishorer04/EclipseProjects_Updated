package RandomQuizes;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collection_Iterators {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(new Integer(2));
		list.add(new Integer(8));
		list.add(new Integer(5));
		list.add(new Integer(1));
		
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println(list);
		

	}

}
