/*  Nama File   : MTitik.java
    Deskripsi   : berisi program utama untuk menguji dan menjalankan class Titik
    Pembuat     : Amelia Aristianti
    Tanggal     : 24 Februari 2026
*/

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); //Membuat objek titik T1 (0,0)
        Titik T2 = new Titik();
        Titik T3 = new Titik();
        Titik T4 = new Titik();

        System.out.println("=== Uji SetAbsis dan SetOrdinat ===");
        T1.setAbsis(3); //mengubah absis T1 dengan nilai 3
        T1.setOrdinat(4); //mengubah ordinat T1 dengan nilai 4
        System.out.println("Koordinat awal T1 : ");
        T1.printTitik(); //mencetak koordinat T1 ke layar

        System.out.println("=== Uji Geser Titik ===");
        T1.geser(3, 4); //menggeser T1 sejauh (3,4)
        System.out.println("Setelah digeser, T1 menjadi : ");
        T1.printTitik(); //menampilkan koordinat T1 setelah digeser

        System.out.println("=== Uji getKuadran ===");
        int kuad = T1.getKuadran(); //mengUjikan kuadran dari titik T1
        System.out.println("Posisi T1 sekarang ada di Kuadran " + kuad);
        
        double jarak1 = T1.getJarakPusat();
        System.out.println("=== Uji getJarakPusat ==="); 
        System.out.println("Jarak T1 terhadap pusat: " + jarak1);

        System.out.println("=== Uji getJarak ===");
        System.out.println("- SetAbsis dan SetOrdinat T2 -");
        T2.setAbsis(5); 
        T2.setOrdinat(6); //mengubah ordinat T1 dengan nilai 4
        System.out.println("Koordinat T2: ");
        T2.printTitik(); 
        double jarak2 = T1.getJarak(T2);
        System.out.println("Jarak antara T1 ke T2: " + jarak2);

        System.out.println("=== Uji refleksiX ===");
        T1.refleksiX();
        System.out.println("T1 setelah refleksi sumbu X : ");
        T1.printTitik();

        System.out.println("=== Uji refleksiY ===");
        T2.refleksiY();
        System.out.println("T2 setelah refleksi sumbu Y : ");
        T2.printTitik();

        System.out.println("=== Uji getRefleksiX ===");
        T3 = T1.getRefleksiX();
        System.out.println("Titik baru (hasil refleksi X dari T1) : ");
        T3.printTitik();

        System.out.println("=== Uji getRefleksiY ===");
        T4 = T2.getRefleksiY();
        System.out.println("Titik baru (hasil refleksi Y dari T2) : ");
        T4.printTitik();

    }
}