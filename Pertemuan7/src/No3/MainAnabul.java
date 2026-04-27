/* Nama File    : MainAnabul.java
 * Deskripsi    : program main yang mensimulasikan semua bunyi dan gerakan setiap tipe anabul.
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No3;

public class MainAnabul {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kucing");
        Anabul anjing = new Anjing("Anjing");
        Anabul burung = new Burung("Burung");

        System.out.println("=== Simulasi Bunyi dan Gerakan Anabul ===\n");

        kucing.gerak();
        kucing.bersuara();

        System.out.println();

        anjing.gerak();
        anjing.bersuara();

        System.out.println();

        burung.gerak();
        burung.bersuara();
    }
}

