package stacks;

public class Stack {
	public static void main(String args[]) {

//		Stack<Integer> stack = new Stack<>();
//		stack.push(10);
//		stack.push(20);
//		System.out.println(stack.pop());
		
		StackImplements obj = new StackImplements();
		obj.push(10);
		obj.push(20);
//		obj.display();
		obj.pop();
//		obj.display();
		obj.push(30);
		obj.push(40);
//		obj.peek();
		obj.pop();
		obj.pop();
//		obj.pop();
		obj.pop();
		obj.display();
		System.out.println(obj.isEmpty());
		System.out.println(obj.size());
	}
}
class StackImplements{
	private int a[];
	private int size;
	private int position;
	public StackImplements() {
		a = new int[1];
		position = 0;
		size = 0;
	}
	public void push(int data) {
		if(size<=position) {
			a = increaseSizeOfArray(a);
		}
		a[position++] = data;
		size++;
	}
	public void pop() {
		if(size<=0) {
			throw new NullPointerException();
		}
		position--;
		size--;
	}
	public int[] increaseSizeOfArray(int a[]) {
		int temp[] = new int[a.length+a.length];
		for(int i=0;i<size;i++) {
			temp[i] = a[i];
		}
		return temp;
	}
	public void display() {
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" | ");
		}
		System.out.println();
	}
	public void peek() {
		System.out.println(a[size-1]);
	}
	public boolean isEmpty() {
		return (size==0) ? true : false;
	}
	public int size() {
		return size;
	}
}
