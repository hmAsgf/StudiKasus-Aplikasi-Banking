package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

import controllers.LoginController;
import controllers.VerifPinController;

public class VerifikasiPinFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel pinLabel;
    private JPasswordField pinField;

    private JButton lanjutButton;

    private VerifPinController _verifPinC;
    private int percobaan = 0;

    public VerifikasiPinFrame(String transaksi)
    {
        super();
        _verifPinC = new VerifPinController(transaksi);
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("VERIFIKASI PIN");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 433, 296, 134, 24);

        pinLabel = new JLabel("Pin");
        setFontName(pinLabel, barlowRegular);
        boundedAdd(pinLabel, 375, 360, 20, 17);

        pinField = new JPasswordField();
        setFontName(pinField, barlowRegular);
        setBackground(pinField, putih);
        setBorder(pinField, hijau, 0, 5, 0, 0);
        boundedAdd(pinField, 375, 377, 250, 30);

        ImageIcon lanjutImg = loadImage("src/assets/images/Button1.png", 160, 40);
        lanjutButton = new JButton("LANJUT", lanjutImg);
        setFontName(lanjutButton, barlowBold);
        setFontSize(lanjutButton, 16);
        setBackground(lanjutButton, putih);
        setForeground(lanjutButton, putih);
        setBorderColor(lanjutButton, putih);
        setCursor(lanjutButton, Cursor.HAND_CURSOR);
        lanjutButton.setFocusable(false);
        lanjutButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(lanjutButton, 420, 464, 160, 40);


        ImageIcon kotakImg = loadImage("src/assets/images/Verifikasi-Setor-TarikRect.png", 400, 248);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 300, 276, 400, 248);
    }

    @Override
    protected void event()
    {
        lanjutButton.addActionListener((e)->{
            String pin = String.valueOf(pinField.getPassword());
            percobaan++;

            boolean status = _verifPinC.cekPin(pin);

            if(status)
            {
                _verifPinC.switchTransaksi();
                dispose();
            }
            else
            {
                if(percobaan==3)
                {
                    JOptionPane.showMessageDialog(null,
                    "Salah Memasukkan Pin Sebanyak 3X\nAkun Anda diBlokir!, Silakan Hubungi Call Center",
                    "Blokir", JOptionPane.INFORMATION_MESSAGE);
                    new LoginController().toView();
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                    "Pin Salah!, Coba Lagi!",
                    "Pin Salah", JOptionPane.ERROR_MESSAGE);
                }

                pinField.setText("");
            }
        });
    }
    
}
