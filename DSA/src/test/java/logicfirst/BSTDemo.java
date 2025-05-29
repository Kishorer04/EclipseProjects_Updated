package logicfirst;

public class BSTDemo {

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree(50);
		bst.insert(bst.root, 20);
		bst.insert(bst.root, 70);
		bst.insert(bst.root, 10);
		bst.insert(bst.root, 25);
		bst.insert(bst.root, 60);
		bst.insert(bst.root, 90);
		bst.insert(bst.root, 80);
		bst.insert(bst.root, 75);
		
		BinarySearchTree.inOrder(bst.root);

		
		if(bst.search(bst.root,60)==null)
			System.out.println("Not found");
		else
			System.out.println("Found");
		
		
		bst.delete(70);
		BinarySearchTree.inOrder(bst.root);
		

	}

}
