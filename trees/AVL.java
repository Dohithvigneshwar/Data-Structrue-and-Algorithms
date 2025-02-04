package trees;
import java.util.LinkedList;
import java.util.Queue;

public class AVL {
	public static void main(String args[]) {
		AVL tree = new AVL();
//		int a[] = new int[] {10,9,8,6,7,3};
//		for(int element : a) {
//			tree.insert(element);
//		}
		for(int i=0;i<10000;i++) tree.insert(i);
		System.out.println(tree.isBalanceTree(tree.root));
		tree.levelOrder(tree.root);
	}
	public void levelOrder(Node node) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(node);
		while(queue.isEmpty()==false) {
			Node temp = queue.remove();
			System.out.print(temp.data+" ");
			if(temp.left!=null) queue.add(temp.left);
			if(temp.right!=null) queue.add(temp.right);
		}
		
	}
	public boolean isBalanceTree(Node node) {
		if(node==null) return true;
		int l = height(node.left);
		int r = height(node.right);
		return Math.abs(l-r)<=1 && isBalanceTree(node.left) && isBalanceTree(node.right);
	}
	public int height(Node node) {
		if(node == null) return -1;
		return node.height;
	}
	public void insert(int data) {
		if(root == null) {
			root = new Node(data);
			return;
		}
		root = insert(data,root);
	}
	public Node insert(int data,Node node) {
		if(node == null) {
			node = new Node(data);
			return node;
		}
		if(node.data<data) {
			node.right = insert(data,node.right);
		}
		if(node.data>data) {
			node.left = insert(data,node.left);
		}
		node.height = Math.max(height(node.left),height(node.right))+1;
		
		int bal = balanceFactor(node);
		
		if(bal>1 && data<node.left.data) {  // LL case
			return rightRotate(node);
		}
		
		if(bal>1 && data>node.left.data) {  // LR case
			node.left = leftRotate(node.left);
			return rightRotate(node);
		}
		
		if(bal<-1 && data>node.right.data) { // RR case
			return leftRotate(node);
		}
		
		if(bal<-1 && data<node.right.data) { //RL case
			node.right = rightRotate(node.right);
			return leftRotate(node);
		}
		
		return node;
	}
	private Node leftRotate(Node x) {
		Node y = x.right;
		Node t2 = y.left;
		
		y.left = x;
		x.right = t2;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		y.height = Math.max(height(y.left), height(y.right))+1;

		return y;
	}
	
	private Node rightRotate(Node x) {
		Node y = x.left;
		Node t3 = y.right;
		
		y.right = x;
		x.left = t3;
		
		x.height = Math.max(height(x.left), height(x.right))+1;
		y.height = Math.max(height(y.left), height(y.right))+1;
		
		return y;
	}
	
	private int balanceFactor(Node node) {
		return height(node.left)-height(node.right);
	}
	public void preOrder(Node node) {
		if(node == null) return;
		System.out.println(node.data + " -> "+node.height);
		preOrder(node.left);
		preOrder(node.right);
	}
	private Node root;
	private class Node{
		private int height, data;
		Node left, right;
		public Node(int data) {
			this.data = data;
		}
	}
}
