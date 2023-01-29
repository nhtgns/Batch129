package hastane;

public class Runner {
    private static Hastane hastane = new Hastane();


    public static void main(String[] args) {

        String hastaDurumu = "Bas agrisi";

        String unvan = doktorUnvan(hastaDurumu);

        hastane.setDoktor(doktorBul(unvan));

        System.out.println("Doktor ismi: " + hastane.getDoktor().getIsim());
        System.out.println("Doktor soy isim: " + hastane.getDoktor().getSoyIsim());
        System.out.println("Doktor unvani: " + hastane.getDoktor().getUnvan());

    }


    public static String doktorUnvan(String actuelDurum) {

        if (actuelDurum.equals("Allerji")) {
            return hastane.unvanlar[0];

        } else if (actuelDurum.equals("Bas agrisi")) {
            return hastane.unvanlar[1];

        } else if (actuelDurum.equals("Diabet")) {
            return hastane.unvanlar[2];

        } else if (actuelDurum.equals("Kalp Spazmi")) {
            return hastane.unvanlar[3];
        }
        return "yanlis durum";

    }//method

    public static Doktor doktorBul(String unvan) {

        Doktor doktor = new Doktor();

        for (int i = 0; i < hastane.unvanlar.length; i++) {

            if (unvan.equals(hastane.unvanlar[i])) {
                doktor.setIsim(hastane.doctorIsimleri[i]);
                doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
                doktor.setUnvan(unvan);
            }//if
        }//for i
        return doktor;
    }//method
}
