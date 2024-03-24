package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainFaktorial10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        System.out.println("=========================");
        System.out.print("Masukkan Jumlah Elemen: ");
        int iJml = sc10.nextInt();

        System.out.println("=========================");
        Faktorial10[] fk = new Faktorial10[iJml];
        for (int i = 0; i < iJml; i++) {
            fk[i] = new Faktorial10();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + " :");
            fk[i].nilai = sc10.nextInt();
        }

        System.out.println("=========================");
        System.out.println("HASIL - BRUTE FORCE");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil perhitungan faktorial menggunakan brute force adalah " + fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("=========================");
        System.out.println("HASIL - DIVIDE AND CONQUER");
        for (int i = 0; i < iJml; i++) {
            System.out.println(
                    "Hasil perhitungan faktorial menggunakan Divide and Conquer adalah "
                            + fk[i].faktorialDC(fk[i].nilai));
        }
        sc10.close();
    }
}
