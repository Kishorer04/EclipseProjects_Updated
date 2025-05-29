package practice;

public class DoublyDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		
		dlist.insertAtBeginning(5);
		dlist.insertAtBeginning(3);
		dlist.insertAtBeginning(9);
		dlist.display();
		System.out.println();
		dlist.displayRev();
		
		dlist.insertAtPosition(3,6);
		System.out.println();
		dlist.display();
		System.out.println();
		dlist.displayRev();
		
	}

}
