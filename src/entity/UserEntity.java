package entity;
// CLASS ENTITAS
public class UserEntity
{
    private String nama, noTelp, nik, email, username, password;
    private RekeningEntity rekening;

    public UserEntity(String nama, String telp, String nik, String email, String password, String username)
    {
        this.nama = nama;
        this.noTelp = telp;
        this.nik = nik;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void buatRekening(RekeningEntity rekening)
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

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getNik() {
        return nik;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public String getPassword() {
        return password;
    }

    public RekeningEntity getRekening() {
        return rekening;
    }

    public String getUsername() {
        return username;
    }

    public void dataUser()
    {
        System.out.println("NAMA           : " + nama);
        System.out.println("NIK            : " + nik);
        System.out.println("NOMOR TELEPON  : " + noTelp);
        System.out.println("EMAIL          : " + email);
        System.out.println("USERNAME       : " + username);
        System.out.println("NOMOR REKENING : " + rekening.getNoRekening());
    }
}
