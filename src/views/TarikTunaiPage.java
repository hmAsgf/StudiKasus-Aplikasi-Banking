package views;
import java.util.Scanner;

import controllers.TarikTunaiController;

public class TarikTunaiPage
{
    private Scanner input = new Scanner(System.in);
    private TarikTunaiController tarikTunaiC = new TarikTunaiController();

    public void initialPage()
    {
        int nominal;
        boolean status;

        System.out.println("=======================================");
        System.out.println("         T A R I K   T U N A I         ");
        System.out.println("=======================================");
        System.out.print("MASUKKAN NOMINAL : ");
        nominal = input.nextInt();
        input.nextLine();

        status = tarikTunaiC.cekSaldo(nominal);

        if(!status)
        {
            saldoKurang();
        }
    }

    public void saldoKurang()
    {
        System.out.println("---------------------------------------");
        System.out.println("           SALDO TIDAK CUKUP           ");
    }
}
