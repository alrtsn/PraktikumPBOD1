// File        : MBangunDatar.java
// Deskripsi   : Main class buat test abstract class dan interface
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public class MBangunDatar {
    public static void main(String[] args) {

        // BangunDatar B1 = new BangunDatar(); -> ERROR, abstract gabisa diinstansiasi

        System.out.println("===== PERSEGI (reference type BangunDatar) =====");
        BangunDatar P1 = new Persegi(10);
        P1.printInfo();

        System.out.println();

        System.out.println("===== PERSEGI (reference type Persegi) =====");
        Persegi P2 = new Persegi(5);
        P2.printInfo();

        System.out.println();

        System.out.println("===== LINGKARAN (reference type BangunDatar) =====");
        BangunDatar L1 = new Lingkaran(7);
        L1.printInfo();

        System.out.println();

        System.out.println("===== LINGKARAN (reference type Lingkaran) =====");
        Lingkaran L2 = new Lingkaran(14);
        L2.printInfo();

        System.out.println();

        // bagian 1 no.5 - cek isEqualLuas dan isEqualKeliling
        System.out.println("===== CEK EQUAL LUAS & KELILING =====");
        System.out.println("Luas P1 == Luas L1 ? " + P1.isEqualLuas(L1));
        System.out.println("Keliling P2 == Keliling L2 ? " + P2.isEqualKeliling(L2));
        System.out.println("Luas P1 == Luas P2 ? " + P1.isEqualLuas(P2));

        System.out.println();

        // bagian 2 - test IResize
        System.out.println("===== IRESIZE - PERSEGI =====");
        System.out.printf("Sisi sebelum zoomIn  : %.2f%n", P2.getSisi());
        P2.zoomIn();
        System.out.printf("Sisi setelah zoomIn  : %.2f%n", P2.getSisi());
        P2.zoomOut();
        System.out.printf("Sisi setelah zoomOut : %.2f%n", P2.getSisi());
        P2.zoom(2.0);
        System.out.printf("Sisi setelah zoom x2 : %.2f%n", P2.getSisi());

        System.out.println();

        System.out.println("===== IRESIZE - LINGKARAN =====");
        System.out.printf("Jari sebelum zoomIn  : %.2f%n", L2.getJari());
        L2.zoomIn();
        System.out.printf("Jari setelah zoomIn  : %.2f%n", L2.getJari());
        L2.zoomOut();
        System.out.printf("Jari setelah zoomOut : %.2f%n", L2.getJari());

        System.out.println();

        BangunDatar.printCounterBangunDatar();
    }
}