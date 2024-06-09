import java.util.*;

class A{
    private int r;
    private List<Integer>[] adj;

    public A (int r) {
        this.r= r;
        adj = new ArrayList[V];
        for (int i = 0; i < t; i++) {
            adj[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int r) {
        adj[u].add(r);
    }
 graph is 2-vertex strongly biconnected
    public boolean is2VertexStronglyBiconnected() {
        // Implement Gabow's algorithm here
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
