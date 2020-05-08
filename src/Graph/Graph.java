package Graph;

import java.util.LinkedList;

public class Graph {
	
	private int V;
	private LinkedList<Integer> adj[];
	
	public Graph(int V) {
		this.V = V;
		adj = new LinkedList[V];
		for(int i = 0; i < V; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	void addEdge(int v, int w) {
		adj[v].add(w);
	}

	public int getV() {
		return V;
	}

	public void setV(int v) {
		V = v;
	}

	public LinkedList<Integer>[] getAdj() {
		return adj;
	}

	public void setAdj(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
}
