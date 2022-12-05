package controllers;
import views.ProfilPage;
import models.UserModel;

public class ProfilController
{
    private RegistrasiController registrasiC = new RegistrasiController();

    public void toView()
    {
        ProfilPage profilPage = new ProfilPage();
        profilPage.initialPage();
    }

    public void tampilData()
    {
        UserModel.getUserLogged().dataUser();;
    }

    public boolean editNoTelp(String noTelp)
    {
        if(registrasiC.cekNoTelp(noTelp))
        {
            UserModel.updateNoTelp(noTelp);
            return true;
        }

        return false;
    }

    public boolean editEmail(String email)
    {
        if(registrasiC.cekEmail(email))
        {
            UserModel.updateEmail(email);
            return true;
        }

        return false;
    }

    public void editUsername(String username)
    {
        UserModel.updateUsername(username);
    }

    public int editPassword(String passwordLama, String passwordBaru , String konfirmasiPassword)
    {
        if(UserModel.getUserLogged().getPassword().equals(passwordLama))
        {
            if(passwordBaru.equals(konfirmasiPassword))
            {
                UserModel.updatePassword(konfirmasiPassword);
                return 1;
            }
            else
            {
                return 0;
            }
        }
        
        return -1;
    }
}
