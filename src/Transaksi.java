// CLASS ENTITAS
public class Transaksi
{
    String jenisTransaksi;
    String tanggalTransaksi;
    String nominalTransaksi;
    String totalBayar;

    public Transaksi(String jenisTransaksi, String nominalTransaksi, String totalBayar)
    {
        this.jenisTransaksi = jenisTransaksi;
        this.nominalTransaksi = nominalTransaksi;
        this.totalBayar = totalBayar;
        tanggalTransaksi = DateString.now();
    }

    public void dataTransaksi()
    {
        System.out.println("JENIS TRANSAKSI     : " + this.jenisTransaksi);
        System.out.println("TANGGAL TRANSAKSI   : " + this.tanggalTransaksi);
        System.out.println("NOMINAL TRANSAKSI   : " + this.nominalTransaksi);
    }
}
