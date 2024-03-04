package P3.ArrayObjects.src.Tugas1;

public class Bola {
    public double jari;

    public Bola(double r) {
        jari = r;
    }

    public double luasPermukaan() {
        return (4 * Math.PI * jari * jari);
    }

    public double volume() {
        return (4 / 3 * Math.PI * jari * jari * jari);
    }
}
