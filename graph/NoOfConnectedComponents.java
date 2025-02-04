package graph;
import java.util.List;
import java.util.ArrayList;
public class NoOfConnectedComponents {
	public static void main(String args[]) {
		int n = 5;
		int m = 3;
		int Edge[][] = {
				{1,2},
				{3,2},
				{4,5}
		};
		List<List<Integer>> graph = new ArrayList<>(n+1);
		for(int i=0;i<=n;i++) graph.add(new ArrayList<>());
		for(int i=0;i<m;i++) {
			graph.get(Edge[i][0]).add(Edge[i][1]);
		}
		System.out.println(graph);
		boolean varray[] = new boolean[n+1];
		int count = 0;
		for(int i=1;i<=n;i++) {
			if(!varray[i]) {
				dfs(graph,varray,i);
				count+=1;
			}
		}
		System.out.println(count);
	}
	public static void dfs(List<List<Integer>> graph,boolean varray[],int start) {
		varray[start] = true;
		for(int i=0;i<graph.get(start).size();i++) {
			int newstart = graph.get(start).get(i);
			if(!varray[newstart]) {
				dfs(graph,varray,newstart);
			}
		}
	}
}
