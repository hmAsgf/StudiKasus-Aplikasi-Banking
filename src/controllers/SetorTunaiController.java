package controllers;

import entity.SetorTunaiEntity;
import entity.TransaksiEntity;
import models.UserModel;
import views.SetorTunaiPage;

public class SetorTunaiController
{
    public void toView()
    {
        SetorTunaiPage setorTunaiPage = new SetorTunaiPage();
        setorTunaiPage.initialPage();
    }

    public boolean cekPin(String pin)
    {
        if(UserModel.getUserLogged().getRekening().getPin().equals(pin))
        {
            return true;
        }

        return false;
    }

    public void setorTunai(int nominal)
    {
        TransaksiEntity transaksi = new SetorTunaiEntity(nominal);
        UserModel.getUserLogged().getRekening().tambahTransaksi(transaksi);
        UserModel.getUserLogged().getRekening().getSaldo().tambahSaldo(nominal);
    }
}
