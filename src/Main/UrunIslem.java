/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import Properties.urunBirimler;
import Properties.urunKategoriler;
import Properties.urunMarkalar;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.apache.commons.io.FilenameUtils;

/**
 *
 * @author Zeki
 */
public class UrunIslem extends javax.swing.JPanel {

    /**
     * Creates new form UrunIslem
     */
    public UrunIslem() {
        initComponents();
        markaCBDoldur();
        kategoriCBDoldur();
        birimCBDoldur();
        dataGetir(1);
        labeldoldur();
    }
    ArrayList<urunBirimler> birimLS = new ArrayList<>();
    ArrayList<urunMarkalar> markaLS = new ArrayList<>();
    ArrayList<urunKategoriler> kategoriLS = new ArrayList<>();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jButton3 = new javax.swing.JButton();
        pnlStok = new javax.swing.JPanel();
        pnlStokBilgi = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblToplamStok = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblSatılanStok = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblAlis = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        lblSatis = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        tbUrunler = new javax.swing.JTabbedPane();
        pnlUrunler = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUrunListesi = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblAra = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        pnlUrunEkle = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        btnUkaydet = new javax.swing.JButton();
        txtUadi = new javax.swing.JTextField();
        txtUbarkod = new javax.swing.JTextField();
        cbBirim = new javax.swing.JComboBox<>();
        cbUmarka = new javax.swing.JComboBox<>();
        cbUkategori = new javax.swing.JComboBox<>();
        txtUAlis = new javax.swing.JTextField();
        txtUSatis = new javax.swing.JTextField();
        txtUKritik = new javax.swing.JTextField();
        lblUgorsel = new javax.swing.JLabel();
        cbUvergi = new javax.swing.JComboBox<>();
        cbAlisVergi = new javax.swing.JComboBox<>();
        cbSatisVergi = new javax.swing.JComboBox<>();
        jLabel24 = new javax.swing.JLabel();
        txtUmiktar = new javax.swing.JTextField();
        btnUIptal = new javax.swing.JButton();
        btnGorselSec = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        pnlUrunAyar = new javax.swing.JPanel();
        pnlStokEkle = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblStokUrunler = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        lblAra1 = new javax.swing.JLabel();
        txtAra1 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblUrunAdi = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        txtEklenecekStok = new javax.swing.JTextField();
        btnStokEkle = new javax.swing.JButton();
        pnlGrupYonetim = new javax.swing.JPanel();
        pnlKategori = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        txtKategoriAdi = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtKategoriAciklama = new javax.swing.JTextArea();
        btnKategoriEkle = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        lsKategori = new javax.swing.JList<>();
        btnKategoriSil = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        pnlBirim = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txtBirimAdi = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtBirimAciklama = new javax.swing.JTextArea();
        jLabel35 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        lsBirimler = new javax.swing.JList<>();
        btnBirimEkle = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        pnlMarka = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txtMarkaAdi = new javax.swing.JTextField();
        jScrollPane9 = new javax.swing.JScrollPane();
        txtMarkaAciklama = new javax.swing.JTextArea();
        jLabel37 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        lsMarkalar = new javax.swing.JList<>();
        btnMarkaEkle = new javax.swing.JButton();
        btnMarkaSil = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        pnlGruplar = new javax.swing.JPanel();
        btnKategoriler = new javax.swing.JButton();
        btnMarkalar = new javax.swing.JButton();
        btnBirimler = new javax.swing.JButton();

        jButton3.setText("jButton3");

        pnlStokBilgi.setLayout(new java.awt.GridLayout(2, 0, 0, 5));

