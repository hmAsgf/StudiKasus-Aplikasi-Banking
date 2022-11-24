import java.util.Scanner;

public class HomePage
{
    private Scanner input = new Scanner(System.in);

    public HomePage()
    {
        initialPage();
    }

    private void initialPage()
    {
        int menu;

        do
        {
            System.out.println("=======================================");
            System.out.println("HAI, " + Auth.getUserLogged().nama);
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
            switchMenu(menu);
        }while(menu != 0);
    }
    
    private void switchMenu(int menu)
    {
        switch(menu)
        {
            case 1:
                new ProfilPage();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                break;
            default:
                break;
        }
    }
}
