package entity;
// CLASS ENTITAS
public class TarikTunaiEntity extends TransaksiEntity
{
    private int nominalTarik;

    public TarikTunaiEntity(int nominalTarik)
    {
        super("Tarik Tunai", String.valueOf(nominalTarik));
        this.nominalTarik = nominalTarik;
    }
}
