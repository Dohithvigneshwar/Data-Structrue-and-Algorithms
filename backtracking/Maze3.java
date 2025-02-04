package backtracking;

import java.util.ArrayList;

public class Maze3 {
	public static void main(String args[]) {
		System.out.println(PrintPathOfMazeDiagonal("",3,3));
	}
	public static ArrayList<String> PrintPathOfMazeDiagonal(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> ans1 = new ArrayList<>();
			ans1.add(p);
			return ans1;
		}
		ArrayList<String> ans = new ArrayList<>();
		if(r>1) {
			ans.addAll(PrintPathOfMazeDiagonal(p+"D",r-1,c)); 
		}
		if(r>1 && c>1) {
			ans.addAll(PrintPathOfMazeDiagonal(p+"->",r-1,c-1)); 
		}
		if(c>1) {
			ans.addAll(PrintPathOfMazeDiagonal(p+"R",r,c-1)); 
		}
		return ans;
	}
}
