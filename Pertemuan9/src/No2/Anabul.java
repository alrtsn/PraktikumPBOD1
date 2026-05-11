/* Nama File    : Anabul.java
 * Deskripsi    : Kelas dasar untuk hewan piaraan dengan atribut nama panggilan
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

public class Anabul {
    private String nama;
    private String panggilan; 
    
    // Constructor
    public Anabul(String nama) {
        this.nama = nama;
        this.panggilan = nama;
    }
    
    // Constructor dengan panggilan
    public Anabul(String nama, String panggilan) {
        this.nama = nama;
        this.panggilan = panggilan;
    }
    
    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    // Getter untuk nama
    public String getNama() {
        return this.nama;
    }
    
    // Setter untuk panggilan
    public void setPanggilan(String panggilan) {
        this.panggilan = panggilan;
    }
    
    // Getter untuk panggilan
    public String getPanggilan() {
        return this.panggilan;
    }
    
    public void gerak() {
        // Default gerakan, bisa didefinisikan lebih lanjut di subclass
    }
    
    public void bersuara() {
        // Default suara, bisa didefinisikan lebih lanjut di subclass
    }
    
    // Untuk mengecek apakah Anabul adalah Kucing
    public boolean isKucing() {
        return this instanceof Kucing;
    }
    
    // Untuk mendapatkan bobot (akan dioverride di subclass)
    public double getBobot() {
        return 0;
    }
}
