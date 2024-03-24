package P5.BruteForceDivideConquer;

import java.util.Scanner;

public class MainPangkat10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);

        System.out.println("==================================");
        System.out.print("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc10.nextInt();

        Pangkat10[] png = new Pangkat10[elemen];
        for (int i = 0; i < elemen; i++) {
            // png[i] = new Pangkat10();
            System.out.print("Masukkan nilai yang hendak dipangkatkan: ");
            int nilai = sc10.nextInt();
            // png[i].nilai = sc10.nextInt();
            System.out.print("Masukkan nilai pemangkat: ");
            int pangkat = sc10.nextInt();
            // png[i].pangkat = sc10.nextInt();
            png[i] = new Pangkat10(nilai, pangkat);
        }

        int menu;
        System.out.println("==================================");
        System.out.println("Pilih metode yang digunakan:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan anda: ");
        menu = sc10.nextInt();

        switch (menu) {
            case 1:
                System.out.println("==================================");
                System.out.println("HASIL PANGKAT - BRUTE FORCE");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("==================================");
                System.out.println("HASIL PANGKAT - DIVIDE AND CONQUER");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah "
                            + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak tersedia.");
        }
        sc10.close();
    }
}
