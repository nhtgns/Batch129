package daytime03;

import java.util.Scanner;

public class C01_StringManipulation {
   // String Class Methodlari
             //   1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
    //ii)equals() method'u "boolean" return eder.
      //      2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
   // kucuk harfe dikkat etmeden anlamamiza yarar.
 //   ii) equalsIgnoreCase() method'u "boolean" return eder.
        //    3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
    //ii) toLowerCase() method'u "String" return eder
         //   4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
   // ii) toUpperCase() method'u "String" return eder
          //  5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
           // ii) charAt() method'u "char" return eder.
        //    6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
  //  ii) length() method'u "int" return eder.
        //    7)contains(): i)Bir String'de belli bir characterin veya
  //  characterlerin var olup olmadigini anlamak icin
   // kullanilir
 //   ii) contains() method'u "boolean" return eder.
        //    8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
 //   ii)split() method'u "Array" return eder.
        //    9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
   // istenilen karakter ya da metinle degistirilmesini saglar.
  //  Sonuc String'dir..
       //     10)replaceFirst()
  //  i) Replace ile aynı sadece ilk bulunan karakteri değiştirir
  //   */
         /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
         1) \\d    ==> tum rakamlar digit,rakam demek
             \\D    ==> tum rakam disi character ler e bir sey atama, sil
         2) \\w   ==> A->Z        a->z         0->9    _tum buyuk, kucuk harf ve sayilar yerine birseyata
             \\W  ==> A->Z        a->z         0->9    _ disindaki hersey
         3) \\s   ==> space tum bosluklar
             \\S   ==> space disindaki hersey
               12) + Concat: Bir stringe diğerini ekler.
            Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
            her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.
        ONEMLI NOT=JAVA YUKARIDAN ASAGI SOLDAN SAGA CALISIR.
         */
   public static void main(String[] args) {

       System.out.println(15+20+"merhaba");
       System.out.println("merhaba" +"\t" +(15+20)); // once parantez ici yapilir
       System.out.println("merhaba"+15*20); //merhaba300  yazar

       // kullanicidan ismini ve soy is  isteyin ,tum ismi buyuk yazdir
       Scanner input = new Scanner(System.in);
       System.out.println("isim ve soyisminizi giriniz");

       String isim = input.nextLine(), soyAd=input.nextLine();//multi declaration
       String tamIsim = isim.concat(" "+ soyAd).toUpperCase(); // concat , yanyana yazdir demek
       System.out.println("tamisim :"  +tamIsim);

       // rakam haricindekileri silin

       String str = "45.99 $";
       str=str.replaceAll("\\D" , ""); //   \\D, rakam harici herseyi siler
       System.out.println(str);//4599,  dooble icin 100 e bolunurse tekrar45.99 olur

       // verilen bir cumleyi * ile gizleyin, onuncu karakterden sonrasini yazdirin

       String cumle = "her dert java gibi olsa";

       System.out.println(cumle.replaceAll("[^a-zA-Z0-9]", "*")+cumle.substring(10));

       // a harfi yerine @ isareti yerl
       String kelime = "olaganustu";
       System.out.println(kelime.replace("a", "@"));  // sout icinde yapiliyor method kullanma
        //butun a lari e ile degistir
        String txt = "merhaba dunya";
       System.out.println(txt.replace("a", "e")); //replace yeterli   merhebe dunye

       // ilk a yi e yap
       System.out.println(txt.replaceFirst("h", "e"));  //merheba dunya

       // kalem yerine dolma yazdirin
       String str2 = "Dolma kalem ile bir dunya kalemi aldik.";
       System.out.println(str2.replaceAll("kalem", "dolma")); // bir grup kumesini degistirir

       //
       String str3 = "bugun hava yagmurlu";
       System.out.println(str3.length()); //19  lenght  bosluklari da karakter sayr ve 1 sayisi ile baslar, ama index 0 dan baslar

       // kullanicidan isim  ve soyisim  isteyin, hangisinin daha uzun old gos ko olu

       System.out.println("Lutfen isim ve soyisminizi giriniz: \t" +
               " isim :");
       String name = input.next();
       System.out.println("soyisim : ");
       String surName = input.next();

       if(name.length()>surName.length()){
           System.out.println("Isminiz daha uzun");
       }else if(name.length()== surName.length()){
           System.out.println("isminiz soyisminizle ayni uzunlukta");

       }else
           System.out.println("Soyisminiz isminizden uzun");








   }
}
