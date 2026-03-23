// File        : BangunDatar.java
// Deskripsi   : Abstract class bangun datar 2D
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public abstract class BangunDatar {
    protected int jmlSisi;
    protected String warna;
    protected String border;
    private static int counterBangunDatar = 0;

    public BangunDatar() {
        counterBangunDatar++;
    }

    public BangunDatar(int jmlSisi, String warna, String border) {
        this.jmlSisi = jmlSisi;
        this.warna   = warna;
        this.border  = border;
        counterBangunDatar++;
    }

    public int getJmlSisi()    { return jmlSisi; }
    public void setJmlSisi(int jmlSisi) { this.jmlSisi = jmlSisi; }

    public String getWarna()   { return warna; }
    public void setWarna(String warna) { this.warna = warna; }

    public String getBorder()  { return border; }
    public void setBorder(String border) { this.border = border; }

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

    // =========================================================
    // JAWABAN PERTANYAAN BAGIAN 1 NO.3:
    // kode mana yang bermasalah?
    //
    // BangunDatar B1 = new BangunDatar(); -> ERROR
    // karena BangunDatar sudah abstract, gabisa dibuat objeknya langsung
    //
    // BangunDatar P1 = new Persegi(10);   -> OK, polimorfisme
    // Persegi P2     = new Persegi(5);    -> OK
    // BangunDatar L1 = new Lingkaran(7);  -> OK, polimorfisme
    // Lingkaran L2   = new Lingkaran(14); -> OK
    // =========================================================
    //
    // JAWABAN PERTANYAAN BAGIAN 1 NO.5:
    //
    // isEqualLuas() bisa dipakai buat bandingin objek beda jenis?
    // -> BISA, karena parameternya bertipe BangunDatar
    //    jadi Persegi bisa dibanding sama Lingkaran selama punya getLuas()
    //
    // kalo BangunDatar ga dijadikan abstract, bisa ga buat isEqualLuas()?
    // -> BISA dibuat, tapi getLuas() harus ada dulu di BangunDatar
    //    masalahnya tiap bentuk punya rumus luas beda-beda
    //    jadi ga ada implementasi yang bener di BangunDatar
    //
    // kelebihan abstract class vs non-abstract:
    // -> subclass DIPAKSA implementasi getLuas() dan getKeliling()
    //    kalo ga diimplementasi -> error compile, ga bisa jalan
    //    jadi ga ada subclass yang "lupa" bikin rumusnya
    // =========================================================
}