package P7;

public class Buku10 {
    int kodeBuku;
    String judullBuku;
    int tahunTerbit;
    String pengarang;
    int stock;

    public Buku10(int kd, String jb, int th, String pg, int st) {
        kodeBuku = kd;
        judullBuku = jb;
        tahunTerbit = th;
        pengarang = pg;
        stock = st;
    }

    void tampilDataBuku() {
        System.out.println("=========================");
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judullBuku);
        System.out.println("Tahun terbit: " + tahunTerbit);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Stock: " + stock);
    }
}
