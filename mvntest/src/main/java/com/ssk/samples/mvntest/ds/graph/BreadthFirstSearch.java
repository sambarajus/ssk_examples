package com.ssk.samples.mvntest.ds.graph;

import java.util.Stack;

import com.ssk.samples.mvntest.ds.queue.MyQueue;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class BreadthFirstSearch {

	private boolean[] marked;// already visited vertex
	private int[] edgeTo; // edges array
	private int s;// source

	public BreadthFirstSearch(Graph g, int s) {
		marked = new boolean[g.V];
		edgeTo = new int[g.V];
		this.s = s;

	}

	public void bfs(Graph g, int s) {
		MyQueue<Integer> q = new MyQueue<Integer>();
		marked[s] = true;
		q.enqueue(s);
		while (q.isEmpty()) {
			int v = q.dequeue();
			for (int w : g.getAdjecencyList(v)) {
				if (marked[w]) {
					edgeTo[w] = v;
					marked[w] = true;
					q.enqueue(w);
				}
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
