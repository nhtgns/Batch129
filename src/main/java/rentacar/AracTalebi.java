package rentacar;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class AracTalebi {

    //Kiralama ile ilgili tarih/saat bilgileri
    private String alinacakSehir;
    private LocalDate alinacakGun;
    private LocalTime alisSaati;
    private LocalDate teslimGunu;
    private LocalTime teslimSaati;

//    public AracTalebi()


    @Override
    public String toString() {
        return "{" +

                " marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }

    //Arac bilgileri
    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private int gunlukUcret;

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDate getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(LocalDate alinacakGun) {
        this.alinacakGun = alinacakGun;
    }

    public LocalTime getAlisSaati() {
        return alisSaati;
    }

    public void setAlisSaati(LocalTime alisSaati) {
        this.alisSaati = alisSaati;
    }

    public LocalDate getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDate teslimGunu) {
        this.teslimGunu = teslimGunu;
    }

    public LocalTime getTeslimSaati() {
        return teslimSaati;
    }

    public void setTeslimSaati(LocalTime teslimSaati) {
        this.teslimSaati = teslimSaati;
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

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public AracTalebi(String alinacakSehir, LocalDate alinacakGun, LocalTime alisSaati, LocalDate teslimGunu, LocalTime teslimSaati) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;
        this.alisSaati = alisSaati;
        this.teslimGunu = teslimGunu;
        this.teslimSaati = teslimSaati;

    }

    public AracTalebi(String marka, String model, String yakitTipi, String vites, int gunlukUcret) {
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;

    }
}
