package backtracking;

public class Maze {
	public static void main(String[] args) {
		System.out.println(CountMazePath(2,4));
	}
	public static int CountMazePath(int r,int c) {
		if(r==1 || c==1) {
			return 1;
		}
		int left = CountMazePath(r-1,c);
		int right = CountMazePath(r,c-1);
		return left+right;
	}
}
