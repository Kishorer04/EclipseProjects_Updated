package tree;

//Node Structure
//class Node {
// Node left, right;
// int data;
//
// Node(int k) {
//     data = k;
//     left = null;
//     right = null;
// }
//}

class LowestCommonAncestorOfBinaryTree {
	
 static Node lca(Node root, int n1, int n2) {

     if (root == null)
         return null;

     // If either key matches with root data, return root
     if (root.data == n1 || root.data == n2)
         return root;

     Node leftLca = lca(root.left, n1, n2);
     Node rightLca = lca(root.right, n1, n2);

     // If both of the above calls return Non-NULL, then one
     // node is present in one subtree and the other is present
     // in the other, so this node is the LCA
     if (leftLca != null && rightLca != null)
         return root;

     // Otherwise check if left subtree or 
     // right subtree is LCA
     return (leftLca != null) ? leftLca : rightLca;
 }

 public static void main(String[] args) {

     // construct the binary tree
     //             1
     //           /   \
     //          2     3
     //         / \   / \
     //        4  5  6   7 
     //             /
     //            8

     Node root = new Node(1);
     root.left = new Node(2);
     root.right = new Node(3);
     root.left.left = new Node(4);
     root.left.right = new Node(5);
     root.right.left = new Node(6);
     root.right.right = new Node(7);
     root.right.left.left = new Node(8);

     Node ans = lca(root, 7, 8);

     System.out.println(ans.data);
 }
}
