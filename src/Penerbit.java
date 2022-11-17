
// Class Entitas
public class Penerbit {
    // Atribut Class Penerbit
    String namaPenerbit;
    String alamatPenerbit;

    // Constructor
    public Penerbit() {
    }

    // Constructor
    public Penerbit(String namaPenerbit) {
        this.namaPenerbit = namaPenerbit;
        this.alamatPenerbit = "-";
    }

    // Constructor
    public Penerbit(String namaPenerbit, String alamatPenerbit) {
        this.namaPenerbit = namaPenerbit;
        this.alamatPenerbit = alamatPenerbit;
    }

    // Method
    public void dataPenerbit() {
        System.out.println("Nama Penerbit   : " + namaPenerbit);
        System.out.println("Alamat Penerbit : " + alamatPenerbit);
    }
}
