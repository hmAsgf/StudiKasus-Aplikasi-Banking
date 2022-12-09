package controllers;
import entity.TransaksiEntity;
import entity.TransferEntity;
import entity.UserEntity;
import models.UserModel;
import views.TransferPage;

public class TransferController
{
    public UserEntity userAsal = UserModel.getUserLogged();
    public UserEntity userTujuan;

    public void toView()
    {
        TransferPage transferPage = new TransferPage();
        transferPage.initialPage();
    }

    public void transfer(int nominal)
    {
        TransaksiEntity transaksi = new TransferEntity(nominal, userAsal, userTujuan);
        userAsal.getRekening().tambahTransaksi(transaksi);
        userAsal.getRekening().getSaldo().ambilSaldo(nominal);

        userTujuan.getRekening().tambahTransaksi(transaksi);
        userTujuan.getRekening().getSaldo().tambahSaldo(nominal);
    }

    public boolean cekRekening(String rekening)
    {
        userTujuan = UserModel.cariRekening(rekening);

        if(userTujuan != null && userTujuan != UserModel.getUserLogged())
        {
            return true;
        }

        return false;
    }
    
    public boolean cekSaldo(int nominal)
    {
        if(UserModel.getUserLogged().getRekening().getSaldo().getJumlahSaldo() >= nominal)
        {
            transfer(nominal);
            return true;
        }

        return false;
    }
}
