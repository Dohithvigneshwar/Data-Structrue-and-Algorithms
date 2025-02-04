package backtracking;

import java.util.ArrayList;

public class Maze4 {
	public static void main(String args[]) {
		boolean a[][] = {
				{true,true,true},
				{true,false,true},
				{true,true,true}
		};
		PrintPathWithRiver("",0,0,a);
	}
	public static void PrintPathWithRiver(String p,int r,int c,boolean a[][]) {
		if(r==a.length-1 && c==a[0].length-1) {
			System.out.println(p);
			return;
		}
		if(!a[r][c]) {
			return;
		}
		if(r<a.length-1) {
			PrintPathWithRiver(p+"D",r+1,c,a); 
		}
		if(c<a.length-1) {
			PrintPathWithRiver(p+"R",r,c+1,a); 
		}
	}
}
