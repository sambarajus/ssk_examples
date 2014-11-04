package com.ssk.samples.mvntest.ds.graph;

import java.util.ArrayList;
import java.util.List;

//Un-Directional Graph
public class Graph {

	int V; // number of Vertices
	int E;// number of Edges
	List<Integer>[] adj;// adjecency of v;

	public Graph(int V) {
		this.V = V;
		this.E = 0;
		for (int i = 0; i < V; i++)
			adj[i] = new ArrayList<Integer>();
	}

	public Graph(int V, int E) {
		this.V = V;
		this.E = E;
		for (int i = 0; i < V; i++)
			adj[i] = new ArrayList<Integer>();
	}
	public void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v’s list.
		adj[w].add(v); // Add v to w’s list.
		E++;
	}
}
