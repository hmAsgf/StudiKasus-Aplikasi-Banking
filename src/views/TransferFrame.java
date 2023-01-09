package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.HomeController;
import controllers.TransferController;

public class TransferFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel rekLabel;
    private JTextField rekField;

    private JLabel nominalLabel;
    private JTextField nominalField;

    private JButton lanjutButton;
    private JButton batalButton;

    private TransferController _transferC = new TransferController();

    public TransferFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("TRANSFER");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 451, 271, 98, 24);

        rekLabel = new JLabel("Rekening Tujuan");
        setFontName(rekLabel, barlowRegular);
        boundedAdd(rekLabel, 375, 335, 100, 17);

        rekField = new JTextField();
        setFontName(rekField, barlowRegular);
        setBackground(rekField, putih);
        setBorder(rekField, hijau, 0, 5, 0, 0);
        boundedAdd(rekField, 375, 352, 250, 30);

        nominalLabel = new JLabel("Nominal");
        setFontName(nominalLabel, barlowRegular);
        boundedAdd(nominalLabel, 375, 402, 51, 17);

        nominalField = new JTextField();
        setFontName(nominalField, barlowRegular);
        setBackground(nominalField, putih);
        setBorder(nominalField, hijau, 0, 5, 0, 0);
        boundedAdd(nominalField, 375, 419, 250, 30);

        ImageIcon lanjutImg = loadImage("src/assets/images/Button1.png", 160, 40);
        lanjutButton = new JButton("LANJUT", lanjutImg);
        setFontName(lanjutButton, barlowBold);
        setFontSize(lanjutButton, 16);
        setBackground(lanjutButton, putih);
        setForeground(lanjutButton, putih);
        setCursor(lanjutButton, Cursor.HAND_CURSOR);
        setBorderColor(lanjutButton, putih);
        lanjutButton.setFocusable(false);
        lanjutButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(lanjutButton, 520, 489, 160, 40);

        ImageIcon batalImg = loadImage("src/assets/images/Button2.png", 160, 40);
        batalButton = new JButton("BATAL", batalImg);
        setFontName(batalButton, barlowBold);
        setFontSize(batalButton, 16);
        setBackground(batalButton, putih);
        setForeground(batalButton, putih);
        setCursor(batalButton, Cursor.HAND_CURSOR);
        setBorderColor(batalButton, putih);
        batalButton.setFocusable(false);
        batalButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(batalButton, 320, 489, 160, 40);


        ImageIcon kotakImg = loadImage("src/assets/images/TransferRect.png", 400, 298);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 300, 251, 400, 298);
    }

    @Override
    protected void event()
    {
        lanjutButton.addActionListener((e)->{
            String rekening = rekField.getText();
            int nominal = Integer.parseInt(nominalField.getText());
            boolean status = _transferC.cekRekening(rekening);

            if(status)
            {
                if(_transferC.cekSaldo(nominal))
                {
                    new DetailTransferFrame(nominal, _transferC.getUserTujuan()).setVisible(true);
                    dispose();
                }
                else
                {
                    JOptionPane.showMessageDialog(null,
                    "Saldo Tidak Cukup!",
                    "Transfer Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "Nomor Rekening Tidak diTemukan!",
                "Transfer Gagal", JOptionPane.ERROR_MESSAGE);
            }
        });

        batalButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });
    }
    
}
