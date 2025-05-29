package logicfirst;

import java.util.Iterator;

public class LDemo {
	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.insertAtBeginning(4);
		list.insertAtBeginning(8);
		list.insertAtBeginning(9);
		list.insertAtPosition(1,7);
		list.display();	
//		System.out.println();
//		list.deleteAtPosition(2);
//		list.display();	
//		System.out.println();
//		list.deleteAtPosition(0);
//		list.display();
//		System.out.println();
		
//		for(int a:list)
//			System.out.print(a);
		
		System.out.println();
		
//		Iterator<Integer> it =list.iterator();
//		
//		while(it.hasNext())
//			System.out.println(it.next());
		
		list.reverse();
		list.display();
		
	}

}
