package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	private LinkedList<Integer> adj[];
	
	public BFS(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
	void bfs(int s, int v) {		
		Boolean[] vis = new Boolean[v];
		
		Arrays.fill(vis, false);
		
		bfs(s, vis);
	}
	
	void bfs(int s, Boolean[] vis) {
		Queue<Integer> qentry = new LinkedList<Integer>();
		
		//add the start node of the graph into the queue
		qentry.add(s);
		
		//set vis of start node as true
		vis[s] = true;
		
		//iterate until all the edges are not visited. Queue will be
		// empty once all the edges are visited.
		while(qentry.size() != 0) {
			int element = qentry.remove();
			
			System.out.println(element);
			
			//checking adjacent edges of each node, if not visited, add those into queue
			// and set vis = true for those edges 
			adj[element].forEach(temp->{
				if(!vis[temp]) {
					vis[temp] = true;
					qentry.add(temp);
				}
			});
			
		}
	}

	public static void main(String[] args) {
		Graph g = new Graph(4);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(1, 2);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 3);
		
		LinkedList<Integer> adj[] = g.getAdj();
		
		BFS search = new BFS(adj);
		
		search.bfs(2, 4);
	}

}
