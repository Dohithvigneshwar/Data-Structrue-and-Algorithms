package linkedList;
class LinkedList{
	Node head;
	private static int size = 0;
	class Node{
		Node next;
		int data;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	public void insertAtBegin(int data) {
		size++;
		Node node = new Node(data);
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		head = node;
		head.next = temp;
	}
	public void insertAtEnd(int data) {
		Node node = new Node(data);
		size++;
		if(head == null) {
			head = node;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	} 
	public void traversal() {
		Node node = new Node(10);
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	public void deleteAtIndex(int index) {
		if(index>=size) {
			System.out.println("Invalid Index For Deletion");
			return;
		}
		if(index == 0) {
			head = head.next;
			size-=1;
			return;
		}
		Node temp = head;
		for(int i=0;i<=index;i++) {
			if(i==index-1) {
				temp.next = temp.next.next;
				size-=1;
				break;
			}
			temp = temp.next;
		}
	}
	public void insertAtPosition(int index,int data) {
		Node node = new Node(data);
		Node temp = head;
		if(index>=size) {
			System.out.println("Not Posible");
			return;
		}
		for(int i=0;i<=index;i++) {
			if(i == index-1) {
				Node t = temp.next;
				temp.next = node;
				node.next = t;
				size+=1;
				break;
			}
			temp = temp.next;
		}
	}
}
public class SingleListLinked {
	public static void main(String args[]){
		LinkedList obj = new LinkedList();
		obj.insertAtEnd(10);
		obj.insertAtEnd(20);
		obj.insertAtBegin(20);
		obj.insertAtBegin(30);
		obj.insertAtPosition(3, 199);
		obj.traversal();
		obj.deleteAtIndex(0);
		obj.traversal();
	}
}
