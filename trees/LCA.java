package trees;

/*
      6
     / \
    4   7
   / \
  2   3    least common ancestor of {2 , 3} -- > 4  

*/
class Tree{
	Node root;
	class Node{
		Node left,right;
		int data;
		public Node(int data) {
			this.data = data;
		}
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
			return new Node(data);
		}
		if(node.data>data) {
			node.left = insert(data,node.left);
		}
		if(node.data<data) {
			node.right = insert(data,node.right);
		}
		return node;
	}
	public void display(Node node) {
		if(node == null) return;
		System.out.print(node.data+" ");
		display(node.left);
		display(node.right);
	} 
	public void leastCommonAncestor(int a,int b,Node node) {
		if(node == null) {
			return;
		}
		if(a<node.data && b<node.data) {
			leastCommonAncestor(a,b,node.left);
		}
		else if(a>node.data && b>node.data) {
			leastCommonAncestor(a,b,node.right);
		}
		else if(a<node.data && b>node.data || a>node.data && b<node.data) {
			System.out.println(node.data);
			int lcount = findNode(node,a,0);
			int rcount = findNode(node,b,0);
			System.out.println(lcount+rcount);
		}
		else {
			return;
		}
	}
	public int findNode(Node node,int data,int count) {
		if(node == null) return -1;
		if(node.data == data) {
			return count;
		}
		if(node.data<data) {
			findNode(node.right,data,count+=1);
		}
		else if(node.data>data) {
			findNode(node.left,data,count+=1);
		}
		return count;
	}
}
public class LCA {
	public static void main(String args[]) {
		Tree bst = new Tree();
		bst.root = bst.insert(100,bst.root);
		int a[] = {90,110,80,92,105,120,60,88,101,106,130};
		for(int e:a) bst.insert(e);
		bst.display(bst.root);
		System.out.println("\nhello");
		bst.leastCommonAncestor(90, 120, bst.root);
	}
}
