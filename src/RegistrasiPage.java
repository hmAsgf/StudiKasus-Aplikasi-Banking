import java.util.Scanner;

public class RegistrasiPage
{
    private Scanner input = new Scanner(System.in);

    public RegistrasiPage()
    {
        initialPage();
    }

    private void initialPage()
    {
        String nama, nik, noTelp, email, username, password, konfirmasiPassword, pin;

        do
        {
            System.out.println("=======================================");
            System.out.println("             BUKA REKENING             ");
            System.out.println("=======================================");
            System.out.print("NAMA LENGKAP        : ");
            nama = input.nextLine();
            System.out.print("NIK                 : ");
            nik = input.nextLine();
            System.out.print("NOMOR TELEPON       : ");
            noTelp = input.nextLine();
            System.out.print("EMAIL               : ");
            email = input.nextLine();
            System.out.print("USERNAME            : ");
            username = input.nextLine();
            System.out.print("PASSWORD            : ");
            password = input.nextLine();
            System.out.print("KONFIRMASI PASSWORD : ");
            konfirmasiPassword = input.nextLine();
            System.out.println("---------------------------------------");
        }while(cekRegistrasi(nik, noTelp, email, password, konfirmasiPassword));
        
        System.out.print("BUAT PIN            : ");
        pin = input.nextLine();
        nama = nama.toUpperCase();
        registrasi(nama, nik, noTelp, email, username, password, pin);
    }

    private boolean cekPassword(String pass, String konfPass)
    {
        if(pass.equals(konfPass))
        {
            return false;
        }
        else
        {
            System.out.println("   KONFIRMASI PASSWORD TIDAK SESUAI!   ");
            return true;
        }
    }

    private boolean cekRegistrasi(String nik, String noTelp, String email, String password, String konfirmasiPassword)
    {
        boolean pass = cekPassword(password, konfirmasiPassword);
        boolean b_nik = false;
        boolean b_noTelp = false;
        boolean b_email = false;

        if(!(Auth.cekNik(nik)))
        {
            System.out.println("          NIK SUDAH TERDAFTAR          ");
            b_nik = true;
        }
        if(!(Auth.cekNoTelp(noTelp)))
        {
            b_noTelp = true;
            System.out.println("     NOMOR TELEPON SUDAH TERDAFTAR     ");
        }
        if(!(Auth.cekEmail(email)))
        {
            b_email = true;
            System.out.println("         EMAIL SUDAH TERDAFTAR         ");
        }

        if((pass) || (b_nik) || (b_noTelp) || (b_email))
        {
            System.out.println("---------------------------------------");
            return true;
        }

        return false;
    }

    private void registrasi(String nama, String nik, String noTelp, String email, String username, String password, String pin)
    {
        System.out.println("---------------------------------------");
        if(Auth.registrasi(nama, nik, noTelp, email, username, password, pin))
        {
            System.out.println("         AKUN BERHASIL DIBUAT!         ");
        }
        System.out.println("---------------------------------------");
    }
}
