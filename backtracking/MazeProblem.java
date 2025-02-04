package backtracking;

import java.util.Arrays;

public class MazeProblem {
	public static int flag = 0;
	public static void main(String args[]) {
		int a[][] = {
				{0,0,0,0,1},
				{0,1,0,0,1},
				{0,0,1,0,1},
				{1,1,0,0,1},
				{1,1,0,0,0}
		};
		int n = a.length;
		int result[][] = new int[a.length][a[0].length];
		back(0,0,n,a,result,1);
		if(flag == 0){
			System.out.println("No solution exists");
		}
	}
	public static boolean back(int x,int y,int n,int a[][],int result[][],int count) {
		if(x==n-1 && y==n-1 && a[x][y] == 0) {
			result[x][y] = 1;
			for(int e[] : result) {
				System.out.println(Arrays.toString(e));
			}
			System.out.println(count+"\n");
			flag = 1;
			return false;
		}
		if((x<=n-1 && x>=0)&&(y>=0 && y<=n-1)&&a[x][y] == 0) {
			result[x][y] = 1;
			a[x][y] = 1;
			if(back(x+1,y,n,a,result,count+=1)) return true;
			count-=1;
			if(back(x,y+1,n,a,result,count+=1)) return true;
			count-=1;
			if(back(x-1,y,n,a,result,count+=1)) return true;
			count-=1;
			if(back(x,y-1,n,a,result,count+=1)) return true;
			count-=1;
			result[x][y] = 0;
			a[x][y] = 0;
			return false;
		}
		return false;
	}
}
