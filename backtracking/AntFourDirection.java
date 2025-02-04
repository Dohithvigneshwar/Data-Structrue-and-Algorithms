package backtracking;
public class AntFourDirection {
	public static int dir[][] = {{1,0},{0,1},{-1,0},{0,-1}};
	public static void main(String[] args) {
		int a[][] = {
				{1,2,3},
				{6,5,4},
				{7,8,9}
		};
		int dp[][] = new int[3][3];
		System.out.println(findPath(a,0,0,dp));
	}
	public static int findPath(int a[][],int x,int y,int dp[][]) {
		if(dp[x][y]!=0) return dp[x][y];
		int max = 1;
		for(int []d : dir) {
			int newx = x+d[0];
			int newy = y+d[1];
			if(newx>=0 && newx<a.length && newy>=0 && newy<a.length && a[x][y]+1==a[newx][newy]) {
				max = Math.max(dp[x][y],1+findPath(a,newx,newy,dp));
			}
		}
		dp[x][y] = max;
		return max;
	}
}
