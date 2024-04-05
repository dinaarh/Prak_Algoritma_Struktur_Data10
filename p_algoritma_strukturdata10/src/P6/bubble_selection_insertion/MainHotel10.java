package P6.bubble_selection_insertion;

public class MainHotel10 {
    public static void main(String[] args) {
        HotelService10 hotelService = new HotelService10();

        Hotel10 h1 = new Hotel10("Hotel Grand", "Kota Malang", 230000, (byte) 5);
        Hotel10 h2 = new Hotel10("Hotel Mercure", "Kota Surabaya", 300000, (byte) 3);
        Hotel10 h3 = new Hotel10("Hotel Aria", "Kota Blitar", 150000, (byte) 1);
        Hotel10 h4 = new Hotel10("Hotel Indah", "Kota Batu", 100000, (byte) 4);
        Hotel10 h5 = new Hotel10("Hotel Ragent", "Kota Kediri", 250000, (byte) 2);

        hotelService.tambahHotel(h1);
        hotelService.tambahHotel(h2);
        hotelService.tambahHotel(h3);
        hotelService.tambahHotel(h4);
        hotelService.tambahHotel(h5);

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel sebelum disorting : ");
        hotelService.tampil();
        System.out.println("=========================================================");
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel setelah disorting asc berdasarkan harga : ");
        System.out.println("=========================================================");
        System.out.println("___Bublle Sort___");
        hotelService.bubbleSortAscHarga();
        hotelService.tampil();
        System.out.println();
        System.out.println("___Selection Sort___");
        hotelService.selectionSortAscHarga();
        hotelService.tampil();
        System.out.println("=========================================================");
        System.out.println();

        System.out.println("=========================================================");
        System.out.println("Daftar Hotel setelah disorting desc berdasarkan bintang : ");
        System.out.println("=========================================================");
        System.out.println("___Bublle Sort___");
        hotelService.bubbleSortDescBintang();
        hotelService.tampil();
        System.out.println();
        System.out.println("___Selection Sort___");
        hotelService.selectionSortDescBintang();
        hotelService.tampil();
        System.out.println("=========================================================");
    }
}
