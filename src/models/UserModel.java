package models;

import java.util.ArrayList;

import entity.RekeningEntity;
import entity.SetorTunaiEntity;
import entity.TransaksiEntity;
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

        UserEntity user1 = new UserEntity("USER TESTING 1", "123", "123",
         "123", "test1", "test1");
        RekeningEntity rekening1 = new RekeningEntity("9876543210", "123456");

        user.buatRekening(rekening);
        user1.buatRekening(rekening1);

        TransaksiEntity transaksi = new SetorTunaiEntity(1000000, 0);
        transaksi.setTanggalTransaksi("06-01-2003 10:34:12");
        user.getRekening().tambahTransaksi(transaksi);

        userList.add(user);
        userList.add(user1);
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
