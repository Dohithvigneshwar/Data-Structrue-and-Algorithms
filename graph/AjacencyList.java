package graph;
import java.util.ArrayList;
@SuppressWarnings("unchecked")
public class AjacencyList {
	private class Edge{
		private int src,dest,weight;
		public Edge(int src, int dest) {
			this.src = src;
			this.dest = dest;
		}
		public Edge(int src, int dest,int weight) {
			this.src = src;
			this.dest = dest;
			this.weight = weight;
		}
	}
	public ArrayList<Edge>[] createGraph(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			graph[i] = new ArrayList<Edge>();
		}
		graph[0].add(new Edge(0,2));
		
		graph[1].add(new Edge(1,3));
		graph[1].add(new Edge(1,2));
		
		graph[2].add(new Edge(2,0));
		graph[2].add(new Edge(2,3));
		graph[2].add(new Edge(2,1));
		
		graph[3].add(new Edge(3,1));
		graph[3].add(new Edge(3,0));
		
		return graph;
	}
	public void display(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			System.out.println("Vertics ---> "+i);
			for(int j=0;j<graph[i].size();j++) {
				Edge e = graph[i].get(j);
				System.out.println("src : "+e.src+" dest : "+e.dest);
			}
		}
	}
	public void displayNeighbours(ArrayList<Edge> graph[]) {
		for(int i=0;i<graph.length;i++) {
			System.out.println("Vertics ---> "+i);
			for(int j=0;j<graph[i].size();j++) {
				Edge e = graph[i].get(j);
				System.out.println(" dest : "+e.dest);
			}
		}
	}
	public static void main(String args[]) {
		AjacencyList obj = new AjacencyList();
		int n = 4;
		ArrayList<Edge> graph[] = new ArrayList[n];
		graph = obj.createGraph(graph);
//		obj.display(graph);
		obj.displayNeighbours(graph);
	}
}
