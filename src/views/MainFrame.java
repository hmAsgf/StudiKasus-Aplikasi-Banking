package views;

import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.Font;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.GraphicsEnvironment;
import java.awt.FontFormatException;

import java.io.File;
import java.io.IOException;

public abstract class MainFrame extends JFrame
{
    // DEFAULT WARNA
    protected Color bgColor = Color.decode("#F2E7D5");
    protected Color hijau = Color.decode("#6D9886");
    protected Color putih = Color.decode("#F7F7F7");
    protected Color hitam = Color.decode("#393E46");
    protected Color merah = Color.decode("#C65959");

    // DEFAULT TULISAN
    protected Font barlowRegular, barlowBold;
    protected float FONTSIZE = 14;

    // DEFAULT LOGO
    protected ImageIcon logo = new ImageIcon("src/assets/images/kumbang.png");

    public MainFrame()
    {
        barlowRegularFont();
        barlowBoldFont();

        setIconImage(logo.getImage());
        getContentPane().setBackground(bgColor);
        setTitle("kumBANK");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1015, 855);
        setLayout(null);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    
    @Override
    public void setVisible(boolean b)
    {
        if (b)
        {
            component();
            event();
        }
        super.setVisible(b);
    }

    protected abstract void component();
    protected abstract void event();

    protected void boundedAdd(Component comp, int x, int y, int width, int height)
    {
        comp.setBounds(x, y, width, height);
        add(comp);
    }

    protected ImageIcon loadImage(String imagePath, int width, int height)
    {
        try {
            BufferedImage bImage;
            Image imgResize;
            ImageIcon imgIcon = null;

            bImage = ImageIO.read(new File(imagePath));

            imgResize = bImage.getScaledInstance(width, height,Image.SCALE_SMOOTH);

            imgIcon = new ImageIcon(imgResize);

            return imgIcon;
        } catch (IOException ex) {
            return null;
        }
    }

    protected void barlowRegularFont()
    {
        try{
            // load a custom font in your project folder
			barlowRegular = Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/fonts/Barlow-Regular.ttf")).deriveFont(FONTSIZE);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/fonts/Barlow-Regular.ttf")));			
		}
		catch(IOException | FontFormatException e){
			
		}
    }

    protected void barlowBoldFont()
    {
        try{
            // load a custom font in your project folder
			barlowBold = Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/fonts/Barlow-Bold.ttf")).deriveFont(FONTSIZE);	
			GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
			ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("src/assets/fonts/Barlow-Bold.ttf")));			
		}
		catch(IOException | FontFormatException e){
			
		}
    }

    protected void setFontName(Component comp, Font font)
    {
        comp.setFont(font);
    }

    protected void setFontStyle(Component comp, int style)
    {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getName(), style, fontLama.getSize());
        comp.setFont(fontBaru);
    }

    protected void setFontSize(Component comp, int size)
    {
        Font fontLama = comp.getFont();
        Font fontBaru = new Font(fontLama.getName(), fontLama.getStyle(), size);
        comp.setFont(fontBaru);
    }

    protected void setBackground(Component comp, Color backgroundColor)
    {
        comp.setBackground(backgroundColor);
    }

    protected void setForeground(Component comp, Color foregroundColor)
    {
        comp.setForeground(foregroundColor);
    }

    protected void setCursor(Component comp, int cursor)
    {
        comp.setCursor(new Cursor(cursor));
    }

    protected void setBorderColor(JComponent comp, Color color)
    {
        comp.setBorder(new LineBorder(color));
    }

    protected void setBorderMargin(JComponent comp, int top, int left, int bottom, int right)
    {
        comp.setBorder(BorderFactory.createEmptyBorder(top, left, bottom, right));
    }

    protected void setBorder(JComponent comp, Color color, int top, int left, int bottom, int right)
    {
        comp.setBorder(BorderFactory.createCompoundBorder(
            new LineBorder(color), 
            BorderFactory.createEmptyBorder(top, left, bottom, right)));
    }
}
