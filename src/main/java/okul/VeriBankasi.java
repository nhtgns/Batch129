package okul;

import java.util.List;

public class VeriBankasi {
    String ad;
    String soyad;
    String tc;
    int yas;

    public VeriBankasi() {
    }

    public VeriBankasi(String ad, String soyad, String tc, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.tc = tc;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    @Override
    public String toString() {
        return "VeriBankasi{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tc='" + tc + '\'' +
                ", yas=" + yas +
                '}';
    }
}
