package practice;

public class StackDemo {

	public static void main(String[] args) {
		
		StackUsingLinkedList sll = new StackUsingLinkedList();
		sll.push(7);
		sll.push(8);
		System.out.println(sll.pop());
		System.out.println(sll.peek());
		System.out.println(sll.isEmpty());

	}

}
