package backtracking;


import java.util.ArrayList;

public class Maze2 {

	public static void main(String[] args) {
		System.out.println(PrintPathOfMaze("",3,3));
	}
	public static ArrayList<String> PrintPathOfMaze(String p,int r,int c) {
		if(r==1 && c==1) {
			ArrayList<String> ans1 = new ArrayList<>();
			ans1.add(p);
			return ans1;
		}
		ArrayList<String> ans = new ArrayList<>();
		if(r>1) {
			ans.addAll(PrintPathOfMaze(p+"D",r-1,c)); 
		}
		if(c>1) {
			ans.addAll(PrintPathOfMaze(p+"R",r,c-1)); 
		}
		return ans;
	}

}
