package tree;

// Node Structure
//class Node {
//	int data;
//	Node left;
//	Node right;
//
//	Node(int d) {
//		this.data = d;
//		left = right = null;
//	}
//}

class BalancedTreeOrNot {

	// Function that returns the height of the tree if the tree is balanced
	// Otherwise it returns -1.
	static int isBalancedRec(Node root) {
		if (root == null)
			return 0;

		// Find Heights of left and right sub trees
		int lHeight = isBalancedRec(root.left);
		int rHeight = isBalancedRec(root.right);

		// If either the subtrees are unbalanced or the absolute difference
		// of their heights is greater than 1, return -1
		if (lHeight == -1 || rHeight == -1 || Math.abs(lHeight - rHeight) > 1)
			return -1;

//		System.out.println(Math.max(lHeight, rHeight) + 1);
		return Math.max(lHeight, rHeight) + 1;  // +1 is used to include the current node in height calculation. In our case node 10.
	}

	// Function to check if tree is height balanced
	static boolean isBalanced(Node root) {
		return isBalancedRec(root) > 0;
	}

	public static void main(String[] args) {
		// Representation of input BST:
		// 10
		// / \
		// 20 30
		// / \
		// 40 60
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(60);

		System.out.println(isBalanced(root) ? "true" : "false");
	}
}
