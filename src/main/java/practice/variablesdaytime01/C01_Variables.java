package practice.variablesdaytime01;

import com.sun.jdi.ByteValue;
import com.sun.jdi.ShortValue;

public class C01_Variables {

    public static void main(String[] args) {

        //byte short int long double float data type lerinin maksimum ve minumum degerlerini yazan kodu yaziniz

        byte byteMax = Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;

        System.out.println("byteMax = " + byteMax);
        System.out.println( "byteMin = "  +  byteMin);


        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;

        System.out.println("shortMax : " + shortMax);
        System.out.println("shortMin : " + shortMin);


        int intMax = Integer.MAX_VALUE;
        int intMin = Integer.MIN_VALUE;

        System.out.println("intMax = " +    intMax );
        System.out.println("intMin = "  + intMin );


        long longMax = Long.MAX_VALUE;
        long longMin = Long.MIN_VALUE;

        System.out.println("longMax : "   + longMax);
        System.out.println("longMin : "   + longMin);


        double doubleMax = Double.MAX_VALUE;
        double doubleMin = Double.MIN_VALUE;

        System.out.println( " doubleMax : " + doubleMax);
        System.out.println( "doubleMin : " + doubleMin);


        float floatMax = Float.MAX_VALUE;
        float floatMin = Float.MIN_VALUE;

        System.out.println("floatMax = " + floatMax);
        System.out.println("floatMin = " + floatMin);

        // ödev 1
        String kursiyer = " Ayse Yilmaz";
        System.out.println(" kursiyer : " + kursiyer);

        int kursiyerBoy =   160 ;
        System.out.println("kursiyerBoy =" + kursiyerBoy);

        byte kursiyerYas =  30 ;
        System.out.println("kursiyerYas = " + kursiyerYas);


        double kursiyerKilo =  50;
        System.out.println("kursiyerKilo = " + kursiyerKilo);
        // odev bitti

        byte kacAy = 12;
        System.out.println("kacAy =" + kacAy);

        byte aylikUcretEuro =  20;
        System.out.println("aylikUcretEuro = " + aylikUcretEuro);

        short toplamUcretEuro = 240;
        System.out.println(" toplamUcretEuro : " + toplamUcretEuro);

        byte gun = 5;
        System.out.println("otobusHaftaIciKacGunCalisiyor = " + gun);

        String haftaSonu = "calismiyor" ;
        System.out.println("haftaSonu : " + haftaSonu) ;

        byte herGunKacSaat = 8;
        System.out.println("herGunKacSaat = " + herGunKacSaat);

        byte toplamSaat = 40;
        System.out.println("toplamSaat ; " + toplamSaat);

        String buHaftaEnCokSatilanUrun = " Camasir Makinesi " ;
        System.out.println("buHaftaEnCokSatilanUrun : " + buHaftaEnCokSatilanUrun);

        byte satilanAdet = 10;
        System.out.println("satilanAdet = " + satilanAdet);

        String enCokArastirilanUrun = "tiras makinesi";
        System.out.println("enCokArastirilanUrun : " + enCokArastirilanUrun);

        String cokArastirildigiHaldeAzSatilanUrun = "Bulasik Makinesi";
        System.out.println("cokArastirildigiHaldeAzSatilanUrun : " + cokArastirildigiHaldeAzSatilanUrun);

        String kahvalti = ( "kahvaltidaBorekYiyelim");
        System.out.println("kahvalti = " + kahvalti);

        String renk = ("Sari");
        System.out.println("renk = " + renk);
    }

}
