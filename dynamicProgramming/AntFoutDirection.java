package dynamic.programming;

public class AntFoutDirection {
	public static int dp[][] = new int[3][3];
	public static int arr[][] = new int[3][3];
	public static void main(String args[]) {
		int a[][] = {
				{1,2,3},
				{6,3,40},
				{7,4,5}
		};
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				dp[i][j] = -1;
			}
		}
		System.out.println(maxCount(0,0,a,3));
	}
	public static boolean maxCount(int x,int y,int a[][],int n) {
		if(x>=n-1 && y>=n-1){
			return true;
		}
		if(x>=0 && x<n-1 && y>=0 && y<n-1 && dp[x][y] == -1) {
			if(a[x][y+1]-a[x][y] == 1) {
				if(maxCount(x,y+1,a,n)) return true;
			}
			if(a[x+1][y]-a[x][y]==1) {
				if(maxCount(x,y+1,a,n)) return true;
			}
		}
		return false;
	
	}
}
