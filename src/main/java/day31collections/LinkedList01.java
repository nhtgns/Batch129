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
        class-->interface==>implements (class i interface in cocugu yapmak)
        interface-->interface==> extends
        interface -->class==> bu mumkun degildir( interface i ,class in cocogu yapamazsiniz)
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
//        List<String> cityNames = new LinkedList<>();
//        cityNames.add("Ali");

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Carl");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");
        System.out.println(names);    //[Steve, Carl, Raj, Megan, Brandon]
//        names.addAll(cityNames);
//        System.out.println(names);

        names.addFirst("Cuneyt");
        System.out.println(names);   //[Cuneyt, Steve, Carl, Raj, Megan, Brandon]
        names.addLast("Ajda");    //This method is equivalent to add.
        System.out.println(names);  //[Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(2, "Suleyman");  //LinkedList index yazsa da ,index kullanmaz,2. isimden sonra sulayman yazdirdi
        System.out.println( names);              //[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Ajda]

        names.add("Suleyman");
        System.out.println(names); //[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Suleyman]

        names.remove("Ajda");// 2 tane ayni object varsa ilk siradakini siler. remove methodu loop kullandi,ve loop kirildi
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon]

        names.remove(4); // 4 ten sonraki node u siliyor
        System.out.println("4. elemandan sonraki silinir:"+ names);//: [Cuneyt, Steve, Suleyman, Carl, Megan, Brandon, Suleyman]

        String r1 = names.remove();   // Retrieves and removes the first element of this list. (Cut + Paste)
        System.out.println(r1); // Cuneyt   //ilk elemani siliyor ve burada Cuneyt i yazdiriyor, bak diyor ben cuneyt i sildim diyor
        System.out.println(names);// [Steve, Suleyman, Carl, Raj, Megan, Brandon] ilk node u sildi, o da cuneyt ,artik linkedlist te cuneyt yok

        names.removeFirstOccurrence("Suleyman");// suleymanin ilk gorunumunu sil ,demek
        System.out.println(names);//[Steve, Carl, Raj, Megan, Brandon, Suleyman]  ilk suleyman gitti

        names.removeLastOccurrence("Suleyman"); // sonuncu suleyman i sil demek
        System.out.println(names);// [Steve, Raj, Brandon, Ajda,]

        String r2 = names.peek();  //Retrieves, but does not remove, the head (first element) of this list. kopyalama yapiyor (kopy + Paste)
                                   // Returns:the head of this list, or null if this list is empty. Ilk elemani silmeden verir
        System.out.println(r2);    //Steve
        System.out.println(names); //[Steve, Carl, Raj, Megan, Brandon] Steve silinmedi,zaten silmez

          //  Retrieves and removes the head (first element) of this list. (Cut + Paste)
          //      Returns:the head of this list, or null if this list is empty
          // remove methodu bos LinkedList te lullanilirsa "hata verir", poll() bos LinkedList te kullanilirsa "null" verir
        names.poll(); //  ilk elemani silme yapar

        //Pop removes and returns the first element of this list.(Cut + Paste)
        //This method is equivalent to removeFirst().
        names.pop(); // removeFirst gibidir


    }
}
