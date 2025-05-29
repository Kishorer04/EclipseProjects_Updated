package practice;

public class DoublyLinkedList {
	Node head;
	Node tail;
	
	DoublyLinkedList(){
		head=null;
		tail=null;
	}
	
	class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int val){
			data=val;
			next=null;
			prev=null;
		}
		
	}
	
	public void insertAtBeginning(int val) {
		
		Node newNode =new Node(val);
		
		if(head==null)
		{
			head=newNode;
			tail=newNode;
		}
		
		else {
			newNode.next=head;
			head.prev=newNode;
			head=newNode;
		}
		
	}
	
	public void display() {
		
		Node temp=head;
		
		while(temp!=null)
		{
		System.out.print(temp.data + " ");
		temp=temp.next;
		}
	}
	
	public void displayRev() {
		Node temp=tail;
		
		while(temp!=null)
		{
			System.out.print(temp.data + " ");
			temp=temp.prev;
		}
	}
	
	public void insertAtPosition(int pos, int val) {
		if(pos==0)
		{
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i=0;i<pos-1;i++)
		{
		temp=temp.next;
		if(temp==null)
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

}

