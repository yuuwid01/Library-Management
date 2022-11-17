
// Class Entitas
public class Buku {
    // Atribut Class Buku
    int idBuku;
    String judulBuku;
    int jmlHalaman;
    String tanggalTerbit;
    Penulis penulis;
    Penerbit penerbit;
    boolean status;

    // Constructor
    public Buku() {
    }

    // Constructor
    public Buku(String judulBuku, int jmlHalaman, String tanggalTerbit, boolean status) {
        idBukuBaru();
        this.judulBuku = judulBuku;
        this.jmlHalaman = jmlHalaman;
        this.tanggalTerbit = tanggalTerbit;
        this.penulis = null;
        this.penerbit = null;
        this.status = status;
    }

    // Constructor dengan Parameter
    public Buku(String judulBuku,
            int jmlHalaman, String tanggalTerbit,
            Penulis penulis, Penerbit penerbit, boolean status) {
        idBukuBaru();
        this.judulBuku = judulBuku;
        this.jmlHalaman = jmlHalaman;
        this.tanggalTerbit = tanggalTerbit;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.status = status;
    }

    private void idBukuBaru() {
        if (Library.bukuList.size() == 0) {
            // Jika ArrayList buku MASIH Kosong,
            // maka atur idBuku menjadi 1
            this.idBuku = 1;
        } else {
            // Jika ArrayList Buku TIDAK Kosong, maka

            // Ambil index Terakhir dalam List
            int indexTerakhirDalamList = Library.bukuList.size() - 1;

            // Ambil Object Buku dalam List berdasarkan indexnya.
            Buku bukuTerakhirDalamList = Library.bukuList.get(indexTerakhirDalamList);

            // Ambil idBuku pada Object Buku terakhir
            int idBukuTerakhir = bukuTerakhirDalamList.idBuku;

            // Id Buku yang baru
            this.idBuku = idBukuTerakhir + 1;
        }
    }

    // Method
    public void dataBuku() {
        System.out.println("ID Buku         : " + idBuku);
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Jumlah Halaman  : " + jmlHalaman);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
    }

    // Setter
    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    // Setter
    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

}
