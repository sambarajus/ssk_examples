package com.ssk.samples.mvntest.ds.graph;

import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class DeapthFirstSearch {

	boolean[] marked;
	int[] edgeTo;
	int s;

	public DeapthFirstSearch(Graph g, int s) {
		marked = new boolean[g.V];
		edgeTo = new int[g.V];
		this.s = s;
	}

	public void dfs(Graph g, int v) {

		marked[v] = true;

		for (int w : g.getAdjecencyList(v)) {
			if (!marked[w]) {
				edgeTo[w] = v;
				dfs(g, w);
			}
		}
	}

	public boolean hasPathTo(int v) {
		return marked[v];
	}

	public LinkedStack<Integer> pathTo(int v) {
		if (!hasPathTo(v))
			return null;
		LinkedStack<Integer> path = new LinkedStack<Integer>();
		for (int x = v; x != s; x = edgeTo[x])
			path.push(x);
		path.push(s);
		return path;
	}
}
