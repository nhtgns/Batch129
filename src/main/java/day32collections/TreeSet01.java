package day32collections;

import java.util.HashSet;
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
        System.out.println(ts);// [3, 8, 12, 25, 32]

        HashSet<Integer> hs = new HashSet<>();
        long two = System.nanoTime();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);
        System.out.println(hs); //[32, 3, 8, 25, 12]

        long three = System.nanoTime();

        System.out.println("Treeset :" + (two -one));
        System.out.println();

        //Note: TreeSet eleman ekleme'de cooook yavas, HashSet is cooook hizlidir.
        // TreeSet'in bu negatif yonunden kurtulmak icin; HashSet olusturur elemanlari ekler, ve sonra HashSet'i TreeSet'e ceviririz.

        int first = ts.first();
        System.out.println(first); //3

        int last = ts.last();
        System.out.println(last); //32

        int floor = ts.floor(15);
        System.out.println(floor);  //12 == 15 elemanlardan biri degil, o yuzden 15 ten bir onceki eleman yazdirildi

        //floor methodunda kullanabileceginiz sayi en kucuk elemandan az olamaz.
        int floor2 = ts.floor(12);
        System.out.println(floor2);  //12 elemanlardan biri , oyuzden 12 yi yazdirdi

        int ceiling1 = ts.ceiling(15);
        System.out.println(ceiling1); // 25 elemanlardan biri degil

        //ceiling() method'unda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz
        int ceiling2 = ts.ceiling(25);
        System.out.println(ceiling2); // 25 elemanlardan biri ,o yuzden direkt yazdirdi

        // 1000 ve ustunu gormek icin ceiling methodu kullanilabilir. 1000 varsa verir ,degilse

        SortedSet<Integer>tailSet1 = ts.tailSet(15);
        System.out.println(tailSet1);//[25, 32]


    }
}
