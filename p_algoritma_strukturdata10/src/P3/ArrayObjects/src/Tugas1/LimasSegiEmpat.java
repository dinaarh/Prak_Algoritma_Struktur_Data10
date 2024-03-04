package P3.ArrayObjects.src.Tugas1;

import java.lang.Math;

public class LimasSegiEmpat {
    public double sisi;
    public double tinggi;

    public LimasSegiEmpat(double s, double t) {
        sisi = s;
        tinggi = t;
    }

    public double luasPermukaan() {
        double tinggiSisi = 0.0;
        double setSisi = (1 / 2 * sisi);
        double luasSisiTegak = 0.0;
        tinggiSisi = Math.sqrt((setSisi * setSisi) + (tinggi * tinggi));
        luasSisiTegak = (4 * (1 / 2 * tinggiSisi * sisi));

        return (sisi * sisi) + luasSisiTegak; // luas alas + luas sisi tegak
    }

    public double volume() {
        return (1.0 / 3.0) * Math.pow(sisi, 2) * tinggi;
    }
}
