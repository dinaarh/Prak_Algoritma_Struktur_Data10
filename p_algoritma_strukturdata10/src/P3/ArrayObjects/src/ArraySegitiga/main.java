package P3.ArrayObjects.src.ArraySegitiga;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        Segitiga[] sgArray = new Segitiga[4];

        for (int i = 0; i < 4; i++) {
            sgArray[i] = new Segitiga(i, i);
            System.out.println("Segitiga ke-" + i);
            System.out.print("Masukkan alas: ");
            sgArray[i].alas = sc10.nextInt();
            System.out.print("Masukkan tinggi: ");
            sgArray[i].tinggi = sc10.nextInt();
        }
    }
}
