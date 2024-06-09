package P16;

public class Mahasiswa10 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa10() {

    }

    public Mahasiswa10(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + "}";
    }
}
