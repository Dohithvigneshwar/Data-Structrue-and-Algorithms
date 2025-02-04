package trees;
/**
 * TREES
 * WHY ? 
 	* O(log n)
 	* ordered storage
 * Limitation
 	* unbalanced tree O(n)
 * Usage 
 	* file system
 	* databases
 	* networking
 	* compression of files
 * Properties that will help it some questions
 	* perfect binary tree:
 		* total nodes = 2^(h+1) - 1
 		* no of leaf nodes = 2 ^ h
 		* no of internal node apart from leaf node => 2^(h+1) - 1 - 2^h = 2^h - 1
 * Implementation 
 * 		- linked representation
 * 		- sequential representation - using Array
 */
public class Trees {
	public static void main(String args[]) {
		BT1 obj = new BT1(10);
		obj.addLeft(20);
		obj.addLeft(30);
		obj.addRight(40);
		obj.addRight(50);	
		obj.printLeft();
		obj.printRight();
		obj.inOrder(obj.root);
	}
}
class BT1{
	Node root;
	public BT1(int data) {
		Node node = new Node(data);
		root = node;
	}
	private class Node{
		private int data;
		private Node left,right;
		public Node(int data) {
			this.data = data;
		}
	}
	public void addLeft(int data) {
		Node temp = root;
		while(temp.left!=null) {
			temp = temp.left;
		}
		Node node = new Node(data);
		temp.left = node;
	}
	public void addRight(int data) {
		Node temp = root;
		while(temp.right!=null) {
			temp = temp.right;
		}
		Node node = new Node(data);
		temp.right = node;
	}
	public void printLeft() {
		Node temp = root;
		System.out.print("LEFT ->");
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.left;
		}
		System.out.println("END");
	}
	public void printRight() {
		Node temp = root;
		System.out.print("RIGHT->");
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp = temp.right;
		}
		System.out.println("END");
	}
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.left.data+" "+root.data+" "+root.right.data);
			inOrder(root.right);
		}
	}
}