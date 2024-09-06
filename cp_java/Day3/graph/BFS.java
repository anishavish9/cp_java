package graph;

import java.util.Iterator;
import java.util.LinkedList;

public class BFS {
	private int v;
    private LinkedList<Integer> list[];

    public BFS(int v) {
        this.v = v;
        list = new LinkedList[v];
        for(int j=0; j<v; j++) {
            list[j] = new LinkedList<>();
        }
    }
    
    // create method addEdge()
    public void addEdge(int v , int w) {
        list[v].add(w);
    }
    
    // bfs method
    public void bfs(int s) {
        boolean visited[] = new boolean[v];
        
        // create queue
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // mark the node as visited and enqueue
        visited[s] = true;
        queue.add(s);
        
        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s + " ");

            Iterator<Integer> itr = list[s].iterator();
            while (itr.hasNext()) {
                int x = itr.next();
                if (!visited[x]) {
                    visited[x] = true;
                    queue.add(x);
                }
            }
        }
    }
    
    public static void main(String args[])
    {
        BFS obj = new BFS(4);
        obj.addEdge(0,1);
        obj.addEdge(0,2);
        obj.addEdge(1,2);
        obj.addEdge(2,0);
        obj.addEdge(2,3);
        obj.addEdge(3,3);

        obj.bfs(0);


    }

}
