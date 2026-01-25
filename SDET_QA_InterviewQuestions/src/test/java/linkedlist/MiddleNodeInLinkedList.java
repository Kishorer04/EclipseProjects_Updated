package linkedlist;

//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        this.data = x;
//        this.next = null;
//    }
//}

class MiddleNodeInLinkedList {

    static int getMiddle(Node head) {

        Node slowptr = head;
        Node fastptr = head;

        while (fastptr != null && fastptr.next != null) {

            // move the fast pointer by two nodes
            fastptr = fastptr.next.next;

            // move the slow pointer by one node
            slowptr = slowptr.next;
        }

        return slowptr.data;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = new Node(60);

        System.out.println(getMiddle(head));
    }
}
