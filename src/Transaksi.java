// CLASS ENTITAS
public class Transaksi
{
    String jenisTransaksi;
    String tanggalTransaksi;
    String nominalTransaksi;

    public Transaksi(String jenisTransaksi, String nominalTransaksi)
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
