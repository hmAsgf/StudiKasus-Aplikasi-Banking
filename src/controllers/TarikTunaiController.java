package controllers;

import entity.TarikTunaiEntity;
import entity.TransaksiEntity;
import models.UserModel;
import views.TarikTunaiPage;

public class TarikTunaiController
{
    public void toView()
    {
        TarikTunaiPage TarikTunaiPage = new TarikTunaiPage();
        TarikTunaiPage.initialPage();
    }

    public void tarikTunai(int nominal)
    {
        TransaksiEntity transaksi = new TarikTunaiEntity(nominal);
        UserModel.getUserLogged().getRekening().tambahTransaksi(transaksi);
        UserModel.getUserLogged().getRekening().getSaldo().ambilSaldo(nominal);
    }

    public boolean cekSaldo(int nominal)
    {
        if(UserModel.getUserLogged().getRekening().getSaldo().getJumlahSaldo() >= nominal)
        {
            tarikTunai(nominal);
            return true;
        }

        return false;
    }
}
