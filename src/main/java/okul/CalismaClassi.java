package okul;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalismaClassi {
    static List<Ogrenci> ogrencilerim = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void ogrenciMenu() {
       int secim =0;
        do {
            System.out.println("Ogrenci Menuye Hosgeldiniz" +
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

                    System.out.println("Ogrenci Sisteminden ciktiniz, Tekrar bekleriz.");
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

    private static void silme() {
        System.out.println(" Ogrencinin TC numarasini giriniz");
        String ogrenciTc = input.next();
        for (Ogrenci w : ogrencilerim) {
            if (w.getTc().equals(ogrenciTc)) {
                ogrencilerim.remove(w);

                break;
            } else {
                System.out.println("Hatali giris yaptiniz");
            }
        }
        System.out.println(ogrencilerim);
    }

    private static void listeleme() {
        System.out.println("adi         Soyadi        Tc         Sube    ");

        for (Ogrenci ogrenci : ogrencilerim) {
            System.out.printf("%-10s | %-10s | %-9s | %-10s\n",
                    ogrenci.getAd(), ogrenci.getSoyad(), ogrenci.getTc(), ogrenci.getSinifSube());

        }
    }

    private static void arama() {
        System.out.println(" Ogrencinin TC numarasini giriniz");
        String ogrenciTc = input.next();
        for (Ogrenci w : ogrencilerim) {
            if (w.getTc().equals(ogrenciTc)) {
                System.out.println(w.getAd() + " " + w.getSoyad() + " " + w.getTc() + " " + w.getYas() + " "
                        + w.getOgrenciNo() + " " + w.getSinif() + " " + w.getSinifSube());
                break;
            } else {
                System.out.println("Hatali giris yaptiniz");
            }

        }
    }

    public static void ekleme() {
        System.out.println("Ogrenci adi giriniz");
        String isim = input.next();
        System.out.println(" Ogrenci soyadi giriniz");
        String soyIsim = input.next();
        System.out.println(" TC numarasini giriniz");
        String tc = input.next();
        System.out.println(" Yas giriniz");
        int yas = input.nextInt();
        System.out.println(" Ogrenci numarasini giriniz");
        String ogrenciNo = input.next();
        System.out.println(" Ogrenci sinifini giriniz");
        int sinif = input.nextInt();
        System.out.println(" Ogrenci subeyi giriniz");
        String sube = input.next();

        Ogrenci yeniOgrenci = new Ogrenci(isim, soyIsim, tc, yas, ogrenciNo, sinif, sube);
        ogrencilerim.add(yeniOgrenci);

        System.out.println(ogrencilerim);
    }


    public static void ogrenciDepo() {
        Ogrenci ogrenci1 = new Ogrenci("Ali", "Can", "123456789", 12, "A12", 5, "A");
        Ogrenci ogrenci2 = new Ogrenci("Veli", "Yilmaz", "234567890", 11, "V19", 6, "B");
        Ogrenci ogrenci3 = new Ogrenci("Huseyin", "Han", "123456780", 12, "H32", 7, "C");

        ogrencilerim.add(ogrenci1);
        ogrencilerim.add(ogrenci2);
        ogrencilerim.add(ogrenci3);


    }
}
