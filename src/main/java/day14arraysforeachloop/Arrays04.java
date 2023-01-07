package day14arraysforeachloop;

import java.util.ArrayList;
import java.util.List;

public class Arrays04 {
    public static void main(String[] args) {

        // arrayler collectionlara gore ilkel yapidadir, collectionlarda biz istedigimiz elemani silebiliyoruz
        //fakat arraylerde elemanlari silmemiz icin yeni array olusturmamiz gerekiyor

      //  String bir array olusturup,6 eleman olusturun, "yellow" dan onceki elemanlari yazdirin

        String colors [] = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        for (String w: colors){

            if (w.equals("Yellow")){   // bu ifade, yellow u gorunce birak demek, yani yellow dan oncekileri yazdir demek
                break;
            }
            System.out.println(w);
        }

        System.out.println("ggggg");


        // Example 2:   String bir array olusturup,6 eleman yerlestiriniz, yellow 'dan sonraki elemanlari yazdirin

        // for loop kullanmaliyim,cunku for loop sondan da baslar

        // for each loop her zaman bastan baslar. arraylerde length parantezsiiz kullanilir
        //note: elemanlari almaya son elemandan baslayacagim icin "for each loop" kullanamam cunku for each loop her zaman bastan baslar,
        // buyuzden for loop kullanirim

        String color [] = new String[6];

        color[0] = "Red";
        color[1] = "Orange";
        color[2] = "Blue";
        color[3] = "Yellow";
        color[4] = "Green";
        color[5] = "Brown";

        for (int i = color.length-1; i>=0;  i--){
            //color[i] , bir arrays
            if (color[i].equals("Yellow")){
                break;                              // hedefe ulasinca break calisir ve bizi loop un disina atar
            }
            System.out.println(color[i]);
        }

        //2. yol: Yellow elemaninin index ini bul ve o index ten daha buyuk indexe sahip olan elemanlari yazdir
       // [Red, Orange, Blue, Yellow, Green, Brown]

        int counter = 0; // burada oncelikle yellow un indexini bulmaya calisiyoruz

        for (String w: color){
            if (w.equals("Yellow")){
                break;
            }
            counter++; // counter ,burada 3 degerinde. asagidaki islemde counter dan sonraki elemandan baslayacagi icin +1 ekliyoruz
            // buraya kadar index i bulduk ,bundan sonra buldugumuz index ten sonrasini yazdiriyoruz

        }        //counter 4 oldu
        for (int i = counter+1;    i<color.length;    i++){

            System.out.println(color[i]);

        }

        }
    }

