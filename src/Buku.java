import enitity.Koleksi;
import enitity.Penerbit;
import enitity.Penulis;

// Class Entitas
public class Buku extends Koleksi {
    // Atribut Class Buku
    private String judulBuku;
    private int jmlHalaman;
    private String tanggalTerbit;
    private Penulis penulis;
    private Penerbit penerbit;

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
            this.idKoleksi = 1;
        } else {
            // Jika ArrayList Buku TIDAK Kosong, maka

            // Ambil index Terakhir dalam List
            int indexTerakhirDalamList = Library.bukuList.size() - 1;

            // Ambil Object Buku dalam List berdasarkan indexnya.
            Buku bukuTerakhirDalamList = Library.bukuList.get(indexTerakhirDalamList);

            // Ambil idBuku pada Object Buku terakhir
            int idBukuTerakhir = bukuTerakhirDalamList.idKoleksi;

            // Id Buku yang baru
            this.idKoleksi = idBukuTerakhir + 1;
        }
    }

    // Method
    public void dataBuku() {
        System.out.println("ID Buku         : " + idKoleksi);
        System.out.println("Judul Buku      : " + judulBuku);
        System.out.println("Jumlah Halaman  : " + jmlHalaman);
        System.out.println("Tanggal Terbit  : " + tanggalTerbit);
    }

    public String getJudulBuku() {
        return judulBuku;
    }

    public void setJudulBuku(String judulBuku) {
        this.judulBuku = judulBuku;
    }

    public int getJmlHalaman() {
        return jmlHalaman;
    }

    public void setJmlHalaman(int jmlHalaman) {
        this.jmlHalaman = jmlHalaman;
    }

    public String getTanggalTerbit() {
        return tanggalTerbit;
    }

    public void setTanggalTerbit(String tanggalTerbit) {
        this.tanggalTerbit = tanggalTerbit;
    }

    public Penulis getPenulis() {
        return penulis;
    }

    public void setPenulis(Penulis penulis) {
        this.penulis = penulis;
    }

    public Penerbit getPenerbit() {
        return penerbit;
    }

    public void setPenerbit(Penerbit penerbit) {
        this.penerbit = penerbit;
    }

}
