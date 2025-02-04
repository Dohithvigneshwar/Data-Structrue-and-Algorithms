package trees;

public class BinaryTree {
	Node root;
	class Node{
		int data;
		Node right;
		Node left;
		public Node(int data) {
			this.data = data;
			right = null;
			left = null;
		}
	}
	public void addLeft(Node r,int element) {
		Node node = new Node(element);
		r.left = node;
	}
	public void addRight(Node r,int element) {
		Node node = new Node(element);
		r.right = node;
	}
	public BinaryTree(int data) {
		Node node = new Node(data);
		root = node;
	}
	public void preOrder(Node root) {
		if(root!=null) {
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	public void inOrder(Node root) {
		if(root!=null) {
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
	}
	public void postOrder(Node root) {
			if(root!=null) {
				postOrder(root.left);
				postOrder(root.right);
				System.out.print(root.data+" ");
			}
	}	
	public static void main(String args[]) {
		BinaryTree obj = new BinaryTree(10);
		obj.addLeft(obj.root, 5);
		obj.addLeft(obj.root.left, 3);
		obj.addRight(obj.root.left, 8);
		obj.addRight(obj.root,15);
		obj.addLeft(obj.root.right,12);
//		stem.out.println(obj.root.right.left.data);
		obj.preOrder(obj.root);
		System.out.println();
		obj.inOrder(obj.root);
		System.out.println();
		obj.postOrder(obj.root);
	}
}
