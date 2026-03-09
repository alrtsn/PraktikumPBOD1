/* Nama File  : Dosen.java
 * Deskripsi  : Class Dosen yang berisi atribut dan method untuk data dosen
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 3 Maret 2026
 */

public class Dosen {

    // ATRIBUT
    private String nip;
    private String nama;
    private String prodi;

    // KONSTRUKTOR TANPA PARAMETER
    public Dosen(){
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    // SELEKTOR (getter)
    public String getNip(){
        return nip;
    }

    public String getNama(){
        return nama;
    }

    public String getProdi(){
        return prodi;
    }

    // MUTATOR (setter)
    public void setNip(String nip){
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public void setProdi(String prodi){
        this.prodi = prodi;
    }
}