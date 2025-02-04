package sorting;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		int a[] = {5,3,2,1,1,0,-100};
		divideInplace(a,0,a.length);
		System.out.println(Arrays.toString(a));
	}
	public static int[] divide(int a[]) {
		if(a.length == 1) {
			return a;
		}
		int mid = a.length/2;
		int l[] = divide(Arrays.copyOfRange(a, 0, mid));
		int r[] = divide(Arrays.copyOfRange(a, mid, a.length));
		return merge(l,r);
	}
	public static int[] merge(int l[],int r[]) {
		int temp[] = new int[l.length+r.length];
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) {
				temp[k] = l[i];
				k++;
				i++;
			}
			else {
				temp[k] = r[j];
				k++;
				j++;
			}
		}
		while(i<l.length) {
			temp[k] = l[i];
			k++;
			i++;
		}
		while(j<r.length) {
			temp[k] = r[j];
			k++;
			j++;
		}
		return temp;
	}
	public static void divideInplace(int a[],int s,int e) {
		if(e-s == 1) {
			return;
		}
		int mid = (s+e)/2;
		divideInplace(a, s, mid);
		divideInplace(a, mid, e);
		mergeInplace(a,s,mid,e);
	}
	public static void mergeInplace(int a[],int s,int mid,int e) {
		int array[] = new int[e-s];
		int i = s, j = mid,k=0;
		while(i<mid && j<e) {
			if(a[i]<=a[j]) {
				array[k++] = a[i++];
			}
			else {
				array[k++] = a[j++];
			}
		}
		while(i<mid) {
			array[k++] = a[i++];
		}
		while(j<e) {
			array[k++] = a[j++];
		}
		for(i=0;i<array.length;i++) {
			a[s+i] = array[i];
		}
	}
}
