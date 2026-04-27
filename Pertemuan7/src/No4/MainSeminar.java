/* Nama File    : MainSeminar.java
 * Deskripsi    : Program utama untuk menguji kelas CivitasAkademika, Dosen, Mahasiswa, dan Seminar.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No4;

public class MainSeminar {
    public static void main(String[] args) {

        // (e) 2 objek Dosen dan 5 objek Mahasiswa
        Dosen d1 = new Dosen("Dr. Aris Munandar", "NIP-001");
        Dosen d2 = new Dosen("Dr. Fitriah",  "NIP-002");

        Mahasiswa mhs1 = new Mahasiswa("Ne-Yo",   "NIM-001");
        Mahasiswa mhs2 = new Mahasiswa("Greg Gonzalez",    "NIM-002");
        Mahasiswa mhs3 = new Mahasiswa("Justin Bieber", "NIM-003");
        Mahasiswa mhs4 = new Mahasiswa("Amel Bieber",  "NIM-004");
        Mahasiswa mhs5 = new Mahasiswa("Sisco",  "NIM-005");

        // (i) setWali untuk tiap mahasiswa
        mhs1.setWali(d1);
        mhs2.setWali(d1);
        mhs3.setWali(d2);
        mhs4.setWali(d2);
        mhs5.setWali(d1);

        // objek Seminar
        Seminar seminar = new Seminar();

        // (f) Registrasi ketujuh peserta
        System.out.println("=== (f) Registrasi Peserta ===");
        seminar.registrasi(d1);
        seminar.registrasi(d2);
        seminar.registrasi(mhs1);
        seminar.registrasi(mhs2);
        seminar.registrasi(mhs3);
        seminar.registrasi(mhs4);
        seminar.registrasi(mhs5);

        // (c) countPeserta
        System.out.println("\n=== (c) Jumlah Peserta ===");
        System.out.println("Total peserta: " + seminar.countPeserta());

        // (g) tampilPeserta
        System.out.println("\n=== (g) Tampil Semua Peserta ===");
        seminar.tampilPeserta();

        // (h) countMahasiswa
        System.out.println("\n=== (h) Jumlah Peserta Mahasiswa ===");
        System.out.println("Jumlah mahasiswa: " + seminar.countMahasiswa());

        // (j) tampilDataMahasiswa
        System.out.println("\n=== (j) Data Mahasiswa ===");
        mhs1.tampilDataMahasiswa();
        System.out.println(); 
        mhs2.tampilDataMahasiswa();
        System.out.println(); 
        mhs3.tampilDataMahasiswa();
        System.out.println();  
        mhs4.tampilDataMahasiswa();
        System.out.println();  
        mhs5.tampilDataMahasiswa();
    }
}