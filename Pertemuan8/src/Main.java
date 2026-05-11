/* Nama File    : Main.java
 * Deskripsi    : Aplikasi utama untuk menguji semua kelas generik dan anabul
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 27 April 2026
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("========== SOAL 1 & 2 ==========");

        Anjing anjing1 = new Anjing("Buddy");
        Kucing kucing1 = new Kucing("Tom", 3.5);

        Datum<Anjing> datumAnjing = new Datum<>();
        Datum<Kucing> datumKucing = new Datum<>();

        datumAnjing.setIsi(anjing1);
        datumKucing.setIsi(kucing1);

        System.out.println("Isi datumAnjing: " + datumAnjing.getIsi().getNama());
        System.out.println("Isi datumKucing: " + datumKucing.getIsi().getNama());

        System.out.println("\nGerak dan suara dari datumAnjing:");
        datumAnjing.getIsi().gerak();
        datumAnjing.getIsi().bersuara();

        System.out.println("\nGerak dan suara dari datumKucing:");
        datumKucing.getIsi().gerak();
        datumKucing.getIsi().bersuara();



        System.out.println("\n========== SOAL 3A & 3B ==========");

        // Tukar integer
        Datum<Integer> int1 = new Datum<>();
        Datum<Integer> int2 = new Datum<>();
        int1.setIsi(3);
        int2.setIsi(6);

        System.out.println("Sebelum tukar: int1 = " + int1.getIsi() + ", int2 = " + int2.getIsi());
        OperatorGenerik op = new OperatorGenerik();
        op.Tukar(int1, int2);
        System.out.println("Setelah tukar: int1 = " + int1.getIsi() + ", int2 = " + int2.getIsi());

        // Tukar string
        Datum<String> str1 = new Datum<>();
        Datum<String> str2 = new Datum<>();
        str1.setIsi("Halo");
        str2.setIsi("Dunia");

        System.out.println("\nSebelum tukar: str1 = " + str1.getIsi() + ", str2 = " + str2.getIsi());
        op.Tukar(str1, str2);
        System.out.println("Setelah tukar: str1 = " + str1.getIsi() + ", str2 = " + str2.getIsi());

        // Tukar sesama keluarga Anabul
        Datum<Anjing> anjingDatum1 = new Datum<>();
        Datum<Anjing> anjingDatum2 = new Datum<>();
        Anjing anjing2 = new Anjing("Rex");
        Anjing anjing3 = new Anjing("Bobby");
        anjingDatum1.setIsi(anjing2);
        anjingDatum2.setIsi(anjing3);

        System.out.println("\nSebelum tukar: anjingDatum1 = " + anjingDatum1.getIsi().getNama() +
                ", anjingDatum2 = " + anjingDatum2.getIsi().getNama());
        op.Tukar(anjingDatum1, anjingDatum2);
        System.out.println("Setelah tukar: anjingDatum1 = " + anjingDatum1.getIsi().getNama() +
                ", anjingDatum2 = " + anjingDatum2.getIsi().getNama());

        System.out.println("\n========== SOAL 3C ==========");
        // fungsi Bobot2 buat jumlahin bobot 2 kucing
        Anggora anggora = new Anggora("Molly", 4.2);
        Kembangtelon kembangtelon = new Kembangtelon("Luna", 3.7);
        Kucing kucingBiasa = new Kucing("Milo", 5.0);

        double totalBobot = op.Bobot2(anggora, kembangtelon);
        System.out.println("Bobot Anggora + Kembangtelon = " + anggora.getBobot() + " + " +
                kembangtelon.getBobot() + " = " + totalBobot + " kg");

        totalBobot = op.Bobot2(kucingBiasa, anggora);
        System.out.println("Bobot Kucing biasa + Anggora = " + kucingBiasa.getBobot() + " + " +
                anggora.getBobot() + " = " + totalBobot + " kg");




        System.out.println("\n========== SOAL 4 ==========");
        // 4a : buat data generik 
        Data<Anabul> dataAnabul = new Data<>();

        // 4b : setIsi
        Burung burung = new Burung("Pipi");
        Anjing anjing4 = new Anjing("Rocky");

        dataAnabul.setIsi(1, anggora);
        dataAnabul.setIsi(2, kembangtelon);
        dataAnabul.setIsi(3, burung);
        dataAnabul.setIsi(4, anjing4);

        // 4c : getIsi
        System.out.println("Isi posisi 1: " + dataAnabul.getIsi(1).getNama());
        System.out.println("Isi posisi 2: " + dataAnabul.getIsi(2).getNama());
        System.out.println("Isi posisi 3: " + dataAnabul.getIsi(3).getNama());
        System.out.println("Isi posisi 4: " + dataAnabul.getIsi(4).getNama());

        System.out.println("\nGerak dari setiap anabul dalam data:");
        for (int i = 1; i <= dataAnabul.getSize(); i++) {
            System.out.print(dataAnabul.getIsi(i).getNama() + " -> ");
            dataAnabul.getIsi(i).gerak();
        }

        // 4d : getSize
        System.out.println("\nJumlah elemen efektif dalam dataAnabul: " + dataAnabul.getSize());


        /*
        RENUNGAN:
        Konsep Generik memungkinkan kita membuat kelas atau method yang bisa bekerja
        dengan berbagai tipe data tanpa harus mengulang kode. Dengan generik,
        tipe data diperiksa saat kompilasi sehingga lebih aman daripada
        menggunakan Object. Contohnya kelas Datum dan Data bisa dipakai untuk
        tipe apapun ]tanpa perlu membuat kelas terpisah untuk setiap tipe data.
        */
    }
}