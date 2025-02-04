package linkedList;

class SLL{
	private Node head;
	private Node tail;
	private int size;
	public SLL() {
		head = null;
		tail = null;
		size = 0;
	}
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	private Node createNode(int data) {
		return new Node(data);
	}
	public void addFirst(int data) {
		Node node = createNode(data);
		node.next = head;
		head = node;
		if(tail == null) {
			tail = head;
		}
		size+=1;
	}
	public void addLast(int data) {
		Node node = createNode(data);
		if(tail == null) {
			addFirst(data);
			return;
		}
		tail.next = node;
		tail = node;
		size+=1;
	}
	public void insertPosition(int pos,int data) {
		if(pos==0) {
			addFirst(data);
			return;
		}
		if(pos == size-1) {
			addLast(data);
			return;
		}
		if(pos>=size) {
			System.out.println("invalid index");
			return;
		}
		Node node = createNode(data);
		Node temp = head;
		for(int i=1;i<pos;i++) {
			temp = temp.next;
		}
		Node tempnext = temp.next;
		temp.next = node;
		node.next = tempnext;
	}
	public void deleteFirst() {
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size-=1;
	}
	public void deleteLast(){
		if(size<=1) {
			deleteFirst();
		}
		Node temp = getIndex(size);
		temp.next = null;
		tail = temp;
		size-=1;
	}
	private Node getIndex(int index) {
		Node temp = head;
		for(int i=0;i<index-1;i++) {
			temp = temp.next;
		}
		return temp;
	}
	public void deleteIndex(int index) {
		if(index == 0) {
			deleteFirst();
			return;
		}
		if(index == size-1) {
			deleteLast();
			return;
		}
		Node temp = getIndex(index);
		Node nextnode = temp.next.next;
		temp.next = nextnode;
	}
	public void display() {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+" -> ");
			temp = temp.next;
		}
		System.out.println("End");
	}
	public void findMiddleOfLinkedList() {
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null) {
			if(fast.next == null) {
				break;
			}
			fast = fast.next.next;
			slow = slow.next;
		}
		System.out.println(slow.data);
	}
	public boolean isCycle() {
		Node fast = head;
		Node slow = head;
		//tail.next = head.next;
		boolean check = false;
		while(fast!=null) {
			if(fast.next == null) {
				return false;
			}
			if(fast == slow && check) {
				return true;
			}
			fast = fast.next.next;
			slow = slow.next;
			check = true;
		}
		return false;
	}
	public int findTheStartingCycle() {
		Node slow = head;
		Node fast = head;
	//	tail.next = head.next.next.next;
		boolean check = true;
		boolean flag = false;
		while(fast!=null) {
			if(fast.next==null) {
				return -1;
			}
			if(slow == fast && flag) {
				if(!check) {
					return slow.data;
				}
				check = false;
				slow = head;
			}
			if(check) {
				slow = slow.next;
				fast = fast.next.next;
			}
			else {
				slow = slow.next;
				fast = fast.next;
			}
			flag = true;
		}
		return -1;
	}
	public void reverse() {
		Node pre = null;
		Node cur = head;
		Node temp = head;
		while(cur!=null) {
			temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		head = pre;
	}
}
public class LinkedListKunal {
	public static void main(String args[]) {
		SLL obj = new SLL();
		obj.addFirst(100);
		obj.addLast(30);
		obj.addFirst(14);
		obj.insertPosition(0,100);
		obj.insertPosition(3,333);
		obj.insertPosition(1, 22);
//		obj.addLast(10);
//		obj.display();
//		obj.deleteFirst();
//		obj.display();
//		obj.deleteLast();
//		obj.display();
	//	obj.deleteIndex(1);
		obj.display();
//		obj.findMiddleOfLinkedList();
		System.out.println(obj.isCycle());
		System.out.println(obj.findTheStartingCycle());
		obj.reverse();
		obj.display();
	}
}