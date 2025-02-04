package backtracking;

public class AutoDiskQ2 {
	public static void main(String args[]) {
		System.out.println(countPath(0,0,3,7));
	}
	public static int countPath(int r,int c,int x,int y) {
		if(r==x-1 && c==y-1) {
			return 1;
		}
		int left = 0,right = 0;
		if(r<x-1) {
			left = countPath(r+1,c,x,y);
		}
		if(c<y-1) {
			right = countPath(r,c+1,x,y);
		}
		return left+right;
		
	}
}
