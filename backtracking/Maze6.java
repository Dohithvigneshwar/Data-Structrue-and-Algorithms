package backtracking;

public class Maze6 {
	public static void main(String args[]) {
		boolean a[][] = {
				{true,true,true},
				{true,true,true},
				{true,true,true}
		};
		
		allDirection("",0,0,a);
	}
	public static void allDirection(String p,int r,int c,boolean a[][]) {
		if(r==a.length-1 && c==a[0].length-1) {
			System.out.println(p);
			return;
		}
		if(a[r][c] == false) {
			return;
		}
		a[r][c] = false;
		if(r<a.length-1) {
			allDirection(p+"D",r+1,c,a);
		}
		if(c<a[0].length-1) {
			allDirection(p+"R",r,c+1,a);
		}
		if(r>0) {
			allDirection(p+"U",r-1,c,a);
		}
		if(c>0) {
			allDirection(p+"L",r,c-1,a);
		}
		a[r][c] = true;
	}
}
