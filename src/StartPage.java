import java.util.Scanner;

public class StartPage
{
    private Scanner input = new Scanner(System.in);

    public StartPage()
    {
        initialPage();
    }

    private void initialPage()
    {
        int menu;
        do
        {
            System.out.println("=======================================");
            System.out.println("           APLIKASI  BANKING           ");
            System.out.println("=======================================");
            System.out.print("""
                    [1] LOGIN
                    [2] DAFTAR REKENING
                    [0] KELUAR
                    """);
            System.out.println("---------------------------------------");
            System.out.print("PILIH MENU : ");
            menu = input.nextInt();
            input.nextLine();
            switchMenu(menu);
        }while(menu != 0);
    }

    private void switchMenu(int menu)
    {
        switch (menu)
        {
            case 1:
                new LoginPage();
                break;
            case 2:
                new RegistrasiPage();
                break;
            case 0:
                break;
        }
    }
}
