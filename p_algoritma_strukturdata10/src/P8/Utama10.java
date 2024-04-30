package P8;

import java.util.Scanner;

public class Utama10 {
    public static void main(String[] args) {
        // Instansiasi Gudang
        Gudang10 gudang = new Gudang10(7);

        // Deklarasi Scanner
        Scanner scanner10 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu : ");
            System.out.println("1. Tambah Barang");
            System.out.println("2. Ambil Barang");
            System.out.println("3. Tampilkan Tumpukan Barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi : ");
            int pilihan = scanner10.nextInt();
            scanner10.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan Kode Barang : ");
                    int kode = scanner10.nextInt();
                    scanner10.nextLine();
                    System.out.print("Masukkan Nama Barang : ");
                    String nama = scanner10.nextLine();
                    System.out.print("Masukkan Nama Kategori : ");
                    String kategori = scanner10.nextLine();
                    System.out.println("====================================");
                    // Untuk menyimpan hasil Barang
                    Barang10 barangBaru = new Barang10(kode, nama, kategori);
                    gudang.tambahBarang(barangBaru);
                    break;
                case 2:
                    gudang.ambilBarang();
                    break;
                case 3:
                    gudang.tampilkanBarang();
                    break;
                case 4:
                    // System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan Tidak Valid. Silahkan Coba Lagi.");
            }
        }
    }
}
