/*
 * File        : DosenTetap.java
 * Deskripsi   : Dosen tetap, BUP 65 tahun, tunjangan 2% x masa kerja x gaji pokok
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
package LATIHAN;


import java.time.LocalDate;
import java.time.Period;

public class DosenTetap extends Dosen {
    private String nidn;
    private static final int BUP = 65;

    public DosenTetap(String nip, String nidn, String nama, LocalDate tanggalLahir,
                      LocalDate tmt, double gajiPokok, String fakultas) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidn = nidn;
    }

    public String getNidn() { return nidn; }

    public LocalDate getTanggalPensiun() {
        return tanggalLahir.plusYears(BUP).withDayOfMonth(1).plusMonths(1);
    }

    @Override
    public double getTunjangan() {
        return 0.02 * getMasaKerja().getYears() * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period masa = getMasaKerja();
        int tahun   = masa.getYears();
        System.out.println("NIP            : " + nip);
        System.out.println("NIDN           : " + nidn);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        System.out.println("Jabatan        : Dosen Tetap");
        System.out.println("Fakultas       : " + fakultas);
        System.out.println("Masa Kerja     : " + tahun + " tahun " + masa.getMonths() + " bulan");
        System.out.println("Tanggal Pensiun: " + formatTanggal(getTanggalPensiun()));
        System.out.println("Gaji Pokok     : " + formatRupiah(gajiPokok));
        System.out.printf ("Tunjangan      : 2%% x %d x %s = %s%n",
                           tahun, formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}
