// File        : Persegi.java
// Deskripsi   : Subclass Persegi, extends BangunDatar, implements IResize
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public class Persegi extends BangunDatar implements IResize {
    private double sisi;

    // konstruktor
    public Persegi() {
        super();
        setJmlSisi(4);
    }

    // konstruktor dengan parameter sisi
    public Persegi(double sisi) {
        super();
        setJmlSisi(4);
        this.sisi = sisi;
    }

    // konstruktor dengan parameter sisi, warna, border
    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // selektor
    public double getSisi() {
        return sisi;
    }

    // mutator
    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double getLuas() {
        return sisi * sisi;
    }

    @Override
    public double getKeliling() {
        return 4 * sisi;
    }

    // method tambahan
    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // implementasi IResize
    @Override
    public void zoomIn() {
        sisi = sisi * 1.1;
    }

    @Override
    public void zoomOut() {
        sisi = sisi * 0.9;
    }

    @Override
    public void zoom(double percent) {
        sisi = sisi * percent/100;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.printf ("Luas        : %.2f%n", getLuas());
        System.out.printf ("Keliling    : %.2f%n", getKeliling());
        System.out.printf ("Diagonal    : %.4f%n", getDiagonal());
    }
}