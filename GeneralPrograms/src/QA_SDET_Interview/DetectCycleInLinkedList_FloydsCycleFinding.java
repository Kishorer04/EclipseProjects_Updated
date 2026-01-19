package QA_SDET_Interview;

//class Node {     // Commenting this Node class since we already have Node class in ReverseLinkedList.java
                   // Java does not allow two classes with the same name in the same package.
//
//	int data;
//	Node next;
//
//	Node(int x) {
//		data = x;
//		next = null;
//	}
//}

public class DetectCycleInLinkedList_FloydsCycleFinding {
	


	static boolean detectLoop(Node head) {
		Node slow = head;
		Node fast = head;

		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}
		return false;

	}

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);

		head.next.next.next = head.next;

		if (detectLoop(head))
			System.out.println("true");
		else
			System.out.println("false");

	}

}
