package entity;

import utils.DateString;

// CLASS ENTITAS
public abstract class TransaksiEntity
{
    private String jenisTransaksi;
    private String tanggalTransaksi;
    private int nominalTransaksi;

    public TransaksiEntity(String jenisTransaksi, int nominalTransaksi)
    {
        this.jenisTransaksi = jenisTransaksi;
        this.nominalTransaksi = nominalTransaksi;
        tanggalTransaksi = DateString.now();
    }

    public void dataTransaksi()
    {
        System.out.println("---------------------------------------");
        System.out.println("JENIS TRANSAKSI     : " + this.jenisTransaksi);
        System.out.println("TANGGAL TRANSAKSI   : " + this.tanggalTransaksi);
        System.out.println("NOMINAL TRANSAKSI   : " + this.nominalTransaksi);
    }

    public abstract int getNominalTransaksi();
}
