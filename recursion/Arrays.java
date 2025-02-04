package recursion;

import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
//		int a[] = {29,1,29,10};
//		System.out.println(FindTheArrayIsSortedOrNot1(a,0));
//		System.out.println(FindTheArrayIsSortedOrNot2(a,0));
//		System.out.println(IndexSearch(a,0,29));
//		System.out.println(AllIndexSearch(a,0,10,new ArrayList<>()));
//		System.out.println(AllIndex(a,0,29));
		
//		int a[] = {1,2,3,4,5,6,7,6,8,9,10};
//		System.out.println(BinarySearch(a,0,a.length-1,6));
		
	}
	public static boolean FindTheArrayIsSortedOrNot1(int a[],int index) {
		if(index == a.length-2) {
			if(a[index+1]>a[index]) return true;
			return false;
		}
		if(a[index]>a[index+1]) {
			return false;
		}
		return FindTheArrayIsSortedOrNot1(a,index+1);
	}
	public static boolean FindTheArrayIsSortedOrNot2(int a[],int index) {
		if(index == a.length-1) {
			return true;
		}
		return a[index]<=a[index+1] && FindTheArrayIsSortedOrNot2(a,index+1);
	}
	public static int IndexSearch(int a[],int index,int target) {
		if(index == a.length) return -1;
//		if(a[index] == target) return index;
//		return IndexSearch(a,index+1,target);
		
		return a[index] == target ? index : IndexSearch(a,index+1,target);
	}
	public static ArrayList<Integer> AllIndexSearch(int a[],int index,int target,ArrayList<Integer> list){
		if(index == a.length) return list;
		if(a[index] == target) {
			list.add(index);
		}
		return AllIndexSearch(a,index+1,target,list);
	}
	public static ArrayList<Integer> AllIndex(int a[],int index,int target){
		//[29,10,10,29,0];
		ArrayList<Integer> list = new ArrayList<>();
		if(index == a.length) return list;
		if(a[index] == target) {
			list.add(index);
		}
		ArrayList<Integer> l1 = AllIndex(a,index+1,target);
		list.addAll(l1);
		return list;
	}
	public static int BinarySearch(int a[],int s,int e, int target) {
		if(s>e) {
			return -1;
		}
		int mid = (s+e)/2;
		if(a[mid] == target) return mid;
		if(a[mid]<target) {
			return BinarySearch(a,mid+1,e,target);
		}
		return BinarySearch(a,s,mid-1,target);
	}
}
