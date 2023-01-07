package day05typecastinstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {
    public static void main(String[] args) {

        /*
        Example 1 : asagidaki kurallara gore kullanicinin girdigi passsword u konrol ediniz
                1) en az 8 karakter olsun
                2) Space karakteri password da olmasin
                3) en az bir tane buyuk harf olsun
                4) en az bir kucuk harf olsun
                5) en az bir tane sembol olsun
                6) en az bir tane rakam olsun


         */
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen passwordunuzu giriniz");
        String pwd = input.nextLine();

        // 1. maddenin kontrolu
        boolean first = pwd.length() > 7;  //en az 8 character olmali demek bu ifade, ayni zamanda bu islem boolean, dir
       // System.out.println(first);  //   Ac123?sd   true

        // 2) Space karakteri password da olmasin
        boolean second = !pwd.contains(" "); //contains ,icermek demek. !pwd.contains(" "); space icermesin demek bu
      //  System.out.println(second); //true Ac123?sd

        //3 en az bir tane buyuk harf olsun
        //note: buyuk harf olmayanlari sil,kalan karakter sayisina bak ,karakter sayisi 0 ise buyuk harf yok demektir
        // sifirdan buyuk ise buyuk harf var demektir
        // length, karsilastirma yapar
        boolean third = pwd.replaceAll("[^A-Z]", "").length() > 0; //burasi en az 1>0 olmali,

        // yani en az 1 tane buyuk harf olmali
        // methodlari art arda kullanmaya " Method chain "denir
       // System.out.println(third); //true

        //4     en az bir kucuk harf olsun
        boolean fourth = pwd.replaceAll("[^a-z]", "").length() > 0;
      //  System.out.println(fourth);   //true

        // 5 : en az bir tane sembol  (harf ve rakam harici her sey) olsun
        boolean fifty = pwd.replaceAll("[a-zA-z0-9]", "").length()>0; //harf ve rakam olan herseyi sil demek bu
       // System.out.println(fifty);   //true  ? kaldi

        // 6) en az bir tane rakam olsun
        //burada karsilastirma oldugu icin boolean kullanilir
        boolean sixth = pwd.replaceAll("[^0-9]", "").length() > 0;// rakam disindakileri sil demek
      //  System.out.println(sixth);  //true 123 rakamlari kalir

        //kullaniciya toptan tum islemlerin dogru ya da yanlis oldugu soylenmeli
        System.out.println("passwort gecerli mi"+ " " + (first && second && third && fourth && fifty && sixth));


    }
}