package P3.ArrayObjects.src.Tugas1;

import java.lang.Math;

public class Kerucut {
    public double jari;
    public double siring;

    public Kerucut(double r, double s) {
        jari = r;
        siring = s;
    }

    public double luasPermukaan() {
        return Math.PI * jari * (jari + siring);
    }

    public double volume() {
        double tinggi = 0.0;
        tinggi = Math.sqrt((siring * siring) - (jari * jari));
        return (1.0 / 3.0) * Math.PI * Math.pow(jari, 2) * tinggi;
    }
}
