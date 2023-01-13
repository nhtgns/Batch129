package daytime01;

import java.util.Scanner;

public class C02_variables {
    /*
    spor salonuna kayit bilgileri alinir.
     */

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("TechPro spor salonuna hosgeldiniz");

        System.out.println(" Lutfen isim soyisim giriniz");
        String isim = input.nextLine(); //tum cumleyi alir

        System.out.println("yasinizi giriniz");
        byte yas = input.nextByte();

        System.out.println("Kilonuzu giriniz");
        double kilo = input.nextDouble();

        System.out.println("boyunuzu giriniz");
        double boy = input.nextDouble();

        int aylikUcret = 20;  // bu bigiyi biz onceden yaziyoruz 20$ i
        System.out.println("aylikUcret =" + aylikUcret);

        System.out.println("Kac ay geleceginizi girirniz");
        int ay = input.nextInt();

        int toplamTutar = aylikUcret  * ay; //burada islemi belirlemelisin
        System.out.println("toplamtutar = " + toplamTutar); //120$
        System.out.println("Isminiz : " + isim + "\t" + "yas : " + yas + "\t" + "Kilo :" + kilo + "\t" + "boyunuz : " + boy +
                        "odemeniz gereken toplam tutar :" + toplamTutar + "$");



    }
}
