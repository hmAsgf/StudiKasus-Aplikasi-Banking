// CLASS ENTITAS
public class Saldo
{
    int jumlahSaldo = 0;

    public void tambahSaldo(int nominal)
    {
        jumlahSaldo += nominal; 
    }

    public void ambilSaldo(int nominal)
    {
        if(jumlahSaldo >= nominal)
        {
            jumlahSaldo -= nominal;
        }
        else
        {
            System.out.println("SALDO TIDAK CUKUP");
        }
    }

    public void dataSaldo()
    {
        System.out.println("SALDO           : " + jumlahSaldo);
    }
}
