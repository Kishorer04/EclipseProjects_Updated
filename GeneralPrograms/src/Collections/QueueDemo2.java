package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueDemo2 {

	public static void main(String[] args) {
		LinkedList q=new LinkedList(); //In LinkedList Insertion order is preserved, Duplicates are allowed, heterogenous data is allowed
	
		//Adding elements  add() or offer()
		q.add("A"); //if adding is successful it returns True, if adding is failed it returns Exception
		q.add("B");
		q.add("C");
		q.offer("C"); //if adding is successful it returns True, if adding is failed it returns False
		q.add(23);
		q.offer(true);
		System.out.println(q);//insertion order is preserved and duplicates allowed
		
	//Getting/Return Header element from queue   element() or peek()
		//System.out.println(q.element());  //Returns head element, if queue is empty returns NoSuchElementException
		//System.out.println(q.peek());     //Returns head element, if queue is empty return Null
		
	
   //Getting/Return and Remove the element from the queue   remove() and poll()
	//System.out.println(q.remove());   //Returns an removes header element, if queue is empty it returns NoSuchElementException
	//System.out.println(q.poll());     //Returns an removes header element, if queue is empty it returns Null

	
	//Read all the elements from queue
	
	//Iterator method
	
	 Iterator it= q.iterator();
	 
	 while(it.hasNext())
	 {
		 System.out.println(it.next());
	 }
	
	 //using for-each loop
	 
	 for(Object ele:q)
	 {
		 System.out.println(ele);
	 }
	 
	
	}

}
