package views;
import java.util.Scanner;
import controllers.TransferController;

public class TransferPage
{
    private Scanner input = new Scanner(System.in);
    private TransferController transferC = new TransferController();
    private int nominal;

    public void initialPage()
    {
        String noRekening;
        boolean status;

        System.out.println("=======================================");
        System.out.println("            T R A N S F E R            ");
        System.out.println("=======================================");
        System.out.print("NOMOR REKENING TUJUAN : ");
        noRekening = input.nextLine();
        status = transferC.cekRekening(noRekening);

        if(status)
        {
            System.out.print("NOMINAL TRANSFER      : ");
            nominal = input.nextInt();
            if(dataTransfer())
            {
                if(!transferC.cekSaldo(nominal))
                {
                    System.out.println("---------------------------------------");
                    System.out.println("           SALDO TIDAK CUKUP           ");
                }
                else
                {
                    System.out.println("---------------------------------------");
                    System.out.println("           TRANSFER BEHASIL!           ");
                }
            }
        }
        else
        {
            System.out.println("---------------------------------------");
            System.out.println("    NOMOR REKENING TIDAK DITEMUKAN!    ");
        }
    }

    private boolean dataTransfer()
    {
        char jawab;

        System.out.println("---------------------------------------");
        System.out.println("NOMOR REKENING : "+transferC.userTujuan.getRekening().getNoRekening());
        System.out.println("ATAS NAMA      : "+transferC.userTujuan.getNama());
        System.out.println("NOMINAL        : "+nominal);
        System.out.println("---------------------------------------");
        System.out.print("APAKAH SUDAH BENAR (Y/T) : ");
        jawab = input.next().charAt(0);

        if(jawab == 'Y' || jawab == 'y')
        {
            return true;
        }

        System.out.println("---------------------------------------");
        System.out.println("          TRANSFER DIBATALKAN          ");
        return false;
    }
}
