import java.util.ArrayList;
import java.util.List;

public class GraphAdjacencyList {

    private int numVertices;
    private List<List<Integer>> adjList;
    public GraphAdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        if (u >= 0 && u < numVertices && v >= 0 && v < numVertices) {
            adjList.get(u).add(v);
            adjList.get(v).add(u); // For undirected graph
        } else {
            System.out.println("Invalid vertex index.");
        }
    }
    public List<Integer> getAdjacentVertices(int vertex) {
        if (vertex >= 0 && vertex < numVertices) {
            return adjList.get(vertex);
        } else {
            System.out.println("Invalid vertex index.");
            return null;
        }
    }
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
       GraphAdjacencyList graph = new GraphAdjacencyList(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();

        System.out.println("\nAdjacent vertices of Vertex 1: " + graph.getAdjacentVertices(1));
    }
}