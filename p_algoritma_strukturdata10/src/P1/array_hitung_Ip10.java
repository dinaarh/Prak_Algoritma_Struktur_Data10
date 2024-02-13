package P1;

import java.util.Scanner;

public class array_hitung_Ip10 {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);

        double[] nilai = new double[8];
        String[][] matkul = {
                { "Pancasila", "2" },
                { "Konsep Teknologi Informasi", "2" },
                { "Critical Thinking dan Problem Solving", "2" },
                { "Matematika Dasar", "3" },
                { "Bahasa Inggris", "2" },
                { "Dasar Pemrograman", "2" },
                { "Praktikum Dasar Pemrograman", "3" },
                { "Keselamatan dan Kesehatan Kerja", "2" }
        };
        double[] bobotNilai = { 0, 1, 2, 2.5, 3, 3.5, 4 };
        String[] nilaiHuruf = { "E", "D", "C", "C+", "B", "B+", "A" };
        double[] bobotFinal = new double[8];
        String[] hurufAkhir = new String[8];

        System.out.println("======================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("======================");

        for (int i = 0; i < matkul.length; i++) {
            System.out.printf("Masukkan nilai angka untuk MK %s  ", matkul[i][0]);
            System.out.print(": ");
            nilai[i] = scanner10.nextDouble();
        }

        for (int i = 0; i < matkul.length; i++) {
            if (nilai[i] > 80) {
                hurufAkhir[i] = nilaiHuruf[6];
                bobotFinal[i] = bobotNilai[6];
            } else if (nilai[i] > 73) {
                hurufAkhir[i] = nilaiHuruf[5];
                bobotFinal[i] = bobotNilai[5];
            } else if (nilai[i] > 65) {
                hurufAkhir[i] = nilaiHuruf[4];
                bobotFinal[i] = bobotNilai[4];
            } else if (nilai[i] > 60) {
                hurufAkhir[i] = nilaiHuruf[3];
                bobotFinal[i] = bobotNilai[3];
            } else if (nilai[i] > 50) {
                hurufAkhir[i] = nilaiHuruf[2];
                bobotFinal[i] = bobotNilai[2];
            } else if (nilai[i] > 39) {
                hurufAkhir[i] = nilaiHuruf[1];
                bobotFinal[i] = bobotNilai[1];
            } else {
                hurufAkhir[i] = nilaiHuruf[0];
                bobotFinal[i] = bobotNilai[0];
            }
        }

        System.out.println("======================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=======================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totResult = 0.0, totSks = 0.0;
        for (int i = 0; i < matkul.length; i++) {
            String[] newMatkul = matkul[i];
            double result = Double.parseDouble(newMatkul[1]) * bobotFinal[i];
            totSks += Double.parseDouble(newMatkul[1]);
            totResult += result;
            System.out.printf("%-40s %-15s %-15s %-15s\n", newMatkul[0], nilai[i], hurufAkhir[i],
                    bobotFinal[i]);
        }
        System.out.println("=======================");
        double ip = totResult / totSks;
        System.out.printf("IP: %.2f\n", ip);
    }
}
