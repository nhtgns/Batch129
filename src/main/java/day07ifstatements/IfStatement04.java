package day07ifstatements;

import java.util.Scanner;

public class IfStatement04 {
    public static void main(String[] args) {

        //Ex 1: gun sayisini verdiginizde gun ismini yazan kodu yazin
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen kacinci gun oldugunu giriniz");
        byte num = input.nextByte();

        if (num==1){
            System.out.println("Sunday");
        }else if (num==2){
            System.out.println("Monday");
        }else if (num==3){
            System.out.println("tuesday");
        }else if (num==4){
            System.out.println("wednesday");
        }else if (num==5){
            System.out.println("Thursday");
        }else if (num==6){
            System.out.println("Friday");
        }else if (num==7){
            System.out.println("Saturday");
        }else {
            System.out.println("hatali giris yaptiniz. Lutfen 1 ile 7 arasinda bir sayi giriniz");
        }
    }
}
