package LATIHAN;

// File        : PNS.java
// Deskripsi   : Subclass PNS
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 20 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class PNS extends Manusia {
    private String nip;
    private static int counterPNS = 0;

    // A = digit ke-14 NIM kamu -> ganti angkanya
    private static final int A = 0;

    // konstruktor lengkap dengan alamat
    // tgl_mulai_kerja diambil dari NIP (format: YYYYMMDD di 8 digit pertama)
    public PNS(String nama, LocalDate tglLahir, String alamat,
               double pendapatan, String nip) {
        super(nama, tglLahir, alamat, pendapatan, parseTglDariNIP(nip));
        this.nip = nip;
        counterPNS++;
    }

    // konstruktor tanpa alamat
    public PNS(String nama, LocalDate tglLahir, double pendapatan, String nip) {
        super(nama, tglLahir, pendapatan, parseTglDariNIP(nip));
        this.nip = nip;
        counterPNS++;
    }

    // ambil tanggal mulai kerja dari 8 digit pertama NIP
    private static LocalDate parseTglDariNIP(String nip) {
        int tahun = Integer.parseInt(nip.substring(0, 4));
        int bulan = Integer.parseInt(nip.substring(4, 6));
        int hari  = Integer.parseInt(nip.substring(6, 8));
        return LocalDate.of(tahun, bulan, hari);
    }

    public String getNip()             { return nip; }
    public static int getCounterPNS()  { return counterPNS; }

    // masa kerja = (now - tgl_mulai_kerja) + A bulan
    @Override
    public String hitungMasaKerja() {
        Period masa      = Period.between(tglMulaiKerja, LocalDate.now());
        int totalBulan   = masa.getYears() * 12 + masa.getMonths() + A;
        int tahun        = totalBulan / 12;
        int bulan        = totalBulan % 12;
        return tahun + " tahun " + bulan + " bulan";
    }

    // pajak = 10% * pendapatan
    @Override
    public double hitungPajak() {
        return 0.10 * pendapatan;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PNS =====");
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("Alamat        : " + alamat);
        System.out.println("NIP           : " + nip);
        System.out.printf ("Pendapatan    : Rp %.0f%n", pendapatan);
        System.out.println("Tgl Mulai     : " + tglMulaiKerja);
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.printf ("Pajak         : Rp %.0f%n", hitungPajak());
    }
}
