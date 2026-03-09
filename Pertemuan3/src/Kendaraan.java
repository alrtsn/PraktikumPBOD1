/* Nama File  : Kendaraan.java
 * Deskripsi  : Class Kendaraan yang berisi atribut dan method untuk data kendaraan
 * Pembuat    : Amelia Aristianti / 24060124120008
 * Tanggal    : 3 Maret 2026
 */

public class Kendaraan {

    // ATRIBUT
    private String noPlat;
    private String jenis;

    // KONSTRUKTOR TANPA PARAMETER
    public Kendaraan(){
        this.noPlat = "";
        this.jenis = "";
    }

    // KONSTRUKTOR DENGAN PARAMETER
    public Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    // SELEKTOR (getter)
    public String getNoPlat(){
        return noPlat;
    }

    public String getJenis(){
        return jenis;
    }

    // MUTATOR (setter)
    public void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis){
        this.jenis = jenis;
    }
}