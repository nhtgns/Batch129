package day21statickeyword;

public class Student {

    /*
    1) static variable veya static methodlar(class member, her ikisi) tum objectler icin ortak elemandir
    2)static class member lar uzerinde yapilan tum degisiklikler tum object leri etkiler
    3) static class member ler, Class a; non static class memberler, object lere monte edilir.
       Mesela bir class tan 100 tane object olusturdugunuzda, non static olanlar 100 tane olusturulur,
       ama static olanlar, object sayisindan bagimsiz olarak bir kere olusturulur
     4)Static class member'lara ulasmak icin object olusturmaya gerek duyulmaz,ama non-static class member'lara
       ulasmak icin object olusturmak sarttir.
     5)static variable lerin diger adi "class variable" dir
     non static variable lerin diger adi "Instance variable" veya "Object variable"  da denir
     */

    public static String stdName = "Tom Hanks"; //static

    public int age = 13;  //non static


    // ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name) {

        String first = name.substring(0, 1);

        String second = name.split(" ")[1].substring(0, 1);

        return first + second;


    }

    //Ogrenci ismindeki sesli harfleri(aeiou) sayan bir method olusturunuz
    public int countVowels(String name) {

        int counter = 0;

        for (int i = 0; i < name.length(); i++) {
            char ch = name.toLowerCase().charAt(i);
            switch (ch) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':

                    counter++;
                    break;
            }

        }
        return counter;
    }
}
