package logicfirst;

public class StackDemo {

	public static void main(String[] args) {
		
		StackUsingLinkedList sll = new StackUsingLinkedList();
		sll.push(5);
		sll.push(0);
		sll.push(8);
		System.out.println(sll.peek());
		
		System.out.println("Popped data: " + sll.pop());
	}

}
