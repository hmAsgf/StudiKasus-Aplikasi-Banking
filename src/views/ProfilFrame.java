package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.HomeController;
import controllers.ProfilController;

public class ProfilFrame extends MainFrame
{
    private JLabel kotakLabel;
    private JLabel titleLabel;
    private JLabel ubahPassLabel;
    
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
    
    private JLabel passLamaLabel;
    private JPasswordField passLamaField;

    private JLabel passBaruLabel;
    private JPasswordField passBaruField;
    
    private JLabel konfirmasiPassLabel;
    private JPasswordField konfirmasiPassField;
    
    private JLabel noRekeningLabel;
    private JTextField noRekeningField;

    private JButton simpanProfilButton;
    private JButton simpanPassButton;
    private JButton kembaliButton;

    private ProfilController _profilC = new ProfilController();

    private String nama = _profilC.user.getNama();
    private String nik = _profilC.user.getNik();
    private String username = _profilC.user.getUsername();
    private String email = _profilC.user.getEmail();
    private String noTelp = _profilC.user.getNoTelp();
    private String noRek = _profilC.user.getRekening().getNoRekening();
    private String password = _profilC.user.getPassword();

    public ProfilFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("PROFIL");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        setForeground(hitam);
        boundedAdd(titleLabel, 133, 117, 65, 24);
    
        ubahPassLabel = new JLabel("UBAH PASSWORD");
        setFontName(ubahPassLabel, barlowRegular);
        setFontSize(ubahPassLabel, 20);
        setForeground(hitam);
        boundedAdd(ubahPassLabel, 610, 117, 160, 24);

        namaLengkapLabel = new JLabel("Nama Lengkap");
        setFontName(namaLengkapLabel, barlowRegular);
        boundedAdd(namaLengkapLabel, 130, 181, 91, 17);

        namaLengkapField = new JTextField(nama);
        setFontName(namaLengkapField, barlowRegular);
        setBackground(namaLengkapField, putih);
        setBorder(namaLengkapField, hijau, 0, 5, 0, 5);
        namaLengkapField.setEditable(false);
        boundedAdd(namaLengkapField, 130, 198, 250, 30);

        usernameLabel = new JLabel("Username");
        setFontName(usernameLabel, barlowRegular);
        boundedAdd(usernameLabel, 130, 258, 63, 17);

        usernameField = new JTextField(username);
        setFontName(usernameField, barlowRegular);
        setBackground(usernameField, putih);
        setBorder(usernameField, hijau, 0, 5, 0, 5);
        boundedAdd(usernameField, 130, 275, 250, 30);

        nikLabel = new JLabel("NIK");
        setFontName(nikLabel, barlowRegular);
        boundedAdd(nikLabel, 130, 335, 22, 17);

        nikField = new JTextField(nik);
        setFontName(nikField, barlowRegular);
        setBackground(nikField, putih);
        setBorder(nikField, hijau, 0, 5, 0, 5);
        nikField.setEditable(false);
        boundedAdd(nikField, 130, 352, 250, 30);
        
        emailLabel = new JLabel("Email");
        setFontName(emailLabel, barlowRegular);
        boundedAdd(emailLabel, 130, 412, 35, 17);

        emailField = new JTextField(email);
        setFontName(emailField, barlowRegular);
        setBackground(emailField, putih);
        setBorder(emailField, hijau, 0, 5, 0, 5);
        boundedAdd(emailField, 130, 429, 250, 30);

        noTelpLabel = new JLabel("Nomor Telepon");
        setFontName(noTelpLabel, barlowRegular);
        boundedAdd(noTelpLabel, 130, 489, 100, 17);

        noTelpField = new JTextField(noTelp);
        setFontName(noTelpField, barlowRegular);
        setBackground(noTelpField, putih);
        setBorder(noTelpField, hijau, 0, 5, 0, 5);
        boundedAdd(noTelpField, 130, 506, 250, 30);

        noRekeningLabel = new JLabel("Nomor Rekening");
        setFontName(noRekeningLabel, barlowRegular);
        boundedAdd(noRekeningLabel, 130, 566, 101, 17);

        noRekeningField = new JTextField(noRek);
        setFontName(noRekeningField, barlowRegular);
        setBackground(noRekeningField, putih);
        setBorder(noRekeningField, hijau, 0, 5, 0, 5);
        noRekeningField.setEditable(false);
        boundedAdd(noRekeningField, 130, 583, 250, 30);
        
        passLamaLabel = new JLabel("Password Lama");
        setFontName(passLamaLabel, barlowRegular);
        boundedAdd(passLamaLabel, 610, 181, 96, 17);

        passLamaField = new JPasswordField();
        setFontName(passLamaField, barlowRegular);
        setBackground(passLamaField, putih);
        setBorder(passLamaField, hijau, 0, 5, 0, 5);
        boundedAdd(passLamaField, 610, 198, 250, 30);
        
        passBaruLabel = new JLabel("Password Baru");
        setFontName(passBaruLabel, barlowRegular);
        boundedAdd(passBaruLabel, 610, 258, 96, 17);

