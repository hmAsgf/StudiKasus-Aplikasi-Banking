package controllers;

import java.util.ArrayList;

import entity.SetorTunaiEntity;
import entity.TarikTunaiEntity;
import entity.TransaksiEntity;
import entity.TransferEntity;
import models.UserModel;
import views.RiwayatTransaksiPage;

public class RiwayatTransaksiController
{
    public ArrayList<TransaksiEntity> riwayat = UserModel.getUserLogged().getRekening().getRiwayatTransaksi();

    public void toView()
    {
        RiwayatTransaksiPage riwayatTransaksiPage = new RiwayatTransaksiPage();
        riwayatTransaksiPage.initialPage();
    }

    public void dataTransaksi()
    {
        for(TransaksiEntity transaksi : riwayat)
        {
            if(transaksi instanceof SetorTunaiEntity)
            {
                SetorTunaiEntity setorTunai = (SetorTunaiEntity) transaksi;
                setorTunai.dataTransaksi();
            }
            else if(transaksi instanceof TarikTunaiEntity)
            {
                TarikTunaiEntity tarikTunai = (TarikTunaiEntity) transaksi;
                tarikTunai.dataTransaksi();
            }
            else if(transaksi instanceof TransferEntity)
            {
                TransferEntity transfer = (TransferEntity) transaksi;
                transfer.dataTransfer();
            }
        }
    }
}
