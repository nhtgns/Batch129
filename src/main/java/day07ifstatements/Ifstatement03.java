package day07ifstatements;

import java.util.Scanner;

public class Ifstatement03 {
    public static void main(String[] args) {

        //E 3 :verilen bir sayinin pozitif negativ veya notr oldugunu  kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = input.nextInt();

        if (num>0){
            System.out.println("pozitif");
        }else  if (num<0){
            System.out.println("negatif");
        }else {
            System.out.println("notr");
        }


    }
}
