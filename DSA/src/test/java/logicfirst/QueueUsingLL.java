package logicfirst;

public class QueueUsingLL {
	Node front;
	Node rear;
	
	class Node{
		int data;
		Node next;
		
		
		Node(int val){
			data=val;
			next=null;		
		}
	}
	
	QueueUsingLL(){
		front = null;
		rear=null;
				
	}
	
	public void enqueue(int val) {
		Node newNode = new Node(val);
		
		if(front==null)
			front = newNode;
		else
			rear.next=newNode;
		rear=newNode;
	}

	public int dequeue() {
		if(front == null) //If Q is empty
			throw new IndexOutOfBoundsException("Queue is Empty");
		
		int temp = front.data;
		front=front.next;
		
		if(front==null) //Deleted last node and now Q is empty
			rear=null;
		return temp;
	}
	
	public boolean isEmtpy() {
		return front == null;
	}
	
	public int elementAtFront() {
		if(front == null)
			throw new IndexOutOfBoundsException("Queue is Empty");
		return front.data;
	}
	
	
}
