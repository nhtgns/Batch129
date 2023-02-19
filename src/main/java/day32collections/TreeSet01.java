package day32collections;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {
    public static void main(String[] args) {


        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);// [3, 8, 12, 25, 32]  naturiel order

        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        TreeSet<Integer> hts = new TreeSet<>(hs); //burada hashset ,treeset e cevrildi, treeset in parantezine hashset in hs si yazilarak
        System.out.println(hts); //[32, 3, 8, 25, 12]  random ,rastgele, sonradan naturel order oldu  [3, 8, 12, 25, 32]

        long three = System.nanoTime();

        System.out.println("Treeset in uygulama suresi :" + (two   - one));
        System.out.println("Hashset in uygulama suresi :" + (three - two));
        System.out.println();

        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet ise cooook hizlidir.
        // TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first); //3

        int last = ts.last();
        System.out.println(last); //32

        int floor = ts.floor(15);  // floor, eleman varsa kendisini yoksa kendisinden onceki elemani yazdirir
        System.out.println(floor);  //12,    15 elemanlardan biri degil, o yuzden 15 ten bir onceki eleman yazdirildi

        //floor methodunda kullanabileceginiz sayi en kucuk elemandan az olamaz. olursa nullpointerexceptions verir
        int floor2 = ts.floor(12);
        System.out.println(floor2);  //12 elemanlardan biri , o yuzden 12 yi yazdirdi

        int ceiling1 = ts.ceiling(15); // eleman varsa elemani yoksa kendisinden buyuk sayiyi verir
        System.out.println(ceiling1); // 25,    15 elemanlardan biri degil

        //ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2); // 25 elemanlardan biri ,o yuzden direkt yazdirdi

        // 1000 ve ustunu gormek icin ceiling methodu kullanilabilir. 1000 varsa verir ,degilse 1000 den buyuk sayiyi verir

        SortedSet<Integer>tailSet1 = ts.tailSet(15);
        System.out.println(tailSet1);//[25, 32] varsa kendisi dahil yoksa kendisinden buyuk "tum sayilari" verir

        SortedSet<Integer>tailSet2 = ts.tailSet(8);
        System.out.println(tailSet2);   //[8, 12, 25, 32]  8 ve sonrakiler set icinde yazdirildi

        NavigableSet<Integer> ts3 =  ts.tailSet(12,false);
        System.out.println(ts3);//normalde 12 bir eleman ama ben 2.parametrede "false" kullandigim icin 12 haric tutuldu.

        SortedSet<Integer> headset1 =  ts.headSet(12);
        System.out.println(headset1);//[3, 8]  burada 12 bir eleman ama set icinde sadece oncekiler yazdirildi, 12 yok

        SortedSet<Integer> headset2 =  ts.headSet(12, true);
        System.out.println(headset2);  //[3, 8, 12]  true deyince 12 dahil oldu

      //  subSet() methodunda bir yerden bir yere kadar alinir, ilk eleman dahil 2. eleman dahil degil
        Integer higher1=ts.higher(12)  ;              //her data type ile calisan methodlara Generic method denir. burada int verirsen
        System.out.println(higher1); //25 ,  12 den bir sonraki buyuk elemani verir

        Integer lower = ts.lower(12);
        System.out.println(lower); //8,  12 den bir onceki elemani verir
    }
}
