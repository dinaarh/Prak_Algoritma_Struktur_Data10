package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa10 {
    List<Mahasiswa10> mahasiswas = new ArrayList<>();

    public static void main(String[] args) {
        ListMahasiswa10 lm = new ListMahasiswa10();
        Mahasiswa10 m = new Mahasiswa10("201234", "Noureen", "021xx1");
        Mahasiswa10 m1 = new Mahasiswa10("201235", "Akhleema", "021xx2");
        Mahasiswa10 m2 = new Mahasiswa10("201236", "Shannum", "021xx3");
        // menambahkan objek mahasiswa
        lm.tambah(m, m1, m2);
        // menampilkan list mahasiswa
        lm.tampil();
        System.out.println();

        // sorting ascending
        System.out.println("Sorting ascending:");
        lm.sortAscending();
        lm.tampil();
        System.out.println();

        // sorting descending
        System.out.println("Sorting descending:");
        lm.sortDescending();
        lm.tampil();
        System.out.println();

        // update mahasiswa
        lm.update(lm.binarySearch("201235"), new Mahasiswa10("201235", "Akhleema Lela", "021xx2"));
        System.out.println("");
        System.out.println("Update mahasiswa dengan Sorting ascending:");
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

    int binarySearch(String nim) {
        sortAscending();
        Mahasiswa10 key = new Mahasiswa10(nim, "", "");
        return Collections.binarySearch(mahasiswas, key);
    }

    public void sortAscending() {
        Collections.sort(mahasiswas);
    }

    public void sortDescending() {
        Collections.sort(mahasiswas, Comparator.reverseOrder());
    }

    // int linearSearch(String nim) {
    // for (int i = 0; i < mahasiswas.size(); i++) {
    // if (nim.equals(mahasiswas.get(i).nim)) {
    // return i;
    // }
    // }
    // return -1;
    // }
}
