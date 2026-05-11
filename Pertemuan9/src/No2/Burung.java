/* Nama File    : Burung.java
 * Deskripsi    : Kelas Burung turunan dari Anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

public class Burung extends Anabul {
    
    public Burung(String nama) {
        super(nama);
    }
    
    public Burung(String nama, String panggilan) {
        super(nama, panggilan);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Cuit cuit!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Burung sedang terbang.");
    }
}