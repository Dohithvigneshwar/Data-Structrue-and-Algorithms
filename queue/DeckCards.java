package queue;

import java.util.LinkedList;
import java.util.Queue;

public class DeckCards {
	public static void main(String args[]) {
//		int a[] = {17,13,11,2,3,5,7};
//		int res[] = new int[a.length];
//		Arrays.sort(a);
//		for(int i=0;i<a.length;i++) {
//			
//		}
		System.out.println(sittingCircle(6,5));
	}
	public static int sittingCircle(int n,int k) {
		Queue<Integer> queue = new LinkedList<>();
		int count = 0;
		for(int i=1;i<=n;i++) queue.add(i);
		while(queue.size()!=1) {
			System.out.println(queue);
			count+=1;
			if(count == k) {
				queue.remove();
				count = 0;
			}
			else {
				queue.add(queue.remove());
			}
		}
		return queue.remove();
	}
}
