/**
 * File        : Asersi2.java
 * Deskripsi   : Program untuk demo asersi,yang akan menolak input
 *               jari-jari lingkaran yang bernilai nol
 * Pembuat     : Amelia Aristianti / 24060124120008
 * Tanggal     : 29 Maret 2026
 */

// class Lingkaran
class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

//cclass Asersi2
public class Asersi2{
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari>0):"jari jari tidak boleh nol!!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = "
            +kelilingLingkaran);
    }
}

// PERTANYAAN:
// secara konsep, ada yang kurang tepat pada program Asersi2 di atas. jelaskan!

// JAWABAN:
// Secara konsep, program Asersi2 kurang tepat karena asersi dipakai
// untuk validasi input dari user. Padahal asersi seharusnya dipakai buat
// ngecek kondisi yang memang tidak boleh terjadi saat debugging,
// bukan buat validasi input user. Untuk input user, lebih cocok pakai
// if + exception, soalnya asersi bisa dimatikan saat runtime.