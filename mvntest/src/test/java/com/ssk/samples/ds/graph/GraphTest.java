package com.ssk.samples.ds.graph;

import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;

import com.ssk.samples.mvntest.ds.graph.Graph;

public class GraphTest extends TestCase {

	public void testAddEdge() {
	//	fail("Not yet implemented");
//		int[] v = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12};
//		int[][] a = new int[][]{{6,2,1,5},{0},{0},{5,4},{5,6,3},{3,4,0},{0,4},{8},{7},{11,10,12},{9},{9,12},{11,9}};
		int[] v = new int[]{0,1,2,3,4,5};
		int[][] a = new int[][]{{1,2},{3},{3},{4},{5},{}};
		Graph g = new Graph(6,0);
		for(int i = 0;i<v.length;i++){
			for(int j = 0;j<a[i].length;j++){
//				System.out.println(a[i][j]);
				g.addEdge(v[i], a[i][j]);
			}
		}
		System.out.println(g.toString());
//		System.out.println(a.length);
		assertTrue(true);
		g.breadthFirstSearch(g, 3);
	}

	
}
