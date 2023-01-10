package day16multidimensionalarrays;

import java.util.Arrays;

public class Md02 {
    public static void main(String[] args) {

        // Ex 1: Bir integer multidimensional array olusturunuz , toplam eleman sayisini konsola yazdirin

        int a [][]  = { {13, 213, 4}, {12,87}, {4,7,1,9}, {99,78}  }; //burada icerdeki array lerin eleman sayilari farkli olabilir
        System.out.println(Arrays.deepToString(a));  //[[13, 213, 4], [12, 87], [4, 7, 1, 9], [99, 78]]toplam 10 eleman var


        int sum = 0;

        //intiger array bu(data tipi)
        for      (int []                 w :            a ) {  // for  each l

             sum = sum  +w.length; // burada her ic array in eleman sayisi alinip ekleniyor
        }
        System.out.println(sum); //11
    }
}
