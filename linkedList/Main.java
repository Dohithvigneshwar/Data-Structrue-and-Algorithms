package linkedList;

public class Main {
	public static void main(String args[]) {
		SingleLinkedList<Integer> list = new SingleLinkedList();
		list.addValueAtEnd(10);
		list.addValueAtEnd(20);
		list.addValueAtEnd(30);
		list.addElementAtFirst(50);
		list.addValueAtEnd(10);
		list.addValueAtEnd(100);
		int size = list.sizeOfLinkedList();
		System.out.println(size);
		list.traversal();
		System.out.println();
		list.insertElementAtPosition(99,81, list);
		list.traversal();
		System.out.println();
//		list.reverseLinkedList();
		list.insertElementAtPosition(1,2, list);
		list.traversal();
	}
}
