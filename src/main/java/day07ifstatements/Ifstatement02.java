package day07ifstatements;

import java.util.Scanner;

public class Ifstatement02 {

    public static void main(String[] args) {

        //Ex 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturun
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = input.nextInt(); // sayi alinacaksa nextInt() kullanilir

        //1.yol  // 2 sart kontrol edildi
        if (num%2==0){
            System.out.println("Cift sayi...");
        }
        if (num%2!=0){
            System.out.println("tek sayi");
        }

        //2.yol  // 1 sart kontrol edildi
        if (num%2==0){
            System.out.println("cift sayi");
        }else{
            System.out.println("tek sayi");
        }

        }

    }

