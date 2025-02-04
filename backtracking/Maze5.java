package backtracking;

public class Maze5 {
	public static void main(String args[]) {
		FourDirection("",0,0);
	}
	public static void FourDirection(String p, int r, int c) {
		if(r==2 && c==2) {
			System.out.println(p);
			return;
		}
		if(r<2) {
			FourDirection(p+"D",r+1,c);
		}
		if(r>0) {
			FourDirection(p+"U",r-1,c);
		}
		if(c<2) {
			FourDirection(p+"R",r,c+1);
		}
		if(c>0) {
			FourDirection(p+"U",r,c-1);
		}
	}
}
