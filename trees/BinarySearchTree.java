package trees;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class BST{
	Node root;
	private class Node{
		private int height;
		private int data;
		private Node left,right;
		public Node(int data) {
			this.data = data;
		}
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void display() {
		display(root);
	}
	private void display(Node node) {
		if(node == null) return;
		System.out.print(node.data+" ("+node.height+") ");
		display(node.left);
		display(node.right);
	}
	public void insert(int data) {
		if(root == null) {
			root = new Node(data);
			return;
		}
		insert(data,root);
	}
	public Node insert(int data,Node node) { 
		if(node == null) {
			Node a =  new Node(data);
			return a;
		}
		if(data<node.data) {
			node.left = insert(data,node.left);
		}
		if(data>node.data) {
			node.right = insert(data,node.right);
		}
		node.height = Math.max(height(node.left),height(node.right))+1;
		return node;
	}
	public void delete(int data) {
		delete(data,root);
	}
	public int height(Node node) {
		if(node == null) {
			return -1;
		}
		return node.height;
	}
	private Node delete(int data,Node node) {
		if(node == null) {
			return null;
		}
		if(node.data == data) {
			if(node.left == null && node.right == null) {
				return null;
			}
			else if(node.left == null || node.right == null) {
				if(node.left == null) {
					return node.right;
				}
				else {
					return node.left;
				}
			}
			else {
				Node temp = inorderSuccessor(node.right);
				node = temp;
				delete(temp.data,node.right);
				return node;
			}
			
		}
		if(node.data<data) {
			node.right = delete(data,node.right);
		}
		if(node.data>data) {
			node.left = delete(data,node.left);
		}
		return node;
	}
	private Node inorderSuccessor(Node node) {
		Node temp = node;
		while(temp.left!=null) {
			temp = temp.left;
		}
		return temp;
	}
	public boolean isBalancedTree(Node node) {
		if(node == null) {
			return true;
		}
		return Math.abs(height(node.left) - height(node.right)) <=1 && isBalancedTree(node.left) && isBalancedTree(node.right);
	}
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
	public void inOrder(Node node) {
		if(node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.data+" ");
		inOrder(node.right);
	}
	public void postOrder(Node node) {
		if(node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+" ");
	}
	public void BFS() {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		System.out.print("BFS (LevelOrder)   -->  ");
		while(!queue.isEmpty()) {
			if(queue.peek().left!=null) {
				queue.add(queue.peek().left);
			}
			if(queue.peek().right!=null) {
				queue.add(queue.peek().right);
			}
			int data = queue.remove().data;
			System.out.print(data+" ");
		}
	}
}
public class BinarySearchTree {
	public static void main(String args[]) {
		BST tree = new BST();
		Scanner sc = new Scanner(System.in);
		tree.insert(50);
		tree.insert(40);
		tree.insert(60);
		tree.insert(30);
		tree.insert(45);
		tree.insert(58);
		tree.insert(70);
//		tree.insert(62);
//		tree.insert(61);
//		tree.insert(90);
		while(true) {
			System.out.println("insert (y/n) : ");
			char c = sc.next().charAt(0);
			if(c!='y') break;
			System.out.print("value : ");
			tree.insert(sc.nextInt());
		}
		//tree.delete(60);
//		tree.display();
//		System.out.println(tree.root.data);
//		System.out.println(tree.isBalancedTree(tree.root));
//		int a[] = {100,200,300};
//		for(int e : a) tree.insert(e);
//		tree.display();
		System.out.print("InOrder    (DFS)   -->  ");
		tree.preOrder(tree.root);
		System.out.print("\nPreOrder   (DFS)   -->  ");
		tree.inOrder(tree.root);
		System.out.print("\nPostOrder  (DFS)   -->  ");
		tree.postOrder(tree.root);
		System.out.println();
		tree.BFS();
		
	}
}
