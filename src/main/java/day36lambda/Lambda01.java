package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);
        myList.add(26.8);

        List<Double> half = getHalfOfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println(half);//[19.2, 13.4, 6.0, 3.5]


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("Jhon");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");
        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list); //TOM AJDA BRAD JHON CUNEYT ANGELİNA bizim verdigimiz siralamaya gore yazdi
        System.out.println();
        //printAllSortWithLastCharUpperDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
       // System.out.println(removeElementIfStartsWithAorEndsWithd(list)); //[Tom, Jhon, Tom, Cuneyt]
        // System.out.println(removeElementIfTheLengthGreaterThanFive(list));//[Tom, Jhon, Ajda, Tom, Brad]
        System.out.println(printLengthSquare(list));
        System.out.println(printElementsLengthEven(list));

        printAllSortWithLastCharUpperDistinct1(list);

    }
    //Example 1: Create a method to find the half of the elements greater than 5, distinct, in reverse order, in a list.

    public static List<Double> getHalfOfElementsGraterThanFiveDistinctReversed(List<Double> myList) {
        return myList.stream().distinct().
                filter(t -> t > 5).map(t -> t / 2).sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

    }

    //EX 2: tum list elemanlarini buyuk harfle alfabetik sirada tekrarasiz olarak yazdiriniz
    public static void printAllAlphabeticallyUpperDistinct(List<String> list) {

        list.stream().distinct().map(t -> t.toUpperCase()).
                sorted().forEach(t -> System.out.print(t + " "));
    }

    //EX 3: tum list elemanlarini kucuk harfle alfabetik siranin tersinde tekrarasiz olarak yazdiriniz
    public static void printAllAlphabeticallyLowerDistinct(List<String> list) {
        list.stream().distinct().map(t -> t.toLowerCase()).
                sorted(Comparator.reverseOrder()).forEach(t -> System.out.print(t + " "));
    }
    //EX 4: tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarasiz olarak yazdiriniz

    public static void printAllSortWithLengthUpperDistinct(List<String> list) {

        list.stream().distinct().map(t -> t.toUpperCase()).sorted().
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));


        //karsilastir uzunluklari

    }

    //Example 5: Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada, tekrarsiz olarak yazdiriniz
    public static void printAllSortWithLastCharUpperDistinct1(List<String> list) {
        list.stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).//t->t.charAt(t.length()-1 bu ifade lambda expression olarak adlandirilir

                forEach(t -> System.out.print(t + " "));

    }

    public static void printAllSortWithLastCharUpperDistinct2(List<String> list) {
        list.stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(Utils::getLastChar)).//t->t.charAt(t.length()-1 bu ifade lambda expression olarak adlandirilir

                forEach(t -> System.out.print(t + " "));

    }

    //EX 6: tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada tekrarasiz olarak yazdiriniz
    //uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String> list) {

        list.stream().distinct().
                map(String::toUpperCase). //String::toUpperCase yapisina "method reference" denir. Anlamı: String class daki lenght metodu kullan diyoruz.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
    }

    //
//    //7 charecter sayisi 5 ten fazla olan elemanlari siliniz ve sonucu list olarak yazdirin
//    public static List <String> removeElementIfTheLengthGreaterThanFive(List<String>list){
//        list.removeIf(t-> t.length()>5);
//        return list;
//    //  }
//    //Example 8: "A" ile baslayan veya "d" ile biten elemanlari siliniz
//    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String> list) {
//        list.removeIf(t -> t.startsWith("A") || t.endsWith("d"));
//        return list;
//        // list return etcegi icin streamden collect list diyip return ettik
//Bazen "stream()" methodu bize lazim olan methodlara ulasmamiza engel olur. Bu yüzden "stream()" methodunu kullanmayız
//"removeIf()" methodunda olduğu gibi.

//Fakat "stream()" methodunu daha sonradan kullanmamız gerekibilir. Bu durumda "stream()" methodunu kullanarak istediğimiz methodlara
//ulasiriz, distinct() methoduna ulaştığımız gibi.

// sonuc bize list olarak lazımsa "collect(Collectors.toList()" ile sonucu List'e ceviririz

  //  }
// Ex 9:  list elemanlrinin karakter sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz
    public static List<Integer> printLengthSquare(List<String> list){
     return    list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());

        //Lambda expression'dan kurtulmanin bir yolu da kendi methodumuzu Util class'dan cagirarak kullanmaktir
      //  map(Utils::getLengthSquare). //oluşturduğum Utils class'ına git getLengthSquare methodunu kullan dedim (functional programming)
// bu methodlar Javadan da gelebilir sizin oluşturduğunuz methodlardan da gelebilir
    }

    //10 : //Example 10: List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz
    public static List<String>printElementsLengthEven(List<String>list){
        return list.stream().filter(Utils::isEven).collect(Collectors.toList());
    }
}
