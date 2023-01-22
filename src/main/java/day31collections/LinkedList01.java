package day31collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) { // LinkedList undex kullanmaz
        //interface lerin constructor u yoktur
        /*
     1) interface'lerden object olusturulamaz cunku interface'leri constructor'i yoktur.
     2) Abstract Class'larda object olusturulamaz consructor'lari vardir ama constructor object olusrturmadan kullanilamaz.
     3) interface'lerin consructor'lari olmadigindan collection olustururken interface isimleri "new" keyword'unden sonra kullanilmaz.
     4) class-->class==>extends
        class-->interface==>implements
        interface-->interface==> extends
        interface -->class==> bu mumkun degildir
     5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar. O yuzden eleman silme ve ekleme islemleri coklukla
       yapilacaksa ArrayList kullanmak tavsiye edilmez.
       //LINLEDLIST ==> Eleman silme-ekleme cok basarilidir. Index kullanmaz.
     6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
     7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
      Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
      gereken durumlarda LinkedList kullanmak tavsiye edilir.
      8)ArrayList'lerde "search" islemi kolay yapilir cunku index'ler adres gibidir.
      9)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
      bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

         */
        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);//[Steve, Carl, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);
        names.addLast("Ajda");//This method is equivalent to add.
        System.out.println(names);
        names.add(2, "Suleyman");//index yazsa da ,index kullanmaz,2. isimden sonra sulayman yazdirdi
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Ajda]
        names.add("Suleyman");

        names.remove("Ajda");// 2 tane ayni object varsa ilk siradakini siler
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon]

        String r1 = names.remove();   // Retrieves and removes the first element of this list. (Cut + Paste)
        System.out.println(r1);// cuneyt
        System.out.println(names);// [Steve, Suleyman, Carl, Raj, Megan, Brandon]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Carl, Raj, Megan, Brandon, Suleyman]  ilk suleyman gitti

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);// [Steve, Raj, Brandon, Ajda, Suleyman]

        String r2 = names.peek();  //Retrieves, but does not remove, the head (first element) of this list. kopyalama yapiyor (kopy + Paste)
                                   // Returns:the head of this list, or null if this list is empty.ilk elemani silmeden verir
        System.out.println(r2);    //Steve
        System.out.println(names); //[Steve, Carl, Raj, Megan, Brandon]

          //  Retrieves and removes the head (first element) of this list. (Cut + Paste)
          //      Returns:the head of this list, or null if this list is empty
          // remove methodu bos LinkedList te lullanilirsa "hata verir", poll() bos LinkedList te kullanilirsa "null" verir
        names.poll(); //  silme yapar

        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop(); // removeFirst gibidir
    }
}
