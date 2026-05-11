/* Nama File    : Data.java
 * Deskripsi    : Kelas generik Data dengan larik statik 100 elemen generik (Soal 4)
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Data<G> {
    private Object[] ruang;
    private int banyak;
 
    public Data() {
        this.ruang = new Object[100];
        this.banyak = 0;
    }
 
    public void setIsi(int posisi, G objek) {
        if (posisi >= 1 && posisi <= 100) {
            if (ruang[posisi - 1] == null) {
                banyak++;
            }
            ruang[posisi - 1] = objek;
        }
    }
 
    @SuppressWarnings("unchecked")
    public G getIsi(int posisi) {
        if (posisi >= 1 && posisi <= 100) {
            return (G) ruang[posisi - 1];
        }
        return null;
    }
 
    public int getSize() {
        return banyak;
    }
}