package entity;

import utils.DateString;

// CLASS ENTITAS
public abstract class TransaksiEntity
{
    private String jenisTransaksi;
    private String tanggalTransaksi;
    private int nominalTransaksi;
    private int saldo;

    public TransaksiEntity(String jenisTransaksi, int nominalTransaksi, int saldo)
    {
        this.jenisTransaksi = jenisTransaksi;
        this.nominalTransaksi = nominalTransaksi;
        this.saldo = saldo;
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

    public int getSaldo() {
        return saldo;
    }

    public String getJenisTransaksi() {
        return jenisTransaksi;
    }

    public void incJenisTransaksi(String jenisTransaksi) {
        this.jenisTransaksi += jenisTransaksi;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }
}
