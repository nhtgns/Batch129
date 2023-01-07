package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {
        //clas ismiyle ulasirsam  statik olur
        Date myDate = new  Date();
        System.out.println(myDate);//    Sat Jan 07 21:27:00 CET 2023

        System.out.println(myDate.getTime());//1673123310126 ==> 1 ocak 1970 ten beri su ana kadar ki mili saniye miktari( benim ilk unig numaram)

        //icinde bulundugumuz an nasil alinir?  corint time
        System.out.println(LocalDate.now()); //2023-01-07

        System.out.println(LocalTime.now()); //21:34:29.755912900

        System.out.println(LocalDateTime.now());//2023-01-07T21:36:11.439173200


        //dunyanin herhangi bir saat dilimindeki saati nasil aliriz?

        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));//2023-01-08T05:44:45.087537200

        //Ileriki bir tarihe nasil gidilir
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));//2030-07-12

        //gerideki bir tarihe nasil gidilir?
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));//2018-10-05

        //Ileriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().plusHours(3));//00:57:29.528699100

        //geriki bir zamana nasil gid
        System.out.println(LocalTime.now().minusMinutes(45));//21:13:39.172151900

        //Zamanda belli bir bolumu nasil aliriz?
        System.out.println(LocalTime.now().getHour() + ":" + LocalTime.now().getMinute());//22:0

        //tarihte belli bolumu nasil aliriz?
        System.out.println(LocalDate.now().getMonth() + ":" + LocalDate.now().getDayOfMonth());// JANUARY:7

        //Iki tarih nasil karsilastirilir?
        //02.13.2005 - 03.01.2007   //isAfter() de var
        boolean result = LocalDate.of(2005, 02, 13).isBefore(LocalDate.of(2007, 03, 01));
        System.out.println(result); //true

        //tarihlerin formatlari nasil degistirilir? 3MM ilk uc harf, 4M ise ayin tamamini verir
        // M--> tek rakamla ay nosu,   MM  iki rakamla ay nosu
        // d tek rakamla gun nosunu yazar, dd iki rakamla gun nosunu yaazar
        //yy yilin son iki rakamini yazar
        DateTimeFormatter dtf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(dtf.format(LocalDate.now()));//07/01/2023


    }

}
