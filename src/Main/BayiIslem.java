/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import Functions.ilIlceDoldur;
import static Main.UrunIslem.db;
import Properties.bankalarPro;
import Properties.cariGruplar;
import Properties.ilPro;
import Properties.ilcePro;
import Properties.siparisOlusturPro;
import com.sun.javafx.binding.StringFormatter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Zeki
 */
public class BayiIslem extends javax.swing.JPanel {

    ArrayList<cariGruplar> cariLS = new ArrayList<>();

    public BayiIslem() {
        initComponents();
        AutoCompleteDecorator.decorate(cbBayiler);
        cbBil.setModel(new ilIlceDoldur().ilDoldur());
        cbBilce.setModel((DefaultComboBoxModel<String>) new ilIlceDoldur().ilceDoldur(0).get("default"));
        grupCBDoldur();
        dataGetir();
        labeldoldur();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabBayi = new javax.swing.JTabbedPane();
        pnlBayiOzet = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        lblAra = new javax.swing.JLabel();
        txtAra = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBayiler2 = new javax.swing.JTable();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblGecmis = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        lblGuncelBakiye = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        btnIslemKaydet = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        cbIslemTuru = new javax.swing.JComboBox<>();
        cbOdemeTuru = new javax.swing.JComboBox<>();
        txtIslemTutar = new javax.swing.JTextField();
        txtIslemAciklama = new javax.swing.JTextField();
        dtIslemTarih = new com.toedter.calendar.JDateChooser();
        jLabel40 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        lblBayi = new javax.swing.JLabel();
        lblYetkili = new javax.swing.JLabel();
        lblTel = new javax.swing.JLabel();
        lblCep = new javax.swing.JLabel();
        lblFax = new javax.swing.JLabel();
        lblVergiD = new javax.swing.JLabel();
        lblVergiNo = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        lblAdres = new javax.swing.JLabel();
        pnlBayiSiparis = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        lblAra2 = new javax.swing.JLabel();
        txtAra2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblUrunler = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        cbBayiler = new javax.swing.JComboBox<>();
        jLabel25 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tblSiparisler = new javax.swing.JTable();
        jPanel25 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        lblUrunAdi = new javax.swing.JLabel();
        lblBirimFiyat = new javax.swing.JLabel();
        txtMiktar = new javax.swing.JTextField();
        lblKdv = new javax.swing.JLabel();
        lblToplam = new javax.swing.JLabel();
        btnSiparisEkle = new javax.swing.JButton();
        jPanel23 = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        lblislemToplam = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        lblvergiToplam = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        lblGenelToplam = new javax.swing.JLabel();
        txtSiparisAciklama = new javax.swing.JTextField();
        dtSiparisTarihi = new com.toedter.calendar.JDateChooser();
        dtOdemeTarihi = new com.toedter.calendar.JDateChooser();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel52 = new javax.swing.JLabel();
        txtPesinat = new javax.swing.JTextField();
        cbPesinat = new javax.swing.JCheckBox();
        btnSiparisKaydet = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        pnlBayiAyar = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtBgrupAdi = new javax.swing.JTextField();
        btnBGekle = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lsBGruplar = new javax.swing.JList<>();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtBadi = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnBkaydet = new javax.swing.JButton();
        btnBiptal = new javax.swing.JButton();
        txtByetkili = new javax.swing.JTextField();
        txtBtel = new javax.swing.JTextField();
        txtBfax = new javax.swing.JTextField();
        txtBcep = new javax.swing.JTextField();
        txtBeposta = new javax.swing.JTextField();
        txtBLimit = new javax.swing.JTextField();
        txtBBakiye = new javax.swing.JTextField();
        txtBvergid = new javax.swing.JTextField();
        txtBVergiN = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txtBAdres = new javax.swing.JTextField();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        cbBil = new javax.swing.JComboBox<>();
        cbBilce = new javax.swing.JComboBox<>();
        cbBgrup = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblBayiler = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        lblAra1 = new javax.swing.JLabel();
        txtBara = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel26 = new javax.swing.JLabel();
        pnlTedarikciBilgi = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblBuAy = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblToplamAlacak = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bayiler"));

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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAra, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAra))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAra))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblBayiler2.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBayiler2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBayiler2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblBayiler2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel15.setBorder(javax.swing.BorderFactory.createTitledBorder("Bayi Detay"));

        tblGecmis.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tblGecmis);

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel30.setText("Bayi :");

        jPanel16.setBackground(new java.awt.Color(215, 75, 82));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Turkish_Lira_60px.png"))); // NOI18N

        lblGuncelBakiye.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblGuncelBakiye.setForeground(new java.awt.Color(255, 255, 255));
        lblGuncelBakiye.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGuncelBakiye.setText("0.00");

        jLabel29.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel29.setText("Güncel Bakiye");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(lblGuncelBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGuncelBakiye, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel29)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel31.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel31.setText("İşlemler");

        jLabel32.setText("İşlem Türü :");

        jLabel33.setText("Tutar :");

        jLabel34.setText("Açıklama :");

        jLabel35.setText("Tarih :");

        jLabel36.setText("Ödeme Türü :");

        btnIslemKaydet.setText("Kaydet");
        btnIslemKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIslemKaydetActionPerformed(evt);
            }
        });

        jButton8.setText("İptal");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        cbIslemTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ödeme", "Satış", "Taksit", "" }));

        cbOdemeTuru.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Peşin", "Çek", "Havale/EFT", "Kredi Kartı", "Açık Hesap" }));

        dtIslemTarih.setDateFormatString("dd.MM.yyyy");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel33)
                                    .addComponent(jLabel32)
                                    .addComponent(jLabel34)
                                    .addComponent(jLabel35)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbIslemTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbOdemeTuru, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtIslemTutar)
                                    .addComponent(txtIslemAciklama)
                                    .addComponent(dtIslemTarih, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIslemKaydet)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(cbIslemTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(txtIslemTutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(txtIslemAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel35))
                    .addComponent(dtIslemTarih, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(cbOdemeTuru, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8)
                    .addComponent(btnIslemKaydet))
                .addGap(86, 86, 86))
        );

        jLabel40.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel40.setText("Yetkili :");

        jLabel59.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel59.setText("Tel :");

        jLabel60.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel60.setText("Cep :");

        jLabel61.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel61.setText("Fax :");

        jLabel62.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel62.setText("Adres :");

        jLabel63.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel63.setText("Vergi Dairesi :");

        jLabel64.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel64.setText("Vergi No :");

        lblBayi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblBayi.setText(" ");

        lblYetkili.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblYetkili.setText(" ");

        lblTel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblTel.setText(" ");

        lblCep.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblCep.setText(" ");

        lblFax.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblFax.setText(" ");

        lblVergiD.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblVergiD.setText(" ");

        lblVergiNo.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        lblVergiNo.setText(" ");

        jLabel68.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel68.setText("İşlem Geçmişi ");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel15Layout.createSequentialGroup()
                            .addGap(43, 43, 43)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel62, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel30)
                                .addComponent(jLabel40, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel59)
                                .addComponent(jLabel60)
                                .addComponent(jLabel61))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblBayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblYetkili, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblTel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFax, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                                    .addComponent(lblAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addComponent(jLabel68, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel63)
                            .addComponent(jLabel64))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVergiD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                            .addComponent(lblVergiNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblBayi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel40)
                            .addComponent(lblYetkili))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(lblTel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel60)
                            .addComponent(lblCep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(lblFax))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(lblVergiD))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel64)
                            .addComponent(lblVergiNo))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel68)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout pnlBayiOzetLayout = new javax.swing.GroupLayout(pnlBayiOzet);
        pnlBayiOzet.setLayout(pnlBayiOzetLayout);
        pnlBayiOzetLayout.setHorizontalGroup(
            pnlBayiOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBayiOzetLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBayiOzetLayout.setVerticalGroup(
            pnlBayiOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBayiOzetLayout.createSequentialGroup()
                .addGroup(pnlBayiOzetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabBayi.addTab("Bayi İşlemleri", pnlBayiOzet);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder("Ürün Listesi"));

        lblAra2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAra2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_18px.png"))); // NOI18N

        txtAra2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtAra2.setForeground(new java.awt.Color(153, 153, 153));
        txtAra2.setText("Ara...");
        txtAra2.setToolTipText("");
        txtAra2.setBorder(null);
        txtAra2.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtAra2.setOpaque(false);
        txtAra2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAra2FocusGained(evt);
            }
        });
        txtAra2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAra2ActionPerformed(evt);
            }
        });
        txtAra2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAra2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtAra2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAra2))
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAra2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtAra2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tblUrunler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUrunler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUrunlerMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tblUrunler);

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane7)
                .addContainerGap())
        );

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Oluştur"));

        jLabel24.setText("Bayi :");

        jLabel25.setText("Açıklama :");

        jLabel41.setText("İşlem Tarihi :");

        jLabel42.setText("Ödeme Tarihi :");

        tblSiparisler.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Ürün Adı", "Birim Fiyat", "Miktar", "Kdv Oranı", "Toplam"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane8.setViewportView(tblSiparisler);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder("Sipariş Detayları"));
        jPanel25.setLayout(new java.awt.GridLayout(2, 6, 5, 5));

        jLabel44.setText("Ürün Adı");
        jPanel25.add(jLabel44);

        jLabel45.setText("Birim Fiyatı");
        jPanel25.add(jLabel45);

        jLabel46.setText("Miktar");
        jPanel25.add(jLabel46);

        jLabel47.setText("KDV");
        jPanel25.add(jLabel47);

        jLabel43.setText("Toplam");
        jPanel25.add(jLabel43);
        jPanel25.add(jLabel48);
        jPanel25.add(lblUrunAdi);
        jPanel25.add(lblBirimFiyat);

        txtMiktar.setText("1");
        txtMiktar.setEnabled(false);
        txtMiktar.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtMiktarCaretUpdate(evt);
            }
        });
        txtMiktar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMiktarActionPerformed(evt);
            }
        });
        txtMiktar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMiktarKeyPressed(evt);
            }
        });
        jPanel25.add(txtMiktar);
        jPanel25.add(lblKdv);
        jPanel25.add(lblToplam);

        btnSiparisEkle.setText("Ekle");
        btnSiparisEkle.setEnabled(false);
        btnSiparisEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisEkleActionPerformed(evt);
            }
        });
        jPanel25.add(btnSiparisEkle);

        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel23.setLayout(new java.awt.GridLayout(4, 0, 5, 5));

        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel53.setText("Toplam :");
        jPanel23.add(jLabel53);

        lblislemToplam.setText("0.00 TL");
        jPanel23.add(lblislemToplam);

        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel56.setText("Kdv Toplam :");
        jPanel23.add(jLabel56);

        lblvergiToplam.setText("0.00 TL");
        jPanel23.add(lblvergiToplam);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Kampanya İndirimi :");
        jPanel23.add(jLabel1);

        jLabel8.setText("0.00 TL");
        jPanel23.add(jLabel8);

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel55.setText("Genel Toplam :");
        jPanel23.add(jLabel55);

        lblGenelToplam.setText("0.00 TL");
        jPanel23.add(lblGenelToplam);

        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel52.setText("Peşinat :");

        txtPesinat.setText("0.00");

        cbPesinat.setText("Tamamı Peşin Alındı.");
        cbPesinat.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbPesinatİtemStateChanged(evt);
            }
        });

        btnSiparisKaydet.setText("Kaydet");
        btnSiparisKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiparisKaydetActionPerformed(evt);
            }
        });

        jButton11.setText("İptal");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel41)
                            .addComponent(jLabel25)
                            .addComponent(jLabel24))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(dtOdemeTarihi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                .addComponent(dtSiparisTarihi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbBayiler, 0, 277, Short.MAX_VALUE)
                                .addComponent(txtSiparisAciklama)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel22Layout.createSequentialGroup()
                                .addComponent(jLabel52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPesinat, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbPesinat))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel22Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSiparisKaydet))
                            .addComponent(jPanel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel22Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel22Layout.createSequentialGroup()
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel24)
                                        .addComponent(cbBayiler, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel25)
                                        .addComponent(txtSiparisAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel41))
                                .addComponent(dtSiparisTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel42)
                                .addComponent(dtOdemeTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator7))
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPesinat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel52))
                        .addGap(18, 18, 18)
                        .addComponent(cbPesinat)))
                .addGap(18, 18, 18)
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSiparisKaydet)
                    .addComponent(jButton11))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBayiSiparisLayout = new javax.swing.GroupLayout(pnlBayiSiparis);
        pnlBayiSiparis.setLayout(pnlBayiSiparisLayout);
        pnlBayiSiparisLayout.setHorizontalGroup(
            pnlBayiSiparisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBayiSiparisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlBayiSiparisLayout.setVerticalGroup(
            pnlBayiSiparisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBayiSiparisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBayiSiparisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        tabBayi.addTab("Sipariş Oluştur", pnlBayiSiparis);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Grup Ekle"));

        jLabel12.setText("Grup Adi :");

        btnBGekle.setText("Ekle");
        btnBGekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBGekleActionPerformed(evt);
            }
        });

        lsBGruplar.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lsBGruplar);

        jButton1.setText("Sil");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBgrupAdi, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBGekle, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtBgrupAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnBGekle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Yeni Bayi Oluştur / Düzenle"));

        jLabel13.setText("Firma / Kişi Adı :");

        jLabel14.setText("Yetkili :");

        jLabel15.setText("Tel :");

        jLabel16.setText("Fax :");

        jLabel17.setText("Cep :");

        jLabel18.setText("E-posta :");

        jLabel19.setText("Açık Hesap Risk Limiti (TL) :");

        jLabel20.setText("Açılış Bakiyesi :");

        jLabel21.setText("Vergi Dairesi :");

        jLabel22.setText("Vergi No :");

        jLabel23.setText("Müşteri Grubu :");

        btnBkaydet.setText("Kaydet");
        btnBkaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBkaydetActionPerformed(evt);
            }
        });

        btnBiptal.setText("İptal Et");
        btnBiptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBiptalActionPerformed(evt);
            }
        });

        jLabel37.setText("Adres:");

        jLabel38.setText("İl :");

        jLabel39.setText("İlçe :");

        cbBil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBilİtemStateChanged(evt);
            }
        });
        cbBil.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cbBilFocusGained(evt);
            }
        });

        cbBilce.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbBilceİtemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBiptal)
                        .addGap(26, 26, 26)
                        .addComponent(btnBkaydet))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel39)
                            .addComponent(jLabel38)
                            .addComponent(jLabel37)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22)
                            .addComponent(jLabel21)
                            .addComponent(jLabel20)
                            .addComponent(jLabel19)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17)
                            .addComponent(jLabel16)
                            .addComponent(jLabel15)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cbBilce, javax.swing.GroupLayout.Alignment.LEADING, 0, 200, Short.MAX_VALUE)
                            .addComponent(cbBil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtBAdres, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBVergiN, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBvergid, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBBakiye, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBLimit, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBeposta, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBcep, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBfax, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBtel, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtByetkili, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBadi, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbBgrup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtBadi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtByetkili, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtBtel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtBfax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtBcep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtBeposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtBLimit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtBBakiye, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txtBvergid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtBVergiN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(txtBAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(cbBil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(cbBilce, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbBgrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBiptal)
                    .addComponent(btnBkaydet))
                .addContainerGap())
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bayi Listesi"));

        tblBayiler.setModel(new javax.swing.table.DefaultTableModel(
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
        tblBayiler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBayilerMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblBayiler);

        lblAra1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAra1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Search_18px.png"))); // NOI18N

        txtBara.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtBara.setForeground(new java.awt.Color(153, 153, 153));
        txtBara.setText("Ara...");
        txtBara.setToolTipText("");
        txtBara.setBorder(null);
        txtBara.setDisabledTextColor(new java.awt.Color(204, 204, 204));
        txtBara.setOpaque(false);
        txtBara.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBaraFocusGained(evt);
            }
        });
        txtBara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBaraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(txtBara, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAra1))
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAra1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBara))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel26.setText("Değişiklik yapmak istediğinizi seçiniz.");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel26)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );

        javax.swing.GroupLayout pnlBayiAyarLayout = new javax.swing.GroupLayout(pnlBayiAyar);
        pnlBayiAyar.setLayout(pnlBayiAyarLayout);
        pnlBayiAyarLayout.setHorizontalGroup(
            pnlBayiAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBayiAyarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBayiAyarLayout.setVerticalGroup(
            pnlBayiAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBayiAyarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBayiAyarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabBayi.addTab("Bayi Ayarları", pnlBayiAyar);

        pnlTedarikciBilgi.setLayout(new java.awt.GridLayout(1, 0));

        jPanel14.setBackground(new java.awt.Color(2, 188, 141));

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bu Ay Tahsilat");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Turkish_Lira_60px.png"))); // NOI18N

        lblBuAy.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblBuAy.setForeground(new java.awt.Color(255, 255, 255));
        lblBuAy.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBuAy.setText("0.00");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBuAy, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBuAy, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlTedarikciBilgi.add(jPanel14);

        jPanel12.setBackground(new java.awt.Color(76, 139, 217));

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Toplam Alacak");

        lblToplamAlacak.setFont(new java.awt.Font("Verdana", 0, 36)); // NOI18N
        lblToplamAlacak.setForeground(new java.awt.Color(255, 255, 255));
        lblToplamAlacak.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblToplamAlacak.setText("0.00");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Turkish_Lira_60px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(lblToplamAlacak, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblToplamAlacak, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pnlTedarikciBilgi.add(jPanel12);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 991, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlTedarikciBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 992, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 105, Short.MAX_VALUE)
                .addComponent(tabBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(pnlTedarikciBilgi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 582, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAraFocusGained
        txtAra.setText("");
    }//GEN-LAST:event_txtAraFocusGained

    private void txtAraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAraActionPerformed

    private void txtAra2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAra2FocusGained
        txtAra2.setText("");
    }//GEN-LAST:event_txtAra2FocusGained

    private void txtAra2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAra2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAra2ActionPerformed

    private void txtBaraFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBaraFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaraFocusGained

    private void txtBaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBaraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBaraActionPerformed

    private void cbBilFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cbBilFocusGained
        ilcedoldur();


    }//GEN-LAST:event_cbBilFocusGained

    private void cbBilİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBilİtemStateChanged

        ilcedoldur();
    }//GEN-LAST:event_cbBilİtemStateChanged
    DB db = new DB();
    private void btnBkaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBkaydetActionPerformed
        String q;
        if (seciliID.equals("")) {
            q = "Call bayiEkle(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        } else {
            q = "Call bayiDuzenle(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        try {

            String bAd = txtBadi.getText();
            String bYonetici = txtByetkili.getText();
            String bTel = txtBtel.getText();
            String bfax = txtBfax.getText();
            String bcep = txtBcep.getText();
            String bEposta = txtBeposta.getText();
            float bLimit = Float.parseFloat(txtBLimit.getText());
            float bBakiye = Float.parseFloat(txtBBakiye.getText());
            String bVergid = txtBvergid.getText();
            String bVergin = txtBVergiN.getText();
            String bAdres = txtBAdres.getText();
            int bil = cbBil.getSelectedIndex() + 1;
            int bgrup = cbBgrup.getSelectedIndex() + 1;

            PreparedStatement pr = db.preBaglan(q);

            pr.setString(1, bAd);
            pr.setString(2, bYonetici);
            pr.setString(3, bTel);
            pr.setString(4, bfax);
            pr.setString(5, bcep);
            pr.setString(6, bEposta);
            pr.setFloat(7, bLimit);
            pr.setFloat(8, bBakiye);
            pr.setString(9, bVergid);
            pr.setString(10, bVergin);
            pr.setString(11, bAdres);
            pr.setString(12, (bil + ""));
            pr.setString(13, (ilceId + ""));
            pr.setString(14, ("" + bgrup));

            int yaz = pr.executeUpdate();
            System.out.println(yaz);

        } catch (SQLException ex) {
            System.err.println("bayi ekleme hatası : " + ex);
        }
        System.out.println("kayıt eklendi");

        seciliID = "";
        txtBadi.setText("");
        txtByetkili.setText("");
        txtBtel.setText("");
        txtBfax.setText("");
        txtBcep.setText("");
        txtBeposta.setText("");
        txtBLimit.setText("");
        txtBBakiye.setText("");
        txtBVergiN.setText("");
        txtBvergid.setText("");
        txtBAdres.setText("");
        cbBil.setSelectedIndex(-1);
        cbBilce.setSelectedItem(-1);
        cbBgrup.setSelectedItem(-1);

    }//GEN-LAST:event_btnBkaydetActionPerformed
    int ilceId;
    private void cbBilceİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbBilceİtemStateChanged

        ArrayList<ilcePro> ls = (ArrayList<ilcePro>) new ilIlceDoldur().ilceDoldur(cbBil.getSelectedIndex()).get("ls");
        for (ilcePro l : ls) {
            if (("" + cbBilce.getSelectedItem()).equals(l.getIlceAdi())) {
                ilceId = l.getIlceId();
            }
        }

    }//GEN-LAST:event_cbBilceİtemStateChanged

    private void btnBGekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBGekleActionPerformed
        String grupAdi = txtBgrupAdi.getText().trim();

        if (grupAdi.equals("")) {
            JOptionPane.showMessageDialog(getRootPane(), "Kategori adı girin...");
            txtBgrupAdi.requestFocus();
        }

        try {
            String kaydetQuery = "insert into carigruplari values(null,0,1,'" + grupAdi + "')";
            int sonuc = db.baglan().executeUpdate(kaydetQuery);
            if (sonuc > 0) {
                txtBgrupAdi.setText("");
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarılı");
            } else {
                JOptionPane.showMessageDialog(getRootPane(), "Kayıt Başarısız");

            }
        } catch (Exception e) {
            System.err.println("kaydetme hatası : " + e);
            if (e.toString().contains("SQLITE_CONSTRAINT_UNIQUE")) {
                JOptionPane.showMessageDialog(getRootPane(), "Bu kategori zaten var...");
            }
        }
        cariLS.clear();
        grupCBDoldur();
    }//GEN-LAST:event_btnBGekleActionPerformed
    ArrayList<ilcePro> ilceLS = new ArrayList<>();

    public void ilceGetir() {
        try {
            ilceLS.clear();
            ResultSet rs;
            String q = " Call ilceleriGetir('" + ilId + 1 + "') ";
            rs = db.baglan().executeQuery(q);
            while (rs.next()) {
                ilcePro ilce = new ilcePro();
                ilce.setIlceId(rs.getInt(1));
                ilce.setIlceAdi(rs.getString(3));
                ilce.setIlId(rs.getInt(2));
                ilceLS.add(ilce);
            }
            System.out.println("ilçeler alındı -----------------");

        } catch (Exception e) {
            System.err.println("ilçe getirme hatasi : " + e);
        }
    }
    String seciliID = "";
    int ilId;
    private void tblBayilerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBayilerMouseClicked

        int row = tblBayiler.getSelectedRow();
        if (row > -1) {
            seciliID = bidLs.get(row);
            try {
                String q = "select*from bayiler where bayiId ='" + seciliID + "'";
                ResultSet rs = db.baglan().executeQuery(q);

                if (rs.next()) {
                    txtBadi.setText(rs.getString(2));
                    txtByetkili.setText(rs.getString(3));
                    txtBtel.setText(rs.getString(4));
                    txtBfax.setText(rs.getString(5));
                    txtBcep.setText(rs.getString(6));
                    txtBeposta.setText(rs.getString(7));
                    txtBLimit.setText(rs.getString(8));
                    txtBBakiye.setText(rs.getString(9));
                    txtBvergid.setText(rs.getString(10));
                    txtBVergiN.setText(rs.getString(11));
                    txtBAdres.setText(rs.getString(12));
                    ilId = rs.getInt(13) - 1;
                    cbBil.setSelectedIndex(rs.getInt(13) - 1);
                    ilceGetir();
                    int i = 1;
                    System.out.println("ls size : " + ilceLS.size());
                    for (ilcePro item : ilceLS) {
                        System.out.println(ilceLS.get(1).getIlceAdi());
                        if (item.getIlceId() == rs.getInt(14)) {
                            System.out.println("i değer :" + i);
                        }
                        System.out.println("i değer :" + i);
                        i++;
                    }

                }
                grupModelDoldur();
            } catch (Exception e) {
                System.err.println("grup getirme hatası 2 :" + e);
            }

        }
    }//GEN-LAST:event_tblBayilerMouseClicked

    private void btnBiptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBiptalActionPerformed
        seciliID = "";
        txtBadi.setText("");
        txtByetkili.setText("");
        txtBtel.setText("");
        txtBfax.setText("");
        txtBcep.setText("");
        txtBeposta.setText("");
        txtBLimit.setText("");
        txtBBakiye.setText("");
        txtBVergiN.setText("");
        txtBvergid.setText("");
        txtBAdres.setText("");
        cbBil.setSelectedIndex(-1);
        cbBilce.setSelectedItem(-1);
        cbBgrup.setSelectedItem(-1);
    }//GEN-LAST:event_btnBiptalActionPerformed

    private void tblBayiler2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBayiler2MouseClicked
        int row = tblBayiler2.getSelectedRow();
        if (row > -1) {
            seciliID = bidLs.get(row);
            try {
                String q = "select*from bayiler where bayiId ='" + seciliID + "'";
                ResultSet rs = db.baglan().executeQuery(q);

                if (rs.next()) {
                    lblBayi.setText(rs.getString(2));
                    lblYetkili.setText(rs.getString(3));
                    lblTel.setText(rs.getString(4));
                    lblCep.setText(rs.getString(5));
                    lblFax.setText(rs.getString(6));
                    lblVergiD.setText(rs.getString(10));
                    lblVergiNo.setText(rs.getString(11));
                    lblAdres.setText(rs.getString(12));
                    ilId = rs.getInt(13) - 1;
                    cbBil.setSelectedIndex(rs.getInt(13) - 1);
                    ilceGetir();
                    int i = 1;
                    System.out.println("ls size : " + ilceLS.size());
                    for (ilcePro item : ilceLS) {
                        System.out.println(ilceLS.get(1).getIlceAdi());
                        if (item.getIlceId() == rs.getInt(14)) {
                            System.out.println("i değer :" + i);
                        }
                        System.out.println("i değer :" + i);
                        i++;
                    }

                }
                grupModelDoldur();
            } catch (Exception e) {
                System.err.println("grup getirme hatası 1" + e);
            }
            islemGecmisi();

        }
    }//GEN-LAST:event_tblBayiler2MouseClicked
    public void labeldoldur(){
        
        try {
            String urunlerQuery = "select sum(siparisTutari) as toplamGelir from siparisler where month(siparisTarihi)=Month(CURDATE())";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblBuAy.setText(next + ".00 ");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
        
       try {
            String urunlerQuery = "SELECT sum(siparisTutari) as s FROM `siparisler` ;";
            ResultSet rs = db.baglan().executeQuery(urunlerQuery);
            
            rs.next();
            String next=rs.getString(1);
            System.out.println(next);
            lblToplamAlacak.setText(next + ".00 ");
            

        } catch (Exception e) {
            System.err.println("satis okuma hatası..." + e);
        } 
        
    }
    private void btnIslemKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIslemKaydetActionPerformed

        try {
            int islemTuru = cbIslemTuru.getSelectedIndex();
            Double Tutar = Double.parseDouble(txtIslemTutar.getText());
            String aciklama = txtIslemAciklama.getText();
            
            int odemeTuru = cbOdemeTuru.getSelectedIndex();

            String q = "Call islemEkle(?,?,?,?,?,?)";
            PreparedStatement pr = db.preBaglan(q);
            java.sql.Date tarih = new java.sql.Date(dtIslemTarih.getDate().getTime());
            
            pr.setInt(1, islemTuru);
            pr.setDouble(2, Tutar);
            pr.setString(3, aciklama);
            pr.setDate(4, tarih);
            pr.setInt(5, odemeTuru);
            pr.setInt(6, Integer.parseInt(seciliID));

            int yaz = pr.executeUpdate();
            System.out.println(yaz);
        } catch (SQLException ex) {
            System.err.println("işlem ekleme hatası" + ex);
        }
        seciliID = "";
        lblGuncelBakiye.setText("0.00");

    }//GEN-LAST:event_btnIslemKaydetActionPerformed

    private void txtAraKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAraKeyPressed
        ara();
    }//GEN-LAST:event_txtAraKeyPressed

    private void txtAra2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAra2KeyPressed

        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Barkod");
        dtm.addColumn("Ürün Adı");
        dtm.addColumn("Stok");

        String ara = fullTextConvert(txtAra2.getText().trim());
        try {
            ResultSet rs = db.baglan().executeQuery("call urunAra('" + ara + "')");
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString("urunBarkod"), rs.getString("urunAdi"), rs.getString("urunMiktar")});
            }
            tblUrunler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("Data Getirme Hatasi: " + e);
        }
    }//GEN-LAST:event_txtAra2KeyPressed
    String uBarkod = "";
    int mevcutStok = 0;
    float seciliFiyat = 0;
    int seciliVergi = 0;
    int urunID;
    private void tblUrunlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUrunlerMouseClicked

        int row = tblUrunler.getSelectedRow();
        if (row > -1) {
            uBarkod = (String) tblUrunler.getValueAt(row, 0);
            mevcutStok = Integer.parseInt((String) tblUrunler.getValueAt(row, 2));
            btnSiparisEkle.setEnabled(true);
        }

        String q = "select*from urunler where urunBarkod='" + uBarkod + "'";
        try {
            ResultSet rs = db.baglan().executeQuery(q);
            while (rs.next()) {
                seciliFiyat = rs.getFloat("urunSatis");
                seciliVergi = rs.getInt("urunVergi");
                lblUrunAdi.setText(rs.getString("urunAdi"));
                lblBirimFiyat.setText(seciliFiyat + " TL");
                lblKdv.setText("% " + seciliVergi);
                lblToplam.setText(seciliFiyat + " TL");
                urunID = rs.getInt(1);
                txtMiktar.setEnabled(true);
            }
        } catch (SQLException ex) {
            Logger.getLogger(BayiIslem.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_tblUrunlerMouseClicked

    ArrayList<siparisOlusturPro> siparisLS = new ArrayList<>();
    float genelToplam = 0;
    float siparisToplam = 0;
    float siparisVergi = 0;

    public void siparisDTM() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Ürün Adı");
        dtm.addColumn("Fiyat");
        dtm.addColumn("Miktar");
        dtm.addColumn("Vergi");
        dtm.addColumn("toplam");
        genelToplam = 0;
        siparisToplam = 0;
        siparisVergi = 0;
        for (siparisOlusturPro item : siparisLS) {
            dtm.addRow(new Object[]{item.getUrunAdi(), item.getBirimFiyat(), item.getMiktar(), item.getVergi(), item.getToplam()});
            genelToplam += item.getToplam()*item.getMiktar();
            siparisToplam += item.getToplam() * (100 - item.getVergi()) / 100;
            siparisVergi += item.getToplam() * (item.getVergi()) / 100;

        }
        lblislemToplam.setText(String.format("%.2f" + " TL", siparisToplam));
        lblvergiToplam.setText(String.format("%.2f" + " TL", siparisVergi));
        lblGenelToplam.setText(String.format("%.2f TL", genelToplam));

        tblSiparisler.setModel(dtm);

    }
    float toplam;

    private void btnSiparisEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisEkleActionPerformed
        siparisOlusturPro siparis = new siparisOlusturPro();

        toplam = seciliFiyat;
        siparis.setUrunId(urunID);
        siparis.setUrunBarkod(uBarkod);
        siparis.setUrunAdi(lblUrunAdi.getText());
        siparis.setBirimFiyat(seciliFiyat);
        siparis.setVergi(seciliVergi);
        siparis.setMiktar(Integer.parseInt(txtMiktar.getText()));
        siparis.setToplam(toplam);

        siparisLS.add(siparis);
        siparisDTM();

    }//GEN-LAST:event_btnSiparisEkleActionPerformed

    private void txtMiktarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMiktarActionPerformed


    }//GEN-LAST:event_txtMiktarActionPerformed

    private void txtMiktarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMiktarKeyPressed


    }//GEN-LAST:event_txtMiktarKeyPressed

    private void txtMiktarCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtMiktarCaretUpdate
        toplam = seciliFiyat * Integer.parseInt(txtMiktar.getText());
        lblToplam.setText(toplam + " TL");
    }//GEN-LAST:event_txtMiktarCaretUpdate

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed

        siparisLS.clear();
        siparisDTM();
    }//GEN-LAST:event_jButton11ActionPerformed
