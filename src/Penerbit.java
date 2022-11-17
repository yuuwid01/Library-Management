
// Class Entitas
public class Penerbit extends Identitas {
    // Atribut Class Penerbit
    String alamatPenerbit;

    // Constructor
    public Penerbit() {
    }

    // Constructor
    public Penerbit(String namaPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = "-";
    }

    // Constructor
    public Penerbit(String namaPenerbit, String alamatPenerbit) {
        this.nama = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    // Method
    public void dataPenerbit() {
        System.out.println("Nama Penerbit   : " + nama);
        System.out.println("Alamat Penerbit : " + alamatPenerbit);
    }
}
