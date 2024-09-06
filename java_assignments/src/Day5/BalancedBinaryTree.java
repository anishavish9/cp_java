/*
 * 1. Balanced Binary Tree Check
 		Write a function to check if a given binary tree is balanced. 
 		A balanced tree is one where the height of two subtrees of any node never differs by more than one.
 */

package Day5;

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


public class BalancedBinaryTree {


	public static void main(String[] args) {
		Node node = new Node(70);
		node.left = new Node(20);
		node.right = new Node(30);
		node.left.left = new Node(40);
		node.left.right = new Node(50);
		
		//balanced if this added 
//		node.right.left = new Node(20);
//		node.right.right = new Node(35);
		
		node.left.left.left = new Node(36);

		BalancedBinaryTree isBalanced = new BalancedBinaryTree();
		System.out.println(isBalanced(node)); // Output: false

	}

	private static Boolean isBalanced(Node node) {
		if(checksHeight(node) != -1) {
			return true;
		}
		else return false;
	}

	private static int checksHeight(Node node) {
		if(node == null) return 0;

		int rightHeight = checksHeight(node.right);
		int leftHeight = checksHeight(node.left);
		if(rightHeight == -1 || leftHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
			return -1;
		}
		return Math.max(leftHeight, rightHeight)+1;

	}

}
