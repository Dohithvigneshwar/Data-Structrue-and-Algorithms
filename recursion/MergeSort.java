package recursion;
import java.util.Arrays;
public class MergeSort {
	public static void main(String[] args) {
		int a[] = {5,4,3,2,1};
//		a = Merge(a);
//		System.out.println(Arrays.toString(a));
	}
	public static int[] Merge(int a[]) {
		if(a.length == 1) return a;
		int mid = a.length/2;
		int left[] = Merge(Arrays.copyOfRange(a,0,mid));
		int right[] = Merge(Arrays.copyOfRange(a, mid, a.length));
		
		return sort(left,right);
	}
	public static int[] sort(int l[],int r[]) {
		int mix[] = new int[l.length+r.length];
		int i=0,j=0,k=0;
		while(i<l.length && j<r.length) {
			if(l[i]<r[j]) {
				mix[k] = l[i];
				k++;
				i++;
			}
			else {
				mix[k] = r[j];
				k++;
				j++;
			}
		}
		while(i<l.length) {
			mix[k] = l[i];
			k++;
			i++;
		}
		while(j<r.length) {
			mix[k] = r[j];
			k++;
			j++;
		}
		return mix;
	}
}
