package P6.bubble_selection_insertion;

public class HotelService10 {
    Hotel10[] rooms = new Hotel10[5];
    int jmlKamar;

    void tambahHotel(Hotel10 h) {
        if (jmlKamar < rooms.length) {
            rooms[jmlKamar] = h;
            jmlKamar++;
        } else {
            System.out.println("Kamar Penuh");
        }
    }

    void tampil() {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println("Nama Hotel : " + rooms[i].nama);
            System.out.println("Kota : " + rooms[i].kota);
            System.out.println("Harga : " + rooms[i].harga);
            System.out.println("Bintang : " + rooms[i].bintang);
            System.out.println();
        }
    }

    void bubbleSortAscHarga() {
        int i = 0;
        while (i < rooms.length - 1) {
            int j = 1;
            while (j < rooms.length - i) {
                if (rooms[j].harga < rooms[j - 1].harga) {
                    Hotel10 temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
                j++;
            }
            i++;
        }
    }

    void selectionSortAscHarga() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMin = i;
            int j = i + 1;
            while (j < rooms.length) {
                if (rooms[idxMin].harga > rooms[j].harga) {
                    idxMin = j;
                }
                j++;
            }
            Hotel10 temp = rooms[idxMin];
            rooms[idxMin] = rooms[i];
            rooms[i] = temp;
        }
    }

    void bubbleSortDescBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            for (int j = 1; j < rooms.length - i; j++) {
                if (rooms[j].bintang > rooms[j - 1].bintang) {
                    Hotel10 temp = rooms[j];
                    rooms[j] = rooms[j - 1];
                    rooms[j - 1] = temp;
                }
            }
        }
    }

    void selectionSortDescBintang() {
        for (int i = 0; i < rooms.length - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < rooms.length; j++) {
                if (rooms[idxMax].bintang < rooms[j].bintang) {
                    idxMax = j;
                }
            }
            Hotel10 temp = rooms[idxMax];
            rooms[idxMax] = rooms[i];
            rooms[i] = temp;
        }
    }
}
