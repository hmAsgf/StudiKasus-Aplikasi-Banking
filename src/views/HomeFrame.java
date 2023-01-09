package views;

import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import controllers.CekSaldoController;
import controllers.HomeController;
import controllers.ProfilController;
import controllers.RiwayatTransaksiController;
import controllers.VerifPinController;

public class HomeFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel profilImageLabel;
    private JLabel namaLabel;

    private JButton logoutButton;

    private JButton setorButton;
    private JButton tarikButton;
    private JButton transferButton;
    private JButton cekSaldoButton;
    private JButton riwayatTransaksiButton;
    private JButton profilButton;

    private HomeController _homeC = new HomeController();

    public HomeFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        ImageIcon userImage = loadImage("src/assets/images/user.png", 50, 50);
        profilImageLabel = new JLabel(userImage);
        boundedAdd(profilImageLabel, 50, 50, 50, 50);

        namaLabel = new JLabel(_homeC.namaLengkap);
        setFontName(namaLabel, barlowRegular);
        setFontSize(namaLabel, 40);
        setForeground(namaLabel, hijau);
        boundedAdd(namaLabel, 130, 51, 700, 48);

        ImageIcon logoutImage = loadImage("src/assets/images/logout.png", 50, 50);
        logoutButton = new JButton(logoutImage);
        setBackground(logoutButton, bgColor);
        setCursor(logoutButton, Cursor.HAND_CURSOR);
        setBorderMargin(logoutButton, 0, 0, 0, 0);
        boundedAdd(logoutButton, 900, 50, 50, 50);

        ImageIcon setorImage = loadImage("src/assets/images/SetorTunai.png", 100, 100);
        setorButton = new JButton("Setor Tunai", setorImage);
        setFontName(setorButton, barlowBold);
        setFontSize(setorButton, 20);
        setBackground(setorButton, putih);
        setForeground(setorButton, hijau);
        setCursor(setorButton, Cursor.HAND_CURSOR);
        setBorderMargin(setorButton, 0, 0, 0, 0);
        setorButton.setHorizontalTextPosition(JButton.CENTER);
        setorButton.setVerticalTextPosition(JButton.BOTTOM);
        setorButton.setFocusable(false);
        boundedAdd(setorButton, 200, 300, 110, 124);
        
        ImageIcon tarikImage = loadImage("src/assets/images/TarikTunai.png", 100, 100);
        tarikButton = new JButton("Tarik Tunai", tarikImage);
        setFontName(tarikButton, barlowBold);
        setFontSize(tarikButton, 20);
        setBackground(tarikButton, putih);
        setForeground(tarikButton, hijau);
        setCursor(tarikButton, Cursor.HAND_CURSOR);
        setBorderMargin(tarikButton, 0, 0, 0, 0);
        tarikButton.setHorizontalTextPosition(JButton.CENTER);
        tarikButton.setVerticalTextPosition(JButton.BOTTOM);
        tarikButton.setFocusable(false);
        boundedAdd(tarikButton, 450, 300, 110, 124);

        ImageIcon transferImage = loadImage("src/assets/images/Transfer.png", 100, 100);
        transferButton = new JButton("Transfer", transferImage);
        setFontName(transferButton, barlowBold);
        setFontSize(transferButton, 20);
        setBackground(transferButton, putih);
        setForeground(transferButton, hijau);
        setCursor(transferButton, Cursor.HAND_CURSOR);
        setBorderMargin(transferButton, 0, 0, 0, 0);
        transferButton.setHorizontalTextPosition(JButton.CENTER);
        transferButton.setVerticalTextPosition(JButton.BOTTOM);
        transferButton.setFocusable(false);
        boundedAdd(transferButton, 700, 300, 110, 124);

        ImageIcon cekSaldoImage = loadImage("src/assets/images/saldo.png", 100, 100);
        cekSaldoButton = new JButton("Cek Saldo", cekSaldoImage);
        setFontName(cekSaldoButton, barlowBold);
        setFontSize(cekSaldoButton, 20);
        setBackground(cekSaldoButton, putih);
        setForeground(cekSaldoButton, hijau);
        setCursor(cekSaldoButton, Cursor.HAND_CURSOR);
        setBorderMargin(cekSaldoButton, 0, 0, 0, 0);
        cekSaldoButton.setHorizontalTextPosition(JButton.CENTER);
        cekSaldoButton.setVerticalTextPosition(JButton.BOTTOM);
        cekSaldoButton.setFocusable(false);
        boundedAdd(cekSaldoButton, 200, 550, 110, 124);

        ImageIcon riwayatTransaksiImage = loadImage("src/assets/images/riwayatTransaksi.png", 100, 100);
        riwayatTransaksiButton = new JButton("Riwayat Transaksi", riwayatTransaksiImage);
        setFontName(riwayatTransaksiButton, barlowBold);
        setFontSize(riwayatTransaksiButton, 20);
        setBackground(riwayatTransaksiButton, putih);
        setForeground(riwayatTransaksiButton, hijau);
        setCursor(riwayatTransaksiButton, Cursor.HAND_CURSOR);
        setBorderMargin(riwayatTransaksiButton, 0, 0, 0, 0);
        riwayatTransaksiButton.setHorizontalTextPosition(JButton.CENTER);
        riwayatTransaksiButton.setVerticalTextPosition(JButton.BOTTOM);
        riwayatTransaksiButton.setFocusable(false);
        boundedAdd(riwayatTransaksiButton, 420, 550, 165, 124);

        ImageIcon profilImage = loadImage("src/assets/images/profil.png", 100, 100);
        profilButton = new JButton("Profil", profilImage);
        setFontName(profilButton, barlowBold);
        setFontSize(profilButton, 20);
        setBackground(profilButton, putih);
        setForeground(profilButton, hijau);
        setCursor(profilButton, Cursor.HAND_CURSOR);
        setBorderMargin(profilButton, 0, 0, 0, 0);
        profilButton.setHorizontalTextPosition(JButton.CENTER);
        profilButton.setVerticalTextPosition(JButton.BOTTOM);
        profilButton.setFocusable(false);
        boundedAdd(profilButton, 700, 550, 100, 124);
        
        ImageIcon image = loadImage("src/assets/images/HomeRect.png", 1000, 650);
        kotakLabel = new JLabel(image);
        boundedAdd(kotakLabel, 0, 150, 1000, 680);
    }

    @Override
    protected void event()
    {
        setorButton.addActionListener((e)->{
            VerifPinController setorTunai = new VerifPinController("Setor Tunai");
            setorTunai.toView();
            dispose();
        });
        
        tarikButton.addActionListener((e)->{
            VerifPinController tarikTunai = new VerifPinController("Tarik Tunai");
            tarikTunai.toView();
            dispose();
        });
        
        transferButton.addActionListener((e)->{
            VerifPinController transfer = new VerifPinController("Transfer");
            transfer.toView();
            dispose();
        });
        
        cekSaldoButton.addActionListener((e)->{
            new CekSaldoController().toView();
            dispose();
        });
        
        riwayatTransaksiButton.addActionListener((e)->{
            new RiwayatTransaksiController().toView();
            dispose();
        });
        
        profilButton.addActionListener((e)->{
            new ProfilController().toView();
            dispose();
        });
        
        logoutButton.addActionListener((e)->{
            _homeC.switchMenu(0);
            dispose();
        });
    }
    
}
