package logicfirst;

public class QueueDemo {

	public static void main(String[] args) {
		QueueUsingLL qu = new QueueUsingLL();
		
		qu.enqueue(7);
		qu.enqueue(6);
		qu.enqueue(5);
		
		System.out.println(qu.dequeue());
		System.out.println(qu.dequeue());
		
		System.out.println(qu.isEmtpy());
		System.out.println(qu.elementAtFront());

		

	}

}
