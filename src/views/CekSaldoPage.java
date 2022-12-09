package views;

import controllers.CekSaldoController;

public class CekSaldoPage
{
    private CekSaldoController CekSaldoC = new CekSaldoController();

    public void initialPage()
    {
        System.out.println("=======================================");
        System.out.println("           C E K   S A L D O           ");
        System.out.println("=======================================");
        System.out.println("SALDO : "+CekSaldoC.getSaldo());
    }
}
