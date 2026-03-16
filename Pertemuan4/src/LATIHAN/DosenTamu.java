/*
 * File        : DosenTamu.java
 * Deskripsi   : Dosen tamu, NIDK, tunjangan 2.5% x gaji pokok
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
package LATIHAN;

import java.time.LocalDate;
import java.time.Period;

public class DosenTamu extends Dosen {
    private String nidk;
    private LocalDate tanggalAkhirKontrak;

    public DosenTamu(String nip, String nidk, String nama, LocalDate tanggalLahir,
                     LocalDate tmt, double gajiPokok, String fakultas,
                     LocalDate tanggalAkhirKontrak) {
        super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
        this.nidk                = nidk;
        this.tanggalAkhirKontrak = tanggalAkhirKontrak;
    }

    public String getNidk() {
        return nidk;
    }
    public LocalDate getTanggalAkhirKontrak() {
        return tanggalAkhirKontrak;
    }

    public int getSisaKontrakBulan() {
        Period sisa = Period.between(LocalDate.now(), tanggalAkhirKontrak);
        return sisa.getYears() * 12 + sisa.getMonths();
    }

    @Override
    public double getTunjangan() {
        return 0.025 * gajiPokok;
    }

    @Override
    public void printInfo() {
        Period masa = getMasaKerja();

        System.out.println("NIP            : " + nip);
        System.out.println("NIDK           : " + nidk);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        System.out.println("Jabatan        : Dosen Tamu");
        System.out.println("Fakultas       : " + fakultas);
        System.out.println("Masa Kerja     : " + masa.getYears() + " tahun " + masa.getMonths() + " bulan");
        System.out.println("Akhir Kontrak  : " + formatTanggal(tanggalAkhirKontrak));
        System.out.println("Sisa Kontrak   : " + getSisaKontrakBulan() + " bulan");
        System.out.println("Gaji Pokok     : " + formatRupiah(gajiPokok));
        System.out.printf ("Tunjangan      : 2.5%% x %s = %s%n",
                           formatRupiah(gajiPokok), formatRupiah(getTunjangan()));
    }
}