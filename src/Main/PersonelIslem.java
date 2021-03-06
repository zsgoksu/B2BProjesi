/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import static Main.BayiIslem.cbBil;
import Properties.harcamaGruplariPro;
import Properties.ilcePro;
import Properties.kasalarPro;
import Properties.personelPro;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java_oglen
 */
public class PersonelIslem extends javax.swing.JPanel {

    /**
     * Creates new form PersonelIslem
     */
    public PersonelIslem() {
        initComponents();
        kasaGruplari();
        dataGetir();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dtIslemTarihi = new com.toedter.calendar.JDateChooser();
        cbKasa = new javax.swing.JComboBox<>();
        txtTutar = new javax.swing.JTextField();
        txtAciklama = new javax.swing.JTextField();
        btnIslemYap = new javax.swing.JButton();
        btnVazgec1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPersonelListesi = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtPersonelTC = new javax.swing.JTextField();
        txtPersonelAdSoyad = new javax.swing.JTextField();
        txtPersonelMail = new javax.swing.JTextField();
        txtPersonelAdres = new javax.swing.JTextField();
        txtPersoneTel = new javax.swing.JTextField();
        txtPersonelAylıkMaas = new javax.swing.JTextField();
        txtMasaiUcreti = new javax.swing.JTextField();
        dtIseBaslama = new com.toedter.calendar.JDateChooser();
        btnKaydet = new javax.swing.JButton();
        btnVazgec2 = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Maaş & Avans Ödeme"));

        jLabel3.setText("İşlem Tarihi :");

        jLabel4.setText("Kasa Seçimi :");

        jLabel5.setText("İşlem Tutarı :");

        jLabel6.setText("Açıklama :");

        dtIslemTarihi.setDateFormatString("dd.MM.yyyy");

        cbKasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtTutar.setText("0.00");
        txtTutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTutarActionPerformed(evt);
            }
        });

        btnIslemYap.setText("İşlem Yap");
        btnIslemYap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIslemYapActionPerformed(evt);
            }
        });

        btnVazgec1.setText("Vazgeç");

        tblPersonelListesi.setModel(new javax.swing.table.DefaultTableModel(
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
        tblPersonelListesi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPersonelListesiMouseClicked(evt);
            }
        });
        tblPersonelListesi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPersonelListesiKeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(tblPersonelListesi);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIslemYap)
                        .addGap(18, 18, 18)
                        .addComponent(btnVazgec1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(dtIslemTarihi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbKasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtTutar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(dtIslemTarihi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbKasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTutar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtAciklama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnIslemYap)
                            .addComponent(btnVazgec1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Personel Ekle/Düzenle"));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Personel TC :");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Personel Eposta :");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Personel Adı Soyadı :");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Personel Adres :");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("İşe Başlama Tarihi :");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Mesai Ücreti  (Saatlik):");

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Aylık Maaş :");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setText("Personel Tel :");

        dtIseBaslama.setDateFormatString("dd.MM.yyyy");

        btnKaydet.setText("Kaydet");
        btnKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKaydetActionPerformed(evt);
            }
        });

        btnVazgec2.setText("Vazgeç");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPersonelMail, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPersonelAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel15))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPersonelAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
                                .addComponent(jLabel13))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtPersonelTC, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16)))
                        .addGap(2, 2, 2)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPersoneTel)
                            .addComponent(txtPersonelAylıkMaas, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(txtMasaiUcreti, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                            .addComponent(dtIseBaslama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnKaydet)
                        .addGap(18, 18, 18)
                        .addComponent(btnVazgec2)))
                .addContainerGap(105, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel15)
                                    .addComponent(txtPersonelAylıkMaas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel14))
                            .addComponent(txtMasaiUcreti, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(dtIseBaslama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel16)
                            .addComponent(txtPersonelTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPersoneTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersonelAdSoyad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPersonelMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtPersonelAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVazgec2)
                    .addComponent(btnKaydet))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Personel İşlemleri", jPanel1);

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 709, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtTutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTutarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTutarActionPerformed

    private void btnKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKaydetActionPerformed
        
        try {
            String TC = txtPersonelTC.getText();
            String adSoyad = txtPersonelAdSoyad.getText();
            String tel = txtPersoneTel.getText();
            String mail = txtPersonelMail.getText();
            String adres = txtPersonelAdres.getText();
            float maas = Float.parseFloat(txtPersonelAylıkMaas.getText());
            float mesai = Float.parseFloat(txtMasaiUcreti.getText());
            java.sql.Date tarih = new java.sql.Date(dtIseBaslama.getDate().getTime());
            
            String q = "Call personelEkle(?,?,?,?,?,?,?,?)";
            
            
                PreparedStatement pr = db.preBaglan(q);

                pr.setString(1, TC);
                pr.setString(2, adSoyad);
                pr.setString(3, tel);
                pr.setString(4, mail);
                pr.setString(5, adres);
                pr.setFloat(6, maas);
                pr.setFloat(7, mesai);
                pr.setDate(8, tarih);
                
                int yaz = pr.executeUpdate();
                
                
           
           
             System.out.println(yaz);

        } catch (SQLException ex) {
            System.err.println("Hesap ekleme hatası : " + ex);
        }
        System.out.println("kayıt eklendi");
    }//GEN-LAST:event_btnKaydetActionPerformed

    private void btnIslemYapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIslemYapActionPerformed
 
          try {
            String giderAciklama = txtAciklama.getText();
            float tutar = Float.parseFloat(txtTutar.getText());
            java.sql.Date tarih = new java.sql.Date(dtIslemTarihi.getDate().getTime());
            int kasaId = kLs.get(cbKasa.getSelectedIndex()).getKasaId();

            String q = "Call giderEkle(?,?,?,?,?)";

            PreparedStatement pr = db.preBaglan(q);

            pr.setString(1, giderAciklama);
            pr.setInt(2, 3);
            pr.setFloat(3, tutar);
            pr.setDate(4, tarih);
            pr.setInt(5, kasaId);
            System.out.println("burdan sonra patladım");
            int yaz = pr.executeUpdate();

            System.out.println(yaz);

        } catch (SQLException ex) {
            System.err.println("gider ekleme hatası : " + ex);
        }
        System.out.println("kayıt eklendi");
        JOptionPane.showMessageDialog(getRootPane(),"Kayıt Başarılı");
        
    }//GEN-LAST:event_btnIslemYapActionPerformed
    String seciliID;
    DB db=new DB();
    private void tblPersonelListesiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPersonelListesiKeyPressed
       
    }//GEN-LAST:event_tblPersonelListesiKeyPressed

    private void tblPersonelListesiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPersonelListesiMouseClicked

        int row = tblPersonelListesi.getSelectedRow();
        if (row > -1) {
            seciliID = pLS.get(row);
            try {
                String q = "select*from personelbilgi where personelId ='" + seciliID + "'";
                ResultSet rs = db.baglan().executeQuery(q);

                if (rs.next()) {
                    txtPersonelTC.setText(rs.getString(2));
                    txtPersonelAdSoyad.setText(rs.getString(3));
                    txtPersonelAdres.setText(rs.getString(4));
                    txtPersonelMail.setText(rs.getString(5));
                    txtPersoneTel.setText(rs.getString(6));
                    txtPersonelAylıkMaas.setText(rs.getString(7));
                    txtMasaiUcreti.setText(rs.getString(8));
                    
                   
                    
                    
                }
            } catch (Exception e) {
                System.err.println("grup getirme hatası 1" + e);
            }
        } 
    }//GEN-LAST:event_tblPersonelListesiMouseClicked
   
    ArrayList<harcamaGruplariPro> hLs = new ArrayList<>();
    ArrayList<kasalarPro> kLs=new ArrayList<>();
    public void kasaGruplari() {
        hLs.clear();
        try {
            String q = "select *from kasalar";
            ResultSet rs = db.baglan().executeQuery(q);
            System.out.println("kasalar alınıyor.");
            while (rs.next()) {
                kasalarPro kasa = new kasalarPro();
                kasa.setKasaId(rs.getInt(1));
                kasa.setKasaAdi(rs.getString(2));
                kLs.add(kasa);
            }
            kasaCbDoldur();
        } catch (Exception e) {
            System.err.println("kasa getirme hatasi : " + e);
        }

    }

    public void kasaCbDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        for (kasalarPro item : kLs) {
            dkm.addElement(item.getKasaAdi());
        }
        cbKasa.setModel(dkm);

    }
    ArrayList<String> pLS = new ArrayList<>();
 public void dataGetir() {
        try {

            String q = "select *from personelbilgi";

            ResultSet rs = db.baglan().executeQuery(q);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("TC");
            dtm.addColumn("Adı");
            dtm.addColumn("Telefon");
            dtm.addColumn("e-posta");
            dtm.addColumn("Maaş");
            dtm.addColumn("İşe Başlangıç");

            while (rs.next()) {
                pLS.add(rs.getString(1));
                dtm.addRow(new String[]{rs.getString(2), rs.getString(3),rs.getString(6),rs.getString(5),rs.getString(7),rs.getString(9)});
                
            }
            tblPersonelListesi.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }
 }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIslemYap;
    private javax.swing.JButton btnKaydet;
    private javax.swing.JButton btnVazgec1;
    private javax.swing.JButton btnVazgec2;
    private javax.swing.JComboBox<String> cbKasa;
    private com.toedter.calendar.JDateChooser dtIseBaslama;
    private com.toedter.calendar.JDateChooser dtIslemTarihi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblPersonelListesi;
    private javax.swing.JTextField txtAciklama;
    private javax.swing.JTextField txtMasaiUcreti;
    private javax.swing.JTextField txtPersoneTel;
    private javax.swing.JTextField txtPersonelAdSoyad;
    private javax.swing.JTextField txtPersonelAdres;
    private javax.swing.JTextField txtPersonelAylıkMaas;
    private javax.swing.JTextField txtPersonelMail;
    private javax.swing.JTextField txtPersonelTC;
    private javax.swing.JTextField txtTutar;
    // End of variables declaration//GEN-END:variables
}
