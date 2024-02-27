package P3.ArrayObjects.src.ArraySegitiga;

import java.lang.Math;

public class Segitiga {
    public int alas;
    public int tinggi;

    public Segitiga(int a, int t) {
        alas = a;
        tinggi = t;
    }

    int hitungLuas() {
        return (int) (0.5 * alas * tinggi);
    }

    int hitungKeliling() {
        int k = 0;
        k = (int) Math.sqrt((alas * alas) + (tinggi * tinggi));
        return k;
    }
}
