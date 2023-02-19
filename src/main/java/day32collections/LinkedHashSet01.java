package day32collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
    public static void main(String[] args) {

        //LinkehHasset olusturma  //"Set"ler tekrarsiz eleman icerirler.
        LinkedHashSet< String> artist = new LinkedHashSet<>();

        artist.add("Ajda");
        artist.add("Tom");
        artist.add("Bradd");
        artist.add("Angelina");

        artist.add("Tom");//Siz ayni elemani tekrar tekrar eklerseniz Java hata vermez, ama tekrarli eklenen elemani "Set" e sadece bir kere koyar.
        System.out.println(artist);  //[Ajda, Tom, Bradd, Angelina] verilen siraya gore dizdi.2 elemandan enson olan i yazdirir, buna override denir

        LinkedHashSet<String> actress = new LinkedHashSet<>();
        actress.add("Ajda");
        actress.add("Angelina");

        artist.removeAll(actress);
        System.out.println(artist); //[Tom, Bradd]

//        LinkedHashSet<String> has = new LinkedHashSet<>();
//        has.add("Bradd");
//        has.add("Tom");
//
//
//        System.out.println(artist.addAll(has)); //addAll methodunu ogren

    }
}
