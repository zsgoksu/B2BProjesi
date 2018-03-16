/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Main.MainForm;
import javax.swing.JPanel;

/**
 *
 * @author Zeki
 */
public class PanelDoldur {
    MainForm mf=new MainForm();
    public void fcPnlGetir(JPanel x){
       mf.pnlChild1.removeAll();
       mf.pnlChild1.repaint();
       mf.pnlChild1.revalidate();
       mf.pnlChild1.add(x);
       mf.pnlChild1.repaint();
       mf.pnlChild1.revalidate();
    }
}
