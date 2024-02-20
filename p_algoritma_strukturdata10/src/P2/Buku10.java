package P2;

public class Buku10 {

    String judul, pengarang;
    int halaman, stok, harga;

    void tampilInformasi() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Jumlah halaman: " + halaman);
        System.out.println("Sisa stok: " + stok);
        System.out.println("Harga: Rp. " + harga);
    }

    void terjual(int jml) {
        if (stok >= jml && stok > 0) {
            stok -= jml;
        }
    }

    void restock(int jml) {
        stok += jml;
    }

    void gantiHarga(int hrg) {
        harga = hrg;
    }

    int hitungHargaTotal(int jml) {
        return harga * jml;
    }

    int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return 12 * hargaTotal / 100;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return 5 * hargaTotal / 100;
        } else {
            return 0;
        }
    }

    int hitungHargaBayar(int hargaTotal, double diskon) {
        return hargaTotal - (int)diskon;
    }

    public Buku10() {

    }

    public Buku10(String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
}