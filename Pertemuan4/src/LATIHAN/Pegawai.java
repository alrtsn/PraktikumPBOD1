/*
 * File        : Pegawai.java
 * Deskripsi   : Superclass pegawai perguruan tinggi
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
package LATIHAN;

import java.time.LocalDate;
import java.time.Period;

public class Pegawai {
    protected String nip;
    protected String nama;
    protected LocalDate tanggalLahir;
    protected LocalDate tmt;
    protected double gajiPokok;

    private static final String[] NAMA_BULAN = {
        "", "Januari", "Februari", "Maret", "April", "Mei", "Juni",
        "Juli", "Agustus", "September", "Oktober", "November", "Desember"
    };

    public Pegawai(String nip, String nama, LocalDate tanggalLahir,
                   LocalDate tmt, double gajiPokok) {
        this.nip          = nip;
        this.nama         = nama;
        this.tanggalLahir = tanggalLahir;
        this.tmt          = tmt;
        this.gajiPokok    = gajiPokok;
    }

    public Period getMasaKerja() {
        return Period.between(tmt, LocalDate.now());
    }

    public static String formatTanggal(LocalDate tanggal) {
        return tanggal.getDayOfMonth() + " "
             + NAMA_BULAN[tanggal.getMonthValue()] + " "
             + tanggal.getYear();
    }

    public static String formatRupiah(double nominal) {
        long bulat = Math.round(nominal);
        String s = String.valueOf(bulat);
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count > 0 && count % 3 == 0) sb.insert(0, '.');
            sb.insert(0, s.charAt(i));
            count++;
        }
        return "Rp " + sb.toString() + ",00";
    }

    public double getTunjangan() {
        return 0;
    }

    public void printInfo() {
        Period masa = getMasaKerja();
        System.out.println("NIP            : " + nip);
        System.out.println("Nama           : " + nama);
        System.out.println("Tanggal Lahir  : " + formatTanggal(tanggalLahir));
        System.out.println("TMT            : " + formatTanggal(tmt));
        System.out.println("Masa Kerja     : " + masa.getYears() + " tahun "
                                               + masa.getMonths() + " bulan");
        System.out.println("Gaji Pokok     : " + formatRupiah(gajiPokok));
    }
}
