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
        jumlahSaldo -= nominal;
    }

    public int getJumlahSaldo() {
        return jumlahSaldo;
    }
}
