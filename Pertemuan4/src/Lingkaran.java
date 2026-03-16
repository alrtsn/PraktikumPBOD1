/*
 * Nama File   : Lingkaran.java
 * Deskripsi   : Subclass Lingkaran yang mewarisi BangunDatar
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */

public class Lingkaran extends BangunDatar {
    private double jari;

    public Lingkaran() {
        super();
        setJmlSisi(0);
    }

    // BAGIAN 2 - keyword super:
    // konstruktor nerima diameter terus dibagi 2 buat dapet jari-jari
    // super(0, warna, border) manggil konstruktor BangunDatar berparameter
    public Lingkaran(double diameter, String warna, String border) {
        super(0,warna,border);
        this.jari = diameter / 2;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }

    public double getLuas() {
        return Math.PI * jari * jari;
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    // BAGIAN 3 - override printInfo():
    // sama kayak Persegi, super.printInfo() dipanggil dulu
    // terus ditambahin info khusus Lingkaran
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.printf("Jari-jari   : %.2f%n", jari);
        System.out.printf("Luas        : %.4f%n", getLuas());
        System.out.printf("Keliling    : %.4f%n", getKeliling());
    }
}