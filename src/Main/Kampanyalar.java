/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import Properties.kampanyaPro;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java_oglen
 */
public class Kampanyalar extends javax.swing.JPanel {

    /**
     * Creates new form Kampanyalar
     */
    public Kampanyalar() {
        initComponents();
        butonGrup();
        rbUrun.setSelected(true);
        kampanyaDB("SELECT * FROM urunler");
        dataGetir();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnlKampanyalar = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        rdAktif = new javax.swing.JRadioButton();
        rdBiten = new javax.swing.JRadioButton();
        rdBaslayacak = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKampanyalar = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        rbUrun = new javax.swing.JRadioButton();
        rbUrunKategori = new javax.swing.JRadioButton();
        rbKullanici = new javax.swing.JRadioButton();
        rbUrunMarka = new javax.swing.JRadioButton();
        rbKullaniciGrup = new javax.swing.JRadioButton();
        txtKampanyaAdi = new javax.swing.JTextField();
        dtBaslangic = new com.toedter.calendar.JDateChooser();
        dtBitis = new com.toedter.calendar.JDateChooser();
        cbUrunGrup = new javax.swing.JComboBox<>();
        txtStokSiniri = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnKaydet = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtTLMiktar = new javax.swing.JTextField();
        rbTL = new javax.swing.JRadioButton();
        rbYuzde = new javax.swing.JRadioButton();
        txtYuzdeMiktar = new javax.swing.JTextField();

        pnlKampanyalar.setBorder(new javax.swing.border.MatteBorder(null));

        rdAktif.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdAktif.setText("Aktif Kampanyalar");
        rdAktif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdAktifActionPerformed(evt);
            }
        });

        rdBiten.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdBiten.setText("Biten Kampanyalar");
        rdBiten.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBitenActionPerformed(evt);
            }
        });

        rdBaslayacak.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        rdBaslayacak.setText("Başlayacak kampanyalar");
        rdBaslayacak.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdBaslayacakActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Kampana Listesi"));

        tblKampanyalar.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblKampanyalar);

        jButton1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton1.setText("Sil");

        jButton2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jButton2.setText("Düzenle");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 974, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rdBiten)
                        .addGap(18, 18, 18)
                        .addComponent(rdAktif)
                        .addGap(18, 18, 18)
                        .addComponent(rdBaslayacak)))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdBiten)
                    .addComponent(rdAktif)
                    .addComponent(rdBaslayacak))
                .addGap(37, 37, 37)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Kampanyalar", jPanel1);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Kampanya Ekle/Düzenle"));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Kampanya Adı :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("İlgili Ürün/Grup  Adı:");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Kampanya Başlama Tarihi :");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Kampanya Bitiş Tarihi :");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Stok Sınırı :");

        rbUrun.setText("Ürüne Kampanya Ekle");
        rbUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUrunActionPerformed(evt);
            }
        });

        rbUrunKategori.setText("Ürün Kategorisine Kampanya Ekle");
        rbUrunKategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUrunKategoriActionPerformed(evt);
            }
        });

        rbKullanici.setText("Kullanıcıya Kampanya Ekle");
        rbKullanici.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKullaniciActionPerformed(evt);
            }
        });

        rbUrunMarka.setText("Ürün Markasına Kampanya Ekle");
        rbUrunMarka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUrunMarkaActionPerformed(evt);
            }
        });

        rbKullaniciGrup.setText("Kullanıcı Grubuna Kampanya Ekle");
        rbKullaniciGrup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbKullaniciGrupActionPerformed(evt);
            }
        });

        txtKampanyaAdi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        dtBaslangic.setDateFormatString("dd.MM.yyyy");

        dtBitis.setDateFormatString("dd.MM.yyyy");

        cbUrunGrup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel10.setText("(Kampanyadan etkilenecek ürün limiti.)");

        btnKaydet.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("İndirim Tutarı :");

        txtTLMiktar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTLMiktar.setText("0");

        rbTL.setText("TL");
        rbTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTLActionPerformed(evt);
            }
        });

        rbYuzde.setText("%");
        rbYuzde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYuzdeActionPerformed(evt);
            }
        });

        txtYuzdeMiktar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtYuzdeMiktar.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(rbUrun)
                        .addGap(18, 18, 18)
                        .addComponent(rbUrunKategori)
                        .addGap(18, 18, 18)
                        .addComponent(rbUrunMarka))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtStokSiniri, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnKaydet))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(0, 6, Short.MAX_VALUE))))
                            .addComponent(txtKampanyaAdi)
                            .addComponent(cbUrunGrup, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(dtBaslangic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(dtBitis, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(rbTL, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTLMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbYuzde)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtYuzdeMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addComponent(rbKullaniciGrup)
                .addGap(18, 18, 18)
                .addComponent(rbKullanici)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbUrun)
                    .addComponent(rbUrunKategori)
                    .addComponent(rbUrunMarka)
                    .addComponent(rbKullaniciGrup)
                    .addComponent(rbKullanici))
                .addGap(51, 51, 51)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtKampanyaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbUrunGrup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTLMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbTL)
                    .addComponent(rbYuzde)
                    .addComponent(txtYuzdeMiktar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtBaslangic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dtBitis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStokSiniri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(btnKaydet)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Kampana Ekle/Düzenle", jPanel2);

        javax.swing.GroupLayout pnlKampanyalarLayout = new javax.swing.GroupLayout(pnlKampanyalar);
        pnlKampanyalar.setLayout(pnlKampanyalarLayout);
        pnlKampanyalarLayout.setHorizontalGroup(
            pnlKampanyalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKampanyalarLayout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1035, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKampanyalarLayout.setVerticalGroup(
            pnlKampanyalarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKampanyalarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1049, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlKampanyalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlKampanyalar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents
String q = "select*from kampanyalar";
    public void dataGetir() {
        try {

           

            ResultSet rs = db.baglan().executeQuery(q);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Kampanya Adı");
            dtm.addColumn("kampanya Başlangıç");
            dtm.addColumn("Kampanya Bitiş");
            dtm.addColumn("Kalan Stok");

            while (rs.next()) {
                
                dtm.addRow(new String[]{rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10)});
                
            }
            tblKampanyalar.setModel(dtm);
            

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }
}
    private void rbUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUrunActionPerformed
        String q = "SELECT * FROM urunler";
        kampanyaDB(q);
        kampanyaTuru = 1;
    }//GEN-LAST:event_rbUrunActionPerformed

    private void rbUrunKategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUrunKategoriActionPerformed
        String q = "SELECT * FROM urunKategoriler";
        kampanyaDB(q);
        kampanyaTuru = 2;
    }//GEN-LAST:event_rbUrunKategoriActionPerformed

    private void rbUrunMarkaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbUrunMarkaActionPerformed

        String q = "SELECT * FROM markalar";
        kampanyaDB(q);
        kampanyaTuru = 3;
    }//GEN-LAST:event_rbUrunMarkaActionPerformed

    private void rbKullaniciGrupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKullaniciGrupActionPerformed
        String q = "SELECT * FROM carigruplari";
        kampanyaDB(q);
        kampanyaTuru = 4;
    }//GEN-LAST:event_rbKullaniciGrupActionPerformed
 
    private void rbKullaniciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbKullaniciActionPerformed
        String q = "SELECT * FROM bayiler";
        kampanyaDB(q);
        kampanyaTuru = 5;
    }//GEN-LAST:event_rbKullaniciActionPerformed
    int kampanyaTuru = 1;
    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        try {
            String kampanyaAdi = txtKampanyaAdi.getText();
            int grup = kampanyaLS.get(cbUrunGrup.getSelectedIndex()).getId();
            /*Date baslamaTarihi =  convertUtilDate;
            Date bitisTarihi = dtBitis.getDate();*/
            int stokLimit = Integer.parseInt(txtStokSiniri.getText());
            
            String q = "Call kampanyaEkle(?,?,?,?,?,?,?,?)";
            java.sql.Date date = new java.sql.Date(dtBaslangic.getDate().getTime());
            java.sql.Date date2 = new java.sql.Date(dtBitis.getDate().getTime());
           
                PreparedStatement pr = db.preBaglan(q);

                pr.setString(1, kampanyaAdi);
                pr.setInt(2, kampanyaTuru);
                pr.setInt(3, grup);
                pr.setDate(4, date);
                pr.setDate(5, date2);
                pr.setInt(6, stokLimit);
                pr.setInt(7, indirimTuru);
                pr.setFloat(8, miktar);
                
               int yaz = pr.executeUpdate();
                
                
       
             System.out.println(yaz);

        } catch (SQLException ex) {
            System.err.println("gider ekleme hatası : " + ex);
        }
        System.out.println("kayıt eklendi");
    }//GEN-LAST:event_btnKaydetActionPerformed
