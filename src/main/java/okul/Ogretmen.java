package okul;

public class Ogretmen extends VeriBankasi{

    String bolum;
    String sicilNo;

    public Ogretmen() {
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;

    }

    public Ogretmen(String ad, String soyad, String tc, int yas, String bolum, String sicilNo) {
        super(ad, soyad, tc, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "bolum='" + bolum + '\'' +
                ", sicilNo='" + sicilNo + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tc='" + tc + '\'' +
                ", yas=" + yas +
                '}';
    }
}
