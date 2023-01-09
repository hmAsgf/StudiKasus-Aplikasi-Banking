package views;

import java.awt.Cursor;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import controllers.HomeController;
import controllers.TransferController;
import entity.UserEntity;

public class DetailTransferFrame extends MainFrame
{
    private JLabel kotakLabel;

    private JLabel titleLabel;

    private JLabel rekLabel;
    private JLabel anLabel;
    private JLabel nominalLabel;

    private JButton benarButton;
    private JButton salahButton;

    private TransferController _transferC = new TransferController();

    private int nominalTransfer;

    private String nominal  = "Nominal Transfer : ";
    private String rekening = "Rekening Tujuan  : ";
    private String nama     = "Atas Nama            : ";

    public DetailTransferFrame(int nominal, UserEntity userTujuan)
    {
        super();
        this.nominal += String.valueOf(nominal);
        rekening += userTujuan.getRekening().getNoRekening();
        nama += userTujuan.getNama();
        this.nominalTransfer = nominal;
        _transferC.cekRekening(userTujuan.getRekening().getNoRekening());
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("TRANSFER");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 451, 294, 98, 24);

        rekLabel = new JLabel(rekening);
        setFontName(rekLabel, barlowRegular);
        boundedAdd(rekLabel, 375, 358, 250, 17);

        anLabel = new JLabel(nama);
        setFontName(anLabel, barlowRegular);
        boundedAdd(anLabel, 375, 385, 250, 17);

        nominalLabel = new JLabel(nominal);
        setFontName(nominalLabel, barlowRegular);
        boundedAdd(nominalLabel, 375, 409, 250, 17);

        ImageIcon benarImg = loadImage("src/assets/images/Button1.png", 160, 40);
        benarButton = new JButton("BENAR", benarImg);
        setFontName(benarButton, barlowBold);
        setFontSize(benarButton, 16);
        setBackground(benarButton, putih);
        setForeground(benarButton, putih);
        setBorderColor(benarButton, putih);
        setCursor(benarButton, Cursor.HAND_CURSOR);
        benarButton.setFocusable(false);
        benarButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(benarButton, 520, 466, 160, 40);

        ImageIcon salahImg = loadImage("src/assets/images/Button2.png", 160, 40);
        salahButton = new JButton("SALAH", salahImg);
        setFontName(salahButton, barlowBold);
        setFontSize(salahButton, 16);
        setBackground(salahButton, putih);
        setForeground(salahButton, putih);
        setBorderColor(salahButton, putih);
        setCursor(salahButton, Cursor.HAND_CURSOR);
        salahButton.setFocusable(false);
        salahButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(salahButton, 320, 466, 160, 40);


        ImageIcon kotakImg = loadImage("src/assets/images/Transfer2Rect.png", 400, 252);
        kotakLabel = new JLabel(kotakImg);
        boundedAdd(kotakLabel, 300, 274, 400, 252);
    }

    @Override
    protected void event()
    {
        benarButton.addActionListener((e)->{
            _transferC.transfer(nominalTransfer);
            new HomeController().toView();
            dispose();
        });

        salahButton.addActionListener((e)->{
            _transferC.toView();
            dispose();
        });
    }
    
}
