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

    public static UserEntity cariRekening(String rekening)
    {
        for(UserEntity user : userList)
        {
            if(user.getRekening().getNoRekening().equals(rekening))
            {
                return user;
            }
        }

        return null;
    }

    public static void buatAkun(UserEntity user, RekeningEntity rekening)
    {
        user.buatRekening(rekening);
        userList.add(user);
    }
}
