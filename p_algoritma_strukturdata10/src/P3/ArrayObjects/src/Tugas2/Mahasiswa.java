package P3.ArrayObjects.src.Tugas2;

public class Mahasiswa {
    public String nama;
    public long nim;
    public String jenisKelamin;
    public double ipk;

    public double hitungRata(Mahasiswa[] mhs) {
        double totalIPK = 0;
        for (Mahasiswa mahasiswa : mhs) {
            totalIPK += mahasiswa.ipk;
        }
        return totalIPK / mhs.length;
    }

    public Mahasiswa hitungIpkTertinggi(Mahasiswa[] mhs) {
        Mahasiswa ipkTertinggi = mhs[0];
        for (Mahasiswa mahasiswa : mhs) {
            if (mahasiswa.ipk > ipkTertinggi.ipk) {
                ipkTertinggi = mahasiswa;
            }
        }
        return ipkTertinggi;
    }
}
