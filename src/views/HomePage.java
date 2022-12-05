package views;
import java.util.Scanner;
import controllers.HomeController;

public class HomePage
{
    private Scanner input = new Scanner(System.in);
    private HomeController homeC = new HomeController();

    public void initialPage()
    {
        int menu;

        do
        {
            System.out.println("=======================================");
            System.out.println("            SELAMAT DATANG!            ");
            System.out.println("=======================================");
            System.out.println("""
                                [1] PROFIL
                                [2] SETOR TUNAI
                                [3] TARIK TUNAI
                                [4] TRANSFER
                                [5] RIWAYAT TRANSAKSI
                                [0] LOGOUT""");
            System.out.println("---------------------------------------");
            System.out.print("PILIH MENU : ");
            menu = input.nextInt();
            input.nextLine();
            homeC.switchMenu(menu);
        }while(menu != 0);
    }
}
