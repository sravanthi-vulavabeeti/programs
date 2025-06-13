import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    private int numVertices;
    private List<List<Integer>> adjList;

    /**
     * Constructor for the GraphAdjacencyList class.
     * Initializes the adjacency list with the specified number of vertices.
     *
     * @param numVertices The total number of vertices in the graph.
     */
    public GraphAdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    /**
     * Adds an edge between two vertices in the graph.
     * This method assumes an undirected graph, so an edge is added in both directions.
     *
     * @param u The first vertex.
     * @param v The second vertex.
     */
    public void addEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            adjList.get(u).add(v);
            adjList.get(v).add(u); // For undirected graph
        } else {
            System.out.println("Invalid vertex index.");
        }
    }

    /**
     * Returns the list of adjacent vertices for a given vertex.
     *
     * @param vertex The vertex for which to retrieve adjacent vertices.
     * @return A list of integers representing the adjacent vertices.
     */
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex >= 0 && vertex < numVertices) {
            return adjList.get(vertex);
        } else {
            System.out.println("Invalid vertex index.");
            return null;
        }
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println("Adjacency List Representation of the Graph:");
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a graph with 5 vertices
        GraphAdjacencyList graph = new GraphAdjacencyList(5);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        graph.printGraph();

        // Get adjacent vertices for a specific vertex
        System.out.println("\nAdjacent vertices of Vertex 1: " + graph.getAdjacentVertices(1));
    }
}