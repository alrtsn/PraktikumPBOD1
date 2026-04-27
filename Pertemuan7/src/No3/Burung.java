/* Nama File    : Burung.java
 * Deskripsi    : Kelas anak burung
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No3;

public class Burung extends Anabul {

    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak: terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: cuit!");
    }
}

