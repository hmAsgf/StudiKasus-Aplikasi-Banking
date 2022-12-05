package controllers;
import views.StartPage;

public class StartController
{
    public void toView()
    {
        StartPage startPage = new StartPage();

        startPage.initialPage();
    }


    public void switchMenu(int menu)
    {
        switch (menu)
        {
            case 1:
                LoginController loginC = new LoginController();
                loginC.toView();
                break;
            case 2:
                RegistrasiController registrasiC = new RegistrasiController();
                registrasiC.toView();
                break;
            case 0:
                break;
        }
    }
}
