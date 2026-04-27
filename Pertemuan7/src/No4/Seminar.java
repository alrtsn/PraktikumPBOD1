/* Nama File    : Seminar.java
 * Deskripsi    : Kelas penyelenggara seminar dengan array statis peserta dan method registrasi, hitung peserta, tampil peserta, countMahasiswa.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No4;

public class Seminar {
    private static final int KAPASITAS = 100;

    // (b) Array statis dan atribut banyakpeserta
    private CivitasAkademika[] peserta;
    private int banyakPeserta;

    // Konstruktor : banyakpeserta diinisialisasi 0
    public Seminar() {
        peserta = new CivitasAkademika[KAPASITAS];
        banyakPeserta = 0;
    }

    // (c) countPeserta
    public int countPeserta() {
        return banyakPeserta;
    }

    // (d) registrasi : pengisian selalu kontigu
    public void registrasi(CivitasAkademika ca) {
        if (banyakPeserta < KAPASITAS) {
            peserta[banyakPeserta] = ca;
            banyakPeserta++;
            System.out.println("Berhasil mendaftar: " + ca.getNama()
                    + " [" + ca.getNomor() + "]");
        } else {
            System.out.println("Seminar penuh! " + ca.getNama()
                    + " tidak dapat didaftarkan.");
        }
    }

    // (g) tampilPeserta
    public void tampilPeserta() {
        System.out.println("\n--- Daftar Peserta Seminar ---");
        for (int i = 0; i < banyakPeserta; i++) {
            System.out.println("  " + (i + 1) + ". ["
                    + peserta[i].getNomor() + "] "
                    + peserta[i].getNama());
        }
        System.out.println("Total: " + banyakPeserta + " orang");
    }

    // (h) countMahasiswa : pake instanceof
    public int countMahasiswa() {
        int count = 0;
        for (int i = 0; i < banyakPeserta; i++) {
            if (peserta[i] instanceof Mahasiswa) {
                count++;
            }
        }
        return count;
    }
}
