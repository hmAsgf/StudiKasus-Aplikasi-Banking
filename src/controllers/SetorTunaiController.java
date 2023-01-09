package controllers;

import entity.SetorTunaiEntity;
import entity.TransaksiEntity;
import entity.UserEntity;
import models.UserModel;
import views.SetorTunaiFrame;

public class SetorTunaiController
{
    private UserEntity user = UserModel.getUserLogged();

    public void toView()
    {
        new SetorTunaiFrame().setVisible(true);
    }

    public boolean cekPin(String pin)
    {
        if(user.getRekening().getPin().equals(pin))
        {
            return true;
        }

        return false;
    }

    public void setorTunai(int nominal)
    {
        TransaksiEntity transaksi = new SetorTunaiEntity(nominal, user.getRekening().getSaldo().getJumlahSaldo());
        UserModel.getUserLogged().getRekening().tambahTransaksi(transaksi);
        UserModel.getUserLogged().getRekening().getSaldo().tambahSaldo(nominal);
    }
}
