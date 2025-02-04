package graph;
import java.util.List;
import java.util.ArrayList;
public class WeightedGraph {
	private class Edge{
		private int src,dest;
		private int weight;
		public Edge(int src,int dest,int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	@SuppressWarnings("unchecked")
	public static void main(String args[]) {
		WeightedGraph obj = new WeightedGraph();
		obj.create();
	}
	public void create() {
		int n = 5;
		int m = 6;
		ArrayList<Edge> graph[] = new ArrayList[n];
		for(int i=0;i<graph.length;i++) graph[i] = new ArrayList<>();
		int Edges[][] = {
				{0,1,10},
				{1,2,20},
				{0,3,40},
				{3,2,30},
				{3,4,50},
				{2,4,60},
		};
		for(int i=0;i<m;i++) {
			int src = Edges[i][0];
			int dest = Edges[i][1];
			int weight = Edges[i][2];
			graph[src].add(new Edge(src,dest,weight));
		}
		for(int i=0;i<graph.length;i++) {
			System.out.println("vertexs : "+i);
			for(Edge e:graph[i]) {
				System.out.println("src : "+e.src+" dest : "+e.dest+" weight : "+e.weight);
			}
		}
	}
}
