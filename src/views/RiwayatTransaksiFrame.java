package views;

import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

import controllers.HomeController;
import controllers.RiwayatTransaksiController;

public class RiwayatTransaksiFrame extends MainFrame
{
    private JLabel titleLabel;

    private JLabel searchLabel;
    private JTextField searchField;
    private JButton searchButton;

    private JButton kembaliButton;

    private JTable transaksiTable;
    private JScrollPane scrollPane;

    private JTableHeader header;

    private RiwayatTransaksiController _riwayatTransaksiC = new RiwayatTransaksiController();

    public RiwayatTransaksiFrame()
    {
        super();
    }

    @Override
    protected void component()
    {
        titleLabel = new JLabel("RIWAYAT TRANSAKSI");
        setFontName(titleLabel, barlowRegular);
        setFontSize(titleLabel, 20);
        boundedAdd(titleLabel, 20, 31, 190, 24);

        searchLabel = new JLabel("Cari Berdasarkan Tanggal");
        setFontName(searchLabel, barlowRegular);
        boundedAdd(searchLabel, 700, 20, 155, 17);

        searchField = new JTextField();
        setFontName(searchField, barlowRegular);
        setBackground(searchField, putih);
        setBorder(searchField, hijau, 0, 5, 0, 0);
        boundedAdd(searchField, 700, 37, 250, 30);

        ImageIcon searchImg = loadImage("src/assets/images/search.png", 20, 20);
        searchButton = new JButton(searchImg);
        setBackground(searchButton, bgColor);
        setBorderColor(searchButton, bgColor);
        setCursor(searchButton, Cursor.HAND_CURSOR);
        searchButton.setFocusable(false);
        boundedAdd(searchButton, 960, 40, 25, 25);

        ImageIcon kembaliImg = loadImage("src/assets/images/Button2.png", 160, 40);
        kembaliButton = new JButton("KEMBALI", kembaliImg);
        setFontName(kembaliButton, barlowBold);
        setFontSize(kembaliButton, 16);
        setBackground(kembaliButton, bgColor);
        setForeground(kembaliButton, putih);
        setBorderColor(kembaliButton, putih);
        setCursor(kembaliButton, Cursor.HAND_CURSOR);
        kembaliButton.setFocusable(false);
        kembaliButton.setHorizontalTextPosition(JButton.CENTER);
        boundedAdd(kembaliButton, 20, 740, 160, 40);

        transaksiTable = new JTable();
        TableModel model = _riwayatTransaksiC.createTableModel();
        renderTable(model);
        
        scrollPane = new JScrollPane(transaksiTable);
        setBackground(scrollPane, putih);
        boundedAdd(scrollPane, 20, 87, 960, 630);
    }

    @Override
    protected void event()
    {
        kembaliButton.addActionListener((e)->{
            new HomeController().toView();
            dispose();
        });

        searchButton.addActionListener((e)->{
            String date = searchField.getText();

            TableModel modelSearch = _riwayatTransaksiC.searchTransaksi(date);
            
            if(date.isBlank())
            {
                TableModel model = _riwayatTransaksiC.createTableModel();
                renderTable(model);
            }
            else
            {
                renderTable(modelSearch);
            }
        });
    }
    
    private void renderTable(TableModel model)
    {
        header = transaksiTable.getTableHeader();
        setFontName(header, barlowBold);
        setFontSize(header, 16);
        setForeground(header, hijau);
        setBackground(header, putih);
        header.setEnabled(false);

        setFontName(transaksiTable, barlowRegular);
        setBackground(transaksiTable, putih);
        transaksiTable.setEnabled(false);
        transaksiTable.setRowHeight(30);
        transaksiTable.setIntercellSpacing(new Dimension(10,0));
        transaksiTable.setTableHeader(header);
        transaksiTable.setModel(model);
        transaksiTable.getColumnModel().getColumn(0).setPreferredWidth(150);
        transaksiTable.getColumnModel().getColumn(1).setPreferredWidth(450);
        transaksiTable.getColumnModel().getColumn(2).setPreferredWidth(180);
        transaksiTable.getColumnModel().getColumn(3).setPreferredWidth(180);
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(JLabel.RIGHT);
        transaksiTable.getColumnModel().getColumn(3).setCellRenderer(cellRenderer);
        transaksiTable.getColumnModel().getColumn(2).setCellRenderer(cellRenderer);
    }
}
