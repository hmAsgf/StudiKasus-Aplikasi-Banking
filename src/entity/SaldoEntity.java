package entity;
// CLASS ENTITAS
public class SaldoEntity
{
    private int jumlahSaldo = 0;

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

    public int getJumlahSaldo() {
        return jumlahSaldo;
    }

    public void setJumlahSaldo(int jumlahSaldo) {
        this.jumlahSaldo = jumlahSaldo;
    }

    public void dataSaldo()
    {
        System.out.println("SALDO           : " + jumlahSaldo);
    }
}
