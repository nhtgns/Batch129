package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

        //Ex 2 : Integer array olusturunuz ,
        // icine 6 tane eleman yerlestiriniz bu elemanlarin en kucugu ile en buyugunun toplammini ekrana yazdiriniz
        // bu soruda kucukten buyuge siralama yapilir, kolaylik icin
        int[] ages = new int[6]; // bu da calisir. primitive ve non pr kullanilir

        ages[0] = 20;
        ages[1] = 23;
        ages[2] = 19;
        ages[3] = 44;
        ages[4] = 15;
        ages[5] = 32;
        System.out.println(Arrays.toString(ages));//20, 23, 19, 44, 15, 32 //burada kucukten buyuge siralama olmadi

        //sort methodu  array deki elemanlari kucukten buyuge siralar
        Arrays.sort(ages);
        System.out.println(Arrays.toString(ages));  //15, 19, 20, 23, 32, 44] sort() methodu siralar kucukten buyuge ve siraladi

        System.out.println(ages[0] + ages[ages.length - 1]);  //59  max + min toplami 59


        // 2.yol  for each loop, bu tur sorular icin ideal. sort methodu javayi biraz yorar

        int minimum = ages[0];  // index kullanilir.burada java, 0 index li elemani aldi buraya koydu,sonra karsilastirip en kucugunu bulacak
        int maximum = ages[0];

        // 20 23,19,44,15,32 bunlar ages in icinde, sirayla w nin icine gidecekler, oradan da asagidaki w ye giderler
        for (int w : ages) {  // for each loop bu.

            minimum = Math.min(minimum, w);//burada minimum sayiyi bulup"minimum"konteynirina atacak.Math.min burada karsilastirma yaparak minimum sayiyi buldurur
            maximum = Math.max(maximum, w);

        }
        System.out.println(minimum); //15
        System.out.println(maximum); //44

        System.out.println(minimum + maximum); //59


    }
}
