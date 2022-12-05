package views;
import java.util.Scanner;

import controllers.RegistrasiController;

public class RegistrasiPage
{
    private Scanner input = new Scanner(System.in);
    private RegistrasiController registrasiC = new RegistrasiController();

    public void initialPage()
    {
        String nama, nik, noTelp, email, username, password, konfirmasiPassword, pin;
        boolean status, cek;

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

            cek = registrasiC.cekRegistrasi(nik, noTelp, email, password, konfirmasiPassword);
            if(!cek)
            {
                gagalRegistrasi();
            }
        }while(!cek);
        
        System.out.print("BUAT PIN            : ");
        pin = input.nextLine();
        nama = nama.toUpperCase();

        System.out.println("---------------------------------------");
        status = registrasiC.prosesRegistrasi(nama, nik, noTelp, email, username, password, pin);
        if(status)
        {
            System.out.println("         AKUN BERHASIL DIBUAT!         ");
        }
    }

    private void gagalRegistrasi()
    {
        if(!registrasiC.bPass)
        {
            System.out.println("   KONFIRMASI PASSWORD TIDAK SESUAI!   ");
        }
        if(!registrasiC.bNik)
        {
            System.out.println("          NIK SUDAH TERDAFTAR          ");
        }
        if(!registrasiC.bNoTelp)
        {
            System.out.println("     NOMOR TELEPON SUDAH TERDAFTAR     ");
        }
        if(!registrasiC.bEmail)
        {
            System.out.println("         EMAIL SUDAH TERDAFTAR         ");
        }
    }
}
