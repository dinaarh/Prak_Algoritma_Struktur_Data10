package P1;

import java.util.Scanner;

public class perulangan_deret10 {
    public static void main(String[] args) {
        Scanner scanner10 = new Scanner(System.in);
        System.out.print("Masukkan NIM: ");
        long nim = scanner10.nextLong();
        long n = nim % 100;
        if (n < 10) {
            n += 10;
        }
        System.out.println("============================");
        System.out.println("Deret bilangan dari n: " + n);
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }
            if (i % 2 == 0) {
                System.out.print(i + " "); // Angka Genap
            } else {
                System.out.print("* "); // Angka Ganjil
            }
        }
        scanner10.close();
    }
}
