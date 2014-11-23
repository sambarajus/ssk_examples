/**
 * 
 */
package com.ssk.examples.others;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.ssk.samples.mvntest.ds.graph.DirectionalGraph;
import com.ssk.samples.mvntest.ds.queue.MyQueue;

/**
 * @author sskumar
 * 
 */
public class MatrixToCluster {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] matrix = { { 0, 1, 0, 1 }, { 0, 0, 1, 1 }, { 0, 0, 0, 0 },
				{ 1, 1, 0, 0 } };
//		convertToClusterList(matrix);
		printClusters(matrix);

	}

	public static void convertToClusterList(int[][] matrix) {
		DirectionalGraph g = new DirectionalGraph(matrix.length, 0);

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					g.addEdge(i, j);
				}
			}
		}
		
		for( int i = 0; i<g.V;i++){
			boolean[] marked = new boolean[g.V];
			boolean[] visited = new boolean[g.V];
			dfs(g,0,marked, visited);
		}
			

	}

	private static void traverseGraph(DirectionalGraph g, int s) {

		boolean[] marked = new boolean[g.V];
		marked[s] = true;
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.enqueue(s);
		while (!q.isEmpty()) {
			int v = q.dequeue();
			for (int w : g.getAdjencies(v)) {

				System.out.println("(" + v + ", " + w + ")");

				if (!marked[w]) {
					marked[w] = true;
					// System.out.println(w);
					q.enqueue(w);
				}
			}

		}

	}

	public static  void dfs(DirectionalGraph g, int v, boolean[] marked,boolean[] visited) {

		marked[v] = true;

		for (int w : g.getAdjencies(v)) {
			if (!marked[w]) {
				System.out.println("(" + v + ", " + w + ")");	
				dfs(g, w, marked, visited);
			}
		}
	}

	
	public static void printClusters(int[][] matrix){
		List clusters = new ArrayList();
		List pairs = new ArrayList();
		
		for (int i = 0; i < matrix.length; i++) {
			boolean pairsFound = false;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1) {
					pairs.add("(" + i + ", " + j + ")");
					pairsFound = true;
				}
			}
			if(!pairsFound){
				clusters.add(pairs);
				pairs = new ArrayList();
			}
		}
		clusters.add(pairs);
		//print display
		for (int i = 0; i < clusters.size(); i++) {
			List cluster = (List)clusters.get(i);
			System.out.print(" Cluster "+i+": ");
			for (Iterator iterator = cluster.iterator(); iterator.hasNext();) {
				String object = (String) iterator.next();
				System.out.print(object);
			}
			System.out.println();
		}
		
	}
	
}
