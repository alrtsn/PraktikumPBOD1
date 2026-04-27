/* Nama File    : Dosen.java
 * Deskripsi    : Kelas turunan dari CivitasAkademika yang merepresentasikan dosen dengan atribut NIP.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No4;

public class Dosen extends CivitasAkademika {
    private String NIP;
 
    public Dosen(String nama, String nip) {
        super(nama);
        this.NIP = nip;
    }
 
    public String getNIP() {
        return this.NIP; }
 
    @Override
    public String getNomor() {
        return this.NIP; }
}

