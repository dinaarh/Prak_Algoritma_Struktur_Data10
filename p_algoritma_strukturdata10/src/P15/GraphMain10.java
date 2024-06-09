package P15;

public class GraphMain10 {
    public static void main(String[] args) throws Exception {
        // Langkah 13 dan 14
        Graph10 gedung = new Graph10(6);

        gedung.addEdge(0, 1, 50);
        gedung.addEdge(0, 2, 100);
        gedung.addEdge(1, 3, 70);
        gedung.addEdge(2, 3, 40);
        gedung.addEdge(3, 4, 60);
        gedung.addEdge(4, 5, 80);
        gedung.degree(0);
        gedung.printGraph();

        // Langkah 15 dan 17
        gedung.removeEdge(1, 3);
        gedung.printGraph();
    }
}
