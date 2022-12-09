package views;
import java.util.Scanner;

import controllers.SetorTunaiController;

public class SetorTunaiPage
{
    private Scanner input = new Scanner(System.in);
    SetorTunaiController setorTunaiC = new SetorTunaiController();

    public void initialPage()
    {
        int nominal;

        System.out.println("=======================================");
        System.out.println("         S E T O R   T U N A I         ");
        System.out.println("=======================================");
        System.out.print("MASUKKAN NOMINAL : ");
        nominal = input.nextInt();
        input.nextLine();
        setorTunaiC.setorTunai(nominal);
    }
}
