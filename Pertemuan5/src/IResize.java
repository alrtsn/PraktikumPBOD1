// File        : IResize.java
// Deskripsi   : Interface untuk objek yang bisa di-resize
// Pembuat     : Amelia Aristianti/24060124120008
// Tanggal     : 18 Maret 2026

public interface IResize {
    // menambah ukuran menjadi 10% lebih besar
    public void zoomIn();

    // mengurangi ukuran menjadi 10% lebih kecil
    public void zoomOut();

    // menskalakan ukuran sesuai dengan input percent yang diberikan
    public void zoom (double percent);

    // --- JAWABAN PERTANYAAN BAGIAN 2 ---
    // keuntungan zoomIn/zoomOut dikemas di interface IResize
    // dibanding dijadikan abstract method di BangunDatar?
    //  ----------------------------------
    // -> kalo di abstract BangunDatar, cuma subclass BangunDatar yang bisa punya fitur resize
    // -> kalo di interface IResize, kelas apapun bisa implement misalnya Garis,
    // Bangun3D, Foto, dll yang ga ada hubungannya sama BangunDatar jg bisa punya fitur resize
    // -> satu kelas juga bisa implement banyak interface sekaligus tapi cuma bisa extends satu class
}