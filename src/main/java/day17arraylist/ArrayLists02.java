package day17arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {

        // Arraylist olustururken sag tarafa "Arraylist" yazmak zorundasiniz
        //Ama sol tarafa ister "Arraylist" yazin isterseniz de "List "yazin ,ikisi de olur. List daha genel bir anlam icerir
        List< Character> initials = new ArrayList<>(); // initials , isimlerin ilk harflerini alma
        initials.add('A');
        initials.add('B');
        initials.add('M');
        initials.add('B');
        initials.add('C');
        initials.add('S');

        // bir List te kac eleman oldugunu nasil anlariz?
        int numOfElement = initials.size(); //size , eleman sayisi
        System.out.println(numOfElement); // 6

        //Note: Array lerden bahsederken "length" kullanin , List lerden bahsederken "size" kullanin.

        //Bir List ten istenen bir eleman nasil alinir?
        char u = initials.get(0); // index egore calisiyor
        System.out.println(u); // A  // Character olarak kaydettik ama char olarak dönüş yaptı. burada autoboxing

        //Ex 1: verilen bir string list teki tum elemanlarin toplam karakter sayisini bulan kodu yaziniz

        List<String> cities = new ArrayList<>();

        cities.add("Miami"); // tekrarli islem
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");

        //1.yol : Recommended ,tavsiye edilen
        int sum = 0;
        for (String  w: cities){

            sum = sum + w.length();
        }
        System.out.println(sum);//26

        //2.yol
        int toplam = 0;
        for (int i = 0; i < cities.size(); i++) {
            toplam = toplam + cities.get(i).length();

        }
        System.out.println(toplam); //26

        //Bir List teki istenen bir elemani nasil degistirebilirirz. replace methodu gibi
        cities.set(0, "New York"); // maimi gitti.
        System.out.println(cities);

        //EX 2: Maas List'i olusturunuz ve maaslara %20 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(19500.25); //zamdan oncekiler
        salary.add(8500.75);
        salary.add(32500.50);
        System.out.println(salary); //[19500.25, 8500.75, 32500.5]

        // 1.yol
        int idx = 0;
        for (Double w: salary){ // for each loop ta index kullanamazsin
            salary.set(idx, w*1.20);

            idx++;
        }
        System.out.println(salary);//[23400.3, 10200.9, 39000.6]

        //2.yol

       for (int i = 0; i < salary.size() ; i++) {
            salary.set(i, salary.get(i)*1.20);
       }
        System.out.println(salary);

    }
}
