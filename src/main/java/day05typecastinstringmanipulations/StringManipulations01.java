package day05typecastinstringmanipulations;

public class StringManipulations01 {

    //String bir non primitive bir data typr dir, ayni zamanda bir class tir.
    //stringmanipulation larda manipule etmenin methodlarini ogrenecegiz
    public static void main(String[] args) {

        String s = "Java is easy";
        //Ex 1 : "s" string  indeki tum karakterleri buyuk harf yapiniz

        String sUpper = s.toUpperCase();  // UpperCase: buyuk harf demek,to ise  yonelme olan a demek ,#buyuk harfe' demek oluyor
        System.out.println(sUpper);  // JAVA IS EASY ;OLUR

        //Ex 2:  s stringindeki karakterlerin  tamamini kucuk yazdir
        String sLower = s.toLowerCase(); // LowerCase : kucuk harf demek to: a demek, yani kucuk harfe
        System.out.println(sLower);  //java is easy

        // Note : string lerde her character in bir index i vardir ve sifir la baslar
        //Ex 3 "s" stringteki ilk charachter i aliniz.
        char firstChar= s.charAt(0);  // s.charAt(0); in anlami su: s stringine git sifirdaki karakteri al.
                                      // charAt():character icinde  su index in ,demek. paranteze hangi sayi yazilirsa (index de) onu buldurur
        System.out.println(firstChar);  //J

        //Ex 4 s stringindeki 2. ve sondan 2. karakteri aliniz ve ekrana yan yana yazdir

        // char lari 'a' ,'b' ... matematik islemlerde kullanirsaniz ascii degerlerini kullanir yani sonuc sayi olur
        char secondChar      = s.charAt(1); //a
        char secondLastChar  = s.charAt(10);//s


        // 1.yol
        System.out.print(secondChar );
        System.out.println(secondLastChar);

        //2.yol
        System.out.println("" + secondChar + secondLastChar); //burada 1. ve 10. karakterleri yan yana yazdirmak icin parantezin ilk icine ya da ortasina cift tirnak yani string isarati konur,
        //  zira java burada toplama yapamaz ,conconutaisin yani birlestirme yapar, fakat bu isaret sona konmaz

        // Example 5: s stringinde kullanilan karakter sayisini bulunuz.

        int sLegent = s.length(); // length: uzunluk demek , java da karakter ssayisi demek.
                                  // burada sonu tam sayi cikacagi icin int kullanacagiz
        System.out.println(sLegent); //12

        // e 6: s stringindeki ilk dort karakteri aliniz
        String sub1 = s.substring(0, 4); // sub: alt demk. string icindeki bir bolumu alir,
                                         // burada hangi index ten ya da nereden basladiginizi demelisiniz.
                                        //0 dahil, 4 haric
        //Note: burada baslangic (ilk index) 0 olmali fakat bitis her zaman bir sonraki index olmali
        System.out.println(sub1); //java

        //EX 7:  s stringindeki "is" kelimesini aliniz
        String sBes= s.substring(5,7);
        System.out.println(sBes);

        //EX 8 : s stringindeki easy i aliniz

        String sub3 = s.substring(8,12);
        System.out.println(sub3); //easy

        //Note:  bir karakterden bslayip stringin sonuna kadar almak isterseniz 2. indeksi yazmayiniz.sadece ilk sayi yazilir
        String sub4 = s.substring(8);
        System.out.println(sub4); //easy

        // Ex 9.  s stringinde "money" kelimesinin var olup olmadigini kontrol ediniz

        boolean isExist = s.contains("money"); //contain:icermek demek. s.contains("money")==>hey java ,s stringi money kelimesini var mi diye sorar.
        System.out.println(isExist);   //false, yok   //Exist: var olmak demek
        // contain(); methodu istediginiz sayidaki kelimeler icin kullanilir. ( x) , (Ali),... (space bile true verir)
        //"" hicbir sey icin blile kullanilr

        /*
         bir methodu ogrenirken 3 seyi ogrenmek lazim
         - bu method ne is yapar.
         - bu methodun farkli kullanimlari nasildir.
         - methodlar size ne return eder (ne verir). contain(); ==> boolean veriyor. substring(); ==> String veriyor..


         */
        // Ex 10:  "s" stringinin belli bir harfle kelimeyle  baslayip baslamdigini kontrol ediniz

        boolean isStart = s.startsWith("Java");     //startsWith: su kelime, harf ile baslamak,demek.
                                                    // s.startsWith(Java);=> benim s stringim Java kelimesi ile baslayip baslamadigini konrol eder
        System.out.println(isStart); //true

        //EX 11: "s Stringinin 6. katrakterden itibaren belli bir harf ile baslayip baslamadigini kontrol ediniz

        boolean isBegin = s.startsWith("i" , 5); // toffset 5, ilk 5 karakteri gorme,cöpe at demek.
        System.out.println(isBegin);// true    // burada su yapiliyor: baslanacak olan karakter once yazilir ve
                                              // karakterden once kac tane karakteri cöpe atacaksaniz o kadar karakterin sayisi ikinciye yazilir
                                                // prefix = ilk, baslangic demek

    }
}
