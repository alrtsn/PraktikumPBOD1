// File        : Manusia.java
// Deskripsi   : Abstract class Manusia sebagai superclass PNS, Pengusaha, Petani
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 20 Maret 2026

package Latihan;
import java.time.LocalDate;
import java.time.Period;

public abstract class Manusia {
    protected String    nama;
    protected LocalDate tglLahir;
    protected String    alamat;
    protected double    pendapatan;
    protected LocalDate tglMulaiKerja;
    private static int  counterMns = 0;

    // konstruktor
    public Manusia(String nama, LocalDate tglLahir, String alamat,
                   double pendapatan, LocalDate tglMulaiKerja) {
        this.nama          = nama;
        this.tglLahir      = tglLahir;
        this.alamat        = alamat;
        this.pendapatan    = pendapatan;
        this.tglMulaiKerja = tglMulaiKerja;
        counterMns++;
    }

    // konstruktor tanpa alamat
    public Manusia(String nama, LocalDate tglLahir, double pendapatan,
                   LocalDate tglMulaiKerja) {
        this(nama, tglLahir, "", pendapatan, tglMulaiKerja);
    }

    // selektor
    public String getNama() {
        return nama;
    }

    public LocalDate getTglLahir() {
        return tglLahir;
    }

    public String getAlamat () {
        return alamat;
    }

    // mutator
    public void setAlamat(String a) {
        this.alamat = a;
    }

    public double getPendapatan() {
        return pendapatan;
    }

    public LocalDate getTglMulaiKerja() {
        return tglMulaiKerja;
    }

    public static int getCounterMns() {
        return counterMns;
    }

    // abstract method
    public abstract String hitungMasaKerja();
    public abstract double hitungPajak();
    public abstract void cetakInfo();
}
