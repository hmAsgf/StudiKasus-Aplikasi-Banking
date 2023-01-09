package controllers;
import models.UserModel;
import views.HomeFrame;

public class HomeController
{
    public String namaLengkap = UserModel.getUserLogged().getNama();

    public void toView()
    {
        new HomeFrame().setVisible(true);
    }
    
    public void switchMenu(int menu)
    {
        switch(menu)
        {
            case 1:
                ProfilController profilC = new ProfilController();
                profilC.toView();
                break;
            case 2:
                VerifPinController setorTunai = new VerifPinController("Setor Tunai");
                setorTunai.toView();
                break;
            case 3:
                VerifPinController tarikTunai = new VerifPinController("Tarik Tunai");
                tarikTunai.toView();
                break;
            case 4:
                VerifPinController transfer = new VerifPinController("Transfer");
                transfer.toView();
                break;
            case 5:
                CekSaldoController cekSaldoC = new CekSaldoController();
                cekSaldoC.toView();
                break;
            case 6:
                RiwayatTransaksiController riwayatTransaksiC = new RiwayatTransaksiController();
                riwayatTransaksiC.toView();
                break;
            case 0:
                UserModel.setUserLogged(null);
                LoginController loginC = new LoginController();
                loginC.toView();
                break;
            default:
                break;
        }
    }
}
