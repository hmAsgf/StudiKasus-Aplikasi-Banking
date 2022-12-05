package entity;
// CLASS ENTITAS
public class RekeningEntity
{
    private String noRekening, pin;
    private SaldoEntity saldo = new SaldoEntity();

    public RekeningEntity(String noRekening, String pin)
    {
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public String getNoRekening() {
        return noRekening;
    }

    public String getPin() {
        return pin;
    }

    public SaldoEntity getSaldo() {
        return saldo;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void dataRekening()
    {
        saldo.dataSaldo();
        System.out.println("NO REKENING  : " + noRekening);
        System.out.println("PIN          : " + pin);
    }
}
