package day10switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        // Ex !: ay numarasini soyleyince , numarasi verilen ay dan baslayip 12. aya kadar tum aylarin isimlerini yazd kodu olus
        //  baslangic ayi 8
        Scanner input = new Scanner(System.in);
        System.out.println("baslangic ayinin numarasini giriniz ");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){ // break a gelince bizi konsola yazdiirir


            case 1:                             //switch 2 ve az durum icin kullanilmaz, en az 3 durumu kullanmak lazim
                System.out.println("January");
            case  2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("gecerli bi ay numarasi giriniz");
        }
         /*  interwiv lerde sorulabilir
            switch te short, int, string, byte, char 5 tane kullanilabilir
            long, boolean, float, dooble kullanilmaz
             */
    }
}
