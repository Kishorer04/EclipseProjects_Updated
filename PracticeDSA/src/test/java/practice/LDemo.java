package practice;

import java.util.Iterator;

public class LDemo {
	public static void main(String[] args) {
		
    LinkedList<Integer> list = new LinkedList<Integer>();
    
    list.insertAtBeginning(3);
    list.insertAtBeginning(5);
    list.insertAtPosition(0,8);
    list.display();
//    System.out.println();
//    list.deleteAtPosition(1);
//    list.display();
    
//    for(int i:list)
//    System.out.print(i);
    
    System.out.println();
//    Iterator<Integer> it =list.iterator();
    
//    while(it.hasNext())
//    	System.out.print(it.next());
     list.reverse();   
    list.display();
       
	}
}
