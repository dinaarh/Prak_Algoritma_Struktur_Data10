package Kuis1_Dina;

import java.util.Scanner;

public class ElektronikMain10 {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);
        Elektronik10[] elektronik10 = new Elektronik10[5];

        for (int i = 0; i < elektronik10.length; i++) {
            elektronik10[i] = new Elektronik10();
            System.out.println("Masukan data produk elektronik ke-" + (i + 1));
            System.out.print("Nama elektronik: ");
            elektronik10[i].nama10 = scanner10.nextLine();
            System.out.print("Merk elektronik: ");
            elektronik10[i].merk10 = scanner10.nextLine();
            System.out.print("Stok elektronik: ");
            elektronik10[i].stok10 = scanner10.nextInt();
            System.out.print("Jumlah terjual: ");
            elektronik10[i].terjual10 = scanner10.nextInt();
            scanner10.nextLine();
            System.out.println();
        }

        System.out.println("Data seluruh produk elektonik:");
        for (Elektronik10 elk10 : elektronik10) {
            elk10.tampil10();
        }
        System.out.println("===================================");

        System.out.println();
        System.out.println("Sisa produk elktronik:");
        for (Elektronik10 elk10 : elektronik10) {
            System.out.println(elk10.ambilNama10() + ": " + elk10.hitungSisa10());
        }
        System.out.println("===================================");

        System.out.println();
        Elektronik10 banyakTerbeli10 = elektronik10[0];
        for (Elektronik10 elk10 : elektronik10) {
            if (elk10.terjual10() > banyakTerbeli10.terjual10()) {
                banyakTerbeli10 = elk10;
            }
        }
        System.out.println("Produk elektronik yang paling banyak dibeli:");
        banyakTerbeli10.tampil10();

        System.out.println("===================================");
        System.out.println();

        System.out.println("Daftar elektronik diurutkan berdasarkan jumlah terjual (descending):");
        for (int i = 0; i < elektronik10.length - 1; i++) {
            for (int j = i + 1; j < elektronik10.length; j++) {
                if (elektronik10[i].terjual10() < elektronik10[j].terjual10()) {
                    Elektronik10 el10 = elektronik10[i];
                    elektronik10[i] = elektronik10[j];
                    elektronik10[j] = el10;
                }
            }
        }
        for (Elektronik10 elk10 : elektronik10) {
            elk10.tampil10();
        }

        System.out.println("===================================");
        System.out.println();

        System.out.println("Daftar Produk: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Produk elektronik ke-" + i);
            System.out.println("Nama Produk:" + elektronik10[i].nama10);
        }
    }
}
