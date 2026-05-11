/* Nama File   : Teman.java
 * Deskripsi    : Kelas untuk mengelola koleksi nama teman menggunakan List
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 5 Mei 2026
 */

package No1;

import java.util.ArrayList;
import java.util.List;

public class Teman {
    // atribut
    private int nbelm;
    private List<String> Lnama;

    // konstruktor
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // a. getNbelm
    public int getNbelm() {
        return nbelm;
    }

    // b. getNama
    public String getNama(int indeks) {
        if (indeks >= 0 && indeks < nbelm) {
            return Lnama.get(indeks);
        } else {
            System.out.println("Indeks tidak valid!");
            return null;
        }
    }

    // c. setNama
    public void setNama(int indeks, String nama) {
        if (indeks >= 0 && indeks < nbelm) {
            Lnama.set(indeks, nama);
        } else {
            System.out.println("Indeks tidak valid!");
        }
    }

    // d. addNama
    public void addNama(String nama) {
        Lnama.add(nama);
        nbelm++;
    }

    // e. delNama
    public void delNama(String nama) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.remove(i);
                nbelm--;
                break;
            }
        }
    }

    // f. isMember
    public boolean isMember(String nama) {
        return Lnama.contains(nama);
    }

    // g. gantiNama
    public void gantiNama(String nama, String namabaru) {
        for (int i = 0; i < nbelm; i++) {
            if (Lnama.get(i).equals(nama)) {
                Lnama.set(i, namabaru);
            }
        }
    }

    // h. countNama
    public int countNama(String nama) {
        int count = 0;
        for (String s : Lnama) {
            if (s.equals(nama)) count++;
        }
        return count;
    }

    // i. showTeman
    public void showTeman() {
        if (nbelm == 0) {
            System.out.println("Tidak ada teman.");
        } else {
            for (int i = 0; i < nbelm; i++) {
                System.out.println((i + 1) + ". " + Lnama.get(i));
            }
        }
    }
    
}