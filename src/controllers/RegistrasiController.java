package controllers;
import models.UserModel;
import views.RegistrasiFrame;
import entity.UserEntity;
import entity.RekeningEntity;
import utils.RandomNumString;

public class RegistrasiController
{
    public boolean bNik, bEmail, bNoTelp, bPass;

    public void toView()
    {
        new RegistrasiFrame().setVisible(true);
    }

    public boolean cekPassword(String pass, String konfPass)
    {
        if(pass.equals(konfPass))
        {
            return true;
        }

        return false;
    }

    public boolean cekNik(String nik)
    {
        for(UserEntity user : UserModel.getUserList())
        {
            if(user.getNik().equals(nik))
            {
                return false;
            }
        }

        return true;
    }

    public boolean cekNoTelp(String noTelp)
    {
        for(UserEntity user : UserModel.getUserList())
        {
            if(user.getNoTelp().equals(noTelp))
            {
                return false;
            }
        }

        return true;
    }

    public boolean cekEmail(String email)
    {
        for(UserEntity user : UserModel.getUserList())
        {
            if(user.getEmail().equals(email))
            {
                return false;
            }
        }

        return true;
    }

    public boolean cekRegistrasi(String nik, String noTelp, String email, String password, String konfirmasiPassword)
    {
        bPass = cekPassword(password, konfirmasiPassword);
        bNik = cekNik(nik);
        bEmail = cekEmail(email);
        bNoTelp = cekNoTelp(noTelp);

        if((bPass) && (bNik) && (bNoTelp) && (bEmail))
        {
            return true;
        }

        return false;
    }

    public boolean prosesRegistrasi(String nama, String nik, String noTelp, String email, String username, String password, String pin)
    {
        if((bNik) && (bNoTelp) && (bEmail))
        {
            UserEntity userBaru = new UserEntity(nama, noTelp, nik, email, password, username);
            RekeningEntity rekeningBaru = new RekeningEntity(RandomNumString.getNumeric(10), pin);
            UserModel.buatAkun(userBaru, rekeningBaru);
            return true;
        }

        return false;
    }
}
