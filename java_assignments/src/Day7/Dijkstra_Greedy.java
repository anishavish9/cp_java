/*
 * 1.	Dijkstra’s Shortest Path Finder
	Code Dijkstra’s algorithm to find the shortest path from a start node to 
	every other node in a weighted graph with positive weights.
 */

package Day7;


import java.util.*;


public class Dijkstra_Greedy {
    private int V; // Number of vertices
    private List<List<Node>> adjList; // Adjacency list


    // Node class to store destination and weight
    static class Node {
        int dest;
        int weight;


        public Node(int dest, int weight) {
            this.dest = dest;
            this.weight = weight;
        }
    }


    // Constructor to initialize the graph
    public Dijkstra_Greedy(int v) {
        this.V = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }


    // Method to add edges to the graph
    public void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Node(destination, weight)); // for directed graph
        adjList.get(destination).add(new Node(source, weight)); // for undirected graph
    }


    // Dijkstra's algorithm implementation
    public void dijkstra(int source) {
        // Priority queue to select the node with the smallest distance
        PriorityQueue<Node> priorityQueue = 
        		new PriorityQueue<>(Comparator.comparingInt(node -> node.weight));
        
        // Array to store the shortest distance from the source to each node
        int[] distances = new int[V];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0; // Distance to the source is 0


        // Add the source node to the priority queue
        priorityQueue.add(new Node(source, 0));


        // Process nodes in the priority queue
        while (!priorityQueue.isEmpty()) {
            // Get the node with the smallest distance
            Node currentNode = priorityQueue.poll();
            int current = currentNode.dest;


            // Explore all adjacent nodes
            for (Node neighbor : adjList.get(current)) {
                int adjacent = neighbor.dest;
                int weight = neighbor.weight;


                // Calculate the new distance
                int newDist = distances[current] + weight;


                // If the new distance is shorter, update the distance and add to the queue
                if (newDist < distances[adjacent]) {
                    distances[adjacent] = newDist;
                    priorityQueue.add(new Node(adjacent, newDist));
                }
            }
        }


        // Print the shortest distances
        System.out.println("Shortest distances from node " + source + ":");
        for (int i = 0; i < V; i++) {
            System.out.println(source + "----" + i + " : " + distances[i]);
        }
    }


    public static void main(String[] args) {
        Dijkstra_Greedy graph = new Dijkstra_Greedy(6);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(2, 3, 1);
        graph.addEdge(3, 4, 7);
        graph.addEdge(4, 5, 2);
        graph.dijkstra(0);
    }
}
