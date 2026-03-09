/* Nama File  : MataKuliah.java
 * Deskripsi  : Class MataKuliah yang berisi atribut dan method untuk data mata kuliah
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 3 Maret 2026
 */

public class MataKuliah {

    // ATRIBUT
    private String idMatKul;
    private String nama;
    private int sks;

    // KONSTRUKTOR TANPA PARAMETER
    public MataKuliah(){
        this.idMatKul = "";
        this.nama = "";
        this.sks = 0;
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public MataKuliah(String idMatKul, String nama, int sks){
        this.idMatKul = idMatKul;
        this.nama = nama;
        this.sks = sks;
    }

    // SELEKTOR (getter)
    public String getIdMatKul(){
        return idMatKul;
    }

    public String getNama(){
        return nama;
    }

    public int getSKS(){
        return sks;
    }

    // MUTATOR (setter)
    public void setIdMatKul(String idMatKul){
        this.idMatKul = idMatKul;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setSks(int sks){
        this.sks = sks;
    }
}