package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop03 {
    public static void main(String[] args) {

        /*
        as sekli cizdiren kodu yazdir

        * * * *  // ilk satirdaki yildiz sayi verilen satir sayisi ile ayni
        * * *
        * *
        *

         */
        Scanner input = new Scanner(System.in);
        System.out.println("satir (row) sayisini giriniz");
        int row = input.nextInt();

        for(int  i = 1 ; i<= row;  i++){ // satir icin

            for (int k = row;  k>=i; k--){//icerdeki for un baslangic degeri row( yani satirsayi ile ayni),(baslangicta k= row = 4 ,sonra3,2,1 devam)

                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
