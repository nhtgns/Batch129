package okul;

public class Ogrenci extends VeriBankasi{
    String ogrenciNo;
    int sinif;
    String sinifSube;


    public Ogrenci() {
    }

    public Ogrenci(String ogrenciNo, int sinif, String sinifSube) {
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.sinifSube = sinifSube;
    }

    public Ogrenci(String ad, String soyad, String tc, int yas, String ogrenciNo, int sinif, String sinifSube) {
        super(ad, soyad, tc, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
        this.sinifSube = sinifSube;

    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public int getSinif() {
        return sinif;
    }

    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    public String getSinifSube() {
        return sinifSube;
    }

    public void setSinifSube(String sinifSube) {
        this.sinifSube = sinifSube;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "ogrenciNo='" + ogrenciNo + '\'' +
                ", sinif=" + sinif +
                ", sinifSube='" + sinifSube + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tc='" + tc + '\'' +
                ", yas=" + yas +
                '}';
    }
}
