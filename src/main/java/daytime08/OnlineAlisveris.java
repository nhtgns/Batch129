package daytime08;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineAlisveris {

    static List<String> urunListesi = new ArrayList<String>();
    static List<Double> urunFiyatlari = new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner input = new Scanner(System.in);




    public static void main(String[] args) {
        /*
         ... Basit bir online alisveris programi yaziniz.

         * 1. Adim : "urunListesi"nden urun sectir ve kac adet istedigini sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
                   istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
                   Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini "toplamOdeme" ekle.
         * 4. Adim : Alisveris bitince online sitenin kurulusGunu ise ucret alma;
         *   degilse toplam odemesi gereken tutari goster.

         * */
        urunListesi.add("ayakkabi : urun kodu :1");
        urunListesi.add("canta : urun kodu : 2 ");
        urunListesi.add("saat : urun kodu  :3");
        urunListesi.add("bilezik : urun kodu : 4");
        urunListesi.add("toka : urun kodu : 5");

        urunFiyatlari.add(10.0);
        urunFiyatlari.add(20.0);
        urunFiyatlari.add(30.0);
        urunFiyatlari.add(150.0);
        urunFiyatlari.add(60.0);
        System.out.println("urunlistesi : " + urunListesi);

        musteriSecim ();
    }//main

    private static void musteriSecim() {
        System.out.println("Lutfen sectiginiz urunun kodu giriniz");
        int secim = input.nextInt();

        System.out.println("sectiginiz urunden kac adet alacaksiniz?");
        int adet = input.nextInt();

        double uruntutari = adet * urunFiyatlari.get(secim-1);//get methodu index ile calisir

        toplamOdeme += uruntutari;
        System.out.println("alisverise devam ise 1 : \n odeme icin 2 : basin");
        int devanMi = input.nextInt();

        if (devanMi == 1){
            musteriSecim();//recursivemethod  hizlidir
        }else {
            odeme();
        }
    }

    private static void odeme() {
        LocalDate kurulusGunu = LocalDate.of(2023, 01, 9);
        LocalDate date = LocalDate.now();

        if (date.isEqual(kurulusGunu)){
            System.out.println("Bugun bizim acilis gunumuz borcunuz yoktur.");
        }else
            System.out.println("Yine bekleriz, odemeniz gereken tutar :" + toplamOdeme + "$");

    }//odeme
}//class
