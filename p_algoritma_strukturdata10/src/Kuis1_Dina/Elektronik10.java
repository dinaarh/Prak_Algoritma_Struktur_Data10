package Kuis1_Dina;

import Kuis1_Dina.ElektronikMain10;

public class Elektronik10 {
    public String nama10;
    public String merk10;
    public int stok10;
    public int terjual10;

    public Elektronik10() {

    }

    public Elektronik10(String nama10, String merk10, int stok10, int terjual10) {
        this.nama10 = nama10;
        this.merk10 = merk10;
        this.stok10 = stok10;
        this.terjual10 = terjual10;
    }

    public String ambilNama10() {
        return nama10;
    }

    public int ambilStok10() {
        return stok10;
    }

    public int terjual10() {
        return terjual10;
    }

    public void tampil10() {
        System.out.println("Nama: " + nama10);
        System.out.println("Merk: " + merk10);
        System.out.println("Stok: " + stok10);
        System.out.println("Terjual: " + terjual10);
        System.out.println();
    }

    public int hitungSisa10() {
        return stok10 - terjual10;
    }

    // private Elektronik10[] elektronik10;

    // public Elektronik10(Elektronik10[] elektronik10) {
    // this.elektronik10 = elektronik10;
    // }
    public int cariProdukTerlaris10() {
        // Elektronik10 banyakTerbeli = elektronik10[0];
        // for (Elektronik10 elk10 : elektronik10) {
        // if (elk10.terjual10() > banyakTerbeli.terjual10()) {
        // banyakTerbeli = elk10;
        // }
        // }
        // return banyakTerbeli;
        return terjual10;
    }

    public void daftarProduk10() {
        // nama10.tampil10();
    }
}
