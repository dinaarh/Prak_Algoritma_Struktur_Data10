package P1;

import java.util.Scanner;

public class pemilihan_nilai10 {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);
        System.out.println("Program Menghitung Nilai AKhir");
        System.out.println("======================");

        System.out.print("Masukkan Nilai Tugas (0-100): ");
        double nilaiTugas = scanner10.nextDouble();
        if (nilaiTugas < 0 || nilaiTugas > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai Kuis (0-100): ");
        double nilaiKuis = scanner10.nextDouble();
        if (nilaiKuis < 0 || nilaiKuis > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai UTS (0-100): ");
        double nilaiUts = scanner10.nextDouble();
        if (nilaiUts < 0 || nilaiUts > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.print("Masukkan Nilai UAS (0-100): ");
        double nilaiUas = scanner10.nextDouble();
        if (nilaiUas < 0 || nilaiUas > 100) {
            System.out.println("Nilai Tidak Valid");
            return;
        }

        System.out.println("======================");

        double nilaiAkhir = 0.2 * nilaiTugas + 0.2 * nilaiKuis + 0.3 * nilaiUts + 0.3 * nilaiUas;
        String nilaiHuruf = "";
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
        } else if (nilaiAkhir > 0 && nilaiAkhir <= 39) {
            nilaiHuruf = "E";
        } else {
            System.out.println("Nilai Akhir Tidak Valid");
            return;
        }

        String result = "";
        if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")
                || nilaiHuruf.equals("C")) {
            result = "SELAMAT ANDA LULUS";
        } else {
            result = "ANDA TIDAK LULUS";
        }

        System.out.printf("Nilai Akhir : %.1f %n", nilaiAkhir);
        System.out.println("Nilai Huruf : " + nilaiHuruf);
        System.out.println("======================");
        System.out.println(result);
    }
}