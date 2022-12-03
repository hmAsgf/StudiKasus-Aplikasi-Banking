// CLASS ENTITAS
public class SetorTunai extends Transaksi
{
    int nominalSetor;

    public SetorTunai(int nominalSetor)
    {
        super("Setor Tunai", String.valueOf(nominalSetor));
        this.nominalSetor = nominalSetor;
    }
}
