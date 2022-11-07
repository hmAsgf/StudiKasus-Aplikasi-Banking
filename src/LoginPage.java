import java.util.Scanner;

public class LoginPage
{
    private Scanner input = new Scanner(System.in);

    public LoginPage()
    {
        login();
    }

    private void login()
    {
        String username, password;
        System.out.println("================ LOGIN ================");
        System.out.print("USERNAME : ");
        username = input.nextLine();
        System.out.print("PASSWORD : ");
        password = input.nextLine();

        if(Auth.login(username, password))
        {
            System.out.println("LOGIN BERHASIL...");
        }
        else
        {
            loginGagal();
        }
    }

    private void loginGagal()
    {
        System.out.println("---------------------------------------");
        System.out.println("------------- LOGIN GAGAL -------------");
        System.out.println("     USERNAME ATAU PASSWORD SALAH!     ");
        System.out.println("---------------------------------------");
    }
}
