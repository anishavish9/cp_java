/*
 * 1.Graph Edge Addition Validation
	Given a directed graph, write a function that adds an edge between two nodes and 
	then checks if the graph still has no cycles. 
	If a cycle is created, the edge should not be added.
 */

package Day6;

public class FindCycle {
	int[] parent;

    public FindCycle(int v) {
        parent = new int[v];
        // Initialize each node as its own parent
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }
    }

    public int find(int node) {
        // Find the root of the node
        if (parent[node] != node) {
            parent[node] = find(parent[node]); // Path compression
        }
        return parent[node];
    }

    public void union(int x, int y) {
        // Union operation to connect x and y
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            parent[rootY] = rootX;
        }
    }

    public boolean isCycle(int[][] edges) {
        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int rootX = find(x);
            int rootY = find(y);
            if (rootX == rootY) {
                return true; // Cycle detected
            }
            union(x, y);
        }
        return false; // No cycle found
    }

    public static void main(String[] args) {
        int v = 4; // Number of vertices
        FindCycle uf = new FindCycle(v);

        int[][] edges = {
            {0, 1},
            {1, 2},
            {2, 3},
            {3, 0} // Edge that creates a cycle
        };

        if (!uf.isCycle(edges)) {
            System.out.println("No cycle detected");
        } 
        else {
            System.out.println("Cycle detected");
        }
    }

}
