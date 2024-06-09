package P15;

// import java.util.Scanner;

public class GraphMain10 {
    public static void main(String[] args) throws Exception {
        GraphMatriks10 gdg = new GraphMatriks10(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.removeEdge(2, 1);
        gdg.printGraph();

        System.out.println("Menghitung Degree ");
        gdg.printDegree();
        // Scanner sc10 = new Scanner(System.in);
        // Langkah 13 dan 14
        // Graph10 gedung = new Graph10(6);

        // gedung.addEdge(0, 1, 50);
        // gedung.addEdge(0, 2, 100);
        // gedung.addEdge(1, 3, 70);
        // gedung.addEdge(2, 3, 40);
        // gedung.addEdge(3, 4, 60);
        // gedung.addEdge(4, 5, 80);
        // gedung.degree(0);
        // gedung.printGraph();

        // Langkah 15 dan 17
        // gedung.removeEdge(1, 3);
        // gedung.printGraph();

        // boolean lanjut = true;
        // System.out.println("| Pengecekan Jalur |");
        // System.out.println();

        // while (lanjut) {
        // System.out.print("Masukkan gedung asal (0-5): ");
        // int asal = sc10.nextInt();
        // System.out.print("Masukkan gedung tujuan (0-5): ");
        // int tujuan = sc10.nextInt();
        // if (asal < 0 || asal > 5 || tujuan < 0 || tujuan > 5) {
        // System.out.println("Gedung yang dimasukkan tidak sesuai. Masukkan 0-5.");
        // } else {
        // if (gedung.adjacency(asal, tujuan)) {
        // System.out.println(
        // "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + "
        // bertetangga");
        // } else {
        // System.out.println(
        // "Gedung " + (char) ('A' + asal) + " dan " + (char) ('A' + tujuan) + " tidak
        // bertetangga");
        // }
        // }
        // System.out.println();

        // System.out.print("Ingin melakukan pengecekan lagi? (y/n) : ");
        // char jwb = sc10.next().charAt(0);
        // if (jwb == 'n' || jwb == 'N') {
        // lanjut = false;
        // }
        // System.out.println();

        // }
        // sc10.close();
    }
}
