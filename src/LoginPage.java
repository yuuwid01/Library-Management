
import java.util.Scanner;

public class LoginPage {
    private Scanner input = new Scanner(System.in);

    public LoginPage() {
        while (true) {
            login();
        }
    }

    private void login() {
        String nik, password;

        System.out.println("---------------------------------------");
        System.out.println("------------- LOGIN STAFF -------------");
        System.out.println("---------------------------------------");
        System.out.print("NIK       : ");
        nik = input.nextLine();
        System.out.print("Password  : ");
        password = input.nextLine();
        System.out.println("---------------------------------------");

        if (Auth.login(nik, password)) {
            new HomePage();
        } else {
            loginGagal();
        }
    }

    private void loginGagal() {
        System.out.println("---------------------------------------");
        System.out.println("------------- LOGIN GAGAL -------------");
        System.out.println("        NIK atau Password SALAH!       ");
        System.out.println("---------------------------------------");
    }
}
