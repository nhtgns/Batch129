package hastane02;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Randevu {


    public static void randevu() {
        Scanner input = new Scanner(System.in);
        LocalDate randevutarihi;
do{


        System.out.println("Randevu tarihini seciniz");
        LocalDate bugun = LocalDate.now();

        String kullanicidanGelenTarih = input.nextLine();
        randevutarihi = LocalDate.parse(kullanicidanGelenTarih);

        boolean onceMi=randevutarihi.isBefore(bugun);


    if ( onceMi ){
        System.out.println("Hatali tarih girdiniz.tekrar deneyiniz");

    }else {
        System.out.println("Istediginiz tarih kaydedilmistir");
        break;
    }

}while (true);
        String randevuSaati;


do {


    List<String> saatler = new ArrayList<>();
    saatler.add("09:30");
    saatler.add("09:45");
    saatler.add("10:00");
    saatler.add("10:30");
    saatler.add("11:15");
    saatler.add("13:30");
    saatler.add("14:45");
    saatler.add("15:30");
    saatler.add("16:00");
    System.out.println("Bu saatlerden birini secebilirsiniz");
    saatler.stream().forEach(t -> System.out.println(t));


    System.out.println("Randevu saatini seciniz");
    randevuSaati = input.nextLine();

    boolean varMi = saatler.contains(randevuSaati);
    if (varMi) {

        System.out.println("Randevu saatini basariyla aldiniz");
        break;
    } else {
        System.out.println(" tekrar deneyiniz");
    }

}while (true);
        System.out.println();
        System.out.println("Randevu tarihiniz: " + randevutarihi );
        System.out.println("Randevu saatiniz : "  + randevuSaati);
       Hastane.menuGoster();
    }
}
