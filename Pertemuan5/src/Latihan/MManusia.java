// File        : MManusia.java
// Deskripsi   : Main class untuk test PNS, Pengusaha, Petani
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 20 Maret 2026

package Latihan;
import java.time.LocalDate;

public class MManusia {
    public static void main(String[] args) {

        // p1 -> NIP 198302032006041002
        // tgl mulai kerja dari NIP: 2006-04-10
        PNS p1 = new PNS(
            "Satriyo",
            LocalDate.of(1983, 2, 3),
            "Jl. Seroja",
            15_000_000,
            "198302032006041002"
        );

        // pe1 -> tgl mulai kerja dari soal: 01-01-2000
        Pengusaha pe1 = new Pengusaha(
            "Adhy",
            LocalDate.of(2000, 1, 1),
            "Jl. Air",
            55_000_000,
            "000-556-773-212-000-5",
            LocalDate.of(2000, 1, 1)
        );

        // pt1 -> tgl mulai kerja dari soal: 09-01-1977
        Petani pt1 = new Petani(
            "Nugraha",
            LocalDate.of(1977, 1, 9),
            "Jl. Bunga 9 Tembalang",
            5_000_000,
            "wonogiri",
            LocalDate.of(1977, 1, 9)
        );

        // p2 -> tanpa alamat, di-set belakangan
        PNS p2 = new PNS(
            "Panji",
            LocalDate.of(1980, 4, 21),
            10_000_000,
            "198004212010041002"
        );
        p2.setAlamat("Jl. Panorama 111 Tembalang");

        System.out.println("Jumlah Manusia    = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS        = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha  = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani     = " + Petani.getCounterPetani());

        System.out.println();

        System.out.printf("Pajak PNS p1        = Rp %.0f%n", p1.hitungPajak());
        System.out.printf("Pajak Pengusaha pe1 = Rp %.0f%n", pe1.hitungPajak());
        System.out.printf("Pajak Petani pt1    = Rp %.0f%n", pt1.hitungPajak());

        System.out.println();

        System.out.println("Masa Kerja p1   = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1  = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1  = " + pt1.hitungMasaKerja());

        System.out.println();

        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
    }
}