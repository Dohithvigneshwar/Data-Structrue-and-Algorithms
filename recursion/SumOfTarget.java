package recursion;
import java.util.*;
public class SumOfTarget {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		int target = 10;
	}
	public static int sum(ArrayList<Integer> l) {
		int r = 0;
		for(int e:l) {
			r+=e;
		}
		return r;
	}
}
