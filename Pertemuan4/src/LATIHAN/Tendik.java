/*
 * File        : Tendik.java
 * Deskripsi   : Tenaga Kependidikan, BUP 55 tahun, tunjangan 1% x masa kerja x gaji pokok
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
package LATIHAN;

import java.time.LocalDate;
import java.time.Period;

public class Tendik extends Pegawai {
    private String bidang;
    private static final int BUP = 55;

    public Tendik(String nip, String nama, LocalDate tanggalLahir,
                  LocalDate tmt, double gajiPokok, String bidang) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok);
        this.bidang = bidang;
    }

    public String getBidang() {
        return bidang;
    }

    public void   setBidang(String b) {
        this.bidang = b;
    }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public double getTunjangan() {
        return 0.01 * getMasaKerja().getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period masa   = getMasaKerja();
        int tahun     = masa.getYears();
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        System.out.println("Jabatan        : Tenaga Kependidikan (Tendik)");
        System.out.println("Bidang         : " + bidang);
        System.out.println("Masa Kerja     : " + tahun + " tahun " + masa.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok     : " + formatRupiah(gajiPokok));
        System.out.printf ("Tunjangan      : 1%% x %d x %s = %s%n",
                           tahun, formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}