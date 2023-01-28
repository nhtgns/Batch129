package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {

/*
  1)TreeMap entry'leri "key" lere gore "natural order" a koyar.
  2)TreeMap cok yavastiri cunku "natural order" yapmak cok zaman ister.
  3)TreeMap "thread-safe" ve "synchronized" degildir.
  4)TreeMap'lerin "key" lerinde "null" kullanilamaz. Cunku "key" lere gore siralama yaptigi icin "null"ı
  koyacak bir yer olmaz. Ama "value" lardanistediginiz kadar kullanabilirsiniz.
 */
public static void main(String[] args) {

    long one = System.nanoTime();

    TreeMap<String, Integer> stdAges = new TreeMap<>();
    stdAges.put("Ali" ,21);
    stdAges.put("Ayşe",25);
    stdAges.put("Kemal",19);
    stdAges.put("Murat",22);

    System.err.println(stdAges);//"Key"lere göre alfabetik sıralama yaptı.

    long two = System.nanoTime();

    HashMap<String,Integer> stdAges2 = new HashMap<>();

    stdAges2.put("Ali",21);
    stdAges2.put("Kemal",19);
    stdAges2.put("Ayse",25);
    stdAges2.put("Murat",22);

    System.out.println(stdAges2);

    long three = System.nanoTime();

    HashMap<String, Integer> stdAges3 = new HashMap<>();
    stdAges3.put("Ali", 21);
    stdAges3.put("Kemal", 19);
    stdAges3.put("Ayse", 25);
    stdAges3.put("Murat", 22);

    TreeMap<String, Integer> stdAges4 = new TreeMap<>(stdAges3);

    System.out.println(stdAges4);

    long four = System.nanoTime();

    System.out.println("TreeMap: " + (two-one) );
    System.out.println("HashMap: " + (three-two) );
    System.out.println("HashMap --> TreeMap: " + (four - three) );

}

}
