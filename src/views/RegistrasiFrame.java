package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.RegistrasiController;

public class RegistrasiFrame extends MainFrame
{
    private JLabel kotakLabel;
    private JLabel titleLabel;
    
    private JLabel namaLengkapLabel;
    private JTextField namaLengkapField;
    
    private JLabel usernameLabel;
    private JTextField usernameField;
    
    private JLabel nikLabel;
    private JTextField nikField;
    
    private JLabel noTelpLabel;
    private JTextField noTelpField;
    
    private JLabel emailLabel;
    private JTextField emailField;
    
    private JLabel passwordLabel;
    private JPasswordField passwordField;
    
    private JLabel konfirmasiPassLabel;
    private JPasswordField konfirmasiPassField;
    
    private JLabel pinLabel;
    private JPasswordField pinField;

    private JButton daftarButton;
    private JButton masukButton;

    private RegistrasiController _registrasiC = new RegistrasiController();

    String errorMsg = "";

    public RegistrasiFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("BUKA REKENING");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        setForeground(hitam);
        boundedAdd(titleLabel, 426, 51, 148, 24);

        namaLengkapLabel = new JLabel("Nama Lengkap");
        setFontName(namaLengkapLabel, barlowRegular);
        boundedAdd(namaLengkapLabel, 375, 115, 91, 17);

        namaLengkapField = new JTextField();
        setFontName(namaLengkapField, barlowRegular);
        setBackground(namaLengkapField, putih);
        setBorder(namaLengkapField, hijau, 0, 5, 0, 0);
        boundedAdd(namaLengkapField, 375, 132, 250, 30);

        usernameLabel = new JLabel("Username");
        setFontName(usernameLabel, barlowRegular);
        boundedAdd(usernameLabel, 375, 182, 63, 17);

        usernameField = new JTextField();
        setFontName(usernameField, barlowRegular);
        setBackground(usernameField, putih);
        setBorder(usernameField, hijau, 0, 5, 0, 0);
        boundedAdd(usernameField, 375, 199, 250, 30);

        nikLabel = new JLabel("NIK");
        setFontName(nikLabel, barlowRegular);
        boundedAdd(nikLabel, 375, 247, 22, 17);

        nikField = new JTextField();
        setFontName(nikField, barlowRegular);
        setBackground(nikField, putih);
        setBorder(nikField, hijau, 0, 5, 0, 0);
        boundedAdd(nikField, 375, 266, 250, 30);

        noTelpLabel = new JLabel("Nomor Telepon");
        setFontName(noTelpLabel, barlowRegular);
        boundedAdd(noTelpLabel, 375, 316, 100, 17);

        noTelpField = new JTextField();
        setFontName(noTelpField, barlowRegular);
        setBackground(noTelpField, putih);
        setBorder(noTelpField, hijau, 0, 5, 0, 0);
        boundedAdd(noTelpField, 375, 333, 250, 30);

        emailLabel = new JLabel("Email");
        setFontName(emailLabel, barlowRegular);
        boundedAdd(emailLabel, 375, 383, 35, 17);

        emailField = new JTextField();
        setFontName(emailField, barlowRegular);
        setBackground(emailField, putih);
        setBorder(emailField, hijau, 0, 5, 0, 0);
        boundedAdd(emailField, 375, 400, 250, 30);
        
        passwordLabel = new JLabel("Password");
        setFontName(passwordLabel, barlowRegular);
        boundedAdd(passwordLabel, 375, 450, 59, 17);

        passwordField = new JPasswordField();
        setFontName(passwordField, barlowRegular);
        setBackground(passwordField, putih);
        setBorder(passwordField, hijau, 0, 5, 0, 0);
        boundedAdd(passwordField, 375, 467, 250, 30);
        
        konfirmasiPassLabel = new JLabel("Konfirmasi Password");
        setFontName(konfirmasiPassLabel, barlowRegular);
        boundedAdd(konfirmasiPassLabel, 375, 517, 128, 17);

        konfirmasiPassField = new JPasswordField();
        setFontName(konfirmasiPassField, barlowRegular);
        setBackground(konfirmasiPassField, putih);
        setBorder(konfirmasiPassField, hijau, 0, 5, 0, 0);
        boundedAdd(konfirmasiPassField, 375, 534, 250, 30);
        
