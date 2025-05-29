package Collections;

import java.util.LinkedList;

public class LinkedListDemo3 {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add("Cat");
		l.add("Cat");
		l.add("Horse");
		l.add("Dog");
		System.out.println(l);
		
	    //Specific methods of LinkedList which will be generally used to implement Stack and Queue
		l.addFirst("Tiger");
		l.addLast("elephant");
		
		System.out.println(l);
		
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
		
	}

}
