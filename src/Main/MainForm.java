/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Functions.DB;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.paint.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;


/**
 *
 * @author java_oglen
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        fcPnlGetir(new GenelDurum());
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel15 = new javax.swing.JLabel();
        pnlMain = new javax.swing.JPanel();
        pnlAMenu = new javax.swing.JPanel();
        pnlPersonel = new javax.swing.JPanel();
        lblkAdi = new javax.swing.JLabel();
        lblkAdi1 = new javax.swing.JLabel();
        lblMenuGiris = new javax.swing.JLabel();
        lblMenuBayi = new javax.swing.JLabel();
        lblMenuTedarikci = new javax.swing.JLabel();
        lblMenuStok = new javax.swing.JLabel();
        lblMenuGiderler = new javax.swing.JLabel();
        lblMenuKampanya = new javax.swing.JLabel();
        lblMenuKasa = new javax.swing.JLabel();
        lblMenuPersonel = new javax.swing.JLabel();
        lblMenuKullanici = new javax.swing.JLabel();
        lblMenuRapor = new javax.swing.JLabel();
        lblMenuCikis1 = new javax.swing.JLabel();
        pnlChild1 = new javax.swing.JPanel();

        jLabel15.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel15.setText("Kullanıcı Şifre :");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setAlignmentX(0.0F);
        pnlMain.setAlignmentY(0.0F);
        pnlMain.setAutoscrolls(true);

        pnlAMenu.setBackground(new java.awt.Color(76, 139, 217));

        pnlPersonel.setBackground(new java.awt.Color(76, 139, 217));

        lblkAdi.setText("Kullanıcı :");

        lblkAdi1.setText("Firma Adı :");

        javax.swing.GroupLayout pnlPersonelLayout = new javax.swing.GroupLayout(pnlPersonel);
        pnlPersonel.setLayout(pnlPersonelLayout);
        pnlPersonelLayout.setHorizontalGroup(
            pnlPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPersonelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblkAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblkAdi1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        pnlPersonelLayout.setVerticalGroup(
            pnlPersonelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPersonelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblkAdi1)
                .addGap(12, 12, 12)
                .addComponent(lblkAdi)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        lblMenuGiris.setBackground(new java.awt.Color(2, 188, 141));
        lblMenuGiris.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuGiris.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuGiris.setText("Genel Durum");
        lblMenuGiris.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuGirisMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuGirisMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuGirisMouseExited(evt);
            }
        });
        lblMenuGiris.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuGirisKeyPressed(evt);
            }
        });

        lblMenuBayi.setBackground(new java.awt.Color(2, 188, 141));
        lblMenuBayi.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuBayi.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuBayi.setText("Bayi İşlemleri");
        lblMenuBayi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuBayiMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuBayiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuBayiMouseExited(evt);
            }
        });
        lblMenuBayi.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuBayiKeyPressed(evt);
            }
        });

        lblMenuTedarikci.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuTedarikci.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuTedarikci.setText("Tedarikçi İşlemleri");
        lblMenuTedarikci.setToolTipText("");
        lblMenuTedarikci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuTedarikciMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuTedarikciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuTedarikciMouseExited(evt);
            }
        });
        lblMenuTedarikci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuTedarikciKeyPressed(evt);
            }
        });

        lblMenuStok.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuStok.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuStok.setText("Stok İşlemleri");
        lblMenuStok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuStokMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuStokMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuStokMouseExited(evt);
            }
        });
        lblMenuStok.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuStokKeyPressed(evt);
            }
        });

        lblMenuGiderler.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuGiderler.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuGiderler.setText("Genel Giderler");
        lblMenuGiderler.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuGiderlerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuGiderlerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuGiderlerMouseExited(evt);
            }
        });
        lblMenuGiderler.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuGiderlerKeyPressed(evt);
            }
        });

        lblMenuKampanya.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuKampanya.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuKampanya.setText("Kampanyalar");
        lblMenuKampanya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuKampanyaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuKampanyaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuKampanyaMouseExited(evt);
            }
        });
        lblMenuKampanya.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuKampanyaKeyPressed(evt);
            }
        });

        lblMenuKasa.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuKasa.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuKasa.setText("Kasa & Banka");
        lblMenuKasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuKasaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuKasaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuKasaMouseExited(evt);
            }
        });
        lblMenuKasa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuKasaKeyPressed(evt);
            }
        });

        lblMenuPersonel.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuPersonel.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuPersonel.setText("Personel İşlemleri");
        lblMenuPersonel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuPersonelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuPersonelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuPersonelMouseExited(evt);
            }
        });
        lblMenuPersonel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuPersonelKeyPressed(evt);
            }
        });

        lblMenuKullanici.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuKullanici.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuKullanici.setText("Ayarlar");
        lblMenuKullanici.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuKullaniciMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuKullaniciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuKullaniciMouseExited(evt);
            }
        });
        lblMenuKullanici.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuKullaniciKeyPressed(evt);
            }
        });

        lblMenuRapor.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuRapor.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuRapor.setText("Raporlar");
        lblMenuRapor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuRaporMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuRaporMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuRaporMouseExited(evt);
            }
        });
        lblMenuRapor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuRaporKeyPressed(evt);
            }
        });

        lblMenuCikis1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        lblMenuCikis1.setForeground(new java.awt.Color(255, 255, 255));
        lblMenuCikis1.setText("Çıkış");
        lblMenuCikis1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuCikis1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMenuCikis1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMenuCikis1MouseExited(evt);
            }
        });
        lblMenuCikis1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lblMenuCikis1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout pnlAMenuLayout = new javax.swing.GroupLayout(pnlAMenu);
        pnlAMenu.setLayout(pnlAMenuLayout);
        pnlAMenuLayout.setHorizontalGroup(
            pnlAMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlPersonel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlAMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAMenuLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(pnlAMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblMenuGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuTedarikci)
                        .addComponent(lblMenuStok, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuGiderler, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuKampanya, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuKasa, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuRapor, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblMenuCikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlAMenuLayout.setVerticalGroup(
            pnlAMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAMenuLayout.createSequentialGroup()
                .addComponent(pnlPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlAMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlAMenuLayout.createSequentialGroup()
                    .addGap(136, 136, 136)
                    .addComponent(lblMenuGiris, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuBayi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuTedarikci, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuStok, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuGiderler, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuKampanya, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuKasa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuPersonel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuKullanici, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuRapor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(lblMenuCikis1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(136, Short.MAX_VALUE)))
        );

        pnlChild1.setBackground(new java.awt.Color(255, 255, 255));
        pnlChild1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlAMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlChild1, javax.swing.GroupLayout.PREFERRED_SIZE, 1009, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addComponent(pnlChild1, javax.swing.GroupLayout.PREFERRED_SIZE, 702, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuGirisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuGirisKeyPressed
       
                 
    }//GEN-LAST:event_lblMenuGirisKeyPressed
    
    public void fcPnlGetir(JPanel x){
       pnlChild1.removeAll();
       pnlChild1.repaint();
       pnlChild1.revalidate();
       pnlChild1.add(x);
       pnlChild1.repaint();
       pnlChild1.revalidate();
    }
    java.awt.Color yesil = new java.awt.Color(2,188,141);
    java.awt.Color mavi = new java.awt.Color(0,105,225);
    public void fcLblRenkDegis(JLabel x){
       x.setOpaque(true);
       x.setBackground(yesil);
    }
    public void fcLblRenkReset(JLabel x){
       x.setOpaque(false);
       x.setBackground(mavi);
    }
    private void lblMenuGirisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGirisMouseClicked
        
        fcPnlGetir(new GenelDurum());
    }//GEN-LAST:event_lblMenuGirisMouseClicked
    
    private void lblMenuGirisMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGirisMouseEntered
        fcLblRenkDegis(lblMenuGiris);
    }//GEN-LAST:event_lblMenuGirisMouseEntered

    private void lblMenuBayiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuBayiMouseClicked

        fcPnlGetir(new BayiIslem());
    }//GEN-LAST:event_lblMenuBayiMouseClicked

    private void lblMenuBayiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuBayiMouseEntered
        fcLblRenkDegis(lblMenuBayi);
    }//GEN-LAST:event_lblMenuBayiMouseEntered

    private void lblMenuBayiKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuBayiKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuBayiKeyPressed

    private void lblMenuTedarikciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTedarikciMouseClicked
        fcPnlGetir(new TedarikciIslem());
    }//GEN-LAST:event_lblMenuTedarikciMouseClicked

    private void lblMenuTedarikciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTedarikciMouseEntered
        fcLblRenkDegis(lblMenuTedarikci);
    }//GEN-LAST:event_lblMenuTedarikciMouseEntered

    private void lblMenuTedarikciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuTedarikciKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuTedarikciKeyPressed

    private void lblMenuStokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuStokMouseClicked
        fcPnlGetir(new UrunIslem());
    }//GEN-LAST:event_lblMenuStokMouseClicked

    private void lblMenuStokMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuStokMouseEntered
        fcLblRenkDegis(lblMenuStok);
    }//GEN-LAST:event_lblMenuStokMouseEntered

    private void lblMenuStokKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuStokKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuStokKeyPressed

    private void lblMenuGiderlerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGiderlerMouseClicked
        fcPnlGetir(new GiderlerIslem());
    }//GEN-LAST:event_lblMenuGiderlerMouseClicked

    private void lblMenuGiderlerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGiderlerMouseEntered
        fcLblRenkDegis(lblMenuGiderler);
    }//GEN-LAST:event_lblMenuGiderlerMouseEntered

    private void lblMenuGiderlerKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuGiderlerKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuGiderlerKeyPressed

    private void lblMenuKasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKasaMouseClicked

        fcPnlGetir(new kasaIslem());
    }//GEN-LAST:event_lblMenuKasaMouseClicked

    private void lblMenuKasaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKasaMouseEntered
        fcLblRenkDegis(lblMenuKasa);
    }//GEN-LAST:event_lblMenuKasaMouseEntered

    private void lblMenuKasaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuKasaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuKasaKeyPressed

    private void lblMenuPersonelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPersonelMouseClicked
        fcPnlGetir(new PersonelIslem());
    }//GEN-LAST:event_lblMenuPersonelMouseClicked

    private void lblMenuPersonelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPersonelMouseEntered
        fcLblRenkDegis(lblMenuPersonel);
    }//GEN-LAST:event_lblMenuPersonelMouseEntered

    private void lblMenuPersonelKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuPersonelKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuPersonelKeyPressed

    private void lblMenuKullaniciMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKullaniciMouseClicked
        fcPnlGetir(new Ayarlar());
    }//GEN-LAST:event_lblMenuKullaniciMouseClicked

    private void lblMenuKullaniciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKullaniciMouseEntered
        fcLblRenkDegis(lblMenuKullanici);
    }//GEN-LAST:event_lblMenuKullaniciMouseEntered

    private void lblMenuKullaniciKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuKullaniciKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuKullaniciKeyPressed

    private void lblMenuRaporMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuRaporMouseClicked
        fcPnlGetir(new Raporlar());
    }//GEN-LAST:event_lblMenuRaporMouseClicked

    private void lblMenuRaporMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuRaporMouseEntered
        fcLblRenkDegis(lblMenuRapor);
    }//GEN-LAST:event_lblMenuRaporMouseEntered

    private void lblMenuRaporKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuRaporKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuRaporKeyPressed

    private void lblMenuBayiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuBayiMouseExited
        fcLblRenkReset(lblMenuBayi);
        
    }//GEN-LAST:event_lblMenuBayiMouseExited

    private void lblMenuGirisMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGirisMouseExited
        fcLblRenkReset(lblMenuGiris);
    }//GEN-LAST:event_lblMenuGirisMouseExited

    private void lblMenuTedarikciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuTedarikciMouseExited
        fcLblRenkReset(lblMenuTedarikci);
    }//GEN-LAST:event_lblMenuTedarikciMouseExited

    private void lblMenuStokMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuStokMouseExited
        fcLblRenkReset(lblMenuStok);
    }//GEN-LAST:event_lblMenuStokMouseExited

    private void lblMenuGiderlerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuGiderlerMouseExited
        fcLblRenkReset(lblMenuGiderler);
    }//GEN-LAST:event_lblMenuGiderlerMouseExited

    private void lblMenuKasaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKasaMouseExited
        fcLblRenkReset(lblMenuKasa);
    }//GEN-LAST:event_lblMenuKasaMouseExited

    private void lblMenuPersonelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuPersonelMouseExited
        fcLblRenkReset(lblMenuPersonel);
    }//GEN-LAST:event_lblMenuPersonelMouseExited

    private void lblMenuKullaniciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKullaniciMouseExited
        fcLblRenkReset(lblMenuKullanici);
    }//GEN-LAST:event_lblMenuKullaniciMouseExited

    private void lblMenuRaporMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuRaporMouseExited
        fcLblRenkReset(lblMenuRapor);
    }//GEN-LAST:event_lblMenuRaporMouseExited

    private void lblMenuKampanyaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuKampanyaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuKampanyaKeyPressed

    private void lblMenuKampanyaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKampanyaMouseExited
        fcLblRenkReset(lblMenuKampanya);
    }//GEN-LAST:event_lblMenuKampanyaMouseExited

    private void lblMenuKampanyaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKampanyaMouseEntered
        fcLblRenkDegis(lblMenuKampanya);
    }//GEN-LAST:event_lblMenuKampanyaMouseEntered

    private void lblMenuKampanyaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuKampanyaMouseClicked
        fcPnlGetir(new Kampanyalar());
    }//GEN-LAST:event_lblMenuKampanyaMouseClicked

    private void lblMenuCikis1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCikis1MouseClicked
        JOptionPane.showConfirmDialog(rootPane, "Çıkmak istediğinizden eminmisiniz?");
        System.exit(0);
    }//GEN-LAST:event_lblMenuCikis1MouseClicked

    private void lblMenuCikis1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCikis1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuCikis1MouseEntered

    private void lblMenuCikis1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuCikis1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuCikis1MouseExited

    private void lblMenuCikis1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lblMenuCikis1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblMenuCikis1KeyPressed
     DB db=new DB();
    public void kisitla(int id){
        String q="select*from kullanicilar where kullaniciId='"+id+"'";
        try {
            ResultSet rs = db.baglan().executeQuery(q);
            int by = 0, py = 0, ty = 0, uy = 0, ay = 0, ky = 0, gy = 0, kby = 0, ry = 0;
            
            if (rs.next()) {
                by = rs.getInt(4);
                py = rs.getInt(5);
                ty = rs.getInt(6);
                uy = rs.getInt(7);
                ay = rs.getInt(8);
                ky = rs.getInt(9);
                gy = rs.getInt(10);
                kby = rs.getInt(11); 
                ry = rs.getInt(12);
                
            }
            
            if (ay==0) {
                lblMenuKullanici.setVisible(false);
            }
            if (by==0) {
               lblMenuBayi.setVisible(false);
            }
            if (gy==0) {
                lblMenuGiderler.setVisible(false);
            }
            if (ky==0) {
                lblMenuKampanya.setVisible(false);
            }
            if (kby==0) {
                lblMenuKasa.setVisible(false);
            }
            if (py==0) {
                lblMenuPersonel.setVisible(false);
            }
            if (ty ==0) {
                lblMenuTedarikci.setVisible(false);
            }
            if (uy==0) {
                lblMenuStok.setVisible(false);
            }
            if (ry==0) {
                lblMenuRapor.setVisible(false);
            }
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JLabel lblMenuBayi;
    private javax.swing.JLabel lblMenuCikis1;
    private javax.swing.JLabel lblMenuGiderler;
    private javax.swing.JLabel lblMenuGiris;
    private javax.swing.JLabel lblMenuKampanya;
    private javax.swing.JLabel lblMenuKasa;
    private javax.swing.JLabel lblMenuKullanici;
    private javax.swing.JLabel lblMenuPersonel;
    private javax.swing.JLabel lblMenuRapor;
    private javax.swing.JLabel lblMenuStok;
    private javax.swing.JLabel lblMenuTedarikci;
    private javax.swing.JLabel lblkAdi;
    private javax.swing.JLabel lblkAdi1;
    private javax.swing.JPanel pnlAMenu;
    public javax.swing.JPanel pnlChild1;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlPersonel;
    // End of variables declaration//GEN-END:variables

    private void setMenuBar(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