int indirimTuru;
float miktar;
    private void rbTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTLActionPerformed

        indirimTuru=0;
        miktar = Float.parseFloat(txtTLMiktar.getText());
    }//GEN-LAST:event_rbTLActionPerformed

    private void rbYuzdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYuzdeActionPerformed

        indirimTuru=1;
        miktar = Float.parseFloat(txtYuzdeMiktar.getText());
    }//GEN-LAST:event_rbYuzdeActionPerformed

    private void rdBitenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBitenActionPerformed

        q = "select *from kampanyalar where kampanyaBitisTarihi < now()";
        dataGetir();
    }//GEN-LAST:event_rdBitenActionPerformed

    private void rdAktifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdAktifActionPerformed

        q="select *from kampanyalar where kampanyaBitisTarihi > now() and kampanyaBaslangicTarihi < NOW()";
        dataGetir();
    }//GEN-LAST:event_rdAktifActionPerformed

    private void rdBaslayacakActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdBaslayacakActionPerformed

        q="select *from kampanyalar where kampanyaBaslangicTarihi > now()";
        dataGetir();
    }//GEN-LAST:event_rdBaslayacakActionPerformed
    public void butonGrup() {
        buttonGroup1.add(rbUrun);
        buttonGroup1.add(rbUrunKategori);
        buttonGroup1.add(rbUrunMarka);
        buttonGroup1.add(rbKullanici);
        buttonGroup1.add(rbKullaniciGrup);
        
        buttonGroup2.add(rbTL);
        buttonGroup2.add(rbYuzde);
        
        buttonGroup3.add(rdBaslayacak);
         buttonGroup3.add(rdBiten);
          buttonGroup3.add(rdAktif);
        
        
    }
    ArrayList<kampanyaPro> kampanyaLS = new ArrayList<>();

    DB db = new DB();

    public void kampanyaDB(String query) {
        kampanyaLS.clear();

        try {

            ResultSet rs = db.baglan().executeQuery(query);
            System.out.println("kasalar alınıyor.");
            while (rs.next()) {
                kampanyaPro kampanya = new kampanyaPro();
                kampanya.setId(rs.getInt(1));
                kampanya.setAd(rs.getString(2));
                kampanyaLS.add(kampanya);
            }
            urunGrupDoldur();
        } catch (Exception e) {
            System.err.println("kasa getirme hatasi : " + e);
        }

    }

    public void urunGrupDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        for (kampanyaPro item : kampanyaLS) {
            dkm.addElement(item.getAd());
        }
        cbUrunGrup.setModel(dkm);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKaydet;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cbUrunGrup;
    private com.toedter.calendar.JDateChooser dtBaslangic;
    private com.toedter.calendar.JDateChooser dtBitis;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel pnlKampanyalar;
    private javax.swing.JRadioButton rbKullanici;
    private javax.swing.JRadioButton rbKullaniciGrup;
    private javax.swing.JRadioButton rbTL;
    private javax.swing.JRadioButton rbUrun;
    private javax.swing.JRadioButton rbUrunKategori;
    private javax.swing.JRadioButton rbUrunMarka;
    private javax.swing.JRadioButton rbYuzde;
    private javax.swing.JRadioButton rdAktif;
    private javax.swing.JRadioButton rdBaslayacak;
    private javax.swing.JRadioButton rdBiten;
    private javax.swing.JTable tblKampanyalar;
    private javax.swing.JTextField txtKampanyaAdi;
    private javax.swing.JTextField txtStokSiniri;
    private javax.swing.JTextField txtTLMiktar;
    private javax.swing.JTextField txtYuzdeMiktar;
    // End of variables declaration//GEN-END:variables
}
