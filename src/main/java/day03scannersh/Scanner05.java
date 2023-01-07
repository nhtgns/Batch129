package day03scannersh;

import java.util.Scanner;

public class Scanner05 {

    //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz ve dikdortgenin alanini hesplayiniz cevresini hesaplayiniz

    // alan. kisa kenar * uzun kenar
    // cevre 2*kisa kenar+2*uzunken
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kisa kenar uzunlugunu giriniz.");
        float shortSide= input.nextFloat();
        System.out.println("Dikdortgenin uzun  kenar uzunlugunu giriniz.");
        float longSide= input.nextFloat();

        System.out.println( " Alan = " + (shortSide * longSide));
        System.out.println( " cevre = " + (2* shortSide + 2*longSide));

    }
}
