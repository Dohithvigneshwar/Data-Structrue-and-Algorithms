package sorting;

import java.util.Arrays;

public class Bubble {
	public static void main(String args[]) {
		int a[] = {5,4,3,2,1};
		bubbleSort(a);
//		System.out.println(Arrays.toString(a));
	}
	public static void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			boolean flag = false;
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					swap(a,j,j+1);
					flag = true;
				}
			}
			System.out.println(Arrays.toString(a));
			if(!flag) break;
			
		}
	}
	public static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	public static void bubbleSort(int a[]) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
				System.out.println(Arrays.toString(a));
			}
		}
	}
}
