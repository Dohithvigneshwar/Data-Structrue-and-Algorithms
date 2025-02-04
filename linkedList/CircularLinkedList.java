package linkedList;

public class CircularLinkedList {
	public static void main(String args[]) {
		CLL obj = new CLL();
		obj.addElement(10);
		obj.addElement(20);
		obj.addElement(30);
		obj.addElement(40);
		obj.addElement(50);
		obj.addElement(60);
		obj.delete(30);
		obj.display();
	}
}
class CLL{
	private int size = 0;
	private Node head;
	private Node tail;
	private class Node{
		private Node next;
		private int data;
		public Node(int data) {
			this.data = data;
		}
	}
	public void addElement(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			tail.next = head;
			size+=1;
			return;
		}
		tail.next = node;
		tail = node;
		tail.next = head;
		size+=1;
	}
	public void delete(int data) {
		if(head!=null) {
			if(head.data == data) {
				head = head.next;
				tail.next = head;
				size-=1;
				return;
			}
			Node temp = head;
			do {
				if(data == temp.next.data) {
					temp.next = temp.next.next;
					break;
				}
				temp = temp.next;
			}
			while(temp!=head);
		}
	}
	public void display() {
		Node temp = head;
//		while(true) {
//			System.out.print(temp.data+" -- > ");
//			temp = temp.next;
//			if(temp == head) {
//				break;
//			}
//		}
		if(head != null) {
			do {
				System.out.print(temp.data+" --> ");
				temp = temp.next;
			}
			while(head != temp);
		}
		System.out.print("HEAD");
	}
}
