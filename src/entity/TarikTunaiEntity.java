package entity;
// CLASS ENTITAS
public class TarikTunaiEntity extends TransaksiEntity
{
    private int nominalTarik;

    public TarikTunaiEntity(int nominalTarik, int saldo)
    {
        super("Tarik Tunai", nominalTarik, saldo);
        this.nominalTarik = nominalTarik;
    }

    @Override
    public int getNominalTransaksi() {
        return nominalTarik;
    }
}
