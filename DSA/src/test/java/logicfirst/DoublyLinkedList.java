package logicfirst;

public class DoublyLinkedList {
	Node head;
	Node tail;
	
	DoublyLinkedList(){
		head=null;
		tail=null;
	}
	
	class Node{
		int data;
		Node prev;
		Node next;
		
		Node(int val){
			data=val;
			prev=null;
			next =null;
		}
	}
	
	public void insertAtBeginning(int val)
	{
		Node newNode = new Node(val);
		newNode.next=head;
		
		//when list is empty
		if(head==null)
			tail = newNode;
		
		else  //list is not empty
			head.prev=newNode;
		
		head=newNode;
	}
	
	public void display() {
		
		if(head==null)
			System.out.println("List is empty");
		Node temp =head;
		
		while(temp!=null)
		{
		System.out.print(temp.data + " ");
		temp=temp.next;
		}
		
	}
	
	public void displayRev() {
		if(head==null)
			System.out.println("List is empty");
		Node temp = tail;
		
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp=temp.prev;
		}
		
	}
	
	public void insertAtPosition(int pos, int val)
	{
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
			if(temp == null)
				throw new IllegalArgumentException();
		}	
			newNode.next=temp.next;
			newNode.prev=temp;
			
			if(temp==tail)
				tail=newNode;
			else 
				temp.next.prev=newNode;
			temp.next=newNode;
			
	}
	
	public void deleteAtPosition(int pos) {
		if(head==null)
			throw new IndexOutOfBoundsException("Deletion attempted in empty list");
		if(pos==0)
		{
			head=head.next;
			if(head==null)
				tail=null;
			else
				head.prev=null;
			return;
		}
		
		
		Node temp = head;
		Node prev = null;
		
		for(int i=0;i<pos;i++)
		{
			prev=temp;
			temp=temp.next;
			if(temp==null)
				throw new IndexOutOfBoundsException("Invalid position");
		}
		
		prev.next  = temp.next;
		if(temp.next==null)
			tail=prev;
		else
			temp.next.prev=prev;

	}
	


}
