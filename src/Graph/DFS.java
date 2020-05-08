package Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	
	private LinkedList<Integer> adj[];
	
	public DFS(LinkedList<Integer>[] adj) {
		this.adj = adj;
	}
	
	void dfs(int s, int v) {
		Boolean vis[] = new Boolean[v];
		
		Arrays.fill(vis, false);
		
		dfs(s, vis);
	}
	
	private void dfs(int s, Boolean[] vis) {
		Stack<Integer> stack = new Stack<Integer>();
		
		stack.push(s);
				
		while(!stack.isEmpty()) {
			int element = stack.peek();
			
			if(!vis[element]) {
				vis[element] = true;
				System.out.println(element);
			}
			
			adj[element].forEach(temp->{
				if(!vis[temp]) {
					stack.push(temp);
				}
			});
			stack.pop();			
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
		
		DFS search = new DFS(adj);
		
		search.dfs(2, 4);
	}
}
