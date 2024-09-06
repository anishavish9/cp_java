package Searching;

class Node {
	int key;
	Node left;
	Node right;

	public Node(int key) {
		this.key = key;
		this.left = null;
		this.right = null;
	}
}

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		this.root = null;
	}

	// insert key
	public void insert(int key) {
		root = inserting(root, key);
	}

	Node inserting(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key)
			root.left = inserting(root.left, key);

		else if (key > root.key)
			root.right = inserting(root.right, key);

		return root;


	}
	// search key in tree (? :
	//(exp)? exp1 :exp2;

	public boolean search(Node root, int key) {
		if (root == null)
			return false;
		if (key == root.key)
			return true;
		return key < root.key ? search(root.left, key) : search(root.right, key);

	}


	//delete method
	public Node delete(Node root, int key) {
		if (root == null)
			return root;
		if (key < root.key)
			root.left = delete(root.left, key);
		else if (key > root.key)
			root.right = delete(root.right, key);
		else {
			//node with only one children
			if(root.left == null)
				return root.right;
			else if (root.right ==null)
				return root.left;
		
			// Node with two children: Get the in-order successor 
			//(smallest in the right subtree)-> go to right child->left child with no node
			root.key = minValue(root.right);
	
			 // Delete the in-order successor
			root.right = delete(root.right, root.key);
		}
		return root;
	}
	
	// Helper function to find the minimum value node in a given tree
	int minValue(Node root) 
	{ 
		int minValue = root.key; 
		while (root.left != null) { 
			root = root.left; 
			minValue = root.key; 
		} 
		return minValue; 
	}

	//in-order
	public void  inorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			System.out.println(root.key+ " ");
			inorder(root.right);

		}
	}
	
	//post-order
	public void  postorder(Node root)
	{
		if(root!=null)
		{
			inorder(root.left);
			inorder(root.right);
			System.out.println(root.key+ " ");

		}
	}
	
	//pre-order
	public void  preorder(Node root)
	{
		if(root!=null)
		{
			System.out.println(root.key+ " ");
			inorder(root.left);
			inorder(root.right);
		}
	}
	
	public static void main(String args[])
	{
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(60);
		bst.insert(40);
		bst.insert(30);
		bst.insert(50);
		bst.insert(80);
		bst.insert(70);
		bst.insert(100);
//		bst.inorder(bst.root);
//		bst.preorder("pre order---------->" + bst.root);
//		bst.postorder("post order---------->" + bst.root);


//		System.out.println(" root value");
//		System.out.println(bst.root.key);

//		bst.delete(bst.root,30);
//		bst.inorder(bst.root);
//
		bst.delete(bst.root,60);
		bst.inorder(bst.root);
				

	}
}
