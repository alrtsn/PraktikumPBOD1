// File        : BangunDatar.java
// Deskripsi   : Abstract class bangun datar 2D
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    // konstruktor
    public BangunDatar() {
        counterBangunDatar++;
    }

    // konstruktor dengan parameter
    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna   = warna;
        this.border  = border;
        counterBangunDatar++;
    }

    // selektor 
    public int getJmlSisi() {
        return jmlSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder()  {
        return border;
    }

    // mutator
    public void setJmlSisi(int jmlSisi) {
        this.jmlSisi = jmlSisi;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    // abstract method -> wajib diimplementasi di subclass
    public abstract double getLuas();
    
    public abstract double getKeliling();

    // cek apakah luas sama dengan bangun datar lain (bagian 1 no.4)
    public boolean isEqualLuas(BangunDatar x) {
        return this.getLuas() == x.getLuas();
    }

    // cek apakah keliling sama dengan bangun datar lain (bagian 1 no.4)
    public boolean isEqualKeliling(BangunDatar x) {
        return this.getKeliling() == x.getKeliling();
    }

    public void printInfo() {
        System.out.println("Jumlah sisi : " + jmlSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public static void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + counterBangunDatar);
    }

    // --- JAWABAN BAGIAN 1 NO.3 ---
    // kode mana yang bermasalah?
    //  ----------------------------------
    // BangunDatar B1 = new BangunDatar();
    // -> error, abstract ga bisa dibuat objeknya
    // -> bisa, ini polimorfisme
    // Persegi P2 = new Persegi(5);
    // -> bisa
    // BangunDatar L1 = new Lingkaran(7);
    // -> bisa, polimorfisme
    // Lingkaran L2 = new Lingkaran(14)
    // -> bisa

    // --- JAWABAN BAGIAN 1 NO.5 ---
    // isEqualLuas() bisa buat bandingin objek beda jenis?
    // -> bisa, parameternya bertipe BangunDatar jadi Persegi bisa dibanding sama Lingkaran
    // kalo BangunDatar ga abstract, masih bisa buat isEqualLuas()?
    // -> bisa dibuat, tapi getLuas() di BangunDatar ga punya implementasi yang bener
    //    karena tiap bentuk rumusnya beda-beda
    // kelebihan abstract class:
    // -> subclass dipaksa implementasi getLuas() dan getKeliling()
    //    kalo ga diimplementasi langsung error compile, jadi ga ada yang kelewat
}