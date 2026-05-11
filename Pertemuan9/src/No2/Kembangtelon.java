/* Nama File    : Kembangtelon.java
 * Deskripsi    : Kelas Kembangtelon yang mewarisi kelas Kucing (Soal 1b)
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

package No2;

public class Kembangtelon extends Kucing {

    public Kembangtelon(String nama) {
        super(nama);
    }

    public Kembangtelon(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kembangtelon : Berlari lincah");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kembangtelon : Meong nyaring");
    }
}