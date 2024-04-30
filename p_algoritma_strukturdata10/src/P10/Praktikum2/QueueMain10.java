package P10.Praktikum2;

import java.util.Scanner;

public class QueueMain10 {
    public static void menu() {
        System.out.println();
        System.out.println("Pilih menu: ");
        System.out.println("1. Antrian baru");
        System.out.println("2. Antrian keluar");
        System.out.println("3. Cek Antrian terdepan");
        System.out.println("4. Cek Semua Antrian");
        System.out.println("5. Cek Antrian paling blakang");
        System.out.println("-----------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int pilih;

        System.out.print("Masukkan kapasitas queue : ");
        int jumlah = sc10.nextInt();
        Queue10 antri = new Queue10(jumlah);

        do {
            menu();
            pilih = sc10.nextInt();
            sc10.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("No Rekening: ");
                    String norek = sc10.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc10.nextLine();
                    System.out.print("Alamat: ");
                    String alamat = sc10.nextLine();
                    System.out.print("Umur: ");
                    int umur = sc10.nextInt();
                    System.out.print("Saldo: ");
                    double saldo = sc10.nextDouble();
                    Nasabah10 nb = new Nasabah10(norek, nama, alamat, umur, saldo);
                    sc10.nextLine();
                    antri.Enqueue(nb);
                    break;
                case 2:
                    Nasabah10 data = antri.Dequeue();
                    if (!"".equals(data.norek) && !"".equals(data.nama) && !"".equals(data.alamat) && data.umur != 0
                            && data.saldo != 0) {
                        System.out.println("Antrian yang keluar: " + data.norek + " "
                                + data.nama + " " + data.alamat + " " + data.umur + " " + data.saldo);
                        break;
                    }
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
            }

        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    }
}
