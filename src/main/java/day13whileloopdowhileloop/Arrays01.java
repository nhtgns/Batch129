package day13whileloopdowhileloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        int a= 12; // Bu yapinin icinde sadece bir tane data depolanabilir
                   // Ama biz code yazarken bir yapinin icinde coklu data ihtiyaci hissederiz
                   // Bir yapinin icinde coklu data depolayabilme icin Java "Array" yapisini olusturmustur

        //Array nasil olusturulur? icine ne tur bir data type koyacaginizi belirtin, bir de kac eleman koyacagini belirtmelisin
        //toString() methodunu kullanmadan sadece array ismi ile yazdirirsaniz java o array  in adresini yazdirir

        // *** Array e eleman ekleyelim !!!!
        String stdNames [] = new  String[5];

        System.out.println(Arrays.toString(stdNames)); //[null, null, null, null, null]   //Array konsola nasil yazdirilir, bu sekilde
        //burada array e eleman yazmadigimiz icin konsola sadece 5 tane default( varsayilan) null yazdirir
        stdNames[0] = "Cuneyt"; //buralarda index kullanilir
        stdNames[1] = "Kemal";
        stdNames[2] = "Ajda"; // array e git, index i 2 olani Ajda yap  demek.
        stdNames[3] = "Ezel";
        stdNames[4] = "Besir";
        System.out.println(Arrays.toString(stdNames));  //[Cuneyt, Kemal, Ajda, Ezel, Besir]

        // *** Array den specific bir elemani almak!!!!
        System.out.println("isim : " + stdNames[2]); // Ajda,  burada sadece Ajda yazdirilir

        // Ex1 : Array deki tum elemanin sonuna ! isareti koyarak ekrana yazdiriniz (loop kullanilir tekrarli bir is oldugu icin)
                        // 0<5  demek burasi
        for (int i = 0; i<stdNames.length;  i++){

            System.out.print(stdNames[i] + "!"); //Cuneyt!Kemal!Ajda!Ezel!Besir!

// burada index kullanilir. srtringlerde length parantezli olur, array lerde parantez kullanilmaz

        }


    }
}
