
// Class Entitas
public class Buku {
    // Atribut Class Buku
    int idBuku;
    String judulBuku;
    int jmlHalaman;
    String tanggalTerbit;
    Penulis penulis;
    Penerbit penerbit;

    // Constructor dengan Parameter
    public Buku(int idBuku, String judulBuku,
            int jmlHalaman, String tanggalTerbit,
            Penulis penulis, Penerbit penerbit) {
        this.idBuku = idBuku;
        this.judulBuku = judulBuku;
        this.jmlHalaman = jmlHalaman;
        this.tanggalTerbit = tanggalTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;
    }

    // Method
    public void dataBuku() {
        System.out.println("ID Buku         : " + idBuku);
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Jumlah Halaman  : " + jmlHalaman);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
    }
}
