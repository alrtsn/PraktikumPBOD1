/*
 * File        : MLatihan.java
 * Deskripsi   : Main class untuk menguji DosenTetap, DosenTamu, dan Tendik
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
package LATIHAN;

import java.time.LocalDate;

public class MLatihan {
    public static void main(String[] args) {

        System.out.println("====== DOSEN TETAP =====");
        DosenTetap dt = new DosenTetap(
            "9545647548",
            "78647324",
            "Andi",
            LocalDate.of(1990, 5, 5),
            LocalDate.of(2015, 1, 1),
            5_000_000,
            "Fakultas Sains dan Matematika"
        );
        dt.printInfo();

        System.out.println();

        System.out.println("====== DOSEN TAMU =====");
        DosenTamu dtu = new DosenTamu(
            "8877665544",
            "99887766",
            "Veyoyoy jago banget cuma bisa granger",
            LocalDate.of(1985, 3, 20),
            LocalDate.of(2023, 6, 1),
            4_500_000,
            "Fakultas Teknik",
            LocalDate.of(2026, 12, 31)
        );
        dtu.printInfo();

        System.out.println();

        System.out.println("====== TENAGA PENDIDIKAN (TENDIK) =====");
        Tendik tendik = new Tendik(
            "7766554433",
            "Gojo Satoru",
            LocalDate.of(1988, 7, 15),
            LocalDate.of(2010, 8, 1),
            3_500_000,
            "Akademik"
        );
        tendik.printInfo();
    }
}
