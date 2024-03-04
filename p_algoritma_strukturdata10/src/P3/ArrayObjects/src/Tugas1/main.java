package P3.ArrayObjects.src.Tugas1;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        Kerucut[] krArray = new Kerucut[1];
        LimasSegiEmpat[] lsArray = new LimasSegiEmpat[1];
        Bola[] blArray = new Bola[1];

        for (int i = 0; i < 1; i++) {
            krArray[i] = new Kerucut(i, i);
            System.out.println("Kerucut");
            System.out.print("Masukkan jari-jari: ");
            krArray[i].jari = sc10.nextDouble();
            System.out.print("Masukkan sisi miring: ");
            krArray[i].siring = sc10.nextDouble();

            lsArray[i] = new LimasSegiEmpat(i, i);
            System.out.println("Limas Segi Empat");
            System.out.print("Masukkan panjang sisi alas: ");
            lsArray[i].sisi = sc10.nextDouble();
            System.out.print("Masukkan tinggi: ");
            lsArray[i].tinggi = sc10.nextDouble();

            blArray[i] = new Bola(i);
            System.out.println("Bola");
            System.out.print("Masukkan jari-jari: ");
            blArray[i].jari = sc10.nextDouble();
        }
        System.out.println("=============================");
        for (int i = 0; i < 1; i++) {
            System.out.println("Kerucut");
            System.out.println("Luas Permukaan:" + Math.round(krArray[i].luasPermukaan()) + ", Volume: "
                    + Math.round(krArray[i].volume()));
            System.out.println();

            System.out.println("Limas Segi Empat");
            System.out.println("Luas Permukaan:" + Math.round(lsArray[i].luasPermukaan()) + ", Volume: "
                    + Math.round(lsArray[i].volume()));
            System.out.println();

            System.out.println("Bola");
            System.out.println("Luas Permukaan:" + Math.round(blArray[i].luasPermukaan()) + ", Volume: "
                    + Math.round(blArray[i].volume()));
        }
    }
}
