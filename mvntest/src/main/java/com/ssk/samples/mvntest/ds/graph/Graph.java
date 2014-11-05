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
		this.E = 0;
//		adj[i] 
		adj = (ArrayList<Integer>[])new ArrayList[V];
		for (int i = 0; i < V; i++)
			adj[i] = new ArrayList<Integer>();
	}
	public void addEdge(int v, int w) {
		adj[v].add(w); // Add w to v’s list.
		adj[w].add(v); // Add v to w’s list.
		E++;
	}
	
	
	public void breadthFirstSearch(Graph g, int val){
		//Root vertix is 0
		int c = 0;
		int duplicates[] = new int[g.E];
		for (int i = 0; i< g.V;i++){
			for(int j = 0; j<adj[i].size();j++){
//				System.out.println(adj[i].get(j));
				c++;
			}
		}
		System.out.println(c);
	}
	
	
	 /**
     * Returns a string representation of the graph.
     * This method takes time proportional to <em>E</em> + <em>V</em>.
     * @return the number of vertices <em>V</em>, followed by the number of edges <em>E</em>,
     *    followed by the <em>V</em> adjacency lists
     */
    public String toString() {
        StringBuilder s = new StringBuilder();
        String NEWLINE = System.getProperty("line.separator");
        s.append(V + " vertices, " + E + " edges " + NEWLINE);
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (int w : adj[v]) {
                s.append(w + " ");
            }
            s.append(NEWLINE);
        }
        return s.toString();
    }
    
    public List<Integer> getAdjecencyList(int V){
    	return adj[V];
    }
    
}
