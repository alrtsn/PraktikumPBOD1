/* Nama File    : MainMahasiswa.java
 * Deskripsi    : Program main Mahasiswa
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No2;

public class MainMahasiswa {
    public static void main(String[] args) {
        // c. Konstruktor default
        Mahasiswa m1 = new Mahasiswa();
        System.out.println("Objek m1 (default):");
        m1.display();

        // d. Konstruktor dengan parameter
        Mahasiswa m2 = new Mahasiswa("008", "Amelia", "Informatika");
        System.out.println("Objek m2 (parameter):");
        m2.display();

        // e. Konstruktor cloning
        Mahasiswa m3 = new Mahasiswa(m2);
        System.out.println("Objek m3 (clone dari m2):");
        m3.display();

        // b. Penggunaan semua varian setProgramStudi

        // Varian 1 (tanpa parameter)
        m1.setProgramStudi();
        System.out.println("m1 setelah setProgramStudi():");
        m1.display();

        // Varian 2 (String)
        m1.setProgramStudi("Sistem Informasi");
        System.out.println("m1 setelah setProgramStudi(String):");
        m1.display();

        // Varian 3 (objek Mahasiswa)
        m1.setProgramStudi(m2);
        System.out.println("m1 setelah setProgramStudi(Mahasiswa):");
        m1.display();
    }
}
