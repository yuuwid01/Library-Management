
// Class Entitas
public class Penulis {
    // Atribut Class Penulis
    String namaPenulis;
    String emailPenulis;

    // Constructor
    public Penulis() {
    }

    // Constructor
    public Penulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
        this.emailPenulis = "-";
    }

    // Constructor
    public Penulis(String namaPenulis, String emailPenulis) {
        this.namaPenulis = namaPenulis;
        this.emailPenulis = emailPenulis;
    }

    // Method
    public void dataPenulis() {
        System.out.println("Nama Penulis    : " + namaPenulis);
        System.out.println("Email Penulis   : " + emailPenulis);
    }

}
