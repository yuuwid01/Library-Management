package enitity;

// Class Entitas
public class Staff extends Akun {
    // Atribut Class Staff
    private String namaStaff;

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

    public String getNamaStaff() {
        return namaStaff;
    }

    public void setNamaStaff(String namaStaff) {
        this.namaStaff = namaStaff;
    }

}
