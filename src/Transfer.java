// CLASS ENTITAS
public class Transfer
{
    int nominalTrasfer;
    User userAsal;
    User userTujuan;

    public Transfer(int nominal, User userAsal, User userTujuan)
    {
        this.nominalTrasfer = nominal;
        this.userAsal = userAsal;
        this.userTujuan = userTujuan;
    }
}
