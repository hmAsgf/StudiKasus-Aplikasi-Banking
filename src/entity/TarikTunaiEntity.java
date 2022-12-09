package entity;
// CLASS ENTITAS
public class TarikTunaiEntity extends TransaksiEntity
{
    private int nominalTarik;

    public TarikTunaiEntity(int nominalTarik)
    {
        super("Tarik Tunai", nominalTarik);
        this.nominalTarik = nominalTarik;
    }

    @Override
    public int getNominalTransaksi() {
        return nominalTarik;
    }
}
