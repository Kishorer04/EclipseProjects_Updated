package tree;

class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class DepthOrHeightOfBinaryTree {
	
//	The maximum depth or height of the tree is the number of edges in the tree from 
//	the root to the deepest node.
    
	static int height(Node root) {
        if (root == null)
            return -1;

        // compute the height of left and right subtrees
        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.max(lHeight, rHeight) + 1;  // Here 1 is used bcoz it is for the current node
    }

    public static void main(String[] args) {

        // Representation of the input tree:
        //     12
        //    /  \
        //   8   18
        //  / \
        // 5   11
        Node root = new Node(12);
        root.left = new Node(8);
        root.right = new Node(18);
        root.left.left = new Node(5);
        root.left.right = new Node(11);

        System.out.println(height(root));
    }
}