/* Nama File    : MainPiaraan.java
 * Deskripsi    : Aplikasi untuk menguji kelas Piaraan
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

public class MainPiaraan {
    public static void main(String[] args) {
        // buat antrean
        Piaraan antrean = new Piaraan();

        // buat objek Anabul (dengan panggilan dan bobot untuk kucing)
        Kucing kucing1 = new Kucing("Milo", 4.5);
        Kucing kucing2 = new Kucing("Oyen", 5.2);
        Anjing anjing1 = new Anjing("Bruno");
        Burung burung1 = new Burung("Rio");

        // enqueue
        antrean.enqueueAnabul(kucing1);
        antrean.enqueueAnabul(anjing1);
        antrean.enqueueAnabul(kucing2);
        antrean.enqueueAnabul(burung1);

        // c. showAnabul
        antrean.showAnabul();

        // b.i getNbelm
        System.out.println(antrean.getNbelm());

        // b.iii isMember
        System.out.println(antrean.isMember(kucing1));

        // b.iv getAnabul
        System.out.println(antrean.getAnabul().getPanggilan());

        // b.v dequeueAnabul
        antrean.dequeueAnabul();
        antrean.showAnabul();

        // d. countKucing
        System.out.println(antrean.countKucing());

        // e. bobotKucing
        System.out.println(antrean.bobotKucing());

        // f. showJenisAnabul
        antrean.showJenisAnabul();
        
        // Tampilkan sisa antrean
        antrean.showAnabul();
        
        // Hitung ulang setelah ada yang keluar
        antrean.countKucing();
        antrean.bobotKucing();
        antrean.showJenisAnabul();
        
        // // Kosongkan semua antrean
        // System.out.println("--- Menghapus Semua Antrean ---");
        // while (antrean.getNbelm() > 0) {
        //     antrean.dequeueAnabul();
        // }
        // antrean.showAnabul();

    }
}

// Renungan
// Koleksi digunakan untuk menyimpan dan mengelola banyak objek dalam satu wadah.
// Koleksi diterapkan menggunakan List pada kelas Teman dan Queue pada kelas Piaraan.
// Operasi seperti add(), remove(), peek(), dan poll() memudahkan
// pengelolaan data tanpa menggunakan array secara manual.
