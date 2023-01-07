package day15arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        String s = "Java brings you money";
        //1. yol; use replace all
         int vowels = s.replaceAll("[^aeiouAEIOU]", "").length(); // burada unlu harflerin disindakileiri siliyor,
                                                                                   // kalan unlu harflerin sayisisn  veriyor
        System.out.println(vowels); //7

        //2.yol  use Array loop

        String letters [] = s.split("");
        System.out.println(Arrays.toString(letters)); //[J, a, v, a,  , b, r, i, n, g, s,  , y, o, u,  , m, o, n, e, y]

        int counter = 0;
        for (String  w :  letters){
            switch (w.toLowerCase()){ //ihtimal sayisi 2 den fazla oldugu icin switch kullaniyoruz

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    counter++; //a e i o u ise bunlar  artir yani ekle.
            }
        }
        System.out.println(counter); // 7

    }
}
