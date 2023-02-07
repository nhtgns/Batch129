package hastane02;

public class VeriBankasi {



    String [] doctorIsimleri ={"Mustafa","Nihat","Hamit", "Sevil","Remziye", "Mehmet" };
    String [] doctorSoyIsimleri ={"Dogan","Gunes","Yilmaz", "Sahin","Bur", "Yildirim" };
    String [] unvanlar ={"Norolog","Allergist","Genel Cerrah", "Cocuk Doktoru","Dahiliye", "Kardiyolog" };
    String [] hastaIsimleri ={"Aykut","Salih","Hasan", "Ayse","Ömer", "Ali" };
    String [] hastaSoyIsimleri ={"Adali","Bas","Kacan", " Gun","Kızılırmak", "Can" };
    String [] durumlar ={"Alerji","Bas agrisi","Tırnak batmasi", "Çocuk hastalıklari","Diyabet", "Kalp hastaliklari" };

     int[] hastaIDleri ={111,222,333,444,555,666};
    public VeriBankasi(String[] doctorIsimleri, String[] doctorSoyIsimleri,
                       String[] unvanlar, String[] hastaIsimleri, String[] hastaSoyIsimleri,
                       String[] durumlar, int[] hastaIDleri) {

        this.doctorIsimleri = doctorIsimleri;
        this.doctorSoyIsimleri = doctorSoyIsimleri;
        this.unvanlar = unvanlar;
        this.hastaIsimleri = hastaIsimleri;
        this.hastaSoyIsimleri = hastaSoyIsimleri;
        this.durumlar = durumlar;
        this.hastaIDleri = hastaIDleri;
    }

    public VeriBankasi() {
    }
}
