package recursion;
import java.util.Arrays;
public class Pattern {
	public static void main(String[] args) {
		int n = 5;
//		PrintPattern1(n,0);
//		PrintPattern2(n,0);
		int a[] = {40,13,20,1 };
//		System.out.println(Arrays.toString(BubbleSort(a,a.length-1,0)));
		SelectionSort(a,a.length,0,0);
		
	}
//	public static void Doubt(int a[]) {
//		a[0] = a[0]+10;
//	}
	public static void SelectionSort(int a[],int r,int c,int maxIndex) {
		if(r == 0) return;
		if(r>c) {	
			System.out.println(r+" "+c+" "+maxIndex);
			if(a[c]>a[maxIndex]) {
				SelectionSort(a,r,c+1,c);
			}
			else{
				SelectionSort(a,r,c+1,maxIndex);
			}
		}
		else {
			System.out.println(r+" "+c+" max "+maxIndex);
			SelectionSort(a,r-1,0,maxIndex);
		}
	}
	private static final int[] BubbleSort(int a[],int r,int c) {
		if(r == 0) return a;
		if(r>c) {
			if(a[c]>a[c+1]) {
				int temp = a[c+1];
				a[c+1] = a[c];
				a[c] = temp;
			}
			BubbleSort(a,r,c+1);
		}
		else {
			BubbleSort(a,r-1,0);
		}
		return a;
	}
	private static final void PrintPattern1(int r,int c) {
		if(r == 0) {
			return;
		}
		if(r>c) {
			System.out.print("* ");
			PrintPattern1(r,c+1);
		}
		else {
			System.out.println();
			PrintPattern1(r-1,0);
		}
	}
	public static void PrintPattern2(int r,int c) {
		if(r==0) return;
		if(r>c) { 
			PrintPattern2(r,c+1);
			System.out.print("* ");
		}
		else {
			PrintPattern2(r-1,0);
			System.out.println();
		}
	}
}
