/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import Functions.ilIlceDoldur;
import static Main.BayiIslem.cbBil;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author java_oglen
 */
public class Ayarlar extends javax.swing.JPanel {

    /**
     * Creates new form Ayarlar
     */
    public Ayarlar() {
        initComponents();
        dataGetir();
        cbFirmaSehir.setModel(new ilIlceDoldur().ilDoldur());
        firmaAyarlari();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRaporlar1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnGuncelle = new javax.swing.JButton();
        cbFirmaSehir = new javax.swing.JComboBox<>();
        txtFirmaAdi = new javax.swing.JTextField();
        txtFirmaUnvan = new javax.swing.JTextField();
        txtFirmaTel = new javax.swing.JTextField();
        txtFirmaFax = new javax.swing.JTextField();
        txtFirmaCep = new javax.swing.JTextField();
        txtFirmaEposta = new javax.swing.JTextField();
        txtFirmaWeb = new javax.swing.JTextField();
        txtFirmaVergiD = new javax.swing.JTextField();
        txtFirmaVergiN = new javax.swing.JTextField();
        txtFirmaAcikAdres = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cbxBayi = new javax.swing.JCheckBox();
        cbxGiderler = new javax.swing.JCheckBox();
        cbxPersonel = new javax.swing.JCheckBox();
        cbxKampanya = new javax.swing.JCheckBox();
        cbxTedarikci = new javax.swing.JCheckBox();
        cbxKasa = new javax.swing.JCheckBox();
        cbxUrun = new javax.swing.JCheckBox();
        cbxRaporlar = new javax.swing.JCheckBox();
        btnKKaydet = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnSil = new javax.swing.JButton();
        txtKullaniciAdi = new javax.swing.JTextField();
        txtKullaniciPW = new javax.swing.JTextField();
        cbxAyarlar = new javax.swing.JCheckBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblKullanicilar = new javax.swing.JTable();

        pnlRaporlar1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Firma Bilgileri"));

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Firma Adı :");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Firma Ticari Ünvan :");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Firma Telefon :");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Firma Fax :");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Firma Cep :");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Firma Eposta :");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Firma Web :");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Firma Şehir :");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Vergi Dairesi :");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Vergi Numarası  :");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Firma Açık Adres :");

        btnGuncelle.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnGuncelle.setText("Güncelle");
        btnGuncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuncelleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbFirmaSehir, 0, 200, Short.MAX_VALUE)
                                    .addComponent(txtFirmaAdi)
                                    .addComponent(txtFirmaUnvan)
                                    .addComponent(txtFirmaTel)
                                    .addComponent(txtFirmaFax)
                                    .addComponent(txtFirmaCep)
                                    .addComponent(txtFirmaEposta)
                                    .addComponent(txtFirmaWeb)
                                    .addComponent(txtFirmaVergiD)
                                    .addComponent(txtFirmaVergiN))
                                .addGap(0, 127, Short.MAX_VALUE))
                            .addComponent(txtFirmaAcikAdres)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuncelle)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtFirmaAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirmaUnvan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirmaTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFirmaFax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtFirmaCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtFirmaEposta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtFirmaWeb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cbFirmaSehir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtFirmaVergiD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtFirmaVergiN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtFirmaAcikAdres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(btnGuncelle)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Kullanıcı Ekle/Düzenle"));

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("Kullanıcı Adı :");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Kullanıcı Şifre :");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel16.setText("Erişim Yetkisi :");

        cbxBayi.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxBayi.setText("Bayi İşlemleri");

        cbxGiderler.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxGiderler.setText("Giderler");

        cbxPersonel.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxPersonel.setText("Personel İşlemleri");

        cbxKampanya.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxKampanya.setText("Kampanyalar");

        cbxTedarikci.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxTedarikci.setText("Tedatikçi İşlemleri");

        cbxKasa.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxKasa.setText("Kasa İşlemleri");

        cbxUrun.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxUrun.setText("Ürün İşlemler");
        cbxUrun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUrunActionPerformed(evt);
            }
        });

        cbxRaporlar.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbxRaporlar.setText("Raporlar");
        cbxRaporlar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxRaporlarActionPerformed(evt);
            }
        });

        btnKKaydet.setText("Kaydet ");
        btnKKaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKKaydetActionPerformed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel17.setText("Personel Listesi");

        btnSil.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnSil.setText("Sil");
        btnSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSilActionPerformed(evt);
            }
        });

        cbxAyarlar.setText("Ayarlar");

        tblKullanicilar.setModel(new javax.swing.table.DefaultTableModel(
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
        tblKullanicilar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKullanicilarMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tblKullanicilar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxPersonel)
                                    .addComponent(cbxBayi)
                                    .addComponent(cbxTedarikci)
                                    .addComponent(cbxUrun)
                                    .addComponent(cbxAyarlar))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxKampanya)
                                    .addComponent(cbxGiderler)
                                    .addComponent(cbxKasa)
                                    .addComponent(cbxRaporlar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtKullaniciPW, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnKKaydet)))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSil)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtKullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtKullaniciPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cbxBayi)
                    .addComponent(cbxKampanya))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxPersonel)
                    .addComponent(cbxGiderler))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxTedarikci)
                    .addComponent(cbxKasa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxUrun)
                    .addComponent(cbxRaporlar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbxAyarlar)
                .addGap(23, 23, 23)
                .addComponent(btnKKaydet)
                .addGap(17, 17, 17)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSil))
        );

        javax.swing.GroupLayout pnlRaporlar1Layout = new javax.swing.GroupLayout(pnlRaporlar1);
        pnlRaporlar1.setLayout(pnlRaporlar1Layout);
        pnlRaporlar1Layout.setHorizontalGroup(
            pnlRaporlar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRaporlar1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlRaporlar1Layout.setVerticalGroup(
            pnlRaporlar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRaporlar1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlRaporlar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 946, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRaporlar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 732, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlRaporlar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxUrunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUrunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxUrunActionPerformed

    private void cbxRaporlarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxRaporlarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxRaporlarActionPerformed
    DB db = new DB();
    private void btnKKaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKKaydetActionPerformed
        try {
            String q = "Call kullaniciEkle(?,?,?,?,?,?,?,?,?,?,?)";
            String kAdi = txtKullaniciAdi.getText();
            String kPW = txtKullaniciPW.getText();
            int by = 0, py = 0, ty = 0, uy = 0, ay = 0, ky = 0, gy = 0, kby = 0, ry = 0;

            if (cbxAyarlar.isSelected()) {
                ay = 1;
            }
            if (cbxBayi.isSelected()) {
                by = 1;
            }
            if (cbxGiderler.isSelected()) {
                gy = 1;
            }
            if (cbxKampanya.isSelected()) {
                ky = 1;
            }
            if (cbxKasa.isSelected()) {
                kby = 1;
            }
            if (cbxPersonel.isSelected()) {
                py = 1;
            }
            if (cbxTedarikci.isSelected()) {
                ty = 1;
            }
            if (cbxUrun.isSelected()) {
                uy = 1;
            }
            if (cbxRaporlar.isSelected()) {
                ry = 1;
            }
            PreparedStatement pr = db.preBaglan(q);
            pr.setString(1, kAdi);
            pr.setString(2, kPW);
            pr.setInt(3, by);
            pr.setInt(4, ky);
            pr.setInt(5, py);
            pr.setInt(6, ty);
            pr.setInt(7, uy);
            pr.setInt(8, ay);
            pr.setInt(9, gy);
            pr.setInt(10, kby);
            pr.setInt(11, ry);
            int yaz = pr.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("kullanici Ekleme Hatasi : " + ex);
        }
        
        JOptionPane.showMessageDialog(getRootPane(), "Kayıt başarılı");
        dataGetir();


    }//GEN-LAST:event_btnKKaydetActionPerformed

    private void tblKullanicilarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKullanicilarMouseClicked


    }//GEN-LAST:event_tblKullanicilarMouseClicked

    private void btnGuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuncelleActionPerformed
        String q = "call firmaAyarlari(?,?,?,?,?,?,?,?,?,?,?)";
        try {

            String firma = txtFirmaAdi.getText();
            String unvan = txtFirmaUnvan.getText();
            String tel = txtFirmaTel.getText();
            String fax = txtFirmaFax.getText();
            String cep = txtFirmaCep.getText();
            String eposta = txtFirmaEposta.getText();
            String web = txtFirmaWeb.getText();
            int sehir = cbFirmaSehir.getSelectedIndex();
            String vergiD = txtFirmaVergiD.getText();
            String vergiN = txtFirmaVergiN.getText();
            String adres = txtFirmaAcikAdres.getText();

            PreparedStatement pr = db.preBaglan(q);

            pr.setString(1, firma);
            pr.setString(2, unvan);
            pr.setString(3, tel);
            pr.setString(4, fax);
            pr.setString(5, cep);
            pr.setString(6, eposta);
            pr.setString(7, web);
            pr.setInt(8, sehir);
            pr.setString(9, vergiD);
            pr.setString(10, vergiN);
            pr.setString(11, adres);

            int yaz = pr.executeUpdate();
            System.out.println(yaz);

        } catch (SQLException ex) {
            System.err.println("bayi ekleme hatası : " + ex);
        }
        JOptionPane.showMessageDialog(getRootPane(),"Güncelleme Başarılı");
    }//GEN-LAST:event_btnGuncelleActionPerformed

    private void btnSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSilActionPerformed

        
    }//GEN-LAST:event_btnSilActionPerformed
    public void dataGetir() {
        try {

            String q = "select *from kullanicilar";

            ResultSet rs = db.baglan().executeQuery(q);

            DefaultTableModel dtm = new DefaultTableModel();
            dtm.addColumn("Kullanici Adı");
            dtm.addColumn("Şifre");

            while (rs.next()) {

                dtm.addRow(new String[]{rs.getString(2), rs.getString(3)});
            }
            tblKullanicilar.setModel(dtm);

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }
    }

    public void firmaAyarlari() {
        try {

            String q = "select *from firmaayarlar";

            ResultSet rs = db.baglan().executeQuery(q);

            while (rs.next()) {

                txtFirmaAdi.setText(rs.getString(1));
                txtFirmaUnvan.setText(rs.getString(2));
                txtFirmaTel.setText(rs.getString(3));
                txtFirmaFax.setText(rs.getString(4));
                txtFirmaCep.setText(rs.getString(5));
                txtFirmaEposta.setText(rs.getString(6));
                txtFirmaWeb.setText(rs.getString(7));
                cbFirmaSehir.setSelectedItem(rs.getInt(8));
                txtFirmaVergiD.setText(rs.getString(9));
                txtFirmaVergiN.setText(rs.getString(10));
                txtFirmaAcikAdres.setText(rs.getString(11));
            }

        } catch (Exception e) {
            System.err.println("okuma hatası..." + e);
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuncelle;
    private javax.swing.JButton btnKKaydet;
    private javax.swing.JButton btnSil;
    private javax.swing.JComboBox<String> cbFirmaSehir;
    private javax.swing.JCheckBox cbxAyarlar;
    private javax.swing.JCheckBox cbxBayi;
    private javax.swing.JCheckBox cbxGiderler;
    private javax.swing.JCheckBox cbxKampanya;
    private javax.swing.JCheckBox cbxKasa;
    private javax.swing.JCheckBox cbxPersonel;
    private javax.swing.JCheckBox cbxRaporlar;
    private javax.swing.JCheckBox cbxTedarikci;
    private javax.swing.JCheckBox cbxUrun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pnlRaporlar1;
    private javax.swing.JTable tblKullanicilar;
    private javax.swing.JTextField txtFirmaAcikAdres;
    private javax.swing.JTextField txtFirmaAdi;
    private javax.swing.JTextField txtFirmaCep;
    private javax.swing.JTextField txtFirmaEposta;
    private javax.swing.JTextField txtFirmaFax;
    private javax.swing.JTextField txtFirmaTel;
    private javax.swing.JTextField txtFirmaUnvan;
    private javax.swing.JTextField txtFirmaVergiD;
    private javax.swing.JTextField txtFirmaVergiN;
    private javax.swing.JTextField txtFirmaWeb;
    private javax.swing.JTextField txtKullaniciAdi;
    private javax.swing.JTextField txtKullaniciPW;
    // End of variables declaration//GEN-END:variables
}
