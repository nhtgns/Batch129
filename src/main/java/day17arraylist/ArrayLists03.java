package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {
    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();

        cities.add("Miami"); // tekrarli islem
        cities.add("Kayseri");
        cities.add("Istanbul");
        cities.add("Almaty");

        // remove() index ile kullanilirsa o index teki elemani siler. ve sildigini verir
        // remove () mth index ile kullanilirsa size sildigi elemani verir

        String n = cities.remove(1); //sildigi elemani yaziyor, bu sekilde n yi yazdirirsam, ama cities i yazdirsam istanbul silinir sadece
        System.out.println(n);


      // remove() birden fazla ayni elemandan varsa, silinecek eleman ile kullanilirsa ilk elemani siler
      // remove  met. eleman ile kullanilirsa size o elemani silip silmedigini ifade eden true ya da false verir
        //Eger eleman List te var ise o elemani siler

       boolean p =  cities.remove("Kayseri");
        System.out.println(p); //true verdi sadece neyi sildigini yazmadi, burada cities i yazdirsam kayseri gorunmez ,cunku silindi

        System.out.println(cities); // Kayseri silindi [Miami, Almaty]   en son hali

    }
}
