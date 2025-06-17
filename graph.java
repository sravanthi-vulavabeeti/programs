public class Graph {
    private int[][] adjMatrix;
    private int numVertices;

    
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjMatrix = new int[numVertices][numVertices];
    }

    
    public void addEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjMatrix[source][destination] = 1;
            adjMatrix[destination][source] = 1; // For undirected graph
        } else {
            System.out.println("Invalid vertex index.");
        }
    }

    
    public void removeEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            adjMatrix[source][destination] = 0;
            adjMatrix[destination][source] = 0; // For undirected graph
        } else {
            System.out.println("Invalid vertex index.");
        }
    }

   
    public boolean hasEdge(int source, int destination) {
        if (source >= 0 && source < numVertices && destination >= 0 && destination < numVertices) {
            return adjMatrix[source][destination] == 1;
        } else {
            System.out.println("Invalid vertex index.");
            return false;
        }
    }

    
    public void printAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5); // Create a graph with 5 vertices

        
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        
        graph.printAdjMatrix();

      
        System.out.println("\nDoes edge (0, 2) exist? " + graph.hasEdge(0, 2));
        System.out.println("Does edge (1, 3) exist? " + graph.hasEdge(1, 3));

        
        graph.removeEdge(0, 4);
        System.out.println("\nAdjacency Matrix after removing edge (0, 4):");
        graph.printAdjMatrix();
    }
}