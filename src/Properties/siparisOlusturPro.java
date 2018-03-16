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
public class siparisOlusturPro {
    private int urunId;
    private String urunBarkod;
    private String urunAdi;
    private Float birimFiyat;
    private int miktar;
    private int vergi;
    private Float toplam;
    private Float indirim;
    private int indirimTuru;

    public Float getIndirim() {
        return indirim;
    }

    public void setIndirim(Float indirim) {
        this.indirim = indirim;
    }

    public int getIndirimTuru() {
        return indirimTuru;
    }

    public void setIndirimTuru(int indirimTuru) {
        this.indirimTuru = indirimTuru;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getUrunBarkod() {
        return urunBarkod;
    }

    public void setUrunBarkod(String urunBarkod) {
        this.urunBarkod = urunBarkod;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Float getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(Float birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getVergi() {
        return vergi;
    }

    public void setVergi(int vergi) {
        this.vergi = vergi;
    }

    public Float getToplam() {
        return toplam;
    }

    public void setToplam(Float toplam) {
        this.toplam = toplam;
    }
    
}
