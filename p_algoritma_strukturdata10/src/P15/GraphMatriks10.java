package P15;

public class GraphMatriks10 {
    int vertex;
    int[][] matriks;

    public GraphMatriks10(int v) {
        vertex = v;
        matriks = new int[v][v];
    }

    public void makeEdge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    //modifikasi dari -1 jadi 0
    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = 0;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.err.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int inDegree(int v) {
        int inDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][v] != 0) {
                inDegree++;
            }
        }
        return inDegree;
    }
    public int outDegree(int v) {
        int outDegree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[v][i] != 0) {
                outDegree++;
            }
        }
        return outDegree;
    }
    public void printDegree() {
        for (int i = 0; i < vertex; i++) {
            System.out.println("Vertex " + (char) ('A' + i) + " : ");
            System.out.println("In-degree : " + inDegree(i));
            System.out.println("Out-degree : " + outDegree(i));
            System.out.println("Degree : " + (inDegree(i) + outDegree(i)));
            System.out.println();
        }
    }
}
