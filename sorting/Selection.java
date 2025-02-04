package sorting;

import java.util.Arrays;

public class Selection {
	public static void main(String args[]) {
		int a[] = {5,4,3,2,1};
//	??\\	sort(a);
		selectionSort(a);
//		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int maxindex = a.length-1-i; // or maxindex = 0;
			for(int j=0;j<a.length-i;j++) {
				if(a[maxindex]<a[j]) {
					maxindex = j;
				}
			}
			int last = a[a.length-1-i];
			a[a.length-1-i] = a[maxindex];
			a[maxindex] = last;
			System.out.println( Arrays.toString(a));
		}
	}
	public static void selectionSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int currentInsertIndex = a.length-1-i;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[currentInsertIndex]<a[j]) {
					currentInsertIndex = j;
				}
			}
			int temp = a[a.length-1-i];
			a[a.length-1-i] = a[currentInsertIndex];
			a[currentInsertIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
