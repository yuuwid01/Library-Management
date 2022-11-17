
// Class Entitas
public class Staff {
    // Atribut Class Staff
    String namaStaff;
    String nik;
    String password;

    // Constructor
    public Staff() {
    }

    // Constructor
    public Staff(String namaStaff, String nik, String password) {
        this.namaStaff = namaStaff;
        this.nik = nik;
        this.password = password;
    }

    // Method
    public void dataStaff() {
        System.out.println("Nama Staff      : " + namaStaff);
        System.out.println("NIK Staff       : " + nik);
        System.out.println("Password        : " + password);
    }
}
