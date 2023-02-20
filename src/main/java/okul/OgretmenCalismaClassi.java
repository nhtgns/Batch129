package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class OgretmenCalismaClassi {
    static Scanner input = new Scanner(System.in);

    static List<Ogretmen> ogretmenlerim = new ArrayList<>();

    public static void ogretmenMenu() {
int secim =0;
        do {
            System.out.println("Ogretmen Menuye Hosgeldiniz" +
                    "\n Ekleme icin     1" +
                    "\n arama icin      2" +
                    "\n Listeleme icin  3" +
                    "\n Silme icin      4" +
                    "\n Ana Menu icin   5" +
                    "\n Cikis icin      6  yi tiklayiniz");
             secim = input.nextInt();

            switch (secim) {
                case 1:
                    ekleme();
                    break;
                case 2:
                    arama();
                    break;
                case 3:
                    listeleme();
                    break;
                case 4:
                    silme();
                    break;
                case 5:
                    System.out.println("Ogretmen Sisteminden ciktiniz, Tekrar bekleriz.");

                    break;
                case 6:
                    System.out.println("Sistemden tamamen ciktiniz, Tekrar bekleriz.");
                    AnaMenu.projeDurdur();
                    break;
                default:
                    System.out.println("Hatali sayi girdiniz");
            }
        }while (secim != 5);


    }

    public static void ogretmenDepo (){
        Ogretmen ogretmen1 = new Ogretmen("Kemal", "Sari","001234567", 33, "Turkce", "135" );
        Ogretmen ogretmen2 = new Ogretmen("Kazim", "Selim","001234568", 34, "Matematik", "136" );
        Ogretmen ogretmen3 = new Ogretmen("Cemal", "Sayi","001234569", 35, "Felsefe", "137" );


        ogretmenlerim.add(ogretmen1);
        ogretmenlerim.add(ogretmen2);
        ogretmenlerim.add(ogretmen3);
    }
    public static void ekleme(){
        System.out.println("Ogretmen adi giriniz");
        String isim = input.next();
        System.out.println(" Ogretmen soyadi giriniz");
        String soyIsim = input.next();
        System.out.println(" TC numarasini giriniz");
        String tc = input.next();
        System.out.println(" Yas giriniz");
        int yas = input.nextInt();
        System.out.println(" Bolum giriniz");
        String bolum = input.next();
        System.out.println(" Sicil no giriniz");
        String sicilNo = input.next();

        Ogretmen yeniOgretmen = new Ogretmen(isim, soyIsim, tc, yas, bolum, sicilNo);
        ogretmenlerim.add(yeniOgretmen);

        System.out.println(ogretmenlerim);
    }
    private static void arama() {
        System.out.println(" Ogretmenin TC numarasini giriniz");
        String ogretmenTc = input.next();
        for (Ogretmen w : ogretmenlerim) {
            if (w.getTc().equals(ogretmenTc)) {
                System.out.println(w.getAd() + " " + w.getSoyad() + " " + w.getTc() + " " + w.getYas() + " "
                        + w.getBolum() + " " + w.getSicilNo());
                break;
            } else {
                System.out.println("Hatali giris yaptiniz");
            }

        }
    }
    private static void listeleme() {
        System.out.println("Adi         Soyadi        Tc         Bolum    ");

        for (Ogretmen ogretmen : ogretmenlerim) {
            System.out.printf("%-10s | %-10s | %-9s | %-10s\n",
                    ogretmen.getAd(), ogretmen.getSoyad(), ogretmen.getTc(), ogretmen.getBolum());

        }
    }
    private static void silme() {
        System.out.println(" Ogretmenin TC numarasini giriniz");
        String ogretmenTc = input.next();
        for (Ogretmen w : ogretmenlerim) {
            if (w.getTc().equals(ogretmenTc)) {
                ogretmenlerim.remove(w);

                break;
            } else {
                System.out.println("Hatali giris yaptiniz");
            }
        }
        System.out.println(ogretmenlerim);
    }


}
