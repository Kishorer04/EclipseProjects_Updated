package logicfirst;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

	Node head;
	
	LinkedList(){
		head=null;
	}
	
	
	class Node{
		
		T data;
		Node next;	
		
		Node(T val){
			data=val;
			next =null;
		}
	}
	
	
	public void insertAtBeginning(T val) {
		
		Node newNode = new Node(val);
		
		//when list is empty
		if(head==null)
			head=newNode;
		
		else { // list is not empty
			newNode.next=head;
			head=newNode;
		}
		
		
	}


	public void display() {
	 
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.data+ " ");
			temp =temp.next;
		}
		
	}


	public void insertAtPosition(int pos, T val) {
		
		Node newNode = new Node(val);
		
		if(pos==0)
		{
			insertAtBeginning(val);
		    return;
		}
		
		Node temp = head;
		
		//Jump till position -1
		for(int i=0;i<pos-1;i++)
		{
			temp=temp.next;
			
			if(temp==null)
			{
			throw new IllegalArgumentException("Invalid position: "+pos);
			
			}
		}
		
		newNode.next=temp.next;
		temp.next=newNode;
		
		
	}
	
	public void deleteAtPosition(int pos)
	{
		if(head==null)
			throw new IndexOutOfBoundsException("Deletion attempted in an empty list");
		
		if(pos==0)
		{
		head=head.next;
		return;
		}
		
		Node temp =head;
		Node prev = null;
		
		//Jump till node to be deleted
		for(int i=0;i<pos;i++)
		{
			prev=temp; //keep track of prev node
			temp=temp.next; //jump to next node
		}
		
		prev.next=temp.next;
	}


	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
            Node temp =head;
			
			@Override
			public boolean hasNext() {
				return temp!=null;
			}

			@Override
			public T next() {
				
				T val=temp.data;
				temp=temp.next;
				return val;
			}
			
		};
	}
	
	
	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current = next;
		}
		
		head=prev;
	
	}
			
		
	}


