// CLASS ENTITAS
public class User
{
    int id;
    String nama, noTelp, nik, email, username, password;
    Rekening rekening;

    public User(String nama, String telp, String nik, String email, String password, String username)
    {
        this.nama = nama;
        this.noTelp = telp;
        this.nik = nik;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void buatRekening(Rekening rekening)
    {
        this.rekening = rekening;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void dataUser()
    {
        System.out.println("NAMA           : " + nama);
        System.out.println("NIK            : " + nik);
        System.out.println("NOMOR TELEPON  : " + noTelp);
        System.out.println("EMAIL          : " + email);
        System.out.println("USERNAME       : " + username);
        System.out.println("NOMOR REKENING : " + rekening.noRekening);
    }
}
