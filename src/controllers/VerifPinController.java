package controllers;
import models.UserModel;
import views.VerifikasiPinFrame;

public class VerifPinController
{
    private String transaksi;

    public VerifPinController(String transaksi)
    {
        this.transaksi = transaksi;
    }

    public void toView()
    {
        new VerifikasiPinFrame(transaksi).setVisible(true);
    }

    public boolean cekPin(String pin)
    {
        if(UserModel.getUserLogged().getRekening().getPin().equals(pin))
        {
            return true;
        }

        return false;
    }

    public void switchTransaksi()
    {
        if(transaksi.equals("Setor Tunai"))
        {
            new SetorTunaiController().toView();
        }
        else if(transaksi.equals("Tarik Tunai"))
        {
            new TarikTunaiController().toView();
        }
        if(transaksi.equals("Transfer"))
        {
            new TransferController().toView();
        }
    }
}
