package logicfirst;

public class DoublyDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList dlist = new DoublyLinkedList();
		dlist.insertAtBeginning(6);
		dlist.insertAtBeginning(8);
		dlist.insertAtBeginning(9);
		dlist.insertAtBeginning(1);
		dlist.display();
		System.out.println();
		dlist.displayRev();
		System.out.println();
		dlist.insertAtPosition(3,4);
		dlist.display();
		System.out.println();
		dlist.displayRev();
		System.out.println();
		dlist.deleteAtPosition(3);
		dlist.display();
		System.out.println();
		dlist.displayRev();

	}

}
