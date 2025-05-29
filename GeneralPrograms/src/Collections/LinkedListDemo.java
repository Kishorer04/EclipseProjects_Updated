package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		
		//List l=new LinkedList();
		//Homogeneous data
		//LinkedList<Integer> l= new LinkedList<Integer>();
   
		//add elements into linked list
		l.add(100);
		l.add("Kishore");
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		
		System.out.println(l.size());
		
		//remove
		l.remove(1);
		System.out.println("After removing "+l);
		
	    //Insert/adding element in the middle of linked list
		l.add(3,"Java");
		System.out.println("After inserting element "+l);
	
	    //retrieving value/object
		System.out.println(l.get(3));
		
		//Replace/Change the value
		l.set(1, "NoNull");
		System.out.println(l);
		
		//check whether the value is present
		System.out.println(l.contains("Python"));
		
		//check whether empty or not
		System.out.println(l.isEmpty());
		
		//Reading elements using for loop
		System.out.println("For loop");
		for(int i=0;i<l.size();i++) {
			System.out.println(l.get(i));
		}
		
		//Reading elements using for-each loop
		System.out.println("For each loop");
		for(Object a:l)
			System.out.println(a);
		
		//Reading elements using iterator
		System.out.println("Iterator method");
		
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
		
		
		
		
	}

}
