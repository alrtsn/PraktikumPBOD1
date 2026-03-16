/*
 * File        : MBangunDatar.java
 * Deskripsi   : Main class untuk menguji keyword super, override printInfo(),
 *               dan static counter (Bagian 2 & 3)
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */
public class MBangunDatar {
public static void main(String[] args) {

        System.out.println("===== PERSEGI 1 (default constructor) =====");
        Persegi p1 = new Persegi();
        p1.setSisi(5.0);
        p1.setWarna("Merah");
        p1.setBorder("Solid");
        p1.printInfo();

        System.out.println();

        System.out.println("===== PERSEGI 2 (parameterized konstruktor) =====");
        Persegi p2 = new Persegi(8.5, "Biru", "Dashed");
        p2.printInfo();

        System.out.println();

        System.out.println("===== LINGKARAN 1 (default konstruktor) =====");
        Lingkaran l1 = new Lingkaran();
        l1.setJari(7.0);
        l1.setWarna("Hijau");
        l1.setBorder("Dotted");
        l1.printInfo();

        System.out.println();

        System.out.println("===== LINGKARAN 2 (parameterized konstruktor, diameter = 10) =====");
        Lingkaran l2 = new Lingkaran(10.0, "Kuning", "Double");
        l2.printInfo();

        System.out.println();

        System.out.println("===== STATIC COUNTER =====");
        BangunDatar.printCounterBangunDatar();
    }
        /*
         * CATATAN – Overriding static method (Bagian 3):
         * Static method TIDAK dapat di-override secara polimorfis dalam Java.
         * Jika kita mendefinisikan method static dengan nama yang sama di subclass
         * (misal printCounterBangunDatar() di Persegi), hal itu disebut METHOD HIDING,
         * bukan overriding. Pemanggilan tetap ditentukan oleh tipe referensi (compile-time),
         * bukan tipe objek (runtime). Oleh karena itu anotasi @Override tidak berlaku
         * untuk static method.
         */
    
}