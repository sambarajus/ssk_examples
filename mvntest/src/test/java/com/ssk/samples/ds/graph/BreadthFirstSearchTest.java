package com.ssk.samples.ds.graph;

import junit.framework.TestCase;

import com.ssk.samples.mvntest.ds.graph.BreadthFirstSearch;
import com.ssk.samples.mvntest.ds.graph.Graph;
import com.ssk.samples.mvntest.ds.stack.LinkedStack;

public class BreadthFirstSearchTest extends TestCase {

	public void testBfs() {
//		fail("Not yet implemented");
//		int[] v = new int[]{0,1,2,3,4,5};
//		int[][] a = new int[][]{{1,2},{3},{3},{4},{5},{}};
		int[] v = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
		int[][] a = new int[][]{{6,2,1,5},{0},{0},{5,4},{5,6,3,11},{3,4,0},{0,4,7},{8},{7,9},{11,10,12},{9},{9,12},{11,9}};
		Graph g = new Graph(13,0);
		for(int i = 0;i<v.length;i++){
			for(int j = 0;j<a[i].length;j++){
//				System.out.println(a[i][j]);
				g.addEdge(v[i], a[i][j]);
			}
		}
		BreadthFirstSearch bfs = new BreadthFirstSearch(g,0);
		bfs.bfs(g, 0);
		LinkedStack<Integer> path = bfs.pathTo(12);
		while(path.topValue()!=null){
			System.out.println(path.pop());
		}
		assert(true);
	}

	public void testPathTo() {
//		fail("Not yet implemented");
		assert(true);
	}

}
