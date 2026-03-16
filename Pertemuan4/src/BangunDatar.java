/*
 * Nama File   : BangunDatar.java
 * Deskripsi   : Superclass yang merepresentasikan bangun datar 2D
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 10 Maret 2026
 */

public class BangunDatar {
    private int jmlSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar++;
    }

    public int getJmlSisi() {
        return jmlSisi;
    }

    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    // Static method counter (Bagian 3)
    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // =========================================================
    // JAWABAN BAGIAN 1:
    // konstruktor ini valid ga di Persegi?
    //   this.jmlSisi = 4;
    //   this.warna = warna;
    //   this.border = border;
    //
    // JAWABAN: TIDAK VALID, error compile
    // karena jmlSisi, warna, border disini private
    // -> subclass Persegi ga bisa akses langsung atribut private superclass
    // solusinya pake setter atau super()
    // =========================================================
    //
    // JAWABAN BAGIAN 4:
    // setelah atribut diganti protected, konstruktor tadi valid ga?
    //
    // JAWABAN: VALID
    // karena protected boleh diakses subclass langsung
    // -> Persegi boleh tulis this.jmlSisi, this.warna, this.border langsung
    //
    // ringkasan akses modifier:
    // private   -> kelas sendiri aja
    // default   -> kelas sendiri + package sama
    // protected -> kelas sendiri + subclass + package sama
    // public    -> semua bisa akses
    // =========================================================
    //
    // JAWABAN BAGIAN 5:
    //
    // percobaan 1: tambahin final di kelas -> public final class BangunDatar
    // -> Persegi dan Lingkaran gabisa extends BangunDatar lagi
    // -> error: cannot inherit from final BangunDatar
    //
    // percobaan 2: tambahin final di method -> public final void printInfo()
    // -> printInfo() di Persegi dan Lingkaran gabisa di-override
    // -> error: overridden method is final
    //
    // intinya:
    // final class   -> kelasnya gabisa diwariskan
    // final method  -> methodnya gabisa di-override di subclass
    // =========================================================
}