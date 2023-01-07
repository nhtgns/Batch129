package day05typecastinstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {
        String s = "Learn Java earn money";

        //Example 1: s Stringinin "money" ile bitip bitmedigini kotrol ediniz. son karakter, harf bile sorulabilr
        boolean isEnd = s.endsWith("money"); // ile biter demek endsWith. s.endsWith("money") ile biter dedik.bakalim oyle mi
        System.out.println(isEnd); //true

        // Example 2: s Stringindeki "money" kelimesini "dolar" kelimesine ceviriniz

        String newS1 = s.replace("money", "dollar");// reclace: yerine koy demek.
        System.out.println(newS1);//learn Java earn dolar              // tembel bir isci cikarip yerine caliskan bir isci almak gibidir.
        //burada alinacak kelime once yazilir(oldChar), yeni kelime ,gelecek kelime sonra yazilir (newchar)


        //Example 3: s stringindeki "earn" kelimesinin yerine "win" yaziniz
        String s2 = s.replace("earn", "win");
        System.out.println(s2); // lwin java win money. not: bu method tum "earn" leri win e cevirir, haaaaa

        // 4 : s Stringindeki  "a" harflerini "*" a ceviriniz

        // note replace methodunda coklu karakter ile calisirsaniz mecbur cift tirnak kullanacaksiniz ama
        // tek krakterle calisirsaniz cift ve tek tirnak kullanabilirsiniz
        // ama ikiside cift ya da ikisi de tek tirnak olmalidir
        String s3 = s.replace('a', '*');
        System.out.println(s3);

        //Ex 5 n harlerini xxx yapini
        String s4 = s.replace("n", "xxx");
        System.out.println(s4);

        //E 6  s stringindeki butun e harflerini siliniz
        // "Hicbir sey" char data type inde yoktur,
        // bir seyi silmek icin replace methodu kullanilir ve silinecek karakterden sonra cift tirnak konur("")
        // bu yuzden replace() methodu kullanarak silme islemi yaparsaniz mutlaka cift tirnak kullaniniz
        //char larda hicbir sey diye bir karakter yok, silme islemi String lerde yapilir
        String s5 = s.replace("e", "");
        System.out.println(s5);


        //note: bir grup data yi degistirmek icin replaceAll() kullanilir
        // replaceAll(), hepsini degistir demek
        //note: bir grup datayi (o-9, a-z , ) ifade etmek icin "Regular Expression" (regex) kullaniriz []
        String t = "Ali 13 yasindadir!...";

        //Ex 7: t stringindeki tum rakamlari  "*" a cevirirniz
        String t1 = t.replaceAll("[0-9]", "*"); //[0-9] bu ifade 0 dan 9 a demek.
        System.out.println(t1); // Ali ** yasindadir

        /*
           Meshur Regex' ler
           1) eger tum rakamlari kastediyorsaniz  ==> [ 0-9]
           2) eger tum kucuk harfleri  kastediyorsaniz [a-z]
           3) eger tum buyuk harfleri  kastediyorsaniz [A-Z]
           4)eger tum kucuk ve buyuk harfleri  kastediyorsaniz [a-zA-Z]
           5) eger tum harfler ve sayilar  [a-zA-Z0-9]
           6) eger tum  noktalama isaretlerini kas  \\p{Punct}
           7) tum sesli harfler ==> [aeiouAEIOU]  //harflerin arasina - cizgi koymazsaniz sadece parante icindeki harfleri siler ya da degistirir
           x,q,w ==> [xqw]

           8) Kucuk harflrden farkli tum karakterler ==> [^a-z] den fakli demek

           // 9 tum harflerden farkli olan tum karakterler [^a-zA-Z]


         */
        // 8) t stringindeki tum rakamlari v e harfleri "!" ceviriniz.
        String bal = "bana 1 gul ver.";
        String bal2 = bal.replaceAll("[^a-zA-Z]", "6");
        System.out.println(bal2);


        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println(t2);   //!!! !! !!!!!!!!!!!...

        // Ex 9 tum sesli harfleri ? ne cevir
        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);  //Al? 13 y?s?nd?d?r!... // ?l? 13 y?s?nd?d?r!...

        //Example 10: t stringindeki kucuk harflr disindaki tum karakterlerii <> vevirinz
        String t4 = t.replaceAll("[^a-z]", "<>");  // ^ den farkli demek
        System.out.println(t4);  //<>li<><><><>yasindadir<><><><>

        //E 11: tum harfler disindaki
        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //E 12: t stringindeki space disindaki tum characterleri $ cevirini
        String t6 = t.replaceAll("[^ ]", "+");
        System.out.println(t6);   //+++ ++ ++++++++++++++

        // 13 sesli harfler disindaki tum karakterleri  "& " e cevirin
        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7); // A&i&&&&&a&i&&a&i&&&&&


    }
}
