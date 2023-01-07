package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {
    public static void main(String[] args) {
        List <String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");
        // names.containsAll(females) "names" Listinde "females" listindeki "tum elemanlarin" var olup olmadigini kontroleder
        //Tamami varsa size "true" verir, herhangibiri yoksa size "false" verir
        boolean r = names.containsAll(females);
        System.out.println(r); // true

        // index  1 den 3 e kadar git 3 u alma.(1 i 2 yi aliyor) ve bunlari List olarak veriyor.Altlist demek, sublist
        List <String> sublist = names.subList(1,3);
        System.out.println(sublist);//[Cuneyt, Mahsun]

        names.retainAll(females); // iki list arasindaki ortak elemanlari gosteriyor
        System.out.println(names);//Ajda, ilk kumede ortak olmayanlar silindi
        System.out.println(females);//[Ajda, Emel] //bu ikinci kume ,ikinci kumede degisiklik olmaz,ilk kumede ortak olmayanlar silinir


       //Evaletleri .retainAll(elektronikler)
        //Ex: elektronoik aletler ve ev aletleri listleriniz var
        // Elektronik ev aletlerini  listeleyiniz

        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String>homeGoods=new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        homeGoods.retainAll(electronics);
        System.out.println(homeGoods);//[Radio, TV]
        //homeGoods.retainAll(electronics) homeGoods ile electronics list'lerinin ortak elemanlarini homeGoods listi icinde verir.
        //baska bir deyisle (in other words) hoomGoods List indeki ortak olmayan elemanlari siler


        names.isEmpty();
        System.out.println(names.isEmpty());// dolu.  bos mu , diye sorar, var, o yuzden false verir
        // isEmpty() List te hic eleman yoksa size "true" verir

        // names.isEmpty()==> bu method list'te hic eleman yoksa "true" verir
       // bir veya daha fazla eleman varsa size "false" verir
       //isEmpty()==> esasinda "names.size()==0" demektir
        // ikisi ayni isi yapiyor ama java da bir sey icin ozel method varsa onu kullan
       // cunku burda "names.size()==0" java yi iki kere yoruyor, hem esitligi olcuyor
        // hem size'i olcuyor
        System.out.println(names.hashCode());
    }
}
