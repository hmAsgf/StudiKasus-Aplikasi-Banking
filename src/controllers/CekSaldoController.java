package controllers;

import models.UserModel;
import views.CekSaldoPage;

public class CekSaldoController
{
    public void toView()
    {
        CekSaldoPage cekSaldoPage = new CekSaldoPage();
        cekSaldoPage.initialPage();
    }

    public int getSaldo() {
        return UserModel.getUserLogged().getRekening().getSaldo().getJumlahSaldo();
    }
}
