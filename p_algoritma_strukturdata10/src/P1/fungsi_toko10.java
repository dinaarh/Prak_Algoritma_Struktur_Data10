package P1;

public class fungsi_toko10 {
    public static void main(String[] args) {

        int[][] stockBungaArray = {
                { 10, 5, 15, 7 },
                { 6, 11, 9, 12 },
                { 2, 10, 10, 5 },
                { 5, 7, 12, 9 } };
        int[] hargaBungaArray = { 75000, 50000, 60000, 10000 };
        System.out.println("=================================");
        System.out.println("Pendapatan setiap cabang jika semua bunga terjual");
        System.out.println("=================================");
        pendapatanCabang(stockBungaArray, hargaBungaArray);
        jumlahBunga(stockBungaArray);
    }

    static void pendapatanCabang(int[][] stockBunga, int[] hargaBunga) {
        int[] pendapatanPerCabang = new int[4];
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                pendapatanPerCabang[i] += stockBunga[i][j] * hargaBunga[j];
            }
        }
        for (int i = 0, j = 1; i < pendapatanPerCabang.length; i++, j++) {
            System.out.println("Pendapatan RoyalGarden " + j + ": " + pendapatanPerCabang[i]);
        }
        System.out.println();
    }

    static void jumlahBunga(int[][] stockBunga) {
        String[] namaBunga = { "Aglonema", "Keladi", "Alocasia", "Mawar" };
        int[] jumlahBungaMati = { 1, 2, 0, 5 };
        int[] stock = new int[4];
        for (int i = 0; i < jumlahBungaMati.length; i++) {
            stock[i] = stockBunga[3][i] - jumlahBungaMati[i];
        }
        System.out.println("=================================");
        System.out.println("Stock Bunga di Cabang RoyalGarden 4");
        System.out.println("=================================");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Bunga " + namaBunga[i] + ": " +
                    stock[i]);
        }
    }
}