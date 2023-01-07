package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {
    public static void main(String[] args) {
        // Kullanicinin verdigi sayi icin carpim tablosunu olusturup konsola yazdiran kodu yaziniz
        // 3 ==> 3x1= 3  3x2=6  3x3=9  3x4=12.... 3x10=30

        Scanner input = new Scanner(System.in);
        System.out.println(" Carpim tablosunu gormek icin bir sayi  giriniz");
        int num = input.nextInt();

        int i = 1;                                             // 1

        while (i<11){                                           //2

            System.out.println(num  + "x" + i + "=" + (num*i));  //3

            i++; //increment var burada                         //4
        }

        //Ex 2   verilen bir stringde her harfin sonuna yildiz sembolunu ekleyiniz.
        // Java   j*a*v*a*
        System.out.println(" bir kelime giriniz");

        String word = input.next();

        String newWord = "";            // yeni data yi memory de yeni stringin icine koymak icin bunu olusturduk

        int k = 0;                       // burada index le islem ypilacagi icin int kullandik cunku index bir sayidir

        while (k<word.length()){            // bu haliyle length den bir aza kadar gitmis oluruz

           newWord=  newWord + word.charAt(k) + "*";

           k++;
        }
       System.out.println(newWord);//j*a*v*a*
    }
}
