/* Nama File    : Anjing.java
 * Deskripsi    : Kelas Anjing yang mewarisi kelas Anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Anjing extends Anabul {

    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Anjing : Berlari");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anjing : Guk-guk");
    }
}