/* Nama File    : MGaris.java
 * Deskripsi    : berisi program utama untuk menguji dan menjalankan class Garis
 * Pembuat      : Amelia Aristianti
 * Tanggal      : 1 Maret 2026
 */

public class MGaris {
    public static void main(String[] args) {
        Titik t1 = new Titik(3, -1);
        Titik t2 = new Titik(7, 5);
        Garis G1 = new Garis(t1, t2);

        System.out.println("=== Informasi Garis ===");
        System.out.println("Titik A : (3, -1)");
        System.out.println("Titik B : (7, 5)");
        System.out.println("------------------------");
        System.out.println("Panjang Garis: " + G1.getPanjang());
        System.out.println("Gradien Garis: " + G1.getGradien());
        System.out.println("Persamaan Garis: " + G1.getPersamaanGaris());
    }
}