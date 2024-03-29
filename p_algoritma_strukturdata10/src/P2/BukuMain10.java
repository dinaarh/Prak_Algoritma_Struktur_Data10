package P2;

public class BukuMain10 {
    public static void main(String[] args) {
        Buku10 bk1 = new Buku10();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denanda Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();
        System.out.println("Harga total terjual: " + bk1.hitungHargaTotal(5));
        System.out.println("Diskon: " + bk1.hitungDiskon(bk1.hitungHargaTotal(5)));
        System.out.println("Harga yang dibayar: "
                + bk1.hitungHargaBayar(bk1.hitungHargaTotal(5), bk1.hitungDiskon(bk1.hitungHargaTotal(5))));
        System.out.println();

        Buku10 bk2 = new Buku10("Self Reward", "Maheera Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();
        System.out.println(bk2.hitungHargaTotal(11));
        System.out.println();

        Buku10 bukuDina = new Buku10("inspirasi", "dinaa", 112, 22, 56000);
        bukuDina.terjual(7);
        bukuDina.tampilInformasi();
        System.out.println("Harga total terjual: " + bukuDina.hitungHargaTotal(7));
        System.out.println("Diskon: " + bukuDina.hitungDiskon(bukuDina.hitungHargaTotal(7)));
        System.out.println("Harga yang dibayar: "
                + bukuDina.hitungHargaBayar(bukuDina.hitungHargaTotal(7),
                        bukuDina.hitungDiskon(bukuDina.hitungHargaTotal(7))));
    }
}
