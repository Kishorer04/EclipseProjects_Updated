package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo2 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		LinkedList l =new LinkedList();
		
		
		l.add(3);
		l.add(9);
		l.add(5);
		l.add(2);
		
		//addAll()
		LinkedList l2=new LinkedList();
		l2.addAll(l);
		
		System.out.println("After adding"+l2);
		
		//removeAll()
		l2.removeAll(l);
		System.out.println("After removing "+l2);
		
		//sort(),shuffle() is possible only with similar elements of similar datatype
		//sort()
		Collections.sort(l);
		System.out.println(l);
		
		//sort in reverse order
		Collections.sort(l,Collections.reverseOrder());
		System.out.println("Reverse order"+ l);
		
		//shuffle()
		Collections.shuffle(l);
		System.out.println(l);
		
		
		
		
		

	}

}
