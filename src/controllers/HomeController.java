package controllers;
import models.UserModel;
import views.HomePage;

public class HomeController
{
    public void toView()
    {
        HomePage homePage = new HomePage();
        homePage.initialPage();
    }
    
    public void switchMenu(int menu)
    {
        switch(menu)
        {
            case 1:
                ProfilController profilC = new ProfilController();
                profilC.toView();
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
                UserModel.setUserLogged(null);
                break;
            default:
                break;
        }
    }
}
