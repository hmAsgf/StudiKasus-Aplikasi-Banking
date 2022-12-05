package views;
import java.util.Scanner;

import controllers.StartController;

public class StartPage
{
    private Scanner input = new Scanner(System.in);
    private StartController startC = new StartController();

    public void initialPage()
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
            startC.switchMenu(menu);
        }while(menu != 0);
    }
}
