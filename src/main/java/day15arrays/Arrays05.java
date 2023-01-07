package day15arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays05 {
    public static void main(String[] args) {

        // Ex 1:  string array elemanlarini uzunluklarina gore kucukten buyuge siralayiniz
        // [ "Michael",  "Ajda",  "Thomas",  "Tom"]   ==> tom,  ajda , thomas, michael  olacak

        String arr  []  = {"Michael",  "Ajda",  "Thomas",  "Tom",};
        System.out.println(Arrays.toString(arr)); //[Michael, Ajda, Thomas, Tom]

        Arrays.sort(arr, Comparator.comparingInt(String::length));// string metoduna git uzunluga siralamy yap
        System.out.println(Arrays.toString(arr));//[Tom, Ajda, Thomas, Michael]

        //burada karşılaştırmayı kendi isteğimize göre yaptık.
          //        "::" bir class daki methoda ulaşmak için kullanılır.
          //        Burada String class'ına git length methodunu kullan dedik lambda dersinde görülecek.
          //comparingInt seçmemizin sebebi integer bir değer olan karakter sayısına göre yapmamızdır.


        // Ex 2:  string array elemanlarini uzunluklarina gore  buyukten kucuge siralayiniz

        String brr  []  = {"Michael",  "Ajda",  "Thomas",  "Tom", "Cuneyt"};
        System.out.println("Normal : " + Arrays.toString(brr)); //[Michael, Ajda, Thomas, Tom, Cuneyt]

        Arrays.sort(brr, Comparator.comparingInt(String::length).reversed()); // reversed , buyukten kucuge siralar
        System.out.println("buyukten kucuge sirali :" + Arrays.toString(brr)); //[Michael, Thomas, Cuneyt, Ajda, Tom]

        //Ex 3:  string array elemanlarini uzunluklarina gore  buyukten kucuge siralayiniz
        // ayni karakter sayisinda olanlari da alfabetik siraya koyunuz

        String crr [] = {"Michael", "Ajda", "Reyhane", "Gabriel", "Tom", "Ali", "Cin", "Cem"};

        System.out.println(Arrays.toString(crr)); //[Michael, Ajda, Reyhane, Gabriel, Tom, Ali, Cin, Cem]

        Arrays.sort(crr, Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(crr)); //[Gabriel, Michael, Reyhane, Ajda, Ali, Cem, Cin, Tom]
        // javadaki methodları kullanarak program yazmaya functional programming denir. diğer adı Lambda dır.
        }
    }

