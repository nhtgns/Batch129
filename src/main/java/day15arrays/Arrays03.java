package day15arrays;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ex 1:  [ 0,2,3,0,12,0] sifirlari en sona koyunuz [2312000]

        int a[]  = {0,2,3,0,12,0}; // bu normal array imiz. ve burada "new" yok

        int b[]  = new  int[a.length];//bu ise sonucu olusturacagimiz yeni array. b a ya bagli , a degisirse b de degisecek.

        int idx = 0;

        for (int w: a){

            if (w != 0){

                b[idx] = w; // java , b ye git 0,1,.. index i

                idx++;
            }

        }
        System.out.println(Arrays.toString(b)); //[2, 3, 12, 0, 0, 0]
        System.out.println(" sifirdan farkli sayilarin adedi :" + idx); //3

    }
}
