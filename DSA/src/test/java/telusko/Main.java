package telusko;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(89);
		list.add(77);
		
		list.addFirst(99);
		
		list.printValues();
		

	}

}
