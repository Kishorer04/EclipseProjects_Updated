package practice;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T> {
	 Node head;
	 
	 LinkedList(){
		 head=null;
	 }
	class Node{
		T data;
		Node next;
	
	Node(T val){
		data = val;
		next = null;			
	}
	}
	
	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		
		if(head==null)
			head=newNode;
		
		else {
			newNode.next=head;
			head=newNode;
		}
	}
	
	
	public void display() {
		Node temp =head;
		
		while(temp!=null)
		{
		System.out.print(temp.data + " ");
		temp=temp.next;
		}
	}
	
	public void insertAtPosition(int pos, T val)
	{
		if(pos==0)
		{
			insertAtBeginning(val);
		    return;
		}
		
		Node newNode = new Node(val);
        Node temp =head;
        
        for(int i=0;i<pos-1;i++)
        {
        	temp=temp.next;
            if(temp==null)
            throw new IndexOutOfBoundsException();
        }
        
        newNode.next=temp.next;
        temp.next=newNode;
 	
	}
	
	
	public void deleteAtPosition(int pos)
	{
		if(head==null)
			throw new  IndexOutOfBoundsException("Deletion attempted in an empty list");
		
		if(pos==0)
		{
			head=head.next;
			return;
		}
	          Node temp =head;
	          Node prev=null;
	          
	          for(int i=0;i<pos;i++)
	          {
	        	  prev=temp;
	        	  temp=temp.next;
	          }
	          
	          prev.next=temp.next;
	        		  
	}


	@Override
	public Iterator<T> iterator() {
	
		return new Iterator<T>() {
			
			Node temp = head;

			@Override
			public boolean hasNext() {
				
				return temp!=null;
			}

			@Override
			public T next() {
				
				T val = temp.data;
				temp=temp.next;
				return val;
			}
			
			
			
			
		};
	}
	
	public void reverse() {
		
		Node prev =null;
		Node current =head;
		Node next = head.next;
		
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		head=prev;
	}
	
	
}
