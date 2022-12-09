package controllers;
import models.UserModel;
import views.VerifikasiPinPage;

public class VerifPinController
{
    private String transaksi;

    public VerifPinController(String transaksi)
    {
        this.transaksi = transaksi;
    }

    public void toView()
    {
        VerifikasiPinPage verifikasiPinPage = new VerifikasiPinPage(transaksi);
        verifikasiPinPage.initialPage();
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
            SetorTunaiController setorTunaiC = new SetorTunaiController();
            setorTunaiC.toView();
        }
        else if(transaksi.equals("Tarik Tunai"))
        {
            TarikTunaiController tarikTunaiC = new TarikTunaiController();
            tarikTunaiC.toView();
        }
        if(transaksi.equals("Transfer"))
        {
            TransferController transferC = new TransferController();
            transferC.toView();
        }
    }
}
