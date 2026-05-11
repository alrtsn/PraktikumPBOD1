/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing turunan dari Anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

public class Anjing extends Anabul {
    
    public Anjing(String nama) {
        super(nama);
    }
    
    public Anjing(String nama, String panggilan) {
        super(nama, panggilan);
    }
    
    @Override
    public void bersuara() {
        System.out.println("Guk guk!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Anjing sedang berlari.");
    }
}