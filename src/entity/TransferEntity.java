package entity;
// CLASS ENTITAS
public class TransferEntity extends TransaksiEntity
{
    private int nominalTrasfer;
    private UserEntity userAsal;
    private UserEntity userTujuan;

    public TransferEntity(int nominal, UserEntity userAsal, UserEntity userTujuan, int saldo)
    {
        super("Transfer", nominal, saldo);
        this.nominalTrasfer = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }

    public UserEntity getUserAsal() {
        return userAsal;
    }

    public UserEntity getUserTujuan() {
        return userTujuan;
    }

    @Override
    public int getNominalTransaksi() {
        return nominalTrasfer;
    }

    public void dataTransfer()
    {
        super.dataTransaksi();
        System.out.println("ASAL REKENING       : "+userAsal.getRekening().getNoRekening());
        System.out.println("ASAL ATAS NAMA      : "+userAsal.getNama());
        System.out.println("TUJUAN REKENING     : "+userTujuan.getRekening().getNoRekening());
        System.out.println("TUJUAN ATAS NAMA    : "+userTujuan.getNama());
    }
}
