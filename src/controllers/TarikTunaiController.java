package controllers;

import entity.TarikTunaiEntity;
import entity.TransaksiEntity;
import entity.UserEntity;
import models.UserModel;
import views.TarikTunaiFrame;

public class TarikTunaiController
{
    private UserEntity user = UserModel.getUserLogged();

    public void toView()
    {
        new TarikTunaiFrame().setVisible(true);
    }

    public void tarikTunai(int nominal)
    {
        TransaksiEntity transaksi = new TarikTunaiEntity(nominal, user.getRekening().getSaldo().getJumlahSaldo());
        UserModel.getUserLogged().getRekening().tambahTransaksi(transaksi);
        UserModel.getUserLogged().getRekening().getSaldo().ambilSaldo(nominal);
    }

    public boolean cekSaldo(int nominal)
    {
        if(user.getRekening().getSaldo().getJumlahSaldo() >= nominal)
        {
            tarikTunai(nominal);
            return true;
        }

        return false;
    }
}
