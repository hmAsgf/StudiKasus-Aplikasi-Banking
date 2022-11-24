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
        System.out.println("=======================================");
        System.out.println("               L O G I N               ");
        System.out.println("=======================================");
        System.out.print("USERNAME : ");
        username = input.nextLine();
        System.out.print("PASSWORD : ");
        password = input.nextLine();

        if(Auth.login(username, password))
        {
            new HomePage();
        }
        else
        {
            loginGagal();
        }
    }

    private void loginGagal()
    {
        System.out.println("---------------------------------------");
        System.out.println("     USERNAME ATAU PASSWORD SALAH!     ");
        System.out.println("---------------------------------------");
    }
}
