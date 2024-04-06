package P7;

import java.util.Scanner;

public class BukuMain10 {
    public static void main(String[] args) {
        Scanner sDina = new Scanner(System.in);
        Scanner s1Dina = new Scanner(System.in);

        PencarianBuku10 data = new PencarianBuku10();
        int jumBuku = 5;

        System.out.println("===================================");
        System.out.println("Masukkan data buku secara urut dari kode buku terkecil : ");
        for (int i = 0; i < jumBuku; i++) {
            System.out.println("-------------");
            System.out.print("Kode Buku \t  : ");
            int kodeBuku = sDina.nextInt();
            System.out.print("Judul Buku \t  : ");
            String judulBuku = s1Dina.nextLine();
            System.out.print("Tahun Terbit \t  : ");
            int tahunTerbit = sDina.nextInt();
            System.out.print("Pengarang \t  : ");
            String pengarang = s1Dina.nextLine();
            System.out.print("Stock \t\t  : ");
            int stock = sDina.nextInt();

            Buku10 m = new Buku10(kodeBuku, judulBuku, tahunTerbit, pengarang, stock);
            data.tambahBuku(m);

        }
        System.out.println("===================================");
        System.out.println("Data Keseluruhan Buku : ");
        data.tampil();

        System.out.println("___________________________________");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan kode buku yang dicari: ");
        System.out.print("Kode Buku : ");
        int cari = sDina.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        System.out.println("___________________________________");
    }
}
