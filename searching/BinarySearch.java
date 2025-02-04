package searching;

public class BinarySearch {
	public static void main(String[] args) {
		int a[] = {100,90,60,20};
		int pos = Binarysearch(a,0,a.length-1,20);
		System.out.println(pos);
	}
	public static int Binarysearch(int a[],int s,int e,int target) {
		while(s<=e) {
			int m = (s+e)/2;
			if(a[m] == target) return m;
			if(a[m]>target) {
				s = m+1;
			}
			else {
				e = m-1;
			}
		}
		return -1;
	}

}
