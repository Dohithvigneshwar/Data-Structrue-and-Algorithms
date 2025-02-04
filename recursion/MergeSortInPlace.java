package recursion;

public class MergeSortInPlace {
	public static void main(String args[]) {
		int a[] = {5,4,3,2,1};
		int s = 0;
		int e = a.length;
		MergeSort(a,s,e);
		System.out.println(java.util.Arrays.toString(a));
	}
	public static void MergeSort(int a[],int s,int e) {
		if(e-s==1) return;
		int mid = (s+e)/2;
		MergeSort(a,s,mid);
		MergeSort(a,mid,e);
		conque(a,s,mid,e);
	}
	public static void conque(int a[],int s,int m,int e) {
		int mix[] = new int[e-s];
		int i=s,j=m,k=0;
		while(i<m && j<e) {
			if(a[i]<a[j]) {
				mix[k++] = a[i++];
			}
			else {
				mix[k++] = a[j++];
			}
		}
		while(i<m) mix[k++] = a[i++];
		while(j<e) mix[k++] = a[j++];
		int newarr[] = java.util.Arrays.copyOfRange(a, s, e);
		System.out.println(java.util.Arrays.toString(newarr));
 		for(k=0;k<mix.length;k++) {
			a[s+k] = mix[k];
		}
	}
}
