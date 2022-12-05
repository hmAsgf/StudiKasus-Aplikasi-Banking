package views;
import java.util.Scanner;
import controllers.LoginController;

public class LoginPage
{
    private Scanner input = new Scanner(System.in);
    private LoginController loginC = new LoginController();

    public void initialPage()
    {
        String username, password;
        boolean status;

        System.out.println("=======================================");
        System.out.println("               L O G I N               ");
        System.out.println("=======================================");
        System.out.print("USERNAME : ");
        username = input.nextLine();
        System.out.print("PASSWORD : ");
        password = input.nextLine();

        status = loginC.prosesLogin(username, password);

        if(!status)
        {
            loginGagal();;
        }
    }

    private void loginGagal()
    {
        System.out.println("---------------------------------------");
        System.out.println("     USERNAME ATAU PASSWORD SALAH!     ");
        System.out.println("---------------------------------------");
    }
}
