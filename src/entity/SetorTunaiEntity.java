package entity;
// CLASS ENTITAS
public class SetorTunaiEntity extends TransaksiEntity
{
    private int nominalSetor;

    public SetorTunaiEntity(int nominalSetor)
    {
        super("Setor Tunai", nominalSetor);
        this.nominalSetor = nominalSetor;
    }

    @Override
    public int getNominalTransaksi() {
        return nominalSetor;
    }
}
