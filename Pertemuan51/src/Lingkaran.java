// File        : Lingkaran.java
// Deskripsi   : Subclass Lingkaran, extends BangunDatar, implements IResize
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public class Lingkaran extends BangunDatar implements IResize {
    private double jari;

    public Lingkaran() {
        super();
        setJmlSisi(0);
    }

    public Lingkaran(double jari) {
        super();
        setJmlSisi(0);
        this.jari = jari;
    }

    public Lingkaran(double diameter, String warna, String border) {
        super(0, warna, border);
        this.jari = diameter / 2;
    }

    public double getJari()          { return jari; }
    public void setJari(double jari) { this.jari = jari; }

    @Override
    public double getLuas()     { return Math.PI * jari * jari; }

    @Override
    public double getKeliling() { return 2 * Math.PI * jari; }

    // implementasi IResize
    @Override
    public void zoomIn() {
        jari = jari * 1.1;
    }

    @Override
    public void zoomOut() {
        jari = jari * 0.9;
    }

    @Override
    public void zoom(double faktor) {
        jari = jari * faktor;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Jari-jari   : %.2f%n", jari);
        System.out.printf("Luas        : %.4f%n", getLuas());
        System.out.printf("Keliling    : %.4f%n", getKeliling());
    }
}