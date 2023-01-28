package day33maps;

import java.util.Arrays;
import java.util.HashMap;

public class HashMaps02 {
    public static void main(String[] args) {
        //Example 1: Size verilen bir cumledeki her bir kelimenin kacar kere kullanildigini gosteren code'u yaziniz
        //           "Java is easy. Java is OOP. OOP makes Java easy." ==> Java=3, is=2, easy=2, OOP=2, makes=1

        HashMap<String, Integer> wordsMap = new HashMap<>();
        String sentence = "Java is easy. Java is OOP. OOP makes Java easy.";
        System.out.println(sentence);//Java is easy. Java is OOP. OOP makes Java easy.

        //burada degisecek olan sitring i kendi adina esayn ettik, yoksa istedigimizi alamayiz,cunku stringler immutable dir
        sentence = sentence.replaceAll("\\p{Punct}", "");
        System.out.println("seboller:" + sentence);//Java is easy Java is OOP OOP makes Java easy

        String[] wordsArray = sentence.split(" ");
        System.out.println(Arrays.toString(wordsArray));//[Java, is, easy, Java, is, OOP, OOP, makes, Java, easy]

        for (String w : wordsArray) {

            Integer numOfOccurrence = wordsMap.get(w);
            //bu get methodunda, object i veriyorsun , o sana value sini,degerini veriyor
            if (numOfOccurrence == null) {

                wordsMap.put(w, 1);// Java,is... yi 1 value suyla wordsMap e ekliyor, Java=1, seklinde
            } else {

                wordsMap.replace(w, numOfOccurrence + 1); //varsa 1 burada +1 ile ekleme yapiyor
            }
        }
        System.out.println(wordsMap);//{Java=3, OOP=2, makes=1, is=2, easy=2}
    }
}
