package trees;

public class SegmentTree {
	public static void main(String args[]) {
		SegmentTree tree = new SegmentTree();
		int a[] = new int[] {3,8,7,6,-2,-8,4,9};
		tree.formSegmentTree(0,a.length-1,a);
		tree.preOrder(tree.root);
		System.out.println("\n"+tree.query(0,7));
		int index = 3;
		int data = 10;
		tree.update(index, data);
		tree.preOrder(tree.root);
	}
	Node root;
	private class Node{
		int startingInterval,endingInterval, data;
		Node left,right;
		public Node(int startingInterval, int endingInterval, int data) {
			this.data = data;
			this.startingInterval = startingInterval;
			this.endingInterval = endingInterval;
		}
	}
	public void formSegmentTree(int start, int end, int a[]) {
		root = formSegmentTree(start,end,a,root);
	}
	public Node formSegmentTree(int start, int end, int a[], Node node) {
		if(start == end) {
			return new Node(start,end,a[start]);
		}
		node = new Node(start,end,0);
		int mid = (start+end)/2;
		node.left = formSegmentTree(start,mid,a,node.left);
		node.right = formSegmentTree(mid+1,end,a,node.right);
		node.data = node.left.data+node.right.data;
		return node;
	}
	public int query(int si,int ei) {
		return query(root,si,ei);
	}
	private int query(Node node,int si,int ei) {
		if(si<=node.startingInterval && ei>=node.endingInterval) {
			return node.data;
		}
		else if(node.endingInterval<si || node.startingInterval>ei) {
			return 0;
		}
		else {
			int leftans = query(node.left,si,ei);
			int rightans = query(node.right,si,ei);
			return leftans+rightans;
		}
	}
	public void update(int index, int data) {
		root.data = update(root,index,data);
	}
	private int update(Node node, int index,int data) {
		if(node.startingInterval == index && node.endingInterval == index) {
			node.data = data;
			return data;
		}
		else if(node.startingInterval<=index &&  node.endingInterval>=index) {
			int leftans = update(node.left,index,data);
			int rightans = update(node.right,index,data);
			node.data = leftans+rightans;
			return node.data;
		}
		else {
			return node.data;
		}
	}
	public void preOrder(Node node) {
		if(node==null) return;
		System.out.print(node.data+" ");
		preOrder(node.left);
		preOrder(node.right);
	}
}
