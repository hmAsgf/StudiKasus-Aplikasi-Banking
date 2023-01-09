package controllers;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import entity.SetorTunaiEntity;
import entity.TarikTunaiEntity;
import entity.TransaksiEntity;
import entity.TransferEntity;
import models.UserModel;
import views.RiwayatTransaksiFrame;

public class RiwayatTransaksiController
{
    public ArrayList<TransaksiEntity> transaksiList = UserModel.getUserLogged().getRekening().getRiwayatTransaksi();

    public void toView()
    {
        new RiwayatTransaksiFrame().setVisible(true);
    }

    public TableModel createTableModel()
    {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object[] column = {
                "Tanggal",
                "Keterangan",
                "Nominal",
                "Saldo"};
                
        dataTable.setColumnIdentifiers(column);

        for(int i=transaksiList.size(); i>0; i--)
        {
            Object[] data = new String[] {
                    transaksiList.get(i-1).getTanggalTransaksi(),
                    transaksiList.get(i-1).getJenisTransaksi(),
                    String.valueOf(transaksiList.get(i-1).getNominalTransaksi()),
                    String.valueOf(transaksiList.get(i-1).getSaldo())};

            dataTable.addRow(data);
        }
        return dataTable;
    }

    public TableModel searchTransaksi(String dateSearch)
    {
        DefaultTableModel dataTable = new DefaultTableModel();

        Object[] column = {
                "Tanggal",
                "Keterangan",
                "Nominal",
                "Saldo"};
                
        dataTable.setColumnIdentifiers(column);

        for(int i=transaksiList.size(); i>0; i--)
        {
            String[] tanggal = transaksiList.get(i-1).getTanggalTransaksi().split(" ");

            if(tanggal[0].equals(dateSearch))
            {
                Object[] data = new String[] {
                        transaksiList.get(i-1).getTanggalTransaksi(),
                        transaksiList.get(i-1).getJenisTransaksi(),
                        String.valueOf(transaksiList.get(i-1).getNominalTransaksi()),
                        String.valueOf(transaksiList.get(i-1).getSaldo())};
    
                dataTable.addRow(data);
            }
        }
        return dataTable;
    }

    public void dataTransaksi()
    {
        for(TransaksiEntity transaksi : transaksiList)
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
