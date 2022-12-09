package views;
import java.util.Scanner;
import controllers.VerifPinController;

public class VerifikasiPinPage
{
    private Scanner input = new Scanner(System.in);
    private VerifPinController verifPinC;

    public VerifikasiPinPage(String transaksi)
    {
        verifPinC = new VerifPinController(transaksi);
    }

    public void initialPage()
    {
        String pin;
        int percobaan = 1;
        boolean status;

        do
        {
            System.out.println("=======================================");
            System.out.println("      V E R I F I K A S I   P I N      ");
            System.out.println("=======================================");
            System.out.print("MASUKKAN PIN : ");
            pin = input.nextLine();
            percobaan++;

            status = verifPinC.cekPin(pin);

            if(status)
            {
                verifPinC.switchTransaksi();
                break;
            }
            else
            {
                if(percobaan==4)
                {
                    blokir();
                }
                else
                {
                    pinSalah();
                }
            }
        }while(percobaan<4);
    }

    private void pinSalah()
    {
        System.out.println("---------------------------------------");
        System.out.println("         PIN SALAH, COBA LAGI!         ");
    }

    private void blokir()
    {
        System.out.println("---------------------------------------");
        System.out.println("   SALAH MEMASUKKAN PIN SEBANYAK 3X!   ");
    }
}
