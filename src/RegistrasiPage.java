import java.util.Scanner;

public class RegistrasiPage
{
    private Scanner input = new Scanner(System.in);

    public RegistrasiPage()
    {
        daftar();
    }

    private void daftar()
    {
        String nama, nik, noTelp, email, username, password;

        System.out.println("====== BUKA REKENING ======");
        System.out.print("NAMA LENGKAP : ");
        nama = input.nextLine();
        System.out.print("NIK          : ");
        nik = input.nextLine();
        System.out.print("NO TELEPON   : ");
        noTelp = input.nextLine();
        System.out.print("EMAIL        : ");
        email = input.nextLine();
        System.out.print("USERNAME     : ");
        username = input.nextLine();
        System.out.print("PASSWORD     : ");
        password = input.nextLine();
        System.out.print("BUAT PIN     : ");
        String pin = input.nextLine();

        nama = nama.toUpperCase();

        if(Auth.registrasi(nama, nik, noTelp, email, username, password, pin))
        {
            System.out.println("AKUN BERHASIL DIBUAT");
        }
        else
        {
            if(!(Auth.cekNik(nik)))
            {
                System.out.println("NIK SUDAH TERDAFTAR!");
            }
            if(!(Auth.cekNoTelp(noTelp)))
            {
                System.out.println("NOMOR TELEPON SUDAH TERDAFTAR!");
            }
            if(!(Auth.cekEmail(email)))
            {
                System.out.println("EMAIL SUDAH TERDAFTAR!");
            }
            System.out.println("DAFTAR GAGAL!");
        }
    }
}
