package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
    stringBuilder, string insa eden, demektir
    Java da string;" string class" veya "stringbuilder  class" kullanilarak olusturulur
    String class kullanarak urettiginiz stringler "Immutable" degistirelemez dir
   " Stringbiulder class" kullanarak urettiginiz stringler "Mutable " degistirilebilir dir.

     */

    public static void main(String[] args) {

        //Immutable
        String s= "Java";
        String t=  s + "!";
        String w=  t + "?";

        //String'i degistirdikten sonra ayni Stringe assein (atarsaniz) ederseniz, Java yine yeni bir container olusturur,
        //degismis degeri bu yeni container'in icine koyar ve eski container'i gosteren oku yeni container'a yonlendirir.
        //Dolayisiyla eski container adressiz kalir, ve "Garbage Collector" adressiz olan container'lari siler.
        // String class ile string olusturmanin dezavantaji, memory surekli dollup tasiyor, hep yeni bir conteynir olusturuyor
        // Avantaji ise asil deger hep korunuyor

        String a = "Money"; // update ten sonra ayni degere atama
        System.out.println(a = a + "More"); //MoneyMore

        System.out.println(a.concat("e")); // concat ile ekleme yaptik

        // Mutable
        //--- StringBUilder kullanarak String uretmenin 1.yolu
        StringBuilder sb1 = new StringBuilder("Python"); // burada yoktan var etme, object uretme yaptik
        System.out.println(sb1); //Python

        sb1.append("!").append("?").append(":");//appent birlestirme yapar. buna method chen denir, method zinciri
        System.out.println(sb1);//Python!?:

        //---Stringbuilder kullanarak string uretmenin 2. yolu
        StringBuilder sb2 = new StringBuilder(); // bu bos bir constructor, degeri asagida "Java"
        System.out.println(sb2.length());        //0 lengt kutulaarin icindeki degeri verir

        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir
        //Capacity asimlarinda, var olanin capacitinin iki katinin iki fazlasina cikar
        System.out.println(sb2.capacity());     // 16  bos kutu verir baslangicta

        sb2.append("Java");                 // constructor un ici bu
        System.out.println(sb2.length());   //4
        System.out.println(sb2.capacity()); //16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length()); //19  .  4 tane java vardi 15 tane de x geldi ,length 19 oldu
        System.out.println(sb2.capacity()); //34  , java buraya 16 tane daha capacity ekledi 2 daha verdi ,toplam 34 oldu

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());  //35
        System.out.println(sb2.capacity());//70 , var olanin (34'un) 2 kati ve 2 ekler, o da 70 eder
        /*

        sb2.append("Java");
        System.out.println(sb2.length());//4
        System.out.println(sb2.capacity());//16

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());//35
        System.out.println(sb2.capacity());//34*2+2 ==> 70
         */

        //StringBuilder kullanarak string uretmenin 3. yolu
        StringBuilder sb3 = new StringBuilder(2); //Constructor un icine tam sayi koyarsaniz ,bu capasiyi gosterir

        sb3.append("Flo");
        System.out.println(sb3.length());//3
        System.out.println(sb3.capacity());//6, var olanin ,2nin  2kati ve 2, toplam 6


        //insert , arasina koymak demek, istenilen karakter istenilen yere konulabilir stringde
        sb3.insert(2, "xxxx"); //Flxxxxo ilk 2 karakteri es gectik, sonrasina 4 tane x koyduk, indexi dikkate  almaz.
        System.out.println(sb3.length());//7
        System.out.println(sb3);//Flxxxxo

        //buraya kadar anlatacagim

        // toString methodu "StringBuilder" i "String" e cevirir.
        //String class da var olan ama stringBuilder class ta var olmayan split method gibi
        // methodlara ihtiyac duydugumuzda toString mrthodunu kullanarak String Class a gecer ve o methodlari kullanir
        sb3.toString().split("l"); // burada sb3 once tostring met ile stringe donustu, sonra split methodu kullanima acildi

        //string i tekrar StringBuilder a cevir
        StringBuilder sb4 = new StringBuilder(sb3);


        //reverse methodu String leri ters cevirir
        sb3.reverse();           //tersten yazdirir stringi
        System.out.println(sb3); //oxxxxlF

        //index 1 deki karakteri sil demek
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxlF

        //index 1 deki karakterden index 5 ( 6 dahil degil) deki karaktere kadar tum karakterleri siler
        sb3.delete(1, 6); // birinci sayi dahil 2. haric olur %99
        System.out.println(sb3); //0

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //String leri alfabeetik sira ile karsilastirir, sb5 alfabetik siralamada onde ise sonu - negatif olur, sonra ise poz olur
        // -1 verir. Yani alfabetik sira olarak J harfi, K harfinden 1 oncedir.
     // compareTo() alfabetik olarak karsilastirir. Bu method ascii degerlere gore islem yapar.
     // compare (ENG) == karsilastirma (TR)
        sb5.compareTo(sb6); //0
        System.out.println(sb5.compareTo(sb6));// -2  H 2 sira once gelir J den

        sb6.setCharAt(2, 'm');// index 2 deki karakteri m ye cevirdi
        System.out.println(sb6);//Jama

        sb6.replace(1,3, "xyz");
        System.out.println(sb6); //Jxyza

        //Stringbuilder Class da kullanmamiza izin verilen bazi String Class methodlari vardir
        //bu methodlari Stringbulder ustunde kullaninca StringBuilder in orijinal degeri degismez
       String s7 = sb6.substring(1,3);
        System.out.println(s7);//xy
        System.out.println(sb6);//Jxyza



    }
}
