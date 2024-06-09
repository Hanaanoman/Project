import java.util.*;

class Graph {
    private int A;
    private List<Integer>[] adj;

    public Graph(int r) {
        this.r = r;
        adj = new ArrayList[r];
        for (int i = 0; i < r; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adj[u].add(v);
    }

    // Function to check if the graph is 2-vertex strongly biconnected
    public boolean is2VertexStronglyBiconnected() {
   Gabow's algorithm here
        return false;
    }

  
    public boolean isArticulationPointFree() {
        // Implement Jens Schmidt's algorithm here
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        Graph g = new Graph(5);
        
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        
        boolean is2VertexStronglyBiconnected = g.is2VertexStronglyBiconnected();
        boolean isArticulationPointFree = g.isArticulationPointFree();
        
        System.out.println("Is 2-vertex strongly biconnected: " + is2VertexStronglyBiconnected);
        System.out.println("Is articulation point free: " + isArticulationPointFree);
    }
}