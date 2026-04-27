/* Nama File    : Mahasiswa.java
 * Deskripsi    : Kelas turunan dari CivitasAkademika yang merepresentasikan mahasiswa dengan atribut NIM dan Dosenwali.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No4;

public class Mahasiswa extends CivitasAkademika {
    private String NIM;
    private Dosen dosenWali;
 
    public Mahasiswa(String nama, String nim) {
        super(nama);
        this.NIM = nim;
        this.dosenWali = null;
    }
 
    public String getNIM() {
        return this.NIM; }
 
    @Override
    public String getNomor() {
        return this.NIM; }
 
    // (i) setWali - mengubah dosen wali
    public void setWali(Dosen dosen) {
        this.dosenWali = dosen;
    }
 
    public Dosen getDosenWali() {
        return this.dosenWali; }
 
    // (j) tampilDataMahasiswa
    public void tampilDataMahasiswa() {
        String namaWali = (this.dosenWali != null) ? this.dosenWali.getNama() : "-";
        System.out.println("  NIM        : " + NIM);
        System.out.println("  Nama       : " + Nama);
        System.out.println("  Dosen Wali : " + namaWali);
    }
}
