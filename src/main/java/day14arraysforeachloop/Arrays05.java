package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        //Note: sort methodu sayisal data type lerini kucukten buyuge siralar(ascending order)
        //Note: sort methodu string  data type lerini alfabetik siralar(alphabetical order)
        //note 3: ascending order + alphabetical order ==> Natural ordner
        //note 4: sort  methodu array elemanlarini "Natural Order" a gore siralar

        //note 5: binarySearch() methodu bir elemanin bir array 'de olup olmadigini kontrol etmek icn kullanilir
        // note 6:binarySearch() methodunu kullanmadan once "sort()" methodu kullanmak zorundayiz
        // sort() methodu nu kullanmazsaniz  buldugunuz sonuc guvenilir olmaz

        String colors [] = new String[6];  // array lar interwiv lerde sorulur

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        Arrays.sort(colors);
        System.out.println(Arrays.toString(colors)); // [Blue, Brown, Green, Orange, Red, Yellow]

        int num = Arrays.binarySearch(colors, "Blue"); // hey java, colors array inde blue diye bir eleman var mi diye soruyoruz
        System.out.println(num);// var ,hem de index i 0 ' da, cunku alfabetik sirada blue en basta olur

        int num2 = Arrays.binarySearch(colors, "Orange");
        System.out.println(num2);// 3 uncu index te

        int num3 = Arrays.binarySearch(colors, "Tarik");
        System.out.println(num3); // -6 ==>  "-" eksi bu eleman array de yok demek
                                  // 6 ne demek , olsaydi harf sirasina göre 6. eleman olurdu
    }
}
