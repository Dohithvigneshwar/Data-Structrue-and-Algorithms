package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;

public class DirectedGraph {
	public static void main(String args[]){
		List<List<Integer>> ajl = adjacencyList();
		int ajm[][] = adjacencyMatrix();
	}
	public static int[][] adjacencyMatrix() {
		int n = 5;
		int m = 6;
		int ajx[][] = new int[n+1][n+1];
		ajx[1][2] = 1;
		
		ajx[1][3] = 1;
		
		ajx[3][4] = 1;
		
		ajx[2][4] = 1;
	
		ajx[2][5] = 1;
		
		ajx[4][5] = 1;
		
//		for(int e[] : ajx) {
//			System.out.println(Arrays.toString(e));
//		}
		return ajx;
	}
	public static List<List<Integer>> adjacencyList() {
		List<List<Integer>> ajx = new ArrayList<>();
		int n = 5;
		int m = 6;
		for(int i=0;i<=n;i++) ajx.add(new ArrayList<>());
		
		ajx.get(0).add(1);
		
		ajx.get(1).add(2);
	
		ajx.get(2).add(0);
		
		ajx.get(2).add(3);
		
		ajx.get(1).add(1);
		
		ajx.get(3).add(4);
		
		ajx.get(1).add(4);
		
//		for(int i=0;i<ajx.size();i++) {
//			System.out.println(ajx.get(i));
//		}
		return ajx;
	}
}