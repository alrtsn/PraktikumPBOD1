/* Nama File    : Datum.java
 * Deskripsi    : Kelas generik Datum dengan atribut isi bertipe generik
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Datum<G> {

    private G isi;

    public void setIsi(G isibaru) {
        this.isi = isibaru;
    }

    public G getIsi() {
        return this.isi;
    }
}