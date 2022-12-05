package controllers;
import entity.UserEntity;
import views.LoginPage;
import models.UserModel;

public class LoginController
{

    public void toView()
    {
        LoginPage loginPage = new LoginPage();
        loginPage.initialPage();
    }

    public boolean prosesLogin(String username, String password)
    {
        for(UserEntity user : UserModel.getUserList())
        {
            if((user.getUsername().equals(username)) && (user.getPassword().equals(password)))
            {
                UserModel.setUserLogged(user);
                HomeController homeC = new HomeController();
                homeC.toView();
                return true;
            }
        }

        return false;
    }
}
