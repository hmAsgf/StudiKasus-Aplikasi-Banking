package views;
import controllers.RiwayatTransaksiController;

public class RiwayatTransaksiPage
{
    RiwayatTransaksiController riwayatTransaksiC = new RiwayatTransaksiController();

    public void initialPage()
    {
        System.out.println("=======================================");
        System.out.println("   R I W A Y A T   T R A N S A K S I   ");
        System.out.println("=======================================");
        riwayatTransaksiC.dataTransaksi();
    }
}
