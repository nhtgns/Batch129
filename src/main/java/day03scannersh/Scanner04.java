package day03scannersh;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {



        //kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonucunu ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double firstNummer= input.nextDouble();
        double secondtNummer= input.nextDouble();

        System.out.println(firstNummer + secondtNummer);
        System.out.println(firstNummer - secondtNummer);
        System.out.println(firstNummer * secondtNummer);
        System.out.println(firstNummer / secondtNummer);


    }
}
