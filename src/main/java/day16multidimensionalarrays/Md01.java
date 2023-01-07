package day16multidimensionalarrays;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {

        // multidimensional Array nasil olusturul
        int a [] [] = new  int[3][2]; //burada Inner arrayler(icteki array ler) 2 ser elemana sahip

        // md nasil yazdirilir?
        System.out.println(Arrays.deepToString(a)); //[[0, 0], [0, 0], [0, 0]] // bunlar default degerler

        //md ye eleman nasil eklenir

        a [0] [0] = 5;  // hey java , a array indeki indexi 0 0 olan elemani 5 yap, demektir. atama yaptik
        a [1] [1] = 45;
        a [2] [0] = 123;
        a [0] [1] = 12;
        a [1] [0] = 81;
        a [2] [1] = 0;

        System.out.println(Arrays.deepToString(a)); //[[5, 12], [81, 45], [123, 0]]
        //multidimensionel Arrayler dibine kadar yazdirlir o yuzden "deepToString() "kullanilir

        //Note: Array lere non primitive data konulamaz(Adresler non prim degil
        //Note: Array lere primitive data veya reference konulur.
        //ama siz bir array i yazdirmak istediginizde java adresler yardimiyla non primitive dataya ulasir
        // ve non pri datayi sanki array in icindeymis gibi gosterir

        // md deki belli elemanlara nasil ulasilir
        System.out.println(Arrays.toString(a[2]));//[123,0]//burada arrayin sadece 2. index e sahip olan elemanini yazdirdigimiz icin toString met kullandik

        System.out.println(a[1][0]);  //81 // burada sout yeterli cunku int bir deger 81.

        System.out.println(Arrays.toString(a[0])); // [5, 12]

        System.out.println(a[2][1]); // 0 ,array in icindeki 0 kendi basina array degil,



    }
}
