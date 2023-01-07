package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //Ex 1: String Array olusturun ,icine 5 tane eleman ekleyin, ilk eleman ile son elemanin icerdigi karakter sayilari
        //toplamini yazdirin

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";

        System.out.println(Arrays.toString(arr)); //[Math, Science, Music, English, Art]
        //[0].length ilk arrayin elaninin karakter sayisi icin  , // [arr.length-1] ise arr aray inin son elemaninin karakter sayisi icin
        System.out.println  (arr[0].length() + arr[arr.length-1].length()); // 7  ,ilk ve son array in karakter sayisi

        //arr[arr.length= arr nin eleman sayisi demek. ama biz index kullandigimiz icin -1 eklemeliyiz. index edogru ulasalim diye
        // bu ornekte arr.length-1 bize 4 u verdi
        // stringlerde length met parantezli ,arraylerde parantezsiz olur



        //Ex 2:String Array olusturun ,icine 5 tane eleman ekleyin, tum elemanlarin icerdigi karakter sayilari
        //toplamini yazdirin


        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";


        //1.Yol: for-loop
        int totalChar = 0; //33 oldu

        for(int i=0; i<brr.length; i++){
            totalChar = totalChar + brr[i].length();// burada arraydeki elemanin (0 dan 4 e kadar) karakter sayisini ver demek
                                                       // yeni bir sonuc elde edilecekse ,yeni bir kontener olusturulur, "totalChar" gibi,
                                                      // bu kolaylik saglar}
        System.out.println(totalChar);// 33


            }


        //***!! 2.yol for each loop==>  baslangic degeri, loop un calisma sartini ve increment ve decrement kismini kendisi olusturur

        // en guzel loop tur. enhanced loop , mumkunse bunu kullanin
        // for each loop  "Array" lerde ve "Collection" larda kullanilir
        //index kullanmaniz gerektiginde bazen "for each loop" caresiz kalir ,mecburen diger looplari kullanirsiniz

        int sum = 0; //33 oldu            // brr nin icinde maimi, istanbul ve digerleri var
        for (String              w :             brr){

            sum = sum + w.length(); // burada 'w' tum indexleri elemanlari temsil ediyor dongude.
        }
        System.out.println(" total :" + sum); //33

}
}


