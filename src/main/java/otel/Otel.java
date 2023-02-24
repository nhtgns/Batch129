package otel;

public abstract class Otel {
  /*
   1) aile odasi, tek kisilik oda ve kral dairesi olmali
    2) musteri ekleme yapilabilmeli
    3) musteri silme olmali
    4) kahvalti zorunlu olmali
    5) internet zorunlu degil
    6) her odanin fiyati fakli olmali
   */

    String musteriAdi;
    String musteriSoyadi;
    int yas;
    String cinsiyet;
    int geceSayisi;
    int ucret;

    public Otel() {
    }

    public Otel(String musteriAdi, String musteriSoyadi, int yas, String cinsiyet, int geceSayisi, int ucret) {
        this.musteriAdi = musteriAdi;
        this.musteriSoyadi = musteriSoyadi;
        this.yas = yas;
        this.cinsiyet = cinsiyet;
        this.geceSayisi = geceSayisi;
        this.ucret = ucret;
    }

    public String getMusteriAdi() {
        return musteriAdi;
    }

    public void setMusteriAdi(String musteriAdi) {
        this.musteriAdi = musteriAdi;
    }

    public String getMusteriSoyadi() {
        return musteriSoyadi;
    }

    public void setMusteriSoyadi(String musteriSoyadi) {
        this.musteriSoyadi = musteriSoyadi;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getGeceSayisi() {
        return geceSayisi;
    }

    public void setGeceSayisi(int geceSayisi) {
        this.geceSayisi = geceSayisi;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "otel{" +
                "musteriAdi='" + musteriAdi + '\'' +
                ", musteriSoyadi='" + musteriSoyadi + '\'' +
                ", yas=" + yas +
                ", cinsiyet='" + cinsiyet + '\'' +
                ", geceSayisi=" + geceSayisi +
                ", ucret=" + ucret +
                '}';
    }
}
