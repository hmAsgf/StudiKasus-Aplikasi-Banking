// CLASS ENTITAS
public class Rekening
{
    String noRekening, pin;
    Saldo saldo = new Saldo();

    public Rekening(String noRekening, String pin)
    {
        this.noRekening = noRekening;
        this.pin = pin;
    }

    public void dataRekening()
    {
        saldo.dataSaldo();
        System.out.println("NO REKENING  : " + noRekening);
        System.out.println("PIN          : " + pin);
    }
}
