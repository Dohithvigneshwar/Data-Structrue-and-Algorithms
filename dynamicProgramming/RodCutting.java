package dynamic.programming;
import java.util.ArrayList;
public class RodCutting {
	public static int target = 8;
	public static void main(String args[]) {
		int a[] = {1,2,3,4,5,6,7,8};
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<a.length;i++) {
			list.add(a[i]);
			back(a,i,list);
			list.remove(0);
		}
	}
	public static void back(int a[],int index,ArrayList<Integer> list) {
		int value = sum(list);
		if(value == target) {
			System.out.println(list);
			return;
		}
		if(value>target) return;
		list.add(a[index]);
		back(a,index,list);
		list.remove(list.size()-1);
		for(int i=index+1;i<a.length;i++) {
			list.add(a[i]);
			back(a,i,list);
			list.remove(list.size()-1);
		}
	}
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for(int e: list) {
			sum+=e;
		}
		return sum;
	}
}