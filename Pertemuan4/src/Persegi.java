/*
 * Nama File   : Persegi.java
 * Deskripsi   : Subclass Persegi yang mewarisi BangunDatar
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi() {
        super();
        setJmlSisi(4);
    }

    // BAGIAN 2 - keyword super:
    // super(4, warna, border) manggil konstruktor BangunDatar yang berparameter
    // super() harus selalu di baris pertama konstruktor
    public Persegi(double sisi, String warna, String border) {
        super(4,warna,border);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public double getLuas() {
        return sisi * sisi;
    }

    public double getKeliling() {
        return 4 * sisi;
    }

    public double getDiagonal() {
        return sisi * Math.sqrt(2);
    }

    // BAGIAN 3 - override printInfo():
    // @Override artinya method ini nulis ulang printInfo() dari BangunDatar
    // super.printInfo() dipanggil dulu buat nampilin info dari BangunDatar
    // terus ditambahin info khusus Persegi dibawahnya
    //
    // BAGIAN 3 - override static method:
    // static method gabisa di-override, namanya method hiding
    // kalo dipaksa pake @Override -> error: method does not override
    // bedanya sama override biasa:
    // override biasa  -> dipanggil berdasarkan tipe objek (runtime)
    // method hiding   -> dipanggil berdasarkan tipe variabel (compile-time)

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Sisi        : " + sisi);
        System.out.printf ("Luas        : %.2f%n", getLuas());
        System.out.printf ("Keliling    : %.2f%n", getKeliling());
        System.out.printf ("Diagonal    : %.4f%n", getDiagonal());
    }
}