package QA_SDET_Interview;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//class Node {
//	int data;
//	Node left;
//	Node right;
//
//	Node(int val) {
//		data = val;
//		left = null;
//		right = null;
//	}
//
//}

//Iterative method to perform level order traversal
public class LevelOrderTraversal_BFS_BinaryTree {

	public static ArrayList<ArrayList<Integer>> levelOrder(Node root) {
		if (root == null)
			return new ArrayList<>();

		// Create an empty queue for level order traversal
		Queue<Node> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		// Enqueue Root
		q.offer(root);
		int currLevel = 0;

		while (!q.isEmpty()) {
			int len = q.size();
			res.add(new ArrayList<>());

			for (int i = 0; i < len; i++) {
				// Add front of queue and remove it from
				// queue
				Node node = q.poll();
				res.get(currLevel).add(node.data);

				// Enqueue left child
				if (node.left != null)
					q.offer(node.left);

				// Enqueue right child
				if (node.right != null)
					q.offer(node.right);
			}
			currLevel++;
		}
		return res;
	}

	public static void main(String[] args) {

		Node root = new Node(5);
		root.left = new Node(12);
		root.right = new Node(13);

		root.left.left = new Node(7);
		root.left.right = new Node(14);

		root.right.right = new Node(2);

		root.left.left.left = new Node(17);
		root.left.left.right = new Node(23);

		root.left.right.left = new Node(27);
		root.left.right.right = new Node(3);

		root.right.right.left = new Node(8);
		root.right.right.right = new Node(11);

		// Perform level order traversal and get the result
		ArrayList<ArrayList<Integer>> res = levelOrder(root);

		for (ArrayList<Integer> level : res) {
			for (int val : level) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

}

//The offer() method in the Java Queue interface is used to insert a specified element into the queue.
//The poll() method in a queue is used to retrieve and remove the element at the head (front) of the queue
