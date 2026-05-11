/* Nama File   : Piaraan.java
 * Deskripsi    : Kelas koleksi antrean untuk objek Anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No2;

import java.util.LinkedList;
import java.util.Queue;

public class Piaraan {
    private int nbelm;
    private Queue<Anabul> Lanabul;

    public Piaraan() {
        Lanabul = new LinkedList<>();
        nbelm = 0;
    }

    public int getNbelm() {
        return nbelm;
    }

    public void enqueueAnabul(Anabul anabul) {
        Lanabul.add(anabul);
        nbelm++;
    }

    public boolean isMember(Anabul anabul) {
        return Lanabul.contains(anabul);
    }

    public Anabul getAnabul() {
        return Lanabul.peek();
    }

    public Anabul dequeueAnabul() {
        Anabul a = Lanabul.poll();
        if (a != null) nbelm--;
        return a;
    }

    public void showAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getPanggilan());
        }
    }

    public int countKucing() {
        int count = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) count++;
        }
        return count;
    }

    public double bobotKucing() {
        double total = 0;
        for (Anabul a : Lanabul) {
            if (a instanceof Kucing) {
                total += ((Kucing) a).getBobot();
            }
        }
        return total;
    }

    public void showJenisAnabul() {
        for (Anabul a : Lanabul) {
            System.out.println(a.getPanggilan() + " : " + a.getClass().getSimpleName());
        }
    }
}