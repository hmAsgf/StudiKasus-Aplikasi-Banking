package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controllers.LoginController;

public class LoginFrame extends MainFrame
{
    private JLabel iconLabel;
    private JLabel titleLabel;

    private JLabel kotakLabel;
    private JLabel loginLabel;
    
    private JLabel usernameLabel;
    private JLabel passwordLabel;

    private JTextField usernameField;
    private JPasswordField passwordField;

    private JButton masukButton;
    private JButton daftarButton;

    private LoginController _loginC = new LoginController();

    public LoginFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        ImageIcon image = loadImage("src/assets/images/kumbang.png", 70, 70);
        iconLabel = new JLabel(image);
        boundedAdd(iconLabel, 358, 92, 70, 70);

        titleLabel = new JLabel("kumBANK");
        setFontName(titleLabel, barlowBold);
        setFontSize(titleLabel, 48);
        setForeground(titleLabel, hijau);
        boundedAdd(titleLabel, 428, 98, 230, 58);

        loginLabel = new JLabel("LOGIN");
        setFontName(loginLabel, barlowRegular);
        setFontSize(loginLabel, 20);
        boundedAdd(loginLabel, 473, 252, 55, 24);

        usernameLabel = new JLabel("Username");
        setFontName(usernameLabel, barlowRegular);
        boundedAdd(usernameLabel, 375, 316, 63, 17);

        usernameField = new JTextField();
        setFontName(usernameField, barlowRegular);
        setBackground(usernameField, putih);
        setBorder(usernameField, hijau, 0, 5, 0, 0);
        boundedAdd(usernameField, 375, 333, 250, 30);

        passwordLabel = new JLabel("Password");
        setFontName(passwordLabel, barlowRegular);
        boundedAdd(passwordLabel, 375, 383, 59, 17);

        passwordField = new JPasswordField();
        setFontName(passwordField, barlowRegular);
        setBackground(passwordField, putih);
        setBorder(passwordField, hijau, 0, 5, 0, 0);
        boundedAdd(passwordField, 375, 400, 250, 30);

        ImageIcon imageBtn = loadImage("src/assets/images/Button1.png", 160, 40);
        masukButton = new JButton("MASUK", imageBtn);
        setFontName(masukButton, barlowBold);
        setFontSize(masukButton, 16);
        setBackground(masukButton, putih);
        setForeground(masukButton, putih);
        setBorderColor(masukButton, putih);
        setCursor(masukButton, Cursor.HAND_CURSOR);
        masukButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(masukButton, 420, 470, 160, 40);

        daftarButton = new JButton("Belum Punya Akun? Daftar");
        setFontName(daftarButton, barlowRegular);
        setBackground(daftarButton, putih);
        setForeground(daftarButton, hitam);
        setBorderColor(daftarButton, putih);
        setCursor(daftarButton, Cursor.HAND_CURSOR);
        boundedAdd(daftarButton, 421, 530, 160, 17);

        ImageIcon kotak = loadImage("src/assets/images/LoginRect.png", 400, 335);
        kotakLabel = new JLabel(kotak);
        boundedAdd(kotakLabel, 300, 232, 400, 335);
    }

    @Override
    protected void event()
    {
        masukButton.addActionListener((e)->{
            String username = usernameField.getText();
            String password = String.valueOf(passwordField.getPassword());

            boolean status = _loginC.prosesLogin(username, password);

            if(status)
            {
                new HomeFrame().setVisible(true);
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                        "Username atau Password Salah!",
                        "Login Gagal",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        daftarButton.addActionListener((e)->{
            new RegistrasiFrame().setVisible(true);
            dispose();
        });
    }
}
