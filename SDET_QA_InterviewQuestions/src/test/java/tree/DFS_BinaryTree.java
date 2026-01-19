package tree;

import java.util.ArrayList;

//Node Structure
//class Node {
//	int data;
//	Node left;
//	Node right;
//
//	Node(int x) {
//		data = x;
//		left = right = null;
//	}
//}

public class DFS_BinaryTree {

	// InOrder
	static void inOrder(Node node, ArrayList<Integer> res) {
		if (node == null)
			return;

		// Traverse the left subtree first
		inOrder(node.left, res);

		// Visit the current node
		res.add(node.data);

		// Traverse the right subtree last
		inOrder(node.right, res);
	}
	

	// PreOrder
	static void preOrder(Node node, ArrayList<Integer> res) {
		if (node == null)
			return;

		res.add(node.data);
		preOrder(node.left, res);
		preOrder(node.right, res);
	}
	

	// PostOrder
	static void postOrder(Node node, ArrayList<Integer> res) {
		if (node == null)
			return;

		postOrder(node.left, res);
		postOrder(node.right, res);
		res.add(node.data);
	}

	public static void main(String[] args) {
		// Create binary tree
        //       1
        //      /  \
        //    2     3
        //   / \     \
        //  4   5     6
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.right = new Node(6);

		ArrayList<Integer> res = new ArrayList<>();
		inOrder(root, res);

		for (int node : res)
			System.out.print(node + " ");
	}
}
