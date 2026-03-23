package LATIHAN;

// File        : Pengusaha.java
// Deskripsi   : Subclass Pengusaha
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 20 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class Pengusaha extends Manusia {
    private String noKTP;
    private static int counterPengusaha = 0;

    // B = digit ke-13 NIM kamu -> ganti angkanya
    private static final int B = 0;

    public Pengusaha(String nama, LocalDate tglLahir, String alamat,
                     double pendapatan, String noKTP) {
        super(nama, tglLahir, alamat, pendapatan, LocalDate.now()); // tgl mulai dari input terpisah
        this.noKTP = noKTP;
        counterPengusaha++;
    }

    // konstruktor dengan tgl mulai kerja eksplisit
    public Pengusaha(String nama, LocalDate tglLahir, String alamat,
                     double pendapatan, String noKTP, LocalDate tglMulaiKerja) {
        super(nama, tglLahir, alamat, pendapatan, tglMulaiKerja);
        this.noKTP = noKTP;
        counterPengusaha++;
    }

    public String getNoKTP()                  { return noKTP; }
    public static int getCounterPengusaha()   { return counterPengusaha; }

    // masa kerja = (now - tgl_mulai_kerja) + B bulan
    @Override
    public String hitungMasaKerja() {
        Period masa    = Period.between(tglMulaiKerja, LocalDate.now());
        int totalBulan = masa.getYears() * 12 + masa.getMonths() + B;
        int tahun      = totalBulan / 12;
        int bulan      = totalBulan % 12;
        return tahun + " tahun " + bulan + " bulan";
    }

    // pajak = 15% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.15 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PENGUSAHA =====");
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("Alamat        : " + alamat);
        System.out.println("No KTP        : " + noKTP);
        System.out.printf ("Pendapatan    : Rp %.0f%n", pendapatan);
        System.out.println("Tgl Mulai     : " + tglMulaiKerja);
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.printf ("Pajak         : Rp %.0f%n", hitungPajak());
    }
}
