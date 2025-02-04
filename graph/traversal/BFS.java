package graph.traversal;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
	public static void main(String args[]) {
		int n = 5;
		int m = 7;
		int Edge[][] = {
				{0,1},
				{0,2},
				{1,2},
				{2,0},
				{2,3},
				{3,3},
				{2,4},
		};
		List<List<Integer>> graph = new ArrayList<>(n);
		for(int i=0;i<n;i++) {
			graph.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++) {
			int v = Edge[i][0];
			int u = Edge[i][1];
			graph.get(v).add(u);
		}
		System.out.println(graph); // directed graph
		bfsTraversal(graph,2);
	}
	public static void bfsTraversal(List<List<Integer>> list,int start) {
		boolean varray[] = new boolean[list.size()];
		Queue<Integer> queue = new LinkedList<>();	
		queue.add(start);
		varray[start] = true;
		while(queue.isEmpty()==false) {
			int rem = queue.remove();
			for(int i=0;i<list.get(rem).size();i++) {
				int connectedNode = list.get(rem).get(i);
				if(!varray[connectedNode]) {
					queue.add(connectedNode);
					varray[connectedNode] = true;
				}
			}
			System.out.print(rem+" ");
		}
	}
}
