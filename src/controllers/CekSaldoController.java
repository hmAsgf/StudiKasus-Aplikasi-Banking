package controllers;

import models.UserModel;
import views.CekSaldoFrame;

public class CekSaldoController
{
    public void toView()
    {
        new CekSaldoFrame().setVisible(true);
    }

    public int getSaldo() {
        return UserModel.getUserLogged().getRekening().getSaldo().getJumlahSaldo();
    }
}
