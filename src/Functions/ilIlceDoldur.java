/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Functions;

import Main.BayiIslem;
import Properties.ilcePro;
import Properties.ilPro;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.scene.control.ComboBox;
import javax.swing.DefaultComboBoxModel;

public class ilIlceDoldur {
    DB db=new DB();
    ArrayList<ilPro> ilLs = new ArrayList<>();
    ArrayList<ilcePro> ilceLS = new ArrayList<>();
    int ilId;
    int ilceId;
    
    
 
    public DefaultComboBoxModel<String> ilDoldur() {
        ilLs.clear();
        try {
            String q = "select *from il";
            ResultSet rs = db.baglan().executeQuery(q);
                System.out.println("iller alınıyor.");
            while (rs.next()) {
                ilPro il = new ilPro();
                il.setIlId(rs.getInt(1));
                il.setIlAdi(rs.getString(2));
                ilLs.add(il);
            }
            return ilCBDoldur();
        } catch (Exception e) {
            System.err.println("il getirme hatasi : " + e);
        }
        
        return ilCBDoldur();
    }


    public DefaultComboBoxModel<String> ilCBDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        for (ilPro item : ilLs) {
            dkm.addElement(item.getIlAdi());
        }
        return dkm;
    }
    
    public HashMap<String, Object> ilceDoldur(int ilsecim) {
        HashMap<String, Object> hm = new HashMap<String, Object>();
        ilceLS.clear();
        ilDoldur();
        ilPro il = new ilPro();
        il = ilLs.get(ilsecim);
        ilId = il.getIlId();

        try {
            ResultSet rs = db.baglan().executeQuery(" Call ilceleriGetir('" + ilId + "') ");
            while (rs.next()) {
                ilcePro ilce = new ilcePro();
                ilce.setIlceId(rs.getInt(1));
                ilce.setIlceAdi(rs.getString(3));
                ilce.setIlId(rs.getInt(2));
                ilceLS.add(ilce);
            }
        } catch (Exception e) {
            System.err.println("ilçe getirme hatasi : " + e);
        }
        hm.put("default", ilceCBDoldur());
        hm.put("ls",ilceLS );
        return hm;
    }

    public DefaultComboBoxModel<String> ilceCBDoldur() {
        DefaultComboBoxModel<String> dkm = new DefaultComboBoxModel<>();
        for (ilcePro item : ilceLS) {
            dkm.addElement(item.getIlceAdi());
        }
        return dkm;
    }
}
