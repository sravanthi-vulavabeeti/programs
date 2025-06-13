import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
import java.util.List;

public class BFSExample {

    private int V; // Number of vertices
    private List<List<Integer>> adj; // Adjacency list

    
    public BFSExample(int v) {
        V = v;
        adj = new ArrayList<>(V);
        for (int i = 0; i < V; ++i) {
            adj.add(new ArrayList<>());
        }
    }

    
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        
        
    }

   
    public void BFS(int startVertex) {
        
        boolean[] visited = new boolean[V];

        
        Queue<Integer> queue = new LinkedList<>();

        
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

          
            for (int neighbor : adj.get(currentVertex)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFSExample graph = new BFSExample(6); // Create a graph with 6 vertices

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Breadth-First Traversal (starting from vertex 0):");
        graph.BFS(0); // Perform BFS starting from vertex 0
    }
}