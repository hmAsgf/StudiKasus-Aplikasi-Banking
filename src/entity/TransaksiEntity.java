package entity;

import utils.DateString;

// CLASS ENTITAS
public class TransaksiEntity
{
    private String jenisTransaksi;
    private String tanggalTransaksi;
    private String nominalTransaksi;

    public TransaksiEntity(String jenisTransaksi, String nominalTransaksi)
    {
        this.jenisTransaksi = jenisTransaksi;
        this.nominalTransaksi = nominalTransaksi;
        tanggalTransaksi = DateString.now();
    }

    public void dataTransaksi()
    {
        System.out.println("JENIS TRANSAKSI     : " + this.jenisTransaksi);
        System.out.println("TANGGAL TRANSAKSI   : " + this.tanggalTransaksi);
        System.out.println("NOMINAL TRANSAKSI   : " + this.nominalTransaksi);
    }
}
