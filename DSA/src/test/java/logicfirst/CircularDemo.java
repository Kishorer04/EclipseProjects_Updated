package logicfirst;

public class CircularDemo {
	
	public static void main(String[] args) {
		CircularLinkedList clist = new CircularLinkedList();
		clist.insertAtBeginning(5);
		clist.insertAtBeginning(8);
//		clist.insertAtBeginning(2);
		clist.insertAtEnd(9);
		clist.display();
		System.out.println();
		clist.deleteAtBeginning();
		clist.display();
		System.out.println();
		clist.deleteAtEnd();
		clist.display();
	}
	
	

}
