package queue;

import java.util.LinkedList;
import java.util.Queue;
public class Queues {
	public static void main(String args[]) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		System.out.println(queue.peek());
//		System.out.print(queue.remove());
		System.out.println(queue);
		
	}
}
