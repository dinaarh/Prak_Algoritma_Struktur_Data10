package P8;

public class Gudang10 {
    Barang10[] tumpukan;
    int size;
    int top;

    public Gudang10(int kapasitas) {
        size = kapasitas;
        tumpukan = new Barang10[size];
        top = -1;
    }

    public boolean cekKosong() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean cekPenuh() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    // Tambah Barang == push
    public void tambahBarang(Barang10 brg) {
        if (!cekPenuh()) {
            top++;
            tumpukan[top] = brg;
            System.out.println("Barang " + brg.nama + " berhasil ditambahkan ke Gudang.");
        } else {
            System.out.println("Gagal! Tumpukan Barang di Gudang sudah penuh");
        }
    }

    // Ambil barang == pengambilan/ pengurangan barang == pop
    public Barang10 ambilBarang() {
        if (!cekKosong()) {
            Barang10 delete = tumpukan[top];
            top--;
            System.out.println("Barang " + delete.nama + " diambil dari Gudang");
            System.out.println("Kode unik dalam biner: " + konversiDesimalKeBiner(delete.kode));
            return delete;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    // Lihat Barang Teratas == Pengecekan tumpukan Barang == peek
    public Barang10 lihatBarangTeratas() {
        if (!cekKosong()) {
            Barang10 barangTeratas = tumpukan[top];
            System.out.println("Barang Teratas : " + barangTeratas.nama);
            return barangTeratas;
        } else {
            System.out.println("Tumpukan Barang Kosong");
            return null;
        }
    }

    public void tampilkanBarang() {
        if (!cekKosong()) {
            System.out.println("Rincian tumpukan Barang di Gudang : ");
            for (int i = top; i >= 0; i--) {
                System.out.printf("Kode %d : %s (Kategori %s)\n", tumpukan[i].kode, tumpukan[i].nama,
                        tumpukan[i].kategori);
            }
        } else {
            System.out.println("Tumpukan Barang Kosong");
        }
    }

    public String konversiDesimalKeBiner(int kode) {
        StackKonversi10 stack = new StackKonversi10();
        while (kode > 0) {
            int sisa = kode % 2;
            stack.push(sisa);
            kode = kode / 2;
        }

        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
