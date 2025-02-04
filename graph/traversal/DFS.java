package graph.traversal;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class DFS {
	public static void main(String args[]) {
		System.out.println("No of vertics :");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
//		ArrayList<Edge> graph[] = new ArrayList[n];
//		for(int i=0;i<n;i++) {
//			graph[i] = new ArrayList<Edge>();
		
		List<List<Integer>> list = new ArrayList<>(n+1);
		for(int i=0;i<=n;i++) {
			list.add(new ArrayList<>());
		}
		System.out.println("No of edges :");
		int m = in.nextInt();
		
		for(int i=0;i<m;i++) {
			int v = in.nextInt();
			int u = in.nextInt();
			list.get(v).add(u);
			list.get(u).add(v);
		}
		ArrayList<Integer> ans = new ArrayList<>();
		boolean varray[] = new boolean[n+1];
		bfs(list,1,varray,ans);
		System.out.println(ans);
	}
	public static void bfs(List<List<Integer>> list,int node,boolean varray[],ArrayList<Integer> ans) {
		varray[node] = true;
		ans.add(node);
		for(int newnode : list.get(node)) {
			if(!varray[newnode]) {
				bfs(list,newnode,varray,ans);
			}
		}
	}
}
//	private class Edge{
//		private int src, dest;
//		public Edge(int src,int dest) {
//			this.src = src;
//			this.dest = dest;
//		}
//	}
//}
