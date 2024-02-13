package P1;

import java.util.Scanner;

public class tugas2_10 {

    public static void main(String[] args) {
        System.out.println("Program untuk menghitung rumus kecepatan, jarak, dan waktu");
        Scanner input10 = new Scanner(System.in);
        menu(input10);
        input10.close();
    }

    static void menu(Scanner input10) {
        int pilihan;
        System.out.println("==========================================");
        System.out.println("--- Rumus Kecepatan, Jarak, dan Waktu ---");
        System.out.println("1. Hitung Kecepatan");
        System.out.println("2. Hitung Jarak");
        System.out.println("3. Hitung Waktu");
        System.out.println("4. Keluar");
        System.out.print("Pilih menu: ");
        pilihan = input10.nextInt();
        System.out.println("==========================================");

        switch (pilihan) {
            case 1:
                hitungKecepatan(input10);
                break;
            case 2:
                hitungJarak(input10);
                break;
            case 3:
                hitungWaktu(input10);
                break;
            case 4:
                System.out.println("Terima kasih!");
                break;
            default:
                System.out.println("Pilihan tidak valid!");
        }
    }

    static void hitungKecepatan(Scanner input10) {
        double s, t, hasil;
        boolean lagi = true;
        while (lagi) {
            System.out.print("Masukkan jarak (s): ");
            s = input10.nextDouble();
            System.out.print("Masukkan waktu (t): ");
            t = input10.nextDouble();

            hasil = s / t;
            System.out.printf("Kecepatan (v) = %.1f\n", hasil);
            System.out.println("==========================================");
            System.out.print("Akan menghitung lagi (y/n)? ");
            String jawab = input10.next();

            if (jawab.equalsIgnoreCase("n")) {
                lagi = false;
            }
        }
        menu(input10);
        input10.close();
    }

    static void hitungJarak(Scanner input10) {
        double v, t, hasil;
        boolean lagi = true;
        while (lagi) {
            System.out.print("Masukkan kecepatan (v): ");
            v = input10.nextDouble();
            System.out.print("Masukkan waktu (t): ");
            t = input10.nextDouble();

            hasil = v * t;
            System.out.printf("Jarak (s) = %.1f\n", hasil);
            System.out.println("==========================================");
            System.out.print("Akan menghitung lagi (y/n)? ");
            String jawab = input10.next();

            if (jawab.equalsIgnoreCase("n")) {
                lagi = false;
            }
        }
        menu(input10);
        input10.close();
    }

    static void hitungWaktu(Scanner input10) {
        double v, s, hasil;
        boolean lagi = true;
        while (lagi) {
            System.out.print("Masukkan jarak (s): ");
            s = input10.nextDouble();
            System.out.print("Masukkan kecepatan (v): ");
            v = input10.nextDouble();

            hasil = s / v;
            System.out.printf("Waktu (t) = %.1f\n", hasil);
            System.out.println("==========================================");
            System.out.print("Akan menghitung lagi (y/n)? ");
            String jawab = input10.next();

            if (jawab.equalsIgnoreCase("n")) {
                lagi = false;
            }
        }
        menu(input10);
        input10.close();
    }
}