        pinLabel = new JLabel("Pin");
        setFontName(pinLabel, barlowRegular);
        boundedAdd(pinLabel, 375, 584, 20, 17);

        pinField = new JPasswordField();
        setFontName(pinField, barlowRegular);
        setBackground(pinField, putih);
        setBorder(pinField, hijau, 0, 5, 0, 0);
        boundedAdd(pinField, 375, 601, 250, 30);

        ImageIcon imageBtn = loadImage("src/assets/images/Button1.png", 160, 40);
        daftarButton = new JButton("DAFTAR", imageBtn);
        setFontName(daftarButton, barlowBold);
        setFontSize(daftarButton, 16);
        setBackground(daftarButton, putih);
        setForeground(daftarButton, putih);
        setBorderColor(daftarButton, putih);
        setCursor(daftarButton, Cursor.HAND_CURSOR);
        daftarButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(daftarButton, 419, 671, 160, 40);

        masukButton = new JButton("Sudah Punya Akun? Masuk");
        setFontName(masukButton, barlowRegular);
        setBackground(masukButton, putih);
        setForeground(masukButton, hitam);
        setBorderColor(masukButton, putih);
        setCursor(masukButton, Cursor.HAND_CURSOR);
        boundedAdd(masukButton, 420, 731, 162, 17);

        ImageIcon image = loadImage("src/assets/images/BukaRekeningRect.png", 400, 737);
        kotakLabel = new JLabel(image);
        boundedAdd(kotakLabel, 300, 31, 400, 737);
    }

    @Override
    protected void event()
    {
        daftarButton.addActionListener((e)->{
            String namaLengkap = namaLengkapField.getText();
            String username = usernameField.getText();
            String nik = nikField.getText();
            String email = emailField.getText();
            String noTelp = noTelpField.getText();
            String password = String.valueOf(passwordField.getPassword());
            String konfirmasiPass = String.valueOf(konfirmasiPassField.getPassword());
            String pin = String.valueOf(pinField.getPassword());

            boolean cekRegistrasi;

            if((!namaLengkap.isBlank()) && (!username.isBlank()) && (!nik.isBlank()) && (!email.isBlank()) && (!pin.isBlank()) &&
                (!noTelp.isBlank()) && (!noTelp.isBlank()) && (!password.isBlank()) && (!konfirmasiPass.isBlank()))
            {
                cekRegistrasi = _registrasiC.cekRegistrasi(nik, noTelp, email, password, konfirmasiPass);

                if(cekRegistrasi)
                {
                    namaLengkap = namaLengkap.toUpperCase();
                    boolean status = _registrasiC.prosesRegistrasi(namaLengkap, nik, noTelp, email, username, password, pin);

                    if(status)
                    {
                        new LoginFrame().setVisible(true);
                        dispose();
                    }
                }
                else
                {
                    gagalRegistrasi();
                    JOptionPane.showMessageDialog(null,
                            errorMsg,
                            "Registrasi Gagal",
                            JOptionPane.ERROR_MESSAGE);
                    errorMsg = "";
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                            "PENGISIAN DATA TIDAK LENGKAP!",
                            "Registrasi Gagal",
                            JOptionPane.ERROR_MESSAGE);
            }
        });

        masukButton.addActionListener((e)->{
            new LoginFrame().setVisible(true);
            dispose();
        });
    }
    
    private void gagalRegistrasi()
    {
        if(!_registrasiC.bPass)
        {
            errorMsg += "KONFIRMASI PASSWORD TIDAK SESUAI!\n";
        }
        if(!_registrasiC.bNik)
        {
            errorMsg += "NIK SUDAH TERDAFTAR!\n";
        }
        if(!_registrasiC.bNoTelp)
        {
            errorMsg += "NOMOR TELEPON SUDAH TERDAFTAR!\n";
        }
        if(!_registrasiC.bEmail)
        {
            errorMsg += "EMAIL SUDAH TERDAFTAR!\n";
        }
    }
    
}
