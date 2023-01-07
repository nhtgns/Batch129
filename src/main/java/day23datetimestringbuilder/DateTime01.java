package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {
    public static void main(String[] args) {

        //EX 1: Time i formatlayiniz. istedigimiz sekle sokacagiz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        //hh ==> 12 lik saat sistemini kullanir -  HH==> 24 luk saa sistemi veerir
        //hh kullandiginizda AM veya PM demelisiniz, bunu demek icin "a" yazmaniz yeterlidir

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a"); // bu bir object
        System.out.println(dtf.format(myTime)); //07-42 ,  07:48:34 , 07:49:09 PM
    }
}
