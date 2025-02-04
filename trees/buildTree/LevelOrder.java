package buildTree;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Queue;
public class LevelOrder {
	public static void main(String args[]) {
		BT obj = new BT();
		int a[] = new int[] {10,-1,20,30,40,-1,50,-1,-1,60,-1,-1,70};
		obj.insert(a);
		System.out.println();
		obj.preOrder(obj.root);
		ArrayList<Integer> list = new ArrayList<>();
		obj.leftview(list,obj.root,0);
		System.out.println(list);
		list = new ArrayList<>();
		obj.rightview(list,obj.root,0);
		System.out.println(list);
		
	}
}
class BT{
	Node root;
	class Node{
		int data;
		Node left,right;
		public Node(int data) {
			this.data = data;
		}
	}
	public void insert(int a[]) {
		if(a[0]==-1 || a.length ==0) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		root = new Node(a[0]);
		queue.add(root);
		int index = 0;
		while(index<a.length) {
			index++;
			if(index>=a.length) break;
			Node node = queue.remove();
			if(a[index] != -1) {
				Node cur = new Node(a[index]);
				node.left = cur;
				queue.add(cur);
			}
			index++;
			if(index>=a.length) break;
			if(a[index] != -1) {
				Node cur = new Node(a[index]);
				node.right = cur;
				queue.add(cur);
			}
		} 
	}
	public static void leftview(ArrayList<Integer> list, Node node,int h) {
		if(node == null) {
			return;
		}
		if(h == list.size()) {
			list.add(node.data);
		}
		leftview(list,node.left,h+1);
		leftview(list,node.right,h+1);
	}
	public static void rightview(ArrayList<Integer> list, Node node,int h) {
		if(node == null) {
			return;
		}
		if(h == list.size()) {
			list.add(node.data);
		}
		rightview(list,node.right,h+1);
		rightview(list,node.left,h+1);
	}
	public void preOrder(Node node) {
		if(node == null) {
			return;
		}
		System.out.println(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
}
