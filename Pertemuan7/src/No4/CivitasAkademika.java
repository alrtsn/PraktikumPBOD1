/* Nama File    : CivitasAkademika.java
 * Deskripsi    : CivitasAkademika sebagai kelas induk yang menyimpan nama dan method dasar identitas.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No4;

public abstract class CivitasAkademika {
    protected String Nama;
 
    public CivitasAkademika(String nama) {
        this.Nama = nama;
    }
 
    public String getNama() {
        return this.Nama; }
 
    // ntr hapus ini
    // Akan di-override oleh Dosen (NIP) dan Mahasiswa (NIM)
    public abstract String getNomor();
}
