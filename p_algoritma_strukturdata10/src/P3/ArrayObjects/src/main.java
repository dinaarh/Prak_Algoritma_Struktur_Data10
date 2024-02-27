package P3.ArrayObjects.src;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int j = 0;
        Scanner sc10 = new Scanner(System.in);

        System.out.print("Masukkan banyak elemen: ");
        j = sc10.nextInt();
        PersegiPanjang[] ppArray = new PersegiPanjang[j];

        for (int i = 0; i < j; i++) {
            ppArray[i] = new PersegiPanjang();
            System.out.println("Persegi panjang ke-" + i);
            System.out.print("Masukkan panjang: ");
            ppArray[i].panjang = sc10.nextInt();
            System.out.print("Masukkan lebar: ");
            ppArray[i].lebar = sc10.nextInt();

        }

        for (int i = 0; i < j; i++) {
            System.out.println("Persegi Panjang ke-" + i);
            System.out.println("Panjang:" + ppArray[i].panjang + ", lebar: " + ppArray[i].lebar);
        }
        // ppArray[0] = new PersegiPanjang();
        // ppArray[0].panjang = 110;
        // ppArray[0].lebar = 30;

        // ppArray[1] = new PersegiPanjang();
        // ppArray[1].panjang = 80;
        // ppArray[1].lebar = 40;

        // ppArray[2] = new PersegiPanjang();
        // ppArray[2].panjang = 100;
        // ppArray[2].lebar = 20;

        // System.out.println("Persegi Panjang ke-0, panjang: " + ppArray[0].panjang +
        // ", lebar: " + ppArray[0].lebar);
        // System.out.println("Persegi Panjang ke-1, panjang: " + ppArray[1].panjang +
        // ", lebar: " + ppArray[1].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang: " + ppArray[2].panjang +
        // ", lebar: " + ppArray[2].lebar);
    }
}