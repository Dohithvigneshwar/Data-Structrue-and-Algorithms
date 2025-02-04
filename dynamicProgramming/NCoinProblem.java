package dynamic.programming;

public class NCoinProblem {
	public static void main(String args[]) {
		int a[] = {8,15,3,7};
		int n = a.length;
		int dp[][] = new int[n][n];
		for(int gap = 0;gap<n;gap++) {
			for(int i=0;i+gap<n;i++) {
				int j = i+gap;
				int x = (i+2<=j) ? dp[i+2][j] : 0;
				int y = (i+1<=j-1) ? dp[i+1][j-1]:0;
				int z = (i<=j-2) ? dp[i][j-2] : 0;
//				dp[i][j] = Math.max(Math.min(a[i]+i,Math.min(x, y)),a[j]+j,Math.min(y, z));
				dp[i][j] = Math.max(a[i]+Math.min(x, y),a[j]+Math.min(y, z));
			}
		}
		System.out.println(dp[0][dp.length-1]);
	}
}
