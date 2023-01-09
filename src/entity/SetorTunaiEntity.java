package entity;
// CLASS ENTITAS
public class SetorTunaiEntity extends TransaksiEntity
{
    private int nominalSetor;

    public SetorTunaiEntity(int nominalSetor, int saldo)
    {
        super("Setor Tunai", nominalSetor, saldo);
        this.nominalSetor = nominalSetor;
    }

    @Override
    public int getNominalTransaksi() {
        return nominalSetor;
    }
}
