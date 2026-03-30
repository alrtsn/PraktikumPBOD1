/**
 * File         : AngkaSial.java
 * Deskripsi    : Program penggunaan exception buatan sendiri Pengenalan klausa 'throw' dan 'throws'
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 29 Maret 2026
 */

public class AngkaSial{
    public void cobaAngka (int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka+ " bukan angka sial");
    }
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }
        catch(AngkaSialException ase){
            //method getMessage () telah ada pada kelas "Exception"
            System.out.println (ase.getMessage ());
            System.out.println ("hati-hati memasukkan angka! ! !") ;
        }
    }
}

// JAWABAN PERTANYAAN:

// 1. Apakah baris 12 (System.out.println(angka+" bukan angka sial")) dieksekusi ketika eksepsi terjadi?
// -> tidak dieksekusi. karena waktu angka == 13, program langsung throw exception di baris 10,
// jadi eksekusi method cobaAngka() langsung berhenti di situ. baris 12 gak kesentuh sama sekali.

// 2. Apakah baris 21 (catch block) dieksekusi?
// -> iya dieksekusi. ketika as.cobaAngka(13) di baris 19 lempar exception,
// program langsung loncat ke blok catch di baris 21. makanya baris 20 (as.cobaAngka(12)) juga gak dieksekusi,
// langsung ke catch dan print pesan errornya.

