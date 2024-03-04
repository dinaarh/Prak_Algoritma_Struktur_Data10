package P3.ArrayObjects.src.Tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0; i < 3; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukan data Mahasiswa ke -" + (i + 1) + ": ");
            System.out.print("Masukan nama: ");
            mhs[i].nama = sc10.nextLine();
            System.out.print("Masukan nim: ");
            mhs[i].nim = sc10.nextLong();
            sc10.nextLine();
            System.out.print("Masukan jenis kelamin: ");
            mhs[i].jenisKelamin = sc10.nextLine();
            System.out.print("Masukan ipk: ");
            mhs[i].ipk = sc10.nextDouble();
            sc10.nextLine();
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("data Mahasiswa ke -" + (i + 1) + ": ");
            System.out.println("Nama          : " + mhs[i].nama);
            System.out.println("Nim           : " + mhs[i].nim);
            System.out.println("Jenis kelamin : " + mhs[i].jenisKelamin);
            System.out.println("Ipk           : " + mhs[i].ipk);
            System.out.println();
        }
    }
}
