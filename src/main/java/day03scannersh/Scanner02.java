package day03scannersh;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        // KUllanicidan ilk ismini ve soyismini alip ikisini ayni satirda ekrana yazdirirniz
        // class ismi    object ismi (bunu ben verdim)       atama operatoru     keywort        constracter
        // 3 addimda bilgiler alinir ve yadirilir
        Scanner         input                                  =               new         Scanner(System.in); // 1. adim

        System.out.println("Ilk isminizi girin."); // 2.adim
        //next, method kullanicidan tek kelimelik "string almak icin kullanilir
        String firstName = input.next(); // 3.adim

        System.out.println("soyisminizi giriniz."); //2.adim
        String lastName= input.next(); // 3.adim

        System.out.println(firstName+ " " + lastName);


    }
}
