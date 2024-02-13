package P1;

import java.util.Scanner;

public class tugas1_10 {
    public static void main(String[] args) {
        char[] kode = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };
        char[][] kota = new char[10][12];
        kota[0] = new char[] { 'B', 'A', 'N', 'T', 'E', 'N', ' ', ' ', ' ', ' ', ' ', ' ' };
        kota[1] = new char[] { 'J', 'A', 'K', 'A', 'R', 'T', 'A', ' ', ' ', ' ', ' ', ' ' };
        kota[2] = new char[] { 'B', 'A', 'N', 'D', 'U', 'N', 'G', ' ', ' ', ' ', ' ', ' ' };
        kota[3] = new char[] { 'C', 'I', 'R', 'E', 'B', 'O', 'N', ' ', ' ', ' ', ' ', ' ' };
        kota[4] = new char[] { 'B', 'O', 'G', 'O', 'R', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };
        kota[5] = new char[] { 'p', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N', ' ', ' ' };
        kota[6] = new char[] { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G', ' ', ' ', ' ', ' ' };
        kota[7] = new char[] { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A', ' ', ' ', ' ', ' ' };
        kota[8] = new char[] { 'M', 'A', 'L', 'A', 'N', 'G', ' ', ' ', ' ', ' ', ' ', ' ' };
        kota[9] = new char[] { 'T', 'E', 'G', 'A', 'L', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

        Scanner scanner10 = new Scanner(System.in);
        System.out.print("Masukkan kode: ");
        char inputKode = Character.toUpperCase(scanner10.next().charAt(0));

        boolean cari = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == inputKode) {
                System.out.print("Kota: ");
                for (int j = 0; j < kota[i].length; j++) {
                    System.out.print(kota[i][j]);
                }
                System.out.println();
                cari = true;
                break;
            }
        }
        if (!cari) {
            System.out.println("kode tidak ditemukan");
        }
    }
}