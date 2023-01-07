package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

        //Ex 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz sonrada charachter sayisi 5 ten fazla olan elemanlari siliniz
        //Advens bir soru
        String colors [] = new String[6];

        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors)); //[Red, Orange, Blue, Yellow, Green, Brown]

        //Logic: Yeni bir array olusturup,karakter sayisi 5 ve 5'den kucuk olan elemanlari
//       yeni array'e transfer edecegiz, boylelikle yeni array'de karakkter sayisi
//       5'den buyuk olan hicbir eleman olmayacak

        //*****!!! soru  hocam, array olusturmak icin iki sey belirlenmelidir
        // 1) elemanlarin data type
        // 2) yeni array de kac tane eleman olacak

        // verilen array 'de eleman sayisi 5 ve 5 ten az olan eleman sayisini bulmali

        int counter = 0;  //sayac
                               // burada colors in icinde karakter sayisi 5 ve 5 ten kucuk olanlari alacagiz
                             //[Red, Orange, Blue, Yellow, Green, Brown] bunlri degerlendiriyor
        for (String  w  : colors){
            if (w.length()<=5){

                counter++; //4 oldu
            }
        }
        System.out.println(counter); // 4 ,yeni Array in eleman sayisi ( counter ile temsil ediliypor, o da 4)

        String newColors[] = new String[counter];  // bu bizim yeni array imiz ve ismi "newColors", ve icinde 4 tane  null var

        // kar sayi 5 ve 5ten az olan array e transfer et ,kismi

        int idx = 0;  // bu yeni array icin olusturulan index.

        for (String  w : colors){   //[Red, Orange, Blue, Yellow, Green, Brown] bunlri degerlendiriyor

            if(w.length()<=5){

                newColors[idx] = w;

                idx++;
            }
        }
        System.out.println(Arrays.toString(newColors));  //Red, Blue, Green, Brown]
    }
}
