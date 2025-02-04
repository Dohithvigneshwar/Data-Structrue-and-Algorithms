package sorting;

import java.util.Arrays;

public class Insertion {
	public static void main(String args[]) {
		int a[] = {56,311,44,15,2};
		int n = a.length;
		sort(a,n);
	}
	public static void sort(int a[],int n) {
		for(int i=1;i<n;i++) {
			int e = a[i];
			int pos = i;
			for(int j=i-1;j>=0;j--) {
				if(e<a[j]) {
					pos = j;
					a[j+1] = a[j];
				}
				else {
					break;
				}
			}
			a[pos] = e;
			System.out.println(Arrays.toString(a));
		}
	}
}
