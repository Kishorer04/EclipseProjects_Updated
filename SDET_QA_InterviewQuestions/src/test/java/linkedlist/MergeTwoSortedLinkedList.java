package linkedlist;

//
//class Node {
//    int data;
//    Node next;
//
//    Node(int x) {
//        data = x;
//        next = null;
//    }
//}

public class MergeTwoSortedLinkedList {

    static Node sortedMerge(Node head1, Node head2) {
                                      

        // create a dummy node to simplify 
        // the merging process
        Node dummy = new Node(-1);
        Node curr = dummy;

        // iterate through both linked lists
        while (head1 != null && head2 != null) {
          
            // add the smaller node to the merged list
            if (head1.data <= head2.data) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }

        // if any list is left, append it to 
        // the merged list
        if (head1 != null) {
            curr.next = head1;
        } else {
            curr.next = head2;
        }

        // return the merged list starting from 
        // the next of dummy node
        return dummy.next;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head1 = new Node(5);
        head1.next = new Node(10);
        head1.next.next = new Node(15);
        head1.next.next.next = new Node(40);

        Node head2 = new Node(2);
        head2.next = new Node(3);
        head2.next.next = new Node(20);

        Node res = sortedMerge(head1, head2);
        printList(res);
    }
}
