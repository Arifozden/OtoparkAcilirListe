package otopark.otoparkacilirliste;
public class Tasit {
    private String tc;
    private String ad;
    private String adres;
    private String plaka;
    private String marka;
    private String model;

    public Tasit(String tc, String ad, String adres, String plaka, String marka, String model) {
        this.tc = tc;
        this.ad = ad;
        this.adres = adres;
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
    }

    public Tasit(){}

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getPlaka() {
        return plaka;
    }

    public void setPlaka(String plaka) {
        this.plaka = plaka;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
