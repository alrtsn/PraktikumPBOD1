// File        : IResize.java
// Deskripsi   : Interface untuk objek yang bisa di-resize
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public interface IResize {
    public void zoomIn();
    public void zoomOut();
    public void zoom(double faktor);

    // =========================================================
    // JAWABAN PERTANYAAN BAGIAN 2:
    // keuntungan zoomIn/zoomOut dikemas di interface IResize
    // dibanding dijadikan abstract method di BangunDatar?
    //
    // -> kalo di abstract BangunDatar, cuma subclass BangunDatar
    //    yang bisa punya fitur resize
    // -> kalo di interface IResize, kelas APAPUN bisa implement
    //    misalnya Garis, Bangun3D, Foto, dll yang ga ada hubungannya
    //    sama BangunDatar juga bisa punya fitur resize
    // -> satu kelas juga bisa implement banyak interface sekaligus
    //    tapi cuma bisa extends satu class
    // =========================================================
}