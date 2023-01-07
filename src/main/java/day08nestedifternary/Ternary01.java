package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        //Example 1: Kullanicidan iki sayi aliniz "buyuk olmayan"(kucuk veya esit olan) sayiyi yazdiriniz
        Scanner input = new Scanner(System.in);
        System.out.println(" iki sayi girin");
        double a =input.nextDouble();
      double b =input.nextDouble();


            //1.yol: if else
       if(a<b){
            System.out.println(a);
       }else {
            System.out.println(b);
        }


        // 2. yol: 'ternary' ile 'if else' ayni seyi yapar, ama soz dizimi farkli
               //       Condition     ?    condition true ise calisir  : Condition false ise calisir
        double result =   a<b         ?                  a             :             b;
       System.out.println(result);

    }
}
