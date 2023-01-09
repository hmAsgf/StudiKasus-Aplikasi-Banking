package controllers;
import entity.TransaksiEntity;
import entity.TransferEntity;
import entity.UserEntity;
import models.UserModel;
import views.TransferFrame;

public class TransferController
{
    public UserEntity userAsal = UserModel.getUserLogged();
    public UserEntity userTujuan;

    public void toView()
    {
        new TransferFrame().setVisible(true);
    }

    public UserEntity getUserTujuan() {
        return userTujuan;
    }

    public void transfer(int nominal)
    {
        TransaksiEntity transaksiAsal = new TransferEntity(nominal, userAsal, userTujuan, userAsal.getRekening().getSaldo().getJumlahSaldo());
        TransaksiEntity transaksiTujuan = new TransferEntity(nominal, userAsal, userTujuan, userTujuan.getRekening().getSaldo().getJumlahSaldo());
        
        String rekening = userTujuan.getRekening().getNoRekening();
        String nama = userTujuan.getNama();
    
        transaksiAsal.incJenisTransaksi("/");
        transaksiAsal.incJenisTransaksi(rekening);
        transaksiAsal.incJenisTransaksi("/");
        transaksiAsal.incJenisTransaksi(nama);
        
        transaksiTujuan.incJenisTransaksi("/");
        transaksiTujuan.incJenisTransaksi(rekening);
        transaksiTujuan.incJenisTransaksi("/");
        transaksiTujuan.incJenisTransaksi(nama);

        userAsal.getRekening().tambahTransaksi(transaksiAsal);
        userAsal.getRekening().getSaldo().ambilSaldo(nominal);
        
        userTujuan.getRekening().tambahTransaksi(transaksiTujuan);
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
            return true;
        }

        return false;
    }
}
