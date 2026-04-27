/* Nama File    : Coersion.java
 * Deskripsi    : Program demonstrasi konversi tipe data (casting, parsing, dan konversi ke string).
 * Pembuat      : Amelia Aristianti / 24060124120008
 * Tanggal      : 21 April 2026
 */

package No1;

public class Coersion {
    public static void main(String[] args) {

        // (a)
        int nilaiInt = 65;
        char nilaiChar = (char) nilaiInt;
        double nilaiDouble = (double) nilaiInt;
        System.out.println("int 65 jadi char: " + nilaiChar);
        System.out.println("int 65 jadi double: " + nilaiDouble);
        System.out.println();

        // (b)
        double real = 65.9;
        int kembaliInt = (int) real;
        System.out.println("double 65.9 ke int: " + kembaliInt);
        System.out.println();

        // (c)
        String X = "1234";
        String Y = "5678";
        String S = X + Y;
        Integer Z = Integer.parseInt(X) + Integer.parseInt(Y);
        System.out.println("X = " + X + ", Y = " + Y);
        System.out.println("S (konkatenasi) = " + S);
        System.out.println("Z (penjumlahan) = " + Z);
        System.out.println();

        // (d)
        String P = "12.34";
        String Q = "56.78";
        String R = P + Q;
        Double D = Double.parseDouble(P) + Double.parseDouble(Q);
        System.out.println("P = " + P + ", Q = " + Q);
        System.out.println("R (konkatenasi) = " + R);
        System.out.println("D (penjumlahan) = " + D);
        System.out.println();

        // (e)
        Integer A = Integer.parseInt(S);
        System.out.println("Integer A dari S = " + A);
        System.out.println();

        // (f)
        String T = A.toString();
        System.out.println("String T dari A = " + T);
    }
}