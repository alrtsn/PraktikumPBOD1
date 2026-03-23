package LATIHAN;

// File        : Petani.java
// Deskripsi   : Subclass Petani
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 20 Maret 2026

import java.time.LocalDate;
import java.time.Period;

public class Petani extends Manusia {
    private String daerahAsal;
    private static int counterPetani = 0;

    // C = digit ke-12 NIM kamu -> ganti angkanya
    private static final int C = 0;

    public Petani(String nama, LocalDate tglLahir, String alamat,
                  double pendapatan, String daerahAsal) {
        super(nama, tglLahir, alamat, pendapatan, LocalDate.now());
        this.daerahAsal = daerahAsal;
        counterPetani++;
    }

    // konstruktor dengan tgl mulai kerja eksplisit
    public Petani(String nama, LocalDate tglLahir, String alamat,
                  double pendapatan, String daerahAsal, LocalDate tglMulaiKerja) {
        super(nama, tglLahir, alamat, pendapatan, tglMulaiKerja);
        this.daerahAsal = daerahAsal;
        counterPetani++;
    }

    public String getDaerahAsal()           { return daerahAsal; }
    public static int getCounterPetani()    { return counterPetani; }

    // masa kerja = (now - tgl_mulai_kerja) + C bulan
    @Override
    public String hitungMasaKerja() {
        Period masa    = Period.between(tglMulaiKerja, LocalDate.now());
        int totalBulan = masa.getYears() * 12 + masa.getMonths() + C;
        int tahun      = totalBulan / 12;
        int bulan      = totalBulan % 12;
        return tahun + " tahun " + bulan + " bulan";
    }

    // pajak petani = 0
    @Override
    public double hitungPajak() {
        return 0;
    }

    @Override
    public void cetakInfo() {
        System.out.println("===== INFO PETANI =====");
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Daerah Asal   : " + daerahAsal);
        System.out.printf ("Pendapatan    : Rp %.0f%n", pendapatan);
        System.out.println("Tgl Mulai     : " + tglMulaiKerja);
        System.out.println("Masa Kerja    : " + hitungMasaKerja());
        System.out.printf ("Pajak         : Rp %.0f%n", hitungPajak());
    }
}