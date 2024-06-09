package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMahasiswa10 {
    List<Mahasiswa10> mahasiswas = new ArrayList<>();

    public static void main(String[] args) {
        ListMahasiswa10 lm = new ListMahasiswa10();
        Mahasiswa10 m = new Mahasiswa10("201234", "Noureen", "021xx1");
        Mahasiswa10 m1 = new Mahasiswa10("201235", "Akhleema", "021xx2");
        Mahasiswa10 m2 = new Mahasiswa10("201236", "Shannum", "021xx3");
        //menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        //menampilkan list mahasiswa
        lm.tampil();
        //update mahasiswa
        lm.update(lm.linearSearch("201235"), new Mahasiswa10("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        lm.tampil();
    }

    public void tambah(Mahasiswa10... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa10 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }
}
