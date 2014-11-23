/**
 * 
 */
package com.ssk.samples.mvntest.ds.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sskumar
 *
 */
public class DirectionalGraph {

	public int V; //Number of Vertices
	public int E; // Number of Edges
	
	List<Integer> adj[] = null;
	
	public DirectionalGraph(int V, int E){
		this.V = V;
		this.E = E;
		adj = (ArrayList<Integer>[])new ArrayList[V];
		for (int i = 0; i < V; i++)
			adj[i] = new ArrayList<Integer>();
	}
	
	public void addEdge(int v, int w){
		adj[v].add(w);
		E++;
	}
	
	public List<Integer> getAdjencies(int v){
		return adj[v];
	}
	
}
