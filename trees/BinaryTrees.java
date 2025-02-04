package trees;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import  java.util.Scanner;
//import trees.interview.question.BFS.Node;

class BT{
	Node root;
	private class Node{
		Node left,right;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	public void insert(Scanner sc) {
		System.out.println("Enter the root node of the Tree : ");
		Node node = new Node(sc.nextInt());
		root = node;
		insert(sc,root);
	}
	private void insert(Scanner sc,Node current) {
		System.out.println("Do you want insert the value at left of "+current.data);
		char check = sc.next().charAt(0);
		if(check=='y') {
			current.left = new Node(sc.nextInt());
			insert(sc,current.left);
		}
		System.out.println("Do you want insert the value at right of "+current.data);
		check = sc.next().charAt(0);
		if(check=='y') {
			current.right = new Node(sc.nextInt());
			insert(sc,current.right);
		}
	}
	public void display() {
		display(root);
	}
	public void display(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		display(root.left);
		display(root.right);
	}
	public boolean isCousins(Node root, int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        if(root == null){
            return false;
        }
        queue.add(root);
        List<Integer> list = new ArrayList<>();
        while(!queue.isEmpty()){
            list.clear();
            int size = queue.size();
            for(int i=0;i<size;i++){
                Node node = queue.remove();
                if(node.left!=null) queue.add(node.left);
                if(node.right!=null) queue.add(node.right);
                list.add(node.data);
            }
            if(list.contains(x) && list.contains(y)){
                break;
            }
        }
        if(!list.contains(x)) {
        	return false;
        }
        if(!list.contains(y)) {
        	return false;
        }
        return (
            findParent(root,x) != findParent(root,y)
        );
    }
	private Node findParent(Node node,int value) {
		if(node.left == null) {
			if(node.right != null) {
				if(node.right.data == value) {
					return node;
				}
				else {
					return null;
				}
			}
			else {
				return null;
			}
		}
		if(node.right == null) {
			if(node.left != null) {
				if(node.left.data == value) {
					return node;
				}
				else {
					return null;
				}
			}
			else {
				return null;
			}
		}
		if(node.left==null && node.right==null) return null;
		if(node.left.data == value || node.right.data == value) {
			return node;
		}
		Node temp = findParent(node.left,value);
		if(temp!=null) {
			return temp;
		}
		return findParent(node.right,value);
	}
}

public class BinaryTrees {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BT obj = new BT();
		obj.insert(sc);
		obj.display();
		System.out.println(obj.isCousins(obj.root, 13, 14));
	}
}
