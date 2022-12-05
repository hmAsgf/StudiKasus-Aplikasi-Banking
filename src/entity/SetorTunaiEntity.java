package entity;
// CLASS ENTITAS
public class SetorTunaiEntity extends TransaksiEntity
{
    private int nominalSetor;

    public SetorTunaiEntity(int nominalSetor)
    {
        super("Setor Tunai", String.valueOf(nominalSetor));
        this.nominalSetor = nominalSetor;
    }
}
