package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainSum10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.print("Masukkan Banyak Perusahaan: ");
        int perusahaan = sc10.nextInt();
        System.out.println();

        for (int i = 0; i < perusahaan; i++) {
            System.out.println("Data Keuntungan Perusahaan ke-" + (i + 1));
            System.out.println("============================================================");
            System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
            System.out.print("Masukkan jumlah bulan : ");
            int elm = sc10.nextInt();

            Sum10 sm = new Sum10(elm);
            System.out.println("============================================================");
            for (int j = 0; j < sm.elemen; j++) {
                System.out.print("Masukkan untung bulan ke- " + (j + 1) + " = ");
                sm.keuntungan[j] = sc10.nextDouble();
            }

            System.out.println("============================================================");
            System.out.println("Algoritma Brute Force");
            System.out.println(
                    "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
            System.out.println("============================================================");
            System.out.println("Algoritma Divide Conquer");
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
                    + Math.round(sm.totalDC(sm.keuntungan, 0, sm.elemen - 1) * 100.0) / 100.0);
            System.out.println("============================================================");
        }
        sc10.close();
    }
}
