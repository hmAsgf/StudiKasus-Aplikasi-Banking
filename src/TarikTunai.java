// CLASS ENTITAS
public class TarikTunai extends Transaksi
{
    int nominalTarik;

    public TarikTunai(int nominalTarik)
    {
        super("Tarik Tunai", String.valueOf(nominalTarik));
        this.nominalTarik = nominalTarik;
    }
}
