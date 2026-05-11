/* Nama File    : Anggora.java
 * Deskripsi    : Kelas Anggora yang mewarisi kelas Kucing (Soal 1b)
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Anggora extends Kucing {

    public Anggora(String nama) {
        super(nama);
    }

    public Anggora(String nama, double bobot) {
        super(nama, bobot);
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Anggora : Melangkah anggun");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Anggora : Meong lembut");
    }
}