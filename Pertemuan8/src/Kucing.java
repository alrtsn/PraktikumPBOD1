/* Nama File    : Kucing.java
 * Deskripsi    : Kelas Kucing yang mewarisi Anabul, dilengkapi atribut bobot (kg)
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Kucing extends Anabul {

    private double bobot;

    public Kucing(String nama) {
        super(nama);
        this.bobot = 0.0;
    }

    public Kucing(String nama, double bobot) {
        super(nama);
        this.bobot = bobot;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }

    @Override
    public void gerak() {
        System.out.println("Cara Gerak Kucing : Melata");
    }

    @Override
    public void bersuara() {
        System.out.println("Cara Bersuara Kucing : Meong");
    }
}