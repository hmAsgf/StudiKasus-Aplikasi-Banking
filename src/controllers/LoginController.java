package controllers;
import entity.UserEntity;
import views.LoginFrame;
import models.UserModel;

public class LoginController
{

    public void toView()
    {
        new LoginFrame().setVisible(true);
    }

    public boolean prosesLogin(String username, String password)
    {
        for(UserEntity user : UserModel.getUserList())
        {
            if((user.getUsername().equals(username)) && (user.getPassword().equals(password)))
            {
                UserModel.setUserLogged(user);
                return true;
            }
        }

        return false;
    }
}
