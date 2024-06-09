package P16;

public class Mahasiswa10 implements Comparable<Mahasiswa10> {
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
    public int compareTo(Mahasiswa10 other) {
        return this.nim.compareTo(other.nim);
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + "}";
    }
}
