package day17arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        /*
     1) ArrayList(List)'ler coklu data depolamak icin kullanilir.
     2) ArrayList(List)'ler non-primitive data type'indeki coklu datalari depolamak icin kullanilir.
        List'ler "non-primitive" data kabul ederler, "Array" ler ise "primitive" data veya reference kabul eder.
     3) ArrayList(List)'leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
        List'ler eleman sayisinda "flexible" dirlar ama "Array"ler "flexible" degildirler.
     4) Madem "Array" ler eleman sayisinda flexible degil nicin Java "Array" leri iptal etmedi?
          i) Eleman sayisi belli olan data'lari depolamak icin Array'ler tercih edilir.
          ii) Array'ler cok hizli calisir.
          iii) Array'ler memory'de cok az yer kaplar.
    */


      ArrayList<Integer> ages = new ArrayList<>();


        System.out.println(ages); //[]

        // listlere eleman nasil eklenir
        //liste eleman eklemek icin "add()" methodunu kullaniriz. bu method sizin verdiginiz sirada "list" eder(Insertion Order) denir

        //Bir list in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin ayni index 'te ayni elemanlar olmali,buyuzden asagidaki list birbirinin ayni degil

        ages.add(9);
        ages.add(10);
        ages.add(11);
        ages.add(12);
        System.out.println(ages); //[9, 10, 11, 12]

        ages.add(1, 656);//araya bir yere  eleman koymak istersen koymak istedigin yerin indexini once,  sayiyi sonra yaz add() ile
        ages.add(3, 777);
        ages.add(888);                //ensona eleman koymak icin normal  bir eleman girin olur
        System.out.println(ages);     //[9, 656, 12, 777, 10, 888]

        //!!! List'e coklu eleman nasil eklenir veya List e baska bir List nasil eklenir?
        //Bir list e coklu eleman eklemek icin o elemanlari once bir listin icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        //burada newAges teki tum elemanlari ages e ekle demek
        ages.addAll(newAges);//addAll()hepsini ekle demek,index belirtmezseniz siranin ensonuna atar eklediklerini,index belirtilirse o indexe
        ages.addAll(2, newAges); //index 2 'ye newAges i koy demek
        System.out.println(ages); //[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //toArray() metodu: eleman sayisini verir
      // degistirmeyecegimizden eminsek array'e cevirip memory kullanimini azaltabiliriz

        //clear() medodu: Bir List'teki tum elemanlari siler.

       ages.clear(); // bir listteki tum elemanlari siler. simdi yukaridakilerin hepsini silesimdi
        System.out.println(ages); //[] bos kutu olur


        //contains methodu List te bir elemanin var olup olmadigini nasil konrol ederiz?
        boolean r = ages.contains(656);
        System.out.println(r); //false, yukarida clear i pasif yapsam true olurdu cunku 656 yukarida var


        //Bir list in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin ayni index 'te ayni elemanlar olmali,buyuzden asagidaki list birbirinin ayni degil
        ArrayList < String > names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

       // Collections.sort(names1); //burada siraya koyuyor tum elemanlari. o yuzden burasi acilirsa true verir asagisi
        //Collections.sort(names2);

        boolean s = names1.equals(names2);
        System.out.println(s); //false

        //EX 1:  verilen 2 integer liste tamaman ayni elemanlarin olup olmadigini kontrol eden kodu yaziniz


        //Bir list in baska bir list ile ayni olup olmadigini nasil kontrol ederiz?
        //Iki listin esit olabilmesi icin ayni index 'te ayni elemanlar olmali,buyuzden asagidaki list birbirinin ayni degil

        List<Integer> nums1 = new ArrayList<>();
        nums1.add(7);
        nums1.add(3);
        nums1.add(8);

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(3);
        nums2.add(7);
        nums2.add(8);


        Collections.sort(nums1);
        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);




    }
}





