package views;

import java.awt.Cursor;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import controllers.HomeController;
import controllers.SetorTunaiController;

public class SetorTunaiFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel nominalLabel;
    private JTextField nominalField;

    private JButton setorButton;
    private JButton batalButton;

    private SetorTunaiController _setorTunaiC = new SetorTunaiController();

    public SetorTunaiFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("SETOR TUNAI");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 440, 296, 119, 24);

        nominalLabel = new JLabel("Nominal");
        setFontName(nominalLabel, barlowRegular);
        boundedAdd(nominalLabel, 375, 360, 51, 17);

        nominalField = new JTextField();
        setFontName(nominalField, barlowRegular);
        setBackground(nominalField, putih);
        nominalField.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(hijau), 
            BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        boundedAdd(nominalField, 375, 377, 250, 30);

        ImageIcon setorImg = loadImage("src/assets/images/Button1.png", 160, 40);
        setorButton = new JButton("SETOR", setorImg);
        setFontName(setorButton, barlowBold);
        setFontSize(setorButton, 16);
        setBackground(setorButton, putih);
        setForeground(setorButton, putih);
        setBorderColor(setorButton, putih);
        setCursor(setorButton, Cursor.HAND_CURSOR);
        setorButton.setFocusable(false);
        setorButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(setorButton, 520, 464, 160, 40);

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
        setorButton.addActionListener((e)->{
            int nominal = Integer.parseInt(nominalField.getText());
            _setorTunaiC.setorTunai(nominal);
            new HomeController().toView();
            dispose();
        });

        batalButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });
    }
    
}
