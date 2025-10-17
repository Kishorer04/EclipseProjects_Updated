package problems;

//Java program to illustrate how to find the middle element
//by counting the number of nodes

//A singly linked list node
class Node {
 int data;
 Node next;

 // Constructor to initialize a new node with data
 Node(int x) {
     this.data = x;
     this.next = null;
 }
}

class MiddleOfLinkedList {

 // Helper function to find length of linked list
 static int getLength(Node head) {

     // Variable to store length
     int length = 0;

     // Traverse the entire linked list and increment
     // length by 1 for each node
     while (head != null) {
         length++;
         head = head.next;
     }

     // Return the number of nodes in the linked list
     return length;
 }

 // Function to get the middle value of the linked list
 static int getMiddle(Node head) {
   
     // Finding the length of the list
     int length = getLength(head);

     // traverse till we reached half of length
     int mid_index = length / 2;
     while (mid_index > 0) {
         head = head.next;
         mid_index--;
     }
     // temp will be storing middle element
     return head.data;
 }

 public static void main(String[] args) {

     // Create a hard-coded linked list:
     // 10 -> 20 -> 30 -> 40 -> 50 -> 60 
     Node head = new Node(10);
     head.next = new Node(20);
     head.next.next = new Node(30);
     head.next.next.next = new Node(40);
     head.next.next.next.next = new Node(50);
     head.next.next.next.next.next = new Node(60);

     System.out.println(getMiddle(head));
 }
}