float indirim=0;
    private void btnSiparisKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiparisKaydetActionPerformed

       String bayiId = bidLs.get(cbBayiler.getSelectedIndex());
       String aciklama = txtSiparisAciklama.getText().trim();
       java.sql.Date siparisTarihi = new java.sql.Date(dtSiparisTarihi.getDate().getTime());
       java.sql.Date odemeTarihi = new java.sql.Date(dtOdemeTarihi.getDate().getTime());
       float pesinat = Float.parseFloat(txtPesinat.getText());
       
       
        String q = "Call siparisEkle(?,?,?,?,?,?,?)";
        

        try {
            PreparedStatement pr = db.preBaglan(q);

            pr.setString(1, bayiId);
            pr.setString(2, aciklama);
            pr.setFloat(3, genelToplam);
            pr.setFloat(4, siparisVergi);
            pr.setFloat(5,indirim);
            pr.setDate(6, siparisTarihi);
            pr.setDate(7, odemeTarihi);
            
            int satisId=0;
            int yaz = pr.executeUpdate();
            ResultSet rs=pr.executeQuery("select * from siparisler order by siparisid desc limit 0,1");
            while (rs.next()) {
               satisId=rs.getInt(1);
                
            }
           pr.close();
            q="Call detayEkle(?,?,?)";
            
            pr=db.preBaglan(q);
            
            
            for (siparisOlusturPro item : siparisLS) {
                pr.setInt(1, item.getUrunId());
                pr.setInt(2, item.getMiktar());
                pr.setInt(3, satisId);
                pr.executeUpdate();
            }
            if(tumuPesin==1){
                pesinat=genelToplam;
            }
            q="insert into gelirler values(null,1,'"+pesinat+"',now())";
            
            pr=db.preBaglan(q);
            
            
            
            JOptionPane.showMessageDialog(getRootPane(), "Satış başarılı");

        } catch (SQLException ex) {
            System.err.println("satis ekleme hatası : " + ex);
        }
       
    }//GEN-LAST:event_btnSiparisKaydetActionPerformed
    int tumuPesin=0;
    private void cbPesinatİtemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbPesinatİtemStateChanged

        if(cbPesinat.isSelected()){
            tumuPesin=1;
        }else{
            tumuPesin=0;
        }
                
    }//GEN-LAST:event_cbPesinatİtemStateChanged

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
    public void ilcedoldur() {
        int il;
        il = cbBil.getSelectedIndex();
        cbBilce.setModel((DefaultComboBoxModel<String>) new ilIlceDoldur().ilceDoldur(il).get("default"));
    }

    public void grupCBDoldur() {
        try {
            String q = "select*from carigruplari where bayi=1";
            ResultSet rs = db.baglan().executeQuery(q);

            while (rs.next()) {
                cariGruplar cg = new cariGruplar();
                cg.setGrupId(rs.getInt(1));
                cg.setGrupAdi(rs.getString(4) + "");
                cariLS.add(cg);

            }
            grupModelDoldur();
        } catch (Exception e) {
            System.err.println("grup getirme hatası 3 :" + e);
        }
    }

    public void grupModelDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        DefaultListModel<String> dlm = new DefaultListModel<>();
        for (cariGruplar item : cariLS) {
            dkm.addElement(item.getGrupAdi());
            dlm.addElement(item.getGrupAdi());
        }
        cbBgrup.setModel(dkm);
        lsBGruplar.setModel(dlm);
    }
    ArrayList<String> bidLs = new ArrayList<>();

    public void dataGetir() {
        try {

            String q = "select *from bayiler";

            ResultSet rs = db.baglan().executeQuery(q);

            DefaultTableModel dtm = new DefaultTableModel();
            DefaultComboBoxModel dcb = new DefaultComboBoxModel();
            dtm.addColumn("Bayi Adı");
            dtm.addColumn("Yetkili");

            while (rs.next()) {
                bidLs.add(rs.getString("bayiId"));
                dtm.addRow(new String[]{rs.getString("bayiAdi"), rs.getString("bayiYetkili")});
                dcb.addElement(rs.getString("bayiAdi"));
            }
            tblBayiler.setModel(dtm);
            tblBayiler2.setModel(dtm);
            cbBayiler.setModel(dcb);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }
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
            tblUrunler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }
        
        
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

    public void ara() {
        DefaultTableModel dtm = new DefaultTableModel();
        dtm.addColumn("Bayi Adı");
        dtm.addColumn("Yetkili");
        String ara = fullTextConvert(txtAra.getText().trim());
        try {
            ResultSet rs = db.baglan().executeQuery("call ara('" + ara + "')");
            while (rs.next()) {
                dtm.addRow(new String[]{rs.getString(2), rs.getString(3)});
            }
            tblBayiler2.setModel(dtm);
            tblBayiler.setModel(dtm);

        } catch (Exception e) {
            System.err.println("Data Getirme Hatasi: " + e);
        } finally {
            db.kapat();
        }
    }
   int bakiye;
    public void islemGecmisi(){
        try {
            String musteriQuery = "select *from siparisler where siparisKullaniciId= '"+seciliID+"' ";
            String odemeler = "select*from bayiislemleri where bayiId='"+seciliID+"' ";
            ResultSet rs = db.baglan().executeQuery(musteriQuery);
            
            DefaultTableModel dtm = new DefaultTableModel();
            bakiye=0;
            String islemturu="";
            dtm.addColumn("İşlem NO");
            dtm.addColumn("İşlem Türü");
            dtm.addColumn("Tutar");
            dtm.addColumn("İşlem Tarihi");
            int islemDegeri = 0;
            double geciciDeger=0;
            if(Integer.parseInt(seciliID)>0){
            while (rs.next() ) {
                geciciDeger=Double.parseDouble(rs.getString("siparisTutari"));
                //Integer.parseInt(rs.getString("islemTuru"));
                if(islemDegeri==0){
                    islemturu = "Ürün Satışı";
                    bakiye-=geciciDeger;
                }else if(islemDegeri==1){
                    islemturu = "Peşin Alınan";
                    bakiye+=geciciDeger;
                }else{
                    islemturu = "Yapılan Ödeme";
                    bakiye+=geciciDeger;
                }
                dtm.addRow(new Object[]{rs.getString("siparisId"), islemturu , rs.getFloat("siparisTutari"),rs.getString("siparisTarihi")});
            }
                System.out.println("burda patladım r2...");
                ResultSet rs2= db.baglan().executeQuery(odemeler);
                while (rs2.next()) {  
                    geciciDeger=Double.parseDouble(rs2.getString("islemTutari"));
                    islemDegeri = rs2.getInt("istemTuru");
                    
                if(islemDegeri==1){
                    islemturu = "Peşin Alınan";
                    bakiye+=geciciDeger;
                }else{
                    islemturu = "Yapılan Ödeme";
                    bakiye+=geciciDeger;
                }
                dtm.addRow(new Object[]{rs2.getString("islemId"), islemturu , rs2.getFloat("islemTutari"),rs2.getString("islemTarihi")});
                }
            }
            tblGecmis.setModel(dtm);
            String KalanBakiye=bakiye+" TL";
            lblGuncelBakiye.setText(KalanBakiye);
            
            

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        } 
        
    }

    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBGekle;
    private javax.swing.JButton btnBiptal;
    private javax.swing.JButton btnBkaydet;
    private javax.swing.JButton btnIslemKaydet;
    private javax.swing.JButton btnSiparisEkle;
    private javax.swing.JButton btnSiparisKaydet;
    private javax.swing.JComboBox<String> cbBayiler;
    private javax.swing.JComboBox<String> cbBgrup;
    public static javax.swing.JComboBox<String> cbBil;
    public static javax.swing.JComboBox<String> cbBilce;
    private javax.swing.JComboBox<String> cbIslemTuru;
    private javax.swing.JComboBox<String> cbOdemeTuru;
    private javax.swing.JCheckBox cbPesinat;
    private com.toedter.calendar.JDateChooser dtIslemTarih;
    private com.toedter.calendar.JDateChooser dtOdemeTarihi;
    private com.toedter.calendar.JDateChooser dtSiparisTarihi;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel lblAdres;
    private javax.swing.JLabel lblAra;
    private javax.swing.JLabel lblAra1;
    private javax.swing.JLabel lblAra2;
    private javax.swing.JLabel lblBayi;
    private javax.swing.JLabel lblBirimFiyat;
    private javax.swing.JLabel lblBuAy;
    private javax.swing.JLabel lblCep;
    private javax.swing.JLabel lblFax;
    private javax.swing.JLabel lblGenelToplam;
    private javax.swing.JLabel lblGuncelBakiye;
    private javax.swing.JLabel lblKdv;
    private javax.swing.JLabel lblTel;
    private javax.swing.JLabel lblToplam;
    private javax.swing.JLabel lblToplamAlacak;
    private javax.swing.JLabel lblUrunAdi;
    private javax.swing.JLabel lblVergiD;
    private javax.swing.JLabel lblVergiNo;
    private javax.swing.JLabel lblYetkili;
    private javax.swing.JLabel lblislemToplam;
    private javax.swing.JLabel lblvergiToplam;
    private javax.swing.JList<String> lsBGruplar;
    private javax.swing.JPanel pnlBayiAyar;
    private javax.swing.JPanel pnlBayiOzet;
    private javax.swing.JPanel pnlBayiSiparis;
    private javax.swing.JPanel pnlTedarikciBilgi;
    private javax.swing.JTabbedPane tabBayi;
    private javax.swing.JTable tblBayiler;
    private javax.swing.JTable tblBayiler2;
    private javax.swing.JTable tblGecmis;
    private javax.swing.JTable tblSiparisler;
    private javax.swing.JTable tblUrunler;
    private javax.swing.JTextField txtAra;
    private javax.swing.JTextField txtAra2;
    private javax.swing.JTextField txtBAdres;
    private javax.swing.JTextField txtBBakiye;
    private javax.swing.JTextField txtBLimit;
    private javax.swing.JTextField txtBVergiN;
    private javax.swing.JTextField txtBadi;
    private javax.swing.JTextField txtBara;
    private javax.swing.JTextField txtBcep;
    private javax.swing.JTextField txtBeposta;
    private javax.swing.JTextField txtBfax;
    private javax.swing.JTextField txtBgrupAdi;
    private javax.swing.JTextField txtBtel;
    private javax.swing.JTextField txtBvergid;
    private javax.swing.JTextField txtByetkili;
    private javax.swing.JTextField txtIslemAciklama;
    private javax.swing.JTextField txtIslemTutar;
    private javax.swing.JTextField txtMiktar;
    private javax.swing.JTextField txtPesinat;
    private javax.swing.JTextField txtSiparisAciklama;
    // End of variables declaration//GEN-END:variables
}
