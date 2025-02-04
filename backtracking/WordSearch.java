package backtracking;

public class WordSearch {
	public static void main(String args[]) {
		char a[][] = {
				{'A','B','C','I'},
				{'B','I','C','S'},
				{'C','D','E','E'}
		};
		searchWord("","SEE",1,3,a);
	}
	public static int result[][] = new int[3][4];
	public static boolean searchWord(String p,String s,int x,int y,char a[][]) {
		if(p.equals(s)) {
			//result[x][y] = 1;
			System.out.println(p);
			return true;
		}
		if(x>=0 && x<=2 && y>=0 && y<=3 && result[x][y] == 0) {
			result[x][y] = 1;
			if(searchWord(p+a[x][y],s,x+1,y,a)) return true;
			if(searchWord(p+a[x][y],s,x,y+1,a)) return true;
			if(searchWord(p+a[x][y],s,x-1,y,a)) return true;
			if(searchWord(p+a[x][y],s,x,y-1,a)) return true;
			result[x][y] = 0;
			return false;
			
		}
		return false;
	}
}
