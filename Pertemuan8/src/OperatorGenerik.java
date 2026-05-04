/* Nama File    : OperatorGenerik.java
 * Deskripsi    : Kelas dengan prosedur generik Tukar dan fungsi generik Bobot2 (Soal 3)
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class OperatorGenerik<G> {
 
    public void Tukar(Datum<G> a, Datum<G> b) {
        G temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    public double Bobot2(Kucing k1, Kucing k2) {
        return k1.getBobot() + k2.getBobot();
    }
}
 