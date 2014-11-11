package com.ssk.samples.ds.graph;

import org.junit.Test;

import com.ssk.samples.mvntest.ds.graph.BreadthFirstSearch;
import com.ssk.samples.mvntest.ds.graph.Graph;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class DeapthFirstSearchTest {

	@Test
	public void testDfs() {
		// fail("Not yet implemented");

		int[] v = new int[] { 0, 1, 2, 3, 4, 5 };
		int[][] a = new int[][] { { 1, 2 }, { 3 }, { 3 }, { 4 }, { 5 }, {} };
		Graph g = new Graph(6, 0);
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				// System.out.println(a[i][j]);
				g.addEdge(v[i], a[i][j]);
			}
		}
		BreadthFirstSearch bfs = new BreadthFirstSearch(g, 0);
		bfs.bfs(g, 0);
		LinkedStack<Integer> path = bfs.pathTo(5);
		while (path.topValue() != null) {
			System.out.println(path.pop());
		}
	}

	@Test
	public void testPathTo() {
//		fail("Not yet implemented");
	}

}
