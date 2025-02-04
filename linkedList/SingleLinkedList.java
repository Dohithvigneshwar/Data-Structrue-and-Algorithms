package linkedList;

public class SingleLinkedList<T>{
	Node head;
	class Node{
		T data;
		Node next;
		public Node(T data) {
			this.data = data;
			next = null;
		}
	}
	public SingleLinkedList(){
		head = null;
	}
	public void addValueAtEnd(T element) {
		Node node = new Node(element);
		if(head == null) {
			head = node;
		}
		else {
			Node temp = head;
			while(temp.next!=null) {
				temp = temp.next;
			} 
			temp.next = node;
		}
	}
	public void traversal() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
	}
	public void addElementAtFirst(T element) {
		Node node = new Node(element);
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	public int sizeOfLinkedList() {
		Node temp = head;
		int size = 1;
		while(temp.next!=null) {
			temp = temp.next;
			size++;
		}
		return size;
	}
	public void insertElementAtPosition(int pos,T element,SingleLinkedList<T> copy) {
		if(pos>=copy.sizeOfLinkedList()) {
			System.out.println("Invalid Position");
			return;
		}
		Node node = new Node(element);
		int count = 1;
		Node temp = head;
		while(count!=pos) {
			temp = temp.next;
			count++;
		}
		Node nextptr = temp.next;
		temp.next = node;
		node.next = nextptr;
	}
	public void reverseLinkedList() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		while(current.next!=null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
}