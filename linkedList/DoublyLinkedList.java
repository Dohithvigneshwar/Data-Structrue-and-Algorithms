package linkedList;

public class DoublyLinkedList {
	public static void main(String args[]) {
		DLL obj = new DLL();
		obj.addFirst(30);
		obj.addFirst(20);
		obj.addFirst(10);
//		obj.addLast(40);
//		obj.addLast(50);
//		obj.displayRev();
		obj.insert(1,100);
//		obj.display();
	//	obj.insert(3, 200);
		obj.display();
//		obj.deleteFirst();
//		obj.deleteLast();
		obj.deleteAtPosition(2);
		obj.display();
	}
}
class DLL{
	private Node head, tail;
	private int size = 0;
	private class Node{
		private Node next,pre;
		int data;
		public Node(int data) {
			this.data = data;
		}
	}
	public void addFirst(int data) {
		Node node = new Node(data);
		if(head == null && tail == null) {
			head = node;
			tail = node;
			size+=1;
			return;
		}
		node.next = head;
		head.pre = node;
		head = node;
		size+=1;
	}
	public void addLast(int data) {
		if(size == 0) {
			addFirst(data);
			return;
		}
		Node node = new Node(data);
		tail.next = node;
		node.pre = tail;
		tail = node;
		size+=1;
	}
	public void display() {
		Node temp = head;
		System.out.print("null (pre)");
		while(temp!=null) {
			System.out.print(" <-- "+temp.data+" --> ");
			temp = temp.next;
		}
		System.out.println("(next) null");
	}
	public void displayRev() {
		Node temp = tail;
		System.out.print("null (pre)");
		while(temp!=null) {
			System.out.print(" <-- "+temp.data+" --> ");
			temp = temp.pre;
		}
		System.out.println("(next) null");
	}
	public void insert(int pos,int data) {
		if(pos == 0) {
			addFirst(data);
			return;
		}
		if(pos == size) {
			addLast(data);
			return;
		}
		Node node = new Node(data);
		Node get = getNode(pos-1);
		Node temp = get.next;
		temp.pre = node;
		get.next = node;
		node.next = temp;
		node.pre = get;
		size+=1;
		
	}
	public void deleteFirst() {
		head = head.next;
		if(head == null) {
			tail = null;
		}
		else{
			head.pre = null;
		}
		size-=1;
	}
	public void deleteLast() {
		tail = tail.pre;
		if(tail == null) {
			head = null;
		}
		else {
			tail.next = null;
		}
		size-=1;
	}
	public void deleteAtPosition(int pos) {
		if(pos == 0) {
			deleteFirst();
			return;
		}
		if(pos == size-1) {
			deleteLast();
			return;
		}
		Node get = getNode(pos-1);
		Node temp = get.next;
		get.next = temp.next;
		temp.next.pre = get;
		size-=1;
	}
	private Node getNode(int pos) {
		Node temp = head;
		for(int i=0;i<pos;i++) {
			temp = temp.next;
		}
		return temp;
	}
}