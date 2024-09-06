package graph;

import java.util.LinkedList;
import java.util.Stack;

public class DFS {
	private int V;
	private LinkedList<Integer> list[];

	public DFS(int v) {
		this.V = v;
		list = new LinkedList[v];
		for (int i = 0; i < v; i++) {
			list[i] = new LinkedList<>();
		}
		
	}
	
	public void addEdge(int v,int w) {
		list[v].add(w);
	}
	
	public void dfs(int node) {

		boolean visited[] = new boolean[V];
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(node);
		while(!stack.isEmpty())
		{
			int currentNode = stack.pop();
			if(!visited[currentNode]) {
				System.out.println("current node "+currentNode);
				visited[currentNode] = true;
			}

			for(int adj: list[currentNode]) {
				if(!visited[adj])
					stack.push(adj);

			}
		}

	}

	public static void main(String args[])
	{
		DFS obj = new DFS(6);
		obj.addEdge(0,1);
		obj.addEdge(0,2);
		obj.addEdge(1,2);
		obj.addEdge(2,0);
		obj.addEdge(2,3);
		obj.addEdge(3,3);

		obj.dfs(0);
	}

}
