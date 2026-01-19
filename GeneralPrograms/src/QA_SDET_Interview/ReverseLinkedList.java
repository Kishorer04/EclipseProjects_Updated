package QA_SDET_Interview;


//class Node{
//	int data;
//	Node next;
//	
//	Node(int new_data)
//	{
//		data = new_data;
//		next=null;
//	}
//}


public class ReverseLinkedList {
	
	
	static Node reverseLinkedList(Node head)
	{
		Node current = head;
		Node prev = null;
		Node next;
		
		while(current!=null)
		{
			//Store next
			next=current.next;
			//Reverse current node's next pointer
			current.next=prev;
			// Move pointers one position ahead
			prev = current;
			current =  next;
		}
		return prev;
	}
	
	
	static void printLinkedList(Node node)
	{
		while(node!=null)
		{
			System.out.print(node.data);
			if(node.next!=null)
			{
				System.out.print("->");
			}
			node=node.next;
		}
	}
	

	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next =  new Node(5);
		
		printLinkedList(head);
		System.out.println();
		
		head = reverseLinkedList(head);
		printLinkedList(head);
	}

}
