package recursion.string;
import java.util.ArrayList;
import java.util.List;
public class Subsets {
	public static void main(String args[]) {
		//SubSets("","abc");
	//	SubSetIteration(new int[] {1,2,3});
		
		List<List<Integer>> list1 = new ArrayList<>();
		
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list1.add(list);
		
		List<Integer> copy = list1.get(0);
		System.out.println(copy);

	}
	public static void SubSetIteration(int a[]) {
		List<List<Integer>> list = new ArrayList<>();
		list.add(new ArrayList<>());
		for(int i=0;i<a.length;i++) {
			int num = a[i];
			int size = list.size();
			for(int j=0;j<size;j++) {
				List<Integer> inner = new ArrayList<>(list.get(j));
				inner.add(num);
				list.add(inner);
			}
		}
		System.out.println(list);
	}
	public static void SubSets(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		SubSets(p+up.charAt(0),up.substring(1));
		SubSets(p,up.substring(1));
	}
}
