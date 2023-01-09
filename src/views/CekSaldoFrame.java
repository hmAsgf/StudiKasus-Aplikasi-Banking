package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import controllers.CekSaldoController;
import controllers.HomeController;

public class CekSaldoFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel saldoLabel;

    private JButton kembaliButton;

    private CekSaldoController _cekSaldoC = new CekSaldoController();

    private String saldo = "Saldo : ";

    public CekSaldoFrame()
    {
        super();
        saldo += String.valueOf(_cekSaldoC.getSaldo());
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("CEK SALDO");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 449, 319, 101, 24);

        saldoLabel = new JLabel(saldo);
        setFontName(saldoLabel, barlowRegular);
        boundedAdd(saldoLabel, 375, 383, 250, 17);

        ImageIcon kembaliImg = loadImage("src/assets/images/Button2.png", 160, 40);
        kembaliButton = new JButton("KEMBALI", kembaliImg);
        setFontName(kembaliButton, barlowBold);
        setFontSize(kembaliButton, 16);
        setBackground(kembaliButton, putih);
        setForeground(kembaliButton, putih);
        setBorderColor(kembaliButton, putih);
        setCursor(kembaliButton, Cursor.HAND_CURSOR);
        kembaliButton.setFocusable(false);
        kembaliButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(kembaliButton, 420, 440, 160, 40);


        ImageIcon kotakImg = loadImage("src/assets/images/CekSaldoRect.png", 400, 201);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 300, 299, 400, 201);
    }

    @Override
    protected void event()
    {
        kembaliButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });
    }
    
}
