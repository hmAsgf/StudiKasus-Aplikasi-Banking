package views;
import java.util.Scanner;
import controllers.ProfilController;

public class ProfilPage
{
    private Scanner input = new Scanner(System.in);
    private ProfilController profilC = new ProfilController();

    public void initialPage()
    {
        int menu;

        do
        {
            System.out.println("=======================================");
            System.out.println("              P R O F I L              ");
            System.out.println("=======================================");
            profilC.tampilData();
            System.out.println("---------------------------------------");
            System.out.println("""
                    [1] UBAH NOMOR TELEPON
                    [2] UBAH EMAIL
                    [3] UBAH USERNAME
                    [4] UBAH PASSWORD
                    [0] KEMBALI""");
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
                ubahNoTelp();
                break;
            case 2:
                ubahEmail();
                break;
            case 3:
                ubahUsername();
                break;
            case 4:
                ubahPassword();
                break;
            default:
                break;
        }
    }

    private void ubahNoTelp()
    {
        String noTelp;

        System.out.println("=======================================");
        System.out.println("           UBAH NOMOR TELEPON          ");
        System.out.println("=======================================");
        System.out.print("NOMOR TELEPON : ");
        noTelp = input.nextLine();
        if(!profilC.editNoTelp(noTelp))
        {
            System.out.println("---------------------------------------");
            System.out.println("     NOMOR TELEPON SUDAH TERDAFTAR     "); 
        }
    }

    private void ubahEmail()
    {
        String email;

        System.out.println("=======================================");
        System.out.println("               UBAH EMAIL              ");
        System.out.println("=======================================");
        System.out.print("EMAIL : ");
        email = input.nextLine();
        if(!profilC.editEmail(email))
        {
            System.out.println("---------------------------------------");
            System.out.println("         EMAIL SUDAH TERDAFTAR         "); 
        }
    }

    private void ubahUsername()
    {
        String username;

        System.out.println("=======================================");
        System.out.println("             UBAH USERNAME             ");
        System.out.println("=======================================");
        System.out.print("USERNAME : ");
        username = input.nextLine();
        profilC.editUsername(username);
    }

    private void ubahPassword()
    {
        String passwordLama, passwordBaru, konfirmasiPassword;
        int cek;

        System.out.println("=======================================");
        System.out.println("             UBAH PASSWORD             ");
        System.out.println("=======================================");
        System.out.print("PASSWORD LAMA       : ");
        passwordLama = input.nextLine();
        System.out.print("PASSWORD BARU       : ");
        passwordBaru = input.nextLine();
        System.out.print("KONFIRMASI PASSWORD : ");
        konfirmasiPassword = input.nextLine();

        cek = profilC.editPassword(passwordLama, passwordBaru, konfirmasiPassword);

        if(cek == 0)
        {
            System.out.println("---------------------------------------");
            System.out.println("   KONFIRMASI PASSWORD TIDAK SESUAI!   ");
        }
        else if(cek == -1)
        {
            System.out.println("---------------------------------------");
            System.out.println("          PASSWORD LAMA SALAH          ");
        }
    }
}
