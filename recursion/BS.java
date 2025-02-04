package recursion;

public class BS {

	public static void main(String[] args) {
		int a[] = {0,1,2,3,4,5,6};
		int target = -1;
		System.out.println(BinarySearch(a,0,a.length-1,target));
	}
	public static int BinarySearch(int a[],int s,int e,int target) {
		if(e<s) return -1;
		int m = (s+e)/2;
		if(target == a[m]) return m;
		if(target<a[m]) {
			return BinarySearch(a,s,m-1,target);
		}
		return BinarySearch(a,m+1,e,target);
	}
}
