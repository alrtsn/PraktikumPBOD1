/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing turunan dari Anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

public class Kucing extends Anabul {
    private double bobot;
    
    public Kucing(String nama) {
        super(nama);
        this.bobot = 0;
    }
    
    public Kucing(String nama, String panggilan) {
        super(nama, panggilan);
        this.bobot = 0;
    }
    
    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }
    
    public Kucing(String nama, String panggilan, double bobot) {
        super(nama, panggilan);
        this.bobot = bobot;
    }
    
    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
    
    public double getBobot() {
        return this.bobot;
    }
    
    @Override
    public void bersuara() {
        System.out.println("Meong!");
    }
    
    @Override
    public void gerak() {
        System.out.println("Kucing sedang berjalan pelan.");
    }
}