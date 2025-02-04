package sorting;

public class QuickSort {
	public static void main(String args[]) {
		int a[] = {6,3,9,5,2,8};
		int lb = 0;
		int ub = a.length-1;
		quick(a,lb,ub);
	}
	public static void quick(int a[], int lb , int ub) {
		if(lb>=ub) return;
		int s = lb;
		int e = ub;
		int pivot = a[lb];
		while(s<e) {
			while(pivot>=a[s]) {
				s++;
				if(s>e) break; 
			}
			while(pivot<a[e]) {
				e--;
			}
			if(s<e) {
				int temp = a[s];
				a[s] = a[e];
				a[e] = temp;
				s++;
				e--;
			}
		}
		System.out.println(java.util.Arrays.toString(a));
		int temp = a[lb];
		a[lb] = a[e];
		a[e] = temp;
		quick(a,lb,e);
		quick(a,s,ub);
		
	}
}
