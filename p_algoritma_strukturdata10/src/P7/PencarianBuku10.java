package P7;

public class PencarianBuku10 {
    Buku10 listBuku[] = new Buku10[5];
    int idx;

    void tambahBuku(Buku10 m) {
        if (idx < listBuku.length) {
            listBuku[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil() {
        for (Buku10 m : listBuku) {
            m.tampilDataBuku();
        }
    }

    int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }

    void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + " ditemukan pada indeks" + pos);
        } else {
            System.out.println("data " + x + " tidak ditemukan");
        }
    }

    void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Kode Buku \t  : " + x);
            System.out.println("Judul Buku \t  : " + listBuku[pos].judullBuku);
            System.out.println("Tahun Terbit \t  : " + listBuku[pos].tahunTerbit);
            System.out.println("Pengarang \t  : " + listBuku[pos].pengarang);
            System.out.println("Stock \t\t  : " + listBuku[pos].stock);

        } else {
            System.out.println("data " + x + " tidak ditemukan ");
        }
    }

    public Buku10 FindBuku(int cari) {
        for (int i = 0; i < listBuku.length; i++) {
            if (listBuku[i].kodeBuku == cari) {
                return listBuku[i];
            }
        }
        return listBuku[-1];
    }

    int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (right + left) / 2;
            if (cari == listBuku[mid].kodeBuku) {
                return mid;
            } else if (listBuku[mid].kodeBuku > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}
