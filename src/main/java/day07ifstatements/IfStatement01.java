package day07ifstatements;

import java.util.Scanner;

public class IfStatement01 {

    public static void main(String[] args) {

        //EX 1: Kullanicidan alinan karakter buyuk harf ise ekrana buyuk harf , kucuk harf ise kucuk harf yazdiran kod yaz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir karakter giriniz");
        char ch = input.next().charAt(0);//kullanicidan bir karakter alacaksaniz once next() methodu sonra charAt() methodu arka arkaya yazilir

        // 1. yol
        if (ch>='A'  && ch<='Z'){
            System.out.println("buyuk harf");
        }

        if (ch>='a' && ch>='z'){
            System.out.println("Kucuk harf");
        }

        //2. yol
        if (ch>='A'  && ch<= 'Z'){
            System.out.println("Buyuk harf");
        }
        else if (ch>='a'  && ch<='z'){
            System.out.println("kucuk harf");
        }else {
            System.out.println("harf degil");
        }

    }
}
