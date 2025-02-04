package backtracking;

public class Pratics {
	public static void main(String args[]) {
		int a[][] = {
				{0,0,1,0},
				{1,0,1,0},
				{1,0,0,0}
		};
		int result[][] = new int[4][4];
		FindPath("",0,0,a,result);
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void FindPath(String p,int r,int c,int a[][],int result[][]) {
		if(r==a.length-1 && c==a[0].length-1) {
			result[r][c] = 1;
			System.out.println(p);
			return;
		}
		if(a[r][c] == 1) {
			return;
		}
		if(r<a.length-1) {
			result[r][c] = 1;
			FindPath(p+"D",r+1,c,a,result);
		}
		if(c<a[0].length-1) {
			result[r][c] = 1;
			FindPath(p+"R",r,c+1,a,result);
		}
	}
}
