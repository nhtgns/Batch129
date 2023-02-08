package hastane02;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Hastane extends VeriBankasi {
    public static void menuGoster() {

        System.out.println(" " +
                "\nTIP MERKEZI ANA MENUSU " +
                "\n Hastaya ulasmak icin              1 " +
                "\n Unvandan doktora ulasmak  icin    2 " +
                "\n Cikis icin                        3 e tiklayiniz");

    }

    public static void HastaneKonsol() {

        slowPrint("TIP MERKEZIMIZE HOSGELDINIZ", 50);
        menuGoster();
        int secim = 0;
        do {


            Scanner input = new Scanner(System.in);
            secim = input.nextInt();


            switch (secim) {
                case 1:
                    hastaBul();
                    break;
                case 2:
                    UnvandanDoktorArama.unvandanDoktora();
                    break;

                case 3:
                    System.out.println("Kendi isteginizle ciktiniz");
                    break;

                default:
                    System.out.println("Yanlis secimde bulundunuz");


            }
        } while (secim != 3);
    }

    public static void hastaBul() {

        VeriBankasi veriBankasi = new VeriBankasi();
        Scanner input = new Scanner(System.in);

        // int bir arraydeki elemanin index numarasina nasil ulasirim ?
        //int bir Arraydeki elemanin index numarasini binarySearch() methoduyla buldum  "Arrays.binarySearch(hastane.hastaIDleri, hastaId);"
        // hastanin aciliyet durumuna nasil ulasir ve degistirebilirim?
        // hastalik adinda degisken olusturup belirledik

        Hastane hastane = new Hastane();
        Durum durum = new Durum();


        int hastaId = 0;
        int index = 0;
        String hastalik = "";
        String unvan = "";

        while (true) { // hastabulma
            System.out.println(" Hasta Id sini giriniz");

            hastaId = input.nextInt();

            index = Arrays.binarySearch(hastane.hastaIDleri, hastaId); //elemanin index i bulundu

            boolean hastaIdVarMi = false;

            for (int i = 0; i < hastane.hastaIDleri.length; i++) {
                if (hastane.hastaIDleri[i] == hastaId) {
                    hastaIdVarMi = true;
                    break;
                }

            }
            if (!hastaIdVarMi) {
                System.out.println("Hatali id girdiniz. konsola yonlendirileceksiniz.");
                continue;
            } else {
                System.out.println(" hasta adi :" + hastane.hastaIsimleri[index] +
                        " " + " Soyadi :" + hastane.hastaSoyIsimleri[index] +
                        " " + "Hastalik durumu :" + hastane.durumlar[index]);
                hastalik = hastane.durumlar[index];
            }


            //  int unvanindex = Arrays.asList(hastane.unvanlar).indexOf("Norolog");

            aciliyetDurumuGoster(hastalik);
            doktorBul(hastalik);
        }

    }//main

    public static void doktorBul(String hastalik) {

        Hastane hastane = new Hastane();

        switch (hastalik) { // hastaliktan doktora ulasma
            case "Alerji":
                System.out.println("Allergist");  //String
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Allergist")]);
                break;

            case "Bas agrisi":
                System.out.println("Norolog");
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Norolog")]);
                break;

            case "Tırnak batmasi":
                System.out.println("Genel Cerrah");
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Genel Cerrah")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Genel Cerrah")]);
                break;

            case "Çocuk hastalıklari":
                System.out.println("Cocuk Doktoru");
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Cocuk Doktoru")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Cocuk Doktoru")]);
                break;

            case "Diyabet":
                System.out.println("Cocuk Doktoru");
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Dahiliye")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Dahiliye")]);
                break;

            case "Kalp hastaliklari":
                System.out.println("Cocuk Doktoru");
                System.out.println("doktoradi :" + " " + hastane.doctorIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Kalp hastaliklari")]);
                System.out.println("doktorsoyadi :" + " " + hastane.doctorSoyIsimleri[Arrays.asList(hastane.unvanlar).indexOf("Kalp hastaliklari")]);
                break;


        }
    }

    public static void aciliyetDurumuGoster(String hastalik) {


        if (hastalik.equalsIgnoreCase("Çocuk hastalıklari") || hastalik.equalsIgnoreCase("Kalp hastaliklari")) {

            System.out.println("Hastanin durumu riskli");
        } else {
            System.out.println("Acil bir durum yoktur.");
        }
    }

    public static void slowPrint(String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}



