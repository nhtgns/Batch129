package rentacar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MusteriAracBilgileri {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        List<AracTalebi> aracKiraList = new ArrayList<>();


            //  aracListesi();


            AracTalebi arac1 = new AracTalebi("Mercedes", "E200", "Benzin", "Otomatik", 100);
            AracTalebi arac2 = new AracTalebi("BMW", "X5", "Dizel", "Manuel", 150);
            AracTalebi arac3 = new AracTalebi("Opel", "Astra", "Benzin", "Otomatik", 100);
            AracTalebi arac4 = new AracTalebi("Renault", "Megane", "Benzin", "Otomatik", 80);
            AracTalebi arac5 = new AracTalebi("Scoda", "Superb", "Dizel", "Manuel", 150);
            AracTalebi arac6 = new AracTalebi("Volkswagen", "Passat", "Benzin", "Otomatik", 200);


            aracKiraList.add(arac1);
            aracKiraList.add(arac2);
            aracKiraList.add(arac3);
            aracKiraList.add(arac4);
            aracKiraList.add(arac5);
            aracKiraList.add(arac6);

            AracTalebi[] yeniArr = aracKiraList.toArray(aracKiraList.toArray(new AracTalebi[0]));
            int counter = 1;
            for (AracTalebi i : yeniArr) {
                System.out.println("Arac " + counter++ + " : " + i);}


            do {
                LocalDate bugun = LocalDate.now();
                LocalTime simdikiSaat = LocalTime.now();

                System.out.println("Arac listesi yukarıdadır");


                System.out.println("İstediğiniz aracın numarasını giriniz");
                int istenenArac = input.nextInt();

                System.out.println("Araca hangi şehirden almak istersiniz?");
                String alinacakSehir = input.next();


                System.out.println("Aracı hangi sehirde teslim etmek istersiniz?");
                String teslimEdilecekSehir = input.next();

                System.out.println("Aracı hangi tarihte almak istersiniz? yyyy-ay-gün olarak griniz  ");
                LocalDate teslimAlinacakGun = LocalDate.parse(input.next());

                if (bugun.isAfter(teslimAlinacakGun)) {
                    System.out.println("Bugünden önceki tarih girilmez");
                    continue;
                }

                System.out.println("Aracı hangi saatte almak istersiniz? hh:mm şeklinde yaziniz");
                LocalTime teslimAlinacakSaat = LocalTime.parse(input.next());
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
                dtf.format(teslimAlinacakSaat);

                System.out.println("Aracı hangi tarihte teslim etmek istersiniz? yyyy-ay-gün olarak griniz  ");
                LocalDate teslimEdilecekGun = LocalDate.parse(input.next());

                System.out.println("Aracı hangi saatte teslim etmek istersiniz?");
                LocalTime teslimEdilecekSaat = LocalTime.parse(input.next());
                dtf.format(teslimEdilecekSaat);


                Period obj = Period.between(teslimAlinacakGun, teslimEdilecekGun);
                int gunSayisi = obj.getDays();


                System.out.println("" +
                        "\nKiralanan gün sayisi   = " + gunSayisi +
                        "\nKiralama ucreti        =" + gunSayisi * aracKiraList.get(istenenArac - 1).getGunlukUcret());//getter


            } while (true);




//    public static void aracListesi () {
//
//        AracTalebi arac1 = new AracTalebi("Mercedes", "E200", "Benzin", "Otomatik", 100);
//        AracTalebi arac2 = new AracTalebi("BMW", "X5", "Dizel", "Manuel", 150);
//        AracTalebi arac3 = new AracTalebi("Opel", "Astra", "Benzin", "Otomatik", 100);
//        AracTalebi arac4 = new AracTalebi("Renault", "Megane", "Benzin", "Otomatik", 80);
//        AracTalebi arac5 = new AracTalebi("Scoda", "Superb", "Dizel", "Manuel", 150);
//        AracTalebi arac6 = new AracTalebi("Volkswagen", "Passat", "Benzin", "Otomatik", 200);
//
//
//
//        System.out.println("arac1.getGunlukUcret() = " + arac1.getGunlukUcret());
//
//        aracKiraList.add(arac1);
//        aracKiraList.add(arac2);
//        aracKiraList.add(arac3);
//        aracKiraList.add(arac4);
//        aracKiraList.add(arac5);
//        aracKiraList.add(arac6);
//
//        AracTalebi[] yeniArr = aracKiraList.toArray(aracKiraList.toArray(new AracTalebi[0]));
//        int counter=1;
//        for (AracTalebi i : yeniArr) {
//            System.out.println("Arac "+counter++ +" : " +i);
//
//        }

    }


        }


