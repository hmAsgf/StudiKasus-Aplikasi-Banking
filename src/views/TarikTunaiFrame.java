package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import controllers.HomeController;
import controllers.TarikTunaiController;

public class TarikTunaiFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel nominalLabel;
    private JTextField nominalField;

    private JButton tarikButton;
    private JButton batalButton;

    private TarikTunaiController _tarikTunaiC = new TarikTunaiController();

    public TarikTunaiFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("TARIK TUNAI");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 444, 296, 119, 24);

        nominalLabel = new JLabel("Nominal");
        setFontName(nominalLabel, barlowRegular);
        boundedAdd(nominalLabel, 375, 360, 51, 17);

        nominalField = new JTextField();
        setFontName(nominalField, barlowRegular);
        setBackground(nominalField, putih);
        setBorder(nominalField, hijau, 0, 5, 0, 0);
        boundedAdd(nominalField, 375, 377, 250, 30);

        ImageIcon tarikImg = loadImage("src/assets/images/Button1.png", 160, 40);
        tarikButton = new JButton("TARIK", tarikImg);
        setFontName(tarikButton, barlowBold);
        setFontSize(tarikButton, 16);
        setBackground(tarikButton, putih);
        setForeground(tarikButton, putih);
        setBorderColor(tarikButton, putih);
        setCursor(tarikButton, Cursor.HAND_CURSOR);
        tarikButton.setFocusable(false);
        tarikButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(tarikButton, 520, 464, 160, 40);

        ImageIcon batalImg = loadImage("src/assets/images/Button2.png", 160, 40);
        batalButton = new JButton("BATAL", batalImg);
        setFontName(batalButton, barlowBold);
        setFontSize(batalButton, 16);
        setBackground(batalButton, putih);
        setForeground(batalButton, putih);
        setBorderColor(batalButton, putih);
        setCursor(batalButton, Cursor.HAND_CURSOR);
        batalButton.setFocusable(false);
        batalButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(batalButton, 320, 464, 160, 40);


        ImageIcon kotakImg = loadImage("src/assets/images/Verifikasi-Setor-TarikRect.png", 400, 248);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 300, 276, 400, 248);
    }

    @Override
    protected void event()
    {
        tarikButton.addActionListener((e)->{
            int nominal = Integer.parseInt(nominalField.getText());
            boolean status = _tarikTunaiC.cekSaldo(nominal);
    
            if(status)
            {
                new HomeController().toView();
                dispose();
            }
            else
            {
                JOptionPane.showMessageDialog(null,
                "Saldo Tidak Cukup!",
                "Tarik Tunai Gagal", JOptionPane.INFORMATION_MESSAGE);
            }
        });

        batalButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });
    }
    
}