        jPanel15.setBackground(new java.awt.Color(223, 173, 39));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Toplam Stok");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Dropbox_60px.png"))); // NOI18N

        lblToplamStok.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblToplamStok.setForeground(new java.awt.Color(255, 255, 255));
        lblToplamStok.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToplamStok.setText("0");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblToplamStok, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamStok, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStokBilgi.add(jPanel15);

        jPanel13.setBackground(new java.awt.Color(205, 56, 60));

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Satılan");

        lblSatılanStok.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblSatılanStok.setForeground(new java.awt.Color(255, 255, 255));
        lblSatılanStok.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSatılanStok.setText("0");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Dropbox_60px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addComponent(lblSatılanStok, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSatılanStok, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel11))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStokBilgi.add(jPanel13);

        jPanel14.setBackground(new java.awt.Color(71, 80, 122));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Toplam Stok Alış Değeri");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Turkish_Lira_60px.png"))); // NOI18N

        lblAlis.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblAlis.setForeground(new java.awt.Color(255, 255, 255));
        lblAlis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlis.setText("0.00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblAlis, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAlis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStokBilgi.add(jPanel14);

        jPanel12.setBackground(new java.awt.Color(2, 188, 141));

        lblSatis.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblSatis.setForeground(new java.awt.Color(255, 255, 255));
        lblSatis.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSatis.setText("0.00");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Turkish_Lira_60px.png"))); // NOI18N

        jLabel25.setFont(new java.awt.Font("Verdana", 1, 17)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Toplam Stok Satış Değeri");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(lblSatis, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlStokBilgi.add(jPanel12);

        tbUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbUrunlerMouseClicked(evt);
            }
        });

        tblUrunListesi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblUrunListesi);

        lblAra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_18px.png"))); // NOI18N

        txtAra.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAra.setForeground(new java.awt.Color(153, 153, 153));
        txtAra.setText("Ara...");
        txtAra.setToolTipText("");
        txtAra.setBorder(null);
        txtAra.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAra.setOpaque(false);
        txtAra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAraFocusGained(evt);
            }
        });
        txtAra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAraActionPerformed(evt);
            }
        });
        txtAra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAraKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAra))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton1.setText("Düzenle");

        jButton2.setText("Sil");

        javax.swing.GroupLayout pnlUrunlerLayout = new javax.swing.GroupLayout(pnlUrunler);
        pnlUrunler.setLayout(pnlUrunlerLayout);
        pnlUrunlerLayout.setHorizontalGroup(
            pnlUrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUrunlerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 991, Short.MAX_VALUE)
                    .addGroup(pnlUrunlerLayout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUrunlerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        pnlUrunlerLayout.setVerticalGroup(
            pnlUrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUrunlerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlUrunlerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(41, 41, 41))
        );

        tbUrunler.addTab("Ürün Listesi", pnlUrunler);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Ekle"));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Ürün Barkodu :");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Ürün Adı :");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Birim :");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setText("Marka :");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel17.setText("Kategori :");

        jLabel18.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel18.setText("Alış Fiyatı :");

        jLabel19.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel19.setText("Satış Fiyatı :");

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel20.setText("Kritik Stok :");

        jLabel21.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel21.setText("Ürün Görseli :");

        jLabel22.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel22.setText("Vergi Oranı :");

        btnUkaydet.setText("Kaydet");
        btnUkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUkaydetActionPerformed(evt);
            }
        });

        cbBirim.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbUmarka.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbUkategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtUAlis.setText("0.00");

        txtUSatis.setText("0.00");

        txtUKritik.setText("0");

        lblUgorsel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        cbUvergi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "8", "18", "20", "21", "25", "65" }));

        cbAlisVergi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vergi Dahil", "Vergi Hariç" }));

        cbSatisVergi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vergi Dahil", "Vergi Hariç" }));

        jLabel24.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel24.setText("Miktar :");

        btnUIptal.setText("İptal Et");

        btnGorselSec.setText("Görsel Seç");
        btnGorselSec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGorselSecActionPerformed(evt);
            }
        });

        jLabel23.setText("Üründen bu kadar kalınca bilgilendir.");

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setText("%");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel22)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel1)
                            .addComponent(jLabel24))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUadi)
                            .addComponent(txtUbarkod)
                            .addComponent(cbBirim, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbUkategori, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUAlis)
                            .addComponent(txtUSatis)
                            .addComponent(txtUKritik)
                            .addComponent(cbUmarka, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUmiktar)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbUvergi, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(168, 168, 168)
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblUgorsel, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGorselSec, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cbAlisVergi, 0, 100, Short.MAX_VALUE)
                                        .addComponent(cbSatisVergi, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 819, Short.MAX_VALUE)
                        .addComponent(btnUIptal)))
                .addGap(18, 18, 18)
                .addComponent(btnUkaydet)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnGorselSec)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblUgorsel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel14)
                                            .addComponent(txtUadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel21))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(txtUbarkod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(cbBirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(txtUmiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(cbUmarka, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(cbUkategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtUAlis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAlisVergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtUSatis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSatisVergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(cbUvergi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtUKritik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUkaydet)
                    .addComponent(btnUIptal))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlUrunEkleLayout = new javax.swing.GroupLayout(pnlUrunEkle);
        pnlUrunEkle.setLayout(pnlUrunEkleLayout);
        pnlUrunEkleLayout.setHorizontalGroup(
            pnlUrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUrunEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlUrunEkleLayout.setVerticalGroup(
            pnlUrunEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUrunEkleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        tbUrunler.addTab("Ürün/Hizmet Ekle", pnlUrunEkle);

        pnlStokEkle.setBorder(javax.swing.BorderFactory.createTitledBorder("Stok Ekle"));

        tblStokUrunler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblStokUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStokUrunlerMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblStokUrunler);

        lblAra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_18px.png"))); // NOI18N

        txtAra1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAra1.setForeground(new java.awt.Color(153, 153, 153));
        txtAra1.setText("Ara...");
        txtAra1.setToolTipText("");
        txtAra1.setBorder(null);
        txtAra1.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAra1.setOpaque(false);
        txtAra1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAra1FocusGained(evt);
            }
        });
        txtAra1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAra1ActionPerformed(evt);
            }
        });
        txtAra1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAra1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAra1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAra1))
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAra1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Stok Eklenecek Ürün ");

        lblUrunAdi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblUrunAdi.setForeground(new java.awt.Color(255, 0, 51));

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel29.setText("Eklenecek Ürün Sayısı");

        btnStokEkle.setText("Ekle");
        btnStokEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStokEkleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlStokEkleLayout = new javax.swing.GroupLayout(pnlStokEkle);
        pnlStokEkle.setLayout(pnlStokEkleLayout);
        pnlStokEkleLayout.setHorizontalGroup(
            pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStokEkleLayout.createSequentialGroup()
                .addGroup(pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlStokEkleLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStokEkleLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlStokEkleLayout.createSequentialGroup()
                        .addGroup(pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnStokEkle)
                            .addGroup(pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtEklenecekStok)))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(pnlStokEkleLayout.createSequentialGroup()
                        .addComponent(lblUrunAdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))))
        );
        pnlStokEkleLayout.setVerticalGroup(
            pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStokEkleLayout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStokEkleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(pnlStokEkleLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblUrunAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel29)
                        .addGap(18, 18, 18)
                        .addComponent(txtEklenecekStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnStokEkle)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pnlGrupYonetim.setLayout(new java.awt.CardLayout());

        pnlKategori.setBorder(javax.swing.BorderFactory.createTitledBorder("Kategori Ekle"));

        jLabel27.setText("Kategori Açıklama :");

        jLabel28.setText("Kategori Adı :");

        txtKategoriAciklama.setColumns(20);
        txtKategoriAciklama.setRows(5);
        jScrollPane4.setViewportView(txtKategoriAciklama);

        btnKategoriEkle.setText("Ekle");
        btnKategoriEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriEkleActionPerformed(evt);
            }
        });

        jScrollPane6.setViewportView(lsKategori);

        btnKategoriSil.setText("Sil");
        btnKategoriSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategoriSilActionPerformed(evt);
            }
        });

        jButton7.setText("Düzenle");

        javax.swing.GroupLayout pnlKategoriLayout = new javax.swing.GroupLayout(pnlKategori);
        pnlKategori.setLayout(pnlKategoriLayout);
        pnlKategoriLayout.setHorizontalGroup(
            pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlKategoriLayout.createSequentialGroup()
                        .addComponent(jScrollPane6)
                        .addGap(95, 95, 95)
                        .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnKategoriSil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton7)))
                    .addGroup(pnlKategoriLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(txtKategoriAdi)
                            .addComponent(btnKategoriEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        pnlKategoriLayout.setVerticalGroup(
            pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKategoriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtKategoriAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(18, 18, 18)
                .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlKategoriLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel27))
                .addGap(18, 18, 18)
                .addComponent(btnKategoriEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlKategoriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlKategoriLayout.createSequentialGroup()
                        .addComponent(btnKategoriSil)
                        .addGap(18, 18, 18)
                        .addComponent(jButton7)))
                .addContainerGap())
        );

        pnlGrupYonetim.add(pnlKategori, "card3");

        pnlBirim.setBorder(javax.swing.BorderFactory.createTitledBorder("Birim Ekle"));

        jLabel34.setText("Birim Açıklama :");

        txtBirimAciklama.setColumns(20);
        txtBirimAciklama.setRows(5);
        jScrollPane7.setViewportView(txtBirimAciklama);

        jLabel35.setText("Birim Adı :");

        lsBirimler.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane8.setViewportView(lsBirimler);

        btnBirimEkle.setText("Ekle");
        btnBirimEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirimEkleActionPerformed(evt);
            }
        });

        jButton9.setText("Sil");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Düzenle");

        javax.swing.GroupLayout pnlBirimLayout = new javax.swing.GroupLayout(pnlBirim);
        pnlBirim.setLayout(pnlBirimLayout);
        pnlBirimLayout.setHorizontalGroup(
            pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBirimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlBirimLayout.createSequentialGroup()
                        .addComponent(jScrollPane8)
                        .addGap(95, 95, 95)
                        .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton10)))
                    .addGroup(pnlBirimLayout.createSequentialGroup()
                        .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(txtBirimAdi)
                            .addComponent(btnBirimEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        pnlBirimLayout.setVerticalGroup(
            pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBirimLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBirimAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBirimLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel34))
                .addGap(18, 18, 18)
                .addComponent(btnBirimEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlBirimLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlBirimLayout.createSequentialGroup()
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)))
                .addContainerGap())
        );

        pnlGrupYonetim.add(pnlBirim, "card4");

        pnlMarka.setBorder(javax.swing.BorderFactory.createTitledBorder("Marka Ekle"));

        jLabel36.setText("Marka Açıklama :");

        txtMarkaAciklama.setColumns(20);
        txtMarkaAciklama.setRows(5);
        jScrollPane9.setViewportView(txtMarkaAciklama);

        jLabel37.setText("Marka Adı :");

        lsMarkalar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane10.setViewportView(lsMarkalar);

        btnMarkaEkle.setText("Ekle");
        btnMarkaEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkaEkleActionPerformed(evt);
            }
        });

        btnMarkaSil.setText("Sil");
        btnMarkaSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkaSilActionPerformed(evt);
            }
        });

        jButton13.setText("Düzenle");

        javax.swing.GroupLayout pnlMarkaLayout = new javax.swing.GroupLayout(pnlMarka);
        pnlMarka.setLayout(pnlMarkaLayout);
        pnlMarkaLayout.setHorizontalGroup(
            pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMarkaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlMarkaLayout.createSequentialGroup()
                        .addComponent(jScrollPane10)
                        .addGap(95, 95, 95)
                        .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMarkaSil, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton13)))
                    .addGroup(pnlMarkaLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                            .addComponent(txtMarkaAdi)
                            .addComponent(btnMarkaEkle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );
        pnlMarkaLayout.setVerticalGroup(
            pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMarkaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMarkaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37))
                .addGap(18, 18, 18)
                .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMarkaLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel36))
                .addGap(18, 18, 18)
                .addComponent(btnMarkaEkle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(pnlMarkaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlMarkaLayout.createSequentialGroup()
                        .addComponent(btnMarkaSil)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13)))
                .addContainerGap())
        );

        pnlGrupYonetim.add(pnlMarka, "card2");

        pnlGruplar.setLayout(new java.awt.GridLayout(1, 0));

        btnKategoriler.setText("Kategoriler");
        btnKategoriler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKategorilerActionPerformed(evt);
            }
        });
        pnlGruplar.add(btnKategoriler);

        btnMarkalar.setText("Markalar");
        btnMarkalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkalarActionPerformed(evt);
            }
        });
        pnlGruplar.add(btnMarkalar);

        btnBirimler.setText("Birimler");
        btnBirimler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBirimlerActionPerformed(evt);
            }
        });
        pnlGruplar.add(btnBirimler);

        javax.swing.GroupLayout pnlUrunAyarLayout = new javax.swing.GroupLayout(pnlUrunAyar);
        pnlUrunAyar.setLayout(pnlUrunAyarLayout);
        pnlUrunAyarLayout.setHorizontalGroup(
            pnlUrunAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlUrunAyarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlStokEkle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(pnlUrunAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGrupYonetim, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlGruplar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        pnlUrunAyarLayout.setVerticalGroup(
            pnlUrunAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlUrunAyarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlUrunAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlStokEkle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlUrunAyarLayout.createSequentialGroup()
                        .addComponent(pnlGruplar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlGrupYonetim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        tbUrunler.addTab("Ürün Ayarları", pnlUrunAyar);

        javax.swing.GroupLayout pnlStokLayout = new javax.swing.GroupLayout(pnlStok);
        pnlStok.setLayout(pnlStokLayout);
        pnlStokLayout.setHorizontalGroup(
            pnlStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbUrunler)
            .addGroup(pnlStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlStokBilgi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlStokLayout.setVerticalGroup(
            pnlStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStokLayout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(tbUrunler))
            .addGroup(pnlStokLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlStokLayout.createSequentialGroup()
                    .addComponent(pnlStokBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 538, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addComponent(pnlStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 5, Short.MAX_VALUE)
                .addComponent(pnlStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
     static DB db = new DB();
    private void txtAraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAraFocusGained
        txtAra.setText("");
    }//GEN-LAST:event_txtAraFocusGained

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAraActionPerformed

    private void txtAra1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAra1FocusGained
       txtAra1.setText("");
    }//GEN-LAST:event_txtAra1FocusGained

    private void txtAra1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAra1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAra1ActionPerformed
public void labeldoldur(){
        
        try {
            String urunlerQuery = "select sum(urunMiktar) as toplamGelir from urunler";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblToplamStok.setText(next + " Adet");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
        
       try {
            String urunlerQuery = "select sum(d.siparisMiktar) as toplamGelir from siparisdetay d inner join siparisler as s on d.siparisID=s.siparisId";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblSatılanStok.setText(next + " Adet");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
       try {
            String urunlerQuery = "select sum(urunMiktar*urunSatis) from urunler";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblSatis.setText(next + " ");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
       try {
            String urunlerQuery = "select sum(urunMiktar*urunAlis) from urunler;";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblAlis.setText(next + "");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
    }
    private void btnUkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUkaydetActionPerformed
        String q = "";
        try {
            String resimPath = "";
            if (!resimPath.equals("")) {
                Random rnd = new Random();
                int sayi = rnd.nextInt(999999999);
                if (uzanti.equalsIgnoreCase("jpg")) {
                    f = new File("./urun_img/" + sayi + ".jpg");
                } else if (uzanti.equalsIgnoreCase("png")) {
                    f = new File("./urun_img/" + sayi + ".png");
                }
                resimPath = "./urun_img/" + sayi + ".jpg";
                try {
                    ImageIO.write(img, "jpg", f);
                    System.out.println("kayit basarili");
                } catch (IOException ex) {
                    System.err.println("resim yükleme hatası :" + ex);
                }

            }
            resimPath = null;
            String uAd = txtUadi.getText();
            String uBarkod = txtUbarkod.getText();
            int uBirim = birimLS.get(cbBirim.getSelectedIndex()).getuBirimId();
            int uMiktar = Integer.parseInt(txtUmiktar.getText());
            int uMarka = markaLS.get(cbUmarka.getSelectedIndex()).getuMarkaId();
            int uKategori = kategoriLS.get(cbUkategori.getSelectedIndex()).getuKategoriId();
            float uAlis = Float.parseFloat(txtUAlis.getText());
            int uAlisV = cbAlisVergi.getSelectedIndex();
            float uSatis = Float.parseFloat(txtUSatis.getText());
            int uSatisV = cbSatisVergi.getSelectedIndex();
            int vergi = Integer.parseInt((String) cbUvergi.getSelectedItem());
            int uKritik = Integer.parseInt(txtUKritik.getText());
            q = "Call urunEkle(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement pr = db.preBaglan(q);

            pr.setString(1, uAd);
            pr.setString(2, uBarkod);
            pr.setInt(3, uBirim);
            pr.setInt(4, uMiktar);
            pr.setInt(5, uMarka);
            pr.setInt(6, uKategori);
            pr.setFloat(7, uAlis);
            pr.setInt(8, uAlisV);
            pr.setFloat(9, uSatis);
            pr.setInt(10, uSatisV);
            pr.setInt(11, vergi);
            pr.setInt(12, uKritik);
            pr.setString(13, resimPath);
            int yaz = pr.executeUpdate();
            System.out.println(yaz);
            dataGetir(1);

        } catch (SQLException ex) {
            System.err.println("ürün ekleme hatası : "+ex);
        }

    }//GEN-LAST:event_btnUkaydetActionPerformed
    String dosyaYolu;
    BufferedImage img = null;
    File f = null;
    String uzanti = null;
    private void btnGorselSecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGorselSecActionPerformed

        JFileChooser resimSec = new JFileChooser();
        resimSec.showOpenDialog(null);
        File f = resimSec.getSelectedFile();
        dosyaYolu = f.getAbsolutePath();
        uzanti = FilenameUtils.getExtension(f.getName());

        try {
            img = ImageIO.read(new File(dosyaYolu));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Image dimg = img.getScaledInstance(lblUgorsel.getWidth(), lblUgorsel.getHeight(),
                Image.SCALE_REPLICATE);

        ImageIcon resim = new ImageIcon(dimg);
        lblUgorsel.setIcon(resim);
    }//GEN-LAST:event_btnGorselSecActionPerformed
    int mevcutStok = 0;
    String ubarkod;
    private void tblStokUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStokUrunlerMouseClicked
        int row = tblStokUrunler.getSelectedRow();
        if (row > -1) {
            ubarkod = (String) tblStokUrunler.getValueAt(row, 0);
            mevcutStok = Integer.parseInt((String) tblStokUrunler.getValueAt(row, 2));
            lblUrunAdi.setText((String) tblStokUrunler.getValueAt(row, 1));
            btnStokEkle.setEnabled(true);
        }
    }//GEN-LAST:event_tblStokUrunlerMouseClicked

    private void btnStokEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStokEkleActionPerformed
        int toplamStok = mevcutStok + Integer.parseInt(txtEklenecekStok.getText());
        try {
            String duzenleQuery = "update urunler set urunMiktar ='" + toplamStok + "' where urunBarkod = '" + ubarkod + "'";
            int sonuc = db.baglan().executeUpdate(duzenleQuery);
            if (sonuc > 0) {
                txtEklenecekStok.setText("0");
                dataGetir(2);
            }

        } catch (SQLException ex) {
            System.err.println("Yazma Hatası : " + ex);

        }
        labeldoldur();
    }//GEN-LAST:event_btnStokEkleActionPerformed

    private void btnKategorilerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategorilerActionPerformed
        fcPnlGetir(pnlKategori);
    }//GEN-LAST:event_btnKategorilerActionPerformed

    private void btnMarkalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkalarActionPerformed
        fcPnlGetir(pnlMarka);
    }//GEN-LAST:event_btnMarkalarActionPerformed

    private void btnBirimlerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirimlerActionPerformed
        fcPnlGetir(pnlBirim);
    }//GEN-LAST:event_btnBirimlerActionPerformed

    private void btnMarkaEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkaEkleActionPerformed
        String markaAdi=txtMarkaAdi.getText().trim();
        String markaAciklama=txtMarkaAciklama.getText().trim();
        
        if (markaAdi.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "Kategori adı girin...");
            txtBirimAdi.requestFocus();
        }
        
        try {
            String kaydetQuery = "insert into markalar values(null,'" + markaAdi + "','" + markaAciklama + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtMarkaAdi.setText("");
                txtMarkaAciklama.setText("");
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarısız");
                
            }
        } catch (Exception e) {
            System.err.println("kaydetme hatası : "+e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu kategori zaten var...");
            }
        }
        markaLS.clear();
        markaCBDoldur();
    }//GEN-LAST:event_btnMarkaEkleActionPerformed

    private void btnKategoriEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriEkleActionPerformed
        String kategoriAdi=txtKategoriAdi.getText().trim();
        String kategoriAciklama=txtKategoriAciklama.getText().trim();
        
        if (kategoriAdi.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "Kategori adı girin...");
            txtKategoriAdi.requestFocus();
        }
        
        try {
            String kaydetQuery = "insert into urunkategoriler values(null,'" + kategoriAdi + "','" + kategoriAciklama + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtKategoriAdi.setText("");
                txtKategoriAciklama.setText("");
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarısız");
                
            }
        } catch (Exception e) {
            System.err.println("kaydetme hatası : "+e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu kategori zaten var...");
            }
        }
        kategoriLS.clear();
        kategoriCBDoldur();
    }//GEN-LAST:event_btnKategoriEkleActionPerformed

    private void txtAra1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAra1KeyPressed
        ara(1);
    }//GEN-LAST:event_txtAra1KeyPressed

    private void txtAraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyPressed
        ara(2);
    }//GEN-LAST:event_txtAraKeyPressed

    private void tbUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbUrunlerMouseClicked
        dataGetir(2);
    }//GEN-LAST:event_tbUrunlerMouseClicked

    private void btnKategoriSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKategoriSilActionPerformed
        urunKategoriler silinecek = kategoriLS.get(lsKategori.getSelectedIndex());
        int silincekId = silinecek.getuKategoriId();
        
        String q="delete from urunKategoriler where kategoriId = '" + silincekId + "' ";
        String denetimQuery="select * from urunler where urunKategori='"+silincekId+"'";
        
        try {
            ResultSet rs=db.baglan().executeQuery(denetimQuery);
            if (rs.next()) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu kategoriye ait stoklu ürünler var");
            }else{
                int silSonuc = db.baglan().executeUpdate(q);
            if (silSonuc>0) {
                JOptionPane.showMessageDialog(getRootPane(), "Silme başarılı");
            }
            }
            
        } catch (SQLException ex) {
            System.err.println("Silme hatası"+ex);
        }
       kategoriLS.clear();
        kategoriCBDoldur();
    }//GEN-LAST:event_btnKategoriSilActionPerformed

    private void btnBirimEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBirimEkleActionPerformed

       String birimAdi=txtBirimAdi.getText().trim();
        String birimAciklama=txtBirimAciklama.getText().trim();
        
        if (birimAdi.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "Kategori adı girin...");
            txtBirimAdi.requestFocus();
        }
        
        try {
            String kaydetQuery = "insert into urunbirimler values(null,'" + birimAdi + "','" + birimAciklama + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtBirimAdi.setText("");
                txtBirimAciklama.setText("");
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarısız");
                
            }
        } catch (Exception e) {
            System.err.println("kaydetme hatası : "+e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu kategori zaten var...");
            }
        }
        birimLS.clear();
        birimCBDoldur();
    }//GEN-LAST:event_btnBirimEkleActionPerformed

    private void btnMarkaSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkaSilActionPerformed

        urunMarkalar silinecek = markaLS.get(lsMarkalar.getSelectedIndex());
        int silincekId = silinecek.getuMarkaId();
        
        String q="delete from markalar where markaId = '" + silincekId + "' ";
        String denetimQuery="select * from urunler where urunMarka='"+silincekId+"'";
        
        try {
            ResultSet rs=db.baglan().executeQuery(denetimQuery);
            if (rs.next()) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu markaya ait stoklu ürünler var");
            }else{
                int silSonuc = db.baglan().executeUpdate(q);
            if (silSonuc>0) {
                JOptionPane.showMessageDialog(getRootPane(), "Silme başarılı");
            }
            }
            
        } catch (SQLException ex) {
            System.err.println("Silme hatası"+ex);
        }
        markaLS.clear();
        markaCBDoldur();
        
    }//GEN-LAST:event_btnMarkaSilActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed

       urunBirimler silinecek = birimLS.get(lsBirimler.getSelectedIndex());
        int silincekId = silinecek.getuBirimId();
        
        String q="delete from urunBirimler where birimId = '" + silincekId + "' ";
        String denetimQuery="select * from urunler where urunBirim='"+silincekId+"'";
        
        try {
            ResultSet rs=db.baglan().executeQuery(denetimQuery);
            if (rs.next()) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu birime ait stoklu ürünler var");
            }else{
                int silSonuc = db.baglan().executeUpdate(q);
            if (silSonuc>0) {
                JOptionPane.showMessageDialog(getRootPane(), "Silme başarılı");
            }
            }
            
        } catch (SQLException ex) {
            System.err.println("Silme hatası"+ex);
        }
        birimLS.clear();
        birimCBDoldur();
        
    }//GEN-LAST:event_jButton9ActionPerformed
    public void birimCBDoldur() {
        try {
            String q = "select*from urunBirimler";
            ResultSet rs = db.baglan().executeQuery(q);

            while (rs.next()) {
                urunBirimler ub = new urunBirimler();
                ub.setuBirimId(rs.getInt(1));
                ub.setuBirimAdi(rs.getString(2));
                ub.setuBirimAciklama(rs.getString(3));
                birimLS.add(ub);

            }
            birimModelDoldur();
        } catch (Exception e) {
            System.err.println("grup getirme hatası" + e);
        }
    }

    public void birimModelDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        DefaultListModel<String> dlm = new DefaultListModel<>();
        for (urunBirimler item : birimLS) {
            dkm.addElement(item.getuBirimAdi());
            dlm.addElement(item.getuBirimAdi());
        }
        cbBirim.setModel(dkm);
        lsBirimler.setModel(dlm);

    }

    public void kategoriCBDoldur() {
        try {

            String q2 = "select*from urunKategoriler";
            ResultSet rs2 = db.baglan().executeQuery(q2);

            while (rs2.next()) {
                urunKategoriler uk = new urunKategoriler();
                uk.setuKategoriId(rs2.getInt(1));
                uk.setuKategoriAdi(rs2.getString(2));
                uk.setuKategoriAciklama(rs2.getString(3));
                kategoriLS.add(uk);
            }
            kategoriModelDoldur();
        } catch (Exception e) {
            System.err.println("grup getirme hatası" + e);
        }
    }

    public void kategoriModelDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        DefaultListModel<String> dlm = new DefaultListModel<>();

        for (urunKategoriler item : kategoriLS) {
            dkm.addElement(item.getuKategoriAdi());
            dlm.addElement(item.getuKategoriAdi());
        }

        cbUkategori.setModel(dkm);
        lsKategori.setModel(dlm);

    }

    public void markaCBDoldur() {
        try {

            String q = "select*from markalar";
            ResultSet rs = db.baglan().executeQuery(q);

            while (rs.next()) {
                urunMarkalar um = new urunMarkalar();
                um.setuMarkaId(rs.getInt(1));
                um.setuMarkaAdi(rs.getString(2));
                um.setuMarkaAciklama(rs.getString(3));
                markaLS.add(um);

            }
            markaModelDoldur();
        } catch (Exception e) {
            System.err.println("grup getirme hatası" + e);
        }
    }

    public void markaModelDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        DefaultListModel<String> dlm = new DefaultListModel<>();

        for (urunMarkalar item : markaLS) {
            dkm.addElement(item.getuMarkaAdi());
            dlm.addElement(item.getuMarkaAdi());
        }
        cbUmarka.setModel(dkm);
        lsMarkalar.setModel(dlm);

    }

    public void dataGetir(int x) {
        if (x == 1) {
            try {
                String urunlerQuery = "select *from urunler";

                ResultSet rs = db.baglan().executeQuery(urunlerQuery);

                DefaultTableModel dtm = new DefaultTableModel();
                dtm.addColumn("Barkod");
                dtm.addColumn("Ürün Adı");
                dtm.addColumn("Kategori");
                dtm.addColumn("Marka");
                dtm.addColumn("Stok");
                dtm.addColumn("Alis Fiyati");
                dtm.addColumn("Satış Fiyatı");
                dtm.addColumn("KDV ORANI");

                while (rs.next()) {
                    int markaID = Integer.parseInt(rs.getString("urunMarka"));
                    int kategoriID = Integer.parseInt(rs.getString("urunKategori"));
                    String marka="Markasız";
                    String kategori="Kategorisiz";
                    for (urunMarkalar item : markaLS) {
                        if(item.getuMarkaId()==markaID){
                            marka=item.getuMarkaAdi();
                        }
                    }
                    for (urunKategoriler item : kategoriLS) {
                        if(item.getuKategoriId()==kategoriID){
                            kategori=item.getuKategoriAdi();
                        }
                    }
                    
                    dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"),
                        kategori, marka, rs.getString("urunMiktar"), rs.getString("urunAlis"),
                        rs.getString("urunSatis"), rs.getString("urunVergi")});
                }
                tblUrunListesi.setModel(dtm);

            } catch (Exception e) {
                System.err.println("okuma hatası..." + e);
            }
        } else {
            try {
                String urunlerQuery = "select *from urunler";

                ResultSet rs = db.baglan().executeQuery(urunlerQuery);

                DefaultTableModel dtm = new DefaultTableModel();
                dtm.addColumn("Barkod");
                dtm.addColumn("Ürün Adı");
                dtm.addColumn("Stok");

                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"), rs.getString("urunMiktar")});
                }
                tblStokUrunler.setModel(dtm);

            } catch (Exception e) {
                System.err.println("okuma hatası..." + e);
            }
        }

    }

    public void fcPnlGetir(JPanel x) {
        pnlGrupYonetim.removeAll();
        pnlGrupYonetim.repaint();
        pnlGrupYonetim.revalidate();
        pnlGrupYonetim.add(x);
        pnlGrupYonetim.repaint();
        pnlGrupYonetim.revalidate();
    }

    public String fullTextConvert(String data) {
        String gonder = "";
        String[] dizi = data.split(" ");
        for (String item : dizi) {
            if (!item.trim().equals("")) {
                gonder += item + "*";
            }
        }
        return gonder;
    }

    public void ara(int x) {
        if (x == 1) {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Barkod");
            dtm.addColumn("Ürün Adı");

            String ara = fullTextConvert(txtAra1.getText().trim());
            try {
                ResultSet rs = db.baglan().executeQuery("call urunAra('" + ara + "')");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi")});
                }
                tblStokUrunler.setModel(dtm);

            } catch (Exception e) {
                System.err.println("Data Getirme Hatasi: " + e);
            } 
        } else {
            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Barkod");
            dtm.addColumn("Ürün Adı");
            dtm.addColumn("Kategori");
            dtm.addColumn("Marka");
            dtm.addColumn("Stok");
            dtm.addColumn("Alis Fiyati");
            dtm.addColumn("Satış Fiyatı");
            dtm.addColumn("KDV ORANI");
            String ara = fullTextConvert(txtAra.getText().trim());
            try {
                ResultSet rs = db.baglan().executeQuery("call urunAra('" + ara + "')");
                while (rs.next()) {
                    dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"),
                        rs.getString("urunKategori"), rs.getString("urunMarka"), rs.getString("urunMiktar"), rs.getString("urunAlis"),
                        rs.getString("urunSatis"), rs.getString("urunVergi")});
                }
                tblUrunListesi.setModel(dtm);

            } catch (Exception e) {
                System.err.println("Data Getirme Hatasi: " + e);
            } finally {
                db.kapat();
            }
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBirimEkle;
    private javax.swing.JButton btnBirimler;
    private javax.swing.JButton btnGorselSec;
    private javax.swing.JButton btnKategoriEkle;
    private javax.swing.JButton btnKategoriSil;
    private javax.swing.JButton btnKategoriler;
    private javax.swing.JButton btnMarkaEkle;
    private javax.swing.JButton btnMarkaSil;
    private javax.swing.JButton btnMarkalar;
    private javax.swing.JButton btnStokEkle;
    private javax.swing.JButton btnUIptal;
    private javax.swing.JButton btnUkaydet;
    private javax.swing.JComboBox<String> cbAlisVergi;
    private javax.swing.JComboBox<String> cbBirim;
    private javax.swing.JComboBox<String> cbSatisVergi;
    private javax.swing.JComboBox<String> cbUkategori;
    private javax.swing.JComboBox<String> cbUmarka;
    private javax.swing.JComboBox<String> cbUvergi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblAlis;
    private javax.swing.JLabel lblAra;
    private javax.swing.JLabel lblAra1;
    private javax.swing.JLabel lblSatis;
    private javax.swing.JLabel lblSatılanStok;
    private javax.swing.JLabel lblToplamStok;
    private javax.swing.JLabel lblUgorsel;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JList<String> lsBirimler;
    private javax.swing.JList<String> lsKategori;
    private javax.swing.JList<String> lsMarkalar;
    private javax.swing.JPanel pnlBirim;
    private javax.swing.JPanel pnlGrupYonetim;
    private javax.swing.JPanel pnlGruplar;
    private javax.swing.JPanel pnlKategori;
    private javax.swing.JPanel pnlMarka;
    private javax.swing.JPanel pnlStok;
    private javax.swing.JPanel pnlStokBilgi;
    private javax.swing.JPanel pnlStokEkle;
    private javax.swing.JPanel pnlUrunAyar;
    private javax.swing.JPanel pnlUrunEkle;
    private javax.swing.JPanel pnlUrunler;
    private javax.swing.JTabbedPane tbUrunler;
    private javax.swing.JTable tblStokUrunler;
    private javax.swing.JTable tblUrunListesi;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtAra1;
    private javax.swing.JTextArea txtBirimAciklama;
    private javax.swing.JTextField txtBirimAdi;
    private javax.swing.JTextField txtEklenecekStok;
    private javax.swing.JTextArea txtKategoriAciklama;
    private javax.swing.JTextField txtKategoriAdi;
    private javax.swing.JTextArea txtMarkaAciklama;
    private javax.swing.JTextField txtMarkaAdi;
    private javax.swing.JTextField txtUAlis;
    private javax.swing.JTextField txtUKritik;
    private javax.swing.JTextField txtUSatis;
    private javax.swing.JTextField txtUadi;
    private javax.swing.JTextField txtUbarkod;
    private javax.swing.JTextField txtUmiktar;
    // End of variables declaration//GEN-END:variables
}