        passBaruField = new JPasswordField();
        setFontName(passBaruField, barlowRegular);
        setBackground(passBaruField, putih);
        setBorder(passBaruField, hijau, 0, 5, 0, 5);
        boundedAdd(passBaruField, 610, 275, 250, 30);
        
        konfirmasiPassLabel = new JLabel("Konfirmasi Password");
        setFontName(konfirmasiPassLabel, barlowRegular);
        boundedAdd(konfirmasiPassLabel, 610, 335, 128, 17);

        konfirmasiPassField = new JPasswordField();
        setFontName(konfirmasiPassField, barlowRegular);
        setBackground(konfirmasiPassField, putih);
        setBorder(konfirmasiPassField, hijau, 0, 5, 0, 5);
        boundedAdd(konfirmasiPassField, 610, 352, 250, 30);

        ImageIcon simpanImg = loadImage("src/assets/images/Button1.png", 160, 40);
        simpanProfilButton = new JButton("SIMPAN", simpanImg);
        setFontName(simpanProfilButton, barlowBold);
        setFontSize(simpanProfilButton, 16);
        setBackground(simpanProfilButton, putih);
        setForeground(simpanProfilButton, putih);
        setBorderColor(simpanProfilButton, putih);
        setCursor(simpanProfilButton, Cursor.HAND_CURSOR);
        simpanProfilButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(simpanProfilButton, 130, 643, 160, 40);

        simpanPassButton = new JButton("SIMPAN", simpanImg);
        setFontName(simpanPassButton, barlowBold);
        setFontSize(simpanPassButton, 16);
        setBackground(simpanPassButton, putih);
        setForeground(simpanPassButton, putih);
        setBorderColor(simpanPassButton, putih);
        setCursor(simpanPassButton, Cursor.HAND_CURSOR);
        simpanPassButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(simpanPassButton, 610, 412, 160, 40);

        ImageIcon kembaliImg = loadImage("src/assets/images/Button2.png", 160, 40);
        kembaliButton = new JButton("KEMBALI", kembaliImg);
        setFontName(kembaliButton, barlowBold);
        setFontSize(kembaliButton, 16);
        setBackground(kembaliButton, putih);
        setForeground(kembaliButton, putih);
        setBorderColor(kembaliButton, putih);
        setCursor(kembaliButton, Cursor.HAND_CURSOR);
        kembaliButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(kembaliButton, 700, 643, 160, 40);

        ImageIcon kotakImg = loadImage("src/assets/images/ProfilRect.png", 800, 606);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 100, 97, 800, 606);
    }

    @Override
    protected void event()
    {
        simpanProfilButton.addActionListener((e)->{
            String newUsername = usernameField.getText();
            String newEmail = emailField.getText();
            String newNoTelp = noTelpField.getText();

            String errorMsg = "";
            boolean error = false;

            if((!newUsername.isBlank()) && (!newEmail.isBlank()) && (!newNoTelp.isBlank()))
            {
                if(!newUsername.equals(username))
                {
                    _profilC.editUsername(newUsername);
                }

                if(!newEmail.equals(email))
                {
                    if(!_profilC.editEmail(newEmail))
                    {
                        errorMsg += "EMAIL SUDAH TERDAFTAR!\n";
                        error = true;
                    }
                }

                if(!newNoTelp.equals(noTelp))
                {
                    if(!_profilC.editNoTelp(newNoTelp))
                    {
                        errorMsg += "NOMOR TELEPON SUDAH TERDAFTARr!\n";
                        error = true;
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "PENGISIAN DATA TIDAK LENGKAP!",
                "Update Profil Gagal", JOptionPane.ERROR_MESSAGE);
            }

            if(error)
            {
                JOptionPane.showMessageDialog(null,
                errorMsg,
                "Update Profil Gagal", JOptionPane.ERROR_MESSAGE);
            }
        });

        simpanPassButton.addActionListener((e)->{
            String passLama = String.valueOf(passLamaField.getPassword());
            String passBaru = String.valueOf(passBaruField.getPassword());
            String konfirmasiPass = String.valueOf(konfirmasiPassField.getPassword());

            String errorMsg = "";
            boolean error = false;

            if((!passLama.isBlank()) && (!passBaru.isBlank()) && (!konfirmasiPass.isBlank()))
            {
                if(!password.equals(passBaru))
                {
                    int status = _profilC.editPassword(passLama, passBaru, konfirmasiPass);
    
                    if(status == 0)
                    {
                        errorMsg += "KONFIRMASI PASSOWRD TIDAK SESUAI!";
                        error = true;
                    }
                    else if(status == -1)
                    {
                        errorMsg += "PASSWORD LAMA SALAH!";
                        error = true;
                    }
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "PENGISIAN DATA TIDAK LENGKAP!",
                "Update Password Gagal", JOptionPane.ERROR_MESSAGE);
            }

            if(error)
            {
                JOptionPane.showMessageDialog(null,
                errorMsg,
                "Update Password Gagal", JOptionPane.ERROR_MESSAGE);
            }
        });

        kembaliButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });
    }
    
}
