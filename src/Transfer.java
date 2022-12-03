// CLASS ENTITAS
public class Transfer extends Transaksi
{
    int nominalTrasfer;
    User userAsal;
    User userTujuan;

    public Transfer(int nominal, User userAsal, User userTujuan)
    {
        super("Transfer", String.valueOf(nominal));
        this.nominalTrasfer = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }
}
