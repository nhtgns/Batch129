package hastane02;

public class Hasta {
    private String isim;
    private String soyIsim;
    private int hastaID;

    public Hasta(String isim, String soyIsim, int hastaID) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        this.hastaID = hastaID;
    }

    public Hasta() {
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getHastaID() {
        return hastaID;
    }

    public void setHastaID(int hastaID) {
        this.hastaID = hastaID;
    }
}
