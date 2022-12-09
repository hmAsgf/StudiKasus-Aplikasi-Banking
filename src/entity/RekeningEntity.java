package entity;
import java.util.ArrayList;

// CLASS ENTITAS
public class RekeningEntity
{
    private String noRekening, pin;
    private SaldoEntity saldo = new SaldoEntity();
    private ArrayList<TransaksiEntity> riwayatTransaksi = new ArrayList<>();

    public RekeningEntity(String noRekening, String pin)
    {
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public void tambahTransaksi(TransaksiEntity transaksi)
    {
        riwayatTransaksi.add(transaksi);
    }

    public ArrayList<TransaksiEntity> getRiwayatTransaksi() {
        return riwayatTransaksi;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getPin() {
        return pin;
    }

    public SaldoEntity getSaldo() {
        return saldo;
    }
}
