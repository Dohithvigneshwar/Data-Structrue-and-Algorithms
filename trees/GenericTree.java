package trees;
import java.util.List;
import java.util.ArrayList;
public class GenericTree {
	Node root;
	private class Node{
		private int data;
		private List<Node> list;
		public Node(int data) {
			list = new ArrayList<>();
			this.data = data;			
		}
	}
	public void insert(int data) {
		if(root == null) {
			Node node = new Node(data);
			root = node;
			return;
		}
	}
	public static void main(String args[]) {
		GenericTree tree = new GenericTree();
		tree.insert(10);
	}
}
