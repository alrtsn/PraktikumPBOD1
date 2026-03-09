/* Nama File    : Mahasiswa.java
 * Deskipsi     : atribut dan method dalam class Mahasiswa
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 3 Maret 2026
 */

import java.util.ArrayList;

public class Mahasiswa {

    // ATRIBUT
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // KONSTRUKTOR

    // konstruktor tanpa parameter
    public Mahasiswa(){
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // konstruktor dengan parameter
    public Mahasiswa (String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatKul = new ArrayList<>(50);
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    // SELEKTOR (getter)

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getProdi() {
        return prodi;
    }

    public Dosen getDosenWali() {
        return dosenWali;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }

    // MUTATOR (setter)

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setDosenWali(Dosen dosenWali) {
        this.dosenWali = dosenWali;
    }

    public void setKendaraan(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    // METHOD

    // menambahkan mata kuliah ke dalam listMatKul
    public void addMatKul (MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    // menghitung total SKS dari semua mata kuliah yang diambil
    public int getJumlahSKS (){
        int sum = 0;
        for (int i = 0; i < listMatKul.size(); i++){
            sum += listMatKul.get(i).getSKS();
        }
        return sum;
    }

    // menghitung jumlah mata kuliah yang diambil
    public int getJumlahMatKul (){
        return listMatKul.size();
    }

    // menampilkan data singkat mahasiswa
    public void printMhs (){
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);   
    }

    // menampilkan detail mahasiswa beserta daftar mata kuliah
    public void printDetailMhs() {
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);

        System.out.println("Daftar Mata Kuliah:");
        for (int i = 0; i < listMatKul.size(); i++) {
            System.out.println((i+1) + ". " + listMatKul.get(i).getNama());
        }
        System.out.println("Dosen Wali : " + dosenWali.getNama());
        System.out.println("Kendaraan : " + kendaraan.getJenis() + " - " + kendaraan.getNoPlat());
    }
}