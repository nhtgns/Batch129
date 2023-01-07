package day12forloopwhileloop;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        /*

        // asagidaki sekli cizen kodu yazin

        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
         */
        Scanner input = new Scanner(System.in);
        System.out.println("satir (row) sayisini giriniz");
        int row = input.nextInt();


        for (int i = 1; i<= row; i++){  // icerdeki loop un bitisini disardaki loop belirliyor, cunku 1. satirda 1; 2. satirda 2 tane sayi var...


            for(int k=1;  k<=i ; k++){


                System.out.print(k + " ");
            }
            System.out.println();
        }



    }
}
