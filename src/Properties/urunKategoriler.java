/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Properties;

/**
 *
 * @author Zeki
 */
public class urunKategoriler {
    int uKategoriId;
    String uKategoriAdi;
    String uKategoriAciklama;

    public int getuKategoriId() {
        return uKategoriId;
    }

    public void setuKategoriId(int uKategoriId) {
        this.uKategoriId = uKategoriId;
    }

    public String getuKategoriAdi() {
        return uKategoriAdi;
    }

    public void setuKategoriAdi(String uKategoriAdi) {
        this.uKategoriAdi = uKategoriAdi;
    }

    public String getuKategoriAciklama() {
        return uKategoriAciklama;
    }

    public void setuKategoriAciklama(String uKategoriAciklama) {
        this.uKategoriAciklama = uKategoriAciklama;
    }
}
