package models;

import java.util.ArrayList;

import entity.RekeningEntity;
import entity.UserEntity;

public class UserModel
{
    private static ArrayList<UserEntity> userList = new ArrayList<>();
    private static UserEntity userLogged = null;

    public static void initialUser()
    {
        UserEntity user = new UserEntity("ADMIN", "-", "-",
         "-", "admin123", "admin");
        RekeningEntity rekening = new RekeningEntity("0123456789", "123456");

        user.buatRekening(rekening);
        userList.add(user);
    }

    public static ArrayList<UserEntity> getUserList(){
        return userList;
    }

    public static UserEntity getUserLogged() {
        return userLogged;
    }

    public static void setUserLogged(UserEntity userLogged) {
        UserModel.userLogged = userLogged;
    }

    public static void updateNoTelp(String noTelp)
    {
        if(userLogged != null)
        {
            userLogged.setNoTelp(noTelp);
        }
    }

    public static void updateEmail(String email)
    {
        if(userLogged != null)
        {
            userLogged.setEmail(email);
        }
    }

    public static void updateUsername(String username)
    {
        if(userLogged != null)
        {
            userLogged.setUsername(username);
        }
    }

    public static void updatePassword(String password)
    {
        if(userLogged != null)
        {
            userLogged.setPassword(password);
        }
    }

    public static void buatAkun(UserEntity user, RekeningEntity rekening)
    {
        user.buatRekening(rekening);
        userList.add(user);
    }
}
