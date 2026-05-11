/* Nama File   : MainTeman.java
 * Deskripsi    : Aplikasi untuk menguji kelas Teman
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No1;

public class MainTeman {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM KOLEKSI TEMAN ===\n");
        
        // Membuat objek Teman
        Teman daftarTeman = new Teman();
        
        // Menambah nama teman
        System.out.println("1. Menambah nama teman:");
        daftarTeman.addNama("Andi");
        daftarTeman.addNama("Budi");
        daftarTeman.addNama("Citra");
        daftarTeman.addNama("Dewi");
        daftarTeman.addNama("Andi");
        daftarTeman.showTeman();
        
        // Mendapatkan jumlah elemen
        System.out.println("2. getNbelm(): " + daftarTeman.getNbelm() + " elemen\n");
        
        // Mendapatkan nama berdasarkan indeks
        System.out.println("3. getNama(2): " + daftarTeman.getNama(2));
        System.out.println("   getNama(0): " + daftarTeman.getNama(0) + "\n");
        
        // Mengubah nama pada indeks tertentu
        System.out.println("4. setNama(1, 'Bagas'):");
        daftarTeman.setNama(1, "Bagas");
        daftarTeman.showTeman();
        
        // Mengecek apakah nama adalah member
        System.out.println("5. isMember('Citra'): " + daftarTeman.isMember("Citra"));
        System.out.println("   isMember('Eka'): " + daftarTeman.isMember("Eka") + "\n");
        
        // Menghitung jumlah kemunculan nama
        System.out.println("6. countNama('Andi'): " + daftarTeman.countNama("Andi") + " kali\n");
        
        // Mengganti nama
        System.out.println("7. gantiNama('Dewi', 'Diana'):");
        daftarTeman.gantiNama("Dewi", "Diana");
        daftarTeman.showTeman();
        
        // Menghapus nama
        System.out.println("8. delNama('Andi'):");
        daftarTeman.delNama("Andi");
        daftarTeman.showTeman();
        
        // Menghapus nama yang tidak ada
        System.out.println("9. delNama('Zaki'):");
        daftarTeman.delNama("Zaki");
        daftarTeman.showTeman();
    }
}
