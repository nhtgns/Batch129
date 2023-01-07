package day15arrays;

import java.util.Arrays;

public class Tekrar01 {
     /*
        1.soru bir array olusturun ve olusturdugunuz arraydeki tum elemanları yazdırın

        */

    public static void main(String[] args) {
        String sayi [] = new String[3];
        sayi [0]= "2";
        sayi [1]= "24";
        sayi [2]= "23";

        Arrays.sort(sayi);
        System.out.println(Arrays.toString(sayi));//[2, 23, 24]



    }//main


}
