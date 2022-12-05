package entity;
// CLASS ENTITAS
public class TransferEntity extends TransaksiEntity
{
    private int nominalTrasfer;
    private UserEntity userAsal;
    private UserEntity userTujuan;

    public TransferEntity(int nominal, UserEntity userAsal, UserEntity userTujuan)
    {
        super("Transfer", String.valueOf(nominal));
        this.nominalTrasfer = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }
}
