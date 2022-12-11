package enitity;

// Class Entitas
public class Penulis extends Identitas {
    // Atribut Class Penulis
    private String emailPenulis;

    // Constructor
    public Penulis() {
    }

    // Constructor
    public Penulis(String namaPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = "-";
    }

    // Constructor
    public Penulis(String namaPenulis, String emailPenulis) {
        this.nama = namaPenulis;
        this.emailPenulis = emailPenulis;
    }

    // Method
    public void dataPenulis() {
        System.out.println("Nama Penulis    : " + nama);
        System.out.println("Email Penulis   : " + emailPenulis);
    }

    public String getEmailPenulis() {
        return emailPenulis;
    }

    public void setEmailPenulis(String emailPenulis) {
        this.emailPenulis = emailPenulis;
    }

}
